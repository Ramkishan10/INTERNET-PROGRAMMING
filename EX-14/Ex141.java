import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Ex141 {

    private static final String BASE_URL = "http://localhost:8080/root/rest/customers";

    public static void main(String[] args) {
        // Invoke the web service endpoints
        getAllCustomers();
        addCustomer();
        updateCustomer();
    }

    private static void getAllCustomers() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(BASE_URL);
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        Response response = builder.get();

        if (response.getStatus() == Response.Status.OK.getStatusCode()) {
            String customersJson = response.readEntity(String.class);
            // Process the customers JSON
            System.out.println(customersJson);
        } else {
            System.out.println("Error: " + response.getStatus());
        }

        response.close();
    }

    private static void addCustomer() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(BASE_URL);
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);

        // Create the customer JSON data
        JSONObject customerData = new JSONObject();
        customerData.put("name", "John Doe");
        customerData.put("email", "johndoe@example.com");

        Response response = builder.post(Entity.entity(customerData.toJSONString(), MediaType.APPLICATION_JSON));

        if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
            System.out.println("Customer added successfully");
        } else {
            System.out.println("Error: " + response.getStatus());
        }

        response.close();
    }

    private static void updateCustomer() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(BASE_URL + "/{id}");
        target = target.resolveTemplate("id", 1); // Replace 1 with the actual customer ID
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);

        // Create the customer JSON data
        JSONObject customerData = new JSONObject();
        customerData.put("name", "Updated Name");
        customerData.put("email", "updated@example.com");

        Response response = builder.put(Entity.entity(customerData.toJSONString(), MediaType.APPLICATION_JSON));

        if (response.getStatus() == Response.Status.OK.getStatusCode()) {
            System.out.println("Customer updated successfully");
        } else {
            System.out.println("Error: " + response.getStatus());
        }

        response.close();
    }
}