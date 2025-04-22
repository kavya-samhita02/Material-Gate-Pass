<%-- 
    Document   : gpcreate
    Created on : 15 May, 2024, 12:32:23 PM
    Author     : SEKHAR
--%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gate Pass</title>
</head>
<body>
    <center><h1> Material Gate Pass Creation</h1></center><br>
    <div class="dark">
        <form method="post" action="Users1?action=push">
            <span style="padding-left:200px;"></span>   
        <label for="date">Date:</label>
        <input type="text" id="creation_date" name="creation_date" placeholder="DD/MM/YYYY"/> <br/><br/>
        <span style="padding-left:200px;"></span>
        <label for="dropdowm">Type:</label>
        <select id="Gp_type"name="Gp_type" >
        <option value="" ></option>   
        <option value="Returnable">Returnable</option>
        <option value="Non-Returnable">Non-Returnable</option>
        </select><br><br>
        <span style="padding-left:200px;"></span>
        <label for="dropdowm">Gate:</label>
        <select id="Gate_name"name="Gate_name" >
        <option value=""  ></option>  
        <option value="Main Gate">Main Gate</option>
        <option value="BC Gate">BC Gate</option>
        </select><br><br>
        <span style="padding-left:200px;"></span>
        <label for="vehicle no">Vehicle no:</label>
    <input type="text" id="Vehicle no" name="Vhcl_no">
<span style="padding-left:40px;"></span>
    <label for="destination">Destination:</label>
    <input type="Destination" id="Destination" name="Destination"><br><br>
    <span style="padding-left:200px;"></span>
    <label for="agency name">Agency_name:</label>
    <input type="text" id="Agency_name" name="Agency_name">
    <span style="padding-left:15px;"></span>
    <label for="agency address">Agency address:</label>
    <input type="text" id="agency_address" name="agency_address"><br><br>
    <span style="padding-left:400px;"></span>

    <button type="submit">Generate</button>
    <label for="gate pass no">Gate Pass No:</label>
    <label>${gpno}</label>
    
    <span style="padding-left:500px;"></span>

    

        
     
        
        
        </form>
</body>
</html>