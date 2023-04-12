<?php
    $servername = "localhost";
    $username = "root"; 
    $password = "";
    $db="appointment";
    $conn = new mysqli($servername, $username, $password,$db);
    if ($conn->connect_error) 
    {
        die("Connection failed: " . $conn->connect_error);
    }
     echo "Connected successfully<br><br>";
    $name=$_POST['name'];
    $mail=$_POST['mail'];
    $adate=$_POST['adate'];
    $atime=$_POST['atime'];
    
    if(!empty($name))
    {
        if(preg_match("/^([a-z A-Z 0-9 @+.-]+)(@[a-z A-Z 0-9 @+.-]+)(\.[a-zA-Z0-9])*$/", $mail))
        {
            if($adate!=NULL)
            {
                if($atime!=NULL)
                {
                    echo '<script>alert("Registered successfully")</script>';
                }
                else
                {
                echo '<script>alert("PLEASE FILL THE APPOINTMENT TIME")</script>';
                }
            }
            else
            {
                echo '<script>alert("PLEASE FILL THE APPOINTMENT DATE")</script>';
            }
        }
        else
        {
            echo '<script>alert("INVALID EMAIL")</script>';
        }
    }
    else
    {
        echo '<script>alert("INVALID NAME")</script>';
    }
    $sql="insert into appointments values('$name','$mail','$adate','$atime')";
    if($conn->query($sql)===TRUE)
    {
        echo 'Thank you for filling the form <br> <br> ';
        echo 'Your data is inserted';
    }
    else
    {
        echo 'Error'.$sql."<br>".$conn->error;
    }
?>

