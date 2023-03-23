<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:greenyellow">
        <h1 style="text-align:center">Movie Analaysis</h1>
        <% 
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/movie");
              Statement st1=c.createStatement();
              Statement st2=c.createStatement();
              Statement st3=c.createStatement();
              String q1="select count(movie_id) from MOVIE";
              String q2="select avg(price) from movie";
              String q3="select director from movie where rating=(select max(rating) from movie)";
              ResultSet rs=st1.executeQuery(q1);
              ResultSet rs1=st2.executeQuery(q2);
              ResultSet rs2=st3.executeQuery(q3);              
        %>
    <center><table border="dotted">
            <tr><th>No.of movies</th><th>Average price of movie</th><th>Highest rating director</th></tr>
        <% 
            while(rs.next())
            {
                out.println("<tr><td>"+rs.getString(1)+"</td>");
            }
            while(rs1.next())
            {
                out.println("<td>"+rs1.getString(1)+"</td>");
            }
            while(rs2.next())
            {
                out.println("<td>"+rs2.getString(1)+"</td></tr></table></center>");
            }
            
        %>
    </body>
</html>

            