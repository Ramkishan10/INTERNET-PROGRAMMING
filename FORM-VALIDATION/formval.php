<!DOCTYPE html>
<html>
    <head>
        <title>Form validation</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            form
            {
                width: 30%;
                height:130%;
                background-color: lightsteelblue;
                
            }
            body
            {
              background-color: black;
            }
       </style>
    </head>
    <body>
        <center>
           <h2 style="color:white;">Form Validation</h2>
                  <form name="myForm" action="http://localhost/ip/val.php" method="post">
                   <table> 
     <tr>
      <td>Enter your Name:<br><br></td>
      <td><input type="text" name="fname" title="name should only contain letters"><br><br></td>
      <tr>
        <td>Enter your mail ID:<br><br></td> 
        <td><input type="email" name="mail" title="enter a proper email iD"><br><br></td>
      </tr>
      <tr>
        <td>choose your gender<br><br></td>
        <td><input type="radio" name="gender">male <input type="radio" name="gender">Female<br><br></td> 
      </tr>
    <tr>
    <td>Mobile No:<br><br></td> 
      <td><input type="number" name="number" pattern="/^\d{10}$/"><br><br></td>`
      
    </tr>
    <tr>
      <td>choose your DOB:<br><br></td> 
      <td><input type="date" name="date"><br><br></td>
    </tr>
    <tr>
    <td>Create your password:<br><br></td> 
      <td><input type="password" name="password"  title="Eight or more characters"><br><br></td>
      
    </tr>
    <tr>
    <td>Confirm your password:<br><br></td> 
      <td><input type="password" name="cpassword"><br><br></td>
      
    </tr>
   
    <tr>
      <tr>
        <td>Enter your Address<br><br></td> 
        <td><textarea rows="6" cols="25" name="address"></textarea><br><br></td>
      </tr>
      <tr>
        <td>choose your Location:<br><br></td> 
        <td>
        <select id="state" name="state" >
          <option value="please select a state">please select a state</option>
          <option value="Telangana">Telangana</option>
          <option value="TamilNadu">TamilNadu</option>
          <option value="Kerala">Kerala</option>
          <option value="Andhra pradesh">Andhra pradesh</option>
          <option value="Karnataka">Karnataka</option>
          <option value="Maharashtra">Maharashtra</option>
          <option value="Rajasthan">Rajasthan</option>
          <option value="Gujarat">Gujarat</option>
          <option value=">Assam">Assam</option>
      </select><br><br>
      </td>
    </select>
      </tr>
    </table> 
    <td colspan="2"><input type="submit" value="submit"></td>
    <td colspan="2"> <input type="reset" value="clear"></td>
    <br><br>
    </form></center>
 </body>
</html>
