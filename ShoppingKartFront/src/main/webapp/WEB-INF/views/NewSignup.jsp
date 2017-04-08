<!DOCTYPE html>
<html lang="en">
<head>
  <title>Signup</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <form action="addNewUser" method="post" class="form-horizontal">
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="username">UserName:</label>
      <div class="col-sm-10">
        <input type="text" name="UserName" class="form-control" id="username" placeholder="Enter UserName">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">EmailId:</label>
      <div class="col-sm-10">          
        <input type="email" name="EmailId" class="form-control" id="email" placeholder="Enter EmailId">
      </div>
      </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2" for="password">Password:</label>
      <div class="col-sm-10">          
        <input type="password" name="Password" class="form-control" id="pwd" placeholder="Enter Password">
      </div>
      </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2" for="contactnumber">Contact Number:</label>
      <div class="col-sm-10">          
        <input type="text" name="ContactNumber" class="form-control" id="contactnumber" placeholder="Enter Contact Number">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="address">Address:</label>
      <div class="col-sm-10">          
        <input type="text" name="Address" class="form-control" id="address" placeholder="Enter Address">
      </div>
    </div>
    
     <div class="form-group">
     <label class="control-label col-sm-2" for="zipcode">Zipcode:</label>
      <div class="col-sm-10">          
        <input type="text" name="Zipcode" class="form-control" id="zipcode" placeholder="Enter Zipcode">
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">SignUp</button>
      </div>
    </div>
</html>







 
 

