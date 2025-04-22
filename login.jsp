<%-- 
    Document   : LOGIN
    Created on : 15 May, 2024, 10:33:23 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gate Pass </title>
     <style>
         <center>
         
            .dark{
                padding:15px;
                background:#e6e6e6;
                margin-top:10px;
                margin-bottom:10px;
                float:left;
                width:30%;}
            </center>
     </style>
        
    </head>
    <body>
    <center><h1> Material Gate Pass System</h1></center>
    <center><div class="dark"></center>
        
        <form method="post" action="Users?action=validate">
            
    <center><label for="user_name">User Name:</label>
  <input type="text" id="user_name" name="user_name"><br><br></center>
  <center><label for="passwd">Password:</label>
  <input type="password" id="passwd" name="passwd"><br><br></center>
  <center><button type="submit">Login</button>
  <button type="submit">Clear</button></center>
        </form>
    <span style="color:red"> ${loginResult}</span>
    </body>
</html>