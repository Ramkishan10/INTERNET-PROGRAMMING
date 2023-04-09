<!DOCTYPE html>

<html>
    <head>
        
    </head>
    <body>
      <form method="post" action="form.php">
    Name: <input type="text" name="name"><br>
    Email: <input type="email" name="email"><br>
    date and time: <input type="text" name="dt"><br>
    <input type="submit" value="Submit">
 </form>

    </body>
</html>
<?php
$servername="localhost";
$username="root";
$password="";
$dbname="form";
$uname="";
$mail="";
$datetime="";
$con=new mysqli($servername,$username,$password,$dbname);
//if($con->connect_error)
//{
  //  echo "Unable to connect with database";
//}
//$sql="create database form";

//if($con->query($sql)===true)
//{
   //echo "Create table";
//}
//$con->close();
$sql="create table formdata(name varchar(50),email varchar(50),date_time varchar(50))";
if($con->query($sql)=== TRUE)
{
    echo "Table creation is successfull";
}
else{
    echo "Creation is not possibe";
}
// Insert data into MySQL
/*$uname = $_POST['uname'];
$mail = $_POST['mail'];
$datetime=$_POST['datetime'];
$sql = "INSERT INTO formdata (name,email,dt) VALUES ('$uname', '$mail','$datetime')";
$name=$_POST['name'];
$mail=$_POST['mail'];
$adate=$_POST['datetime'];*/
$con->close();
?>


