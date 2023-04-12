<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <style>
            form
            {
                background-color: tomato;
                width:50%;
                
            }
        </style>
    </head>
    <body>
        <center>
           <h2>Form Validation</h2>
                <form name="myForm" action="http://localhost/ex11/formvalidate.php" method="post">
                    <table style="height:250px;"> 
                        <tr>
                            <td>Enter your Name:<br><br></td>
                            <td><input type="text" name="name" title="name should only contain letters"><br><br></td>
                        </tr>
                        <tr>
                            <td>Enter your mail ID:<br><br></td> 
                            <td><input type="email" name="mail" title="enter a proper email iD"><br><br></td>
                        </tr>
                        <tr>
                            <td>Choose appointment date<br><br></td>
                            <td><input type="date" name="adate"><br><br></td> 
                        </tr>
                        <tr>
                            <td>Choose appointment time<br><br></td> 
                            <td><input type="time" name="atime"><br><br></td>
                        </tr>
                    </table>
                    <td><input type="submit" value="submit"></td>
                    <td> <input type="reset" value="clear"></td>
                    <br><br>
                </form>
        </center>   
    </body>
</html>
