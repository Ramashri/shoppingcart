<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.w3-button {width:150px;}
.right {
    position: absolute;
    right: 0px;
    width: 300px;
    padding: 10px;
}
</style>
</head>
<body>

 <img src="resources/image/products/${product.productId}.jpg" alt="${product.productId}" width="250" height="400" align="left">
 
 
 <div class="right">
 <ul style="list-style-type:none">
  <li class="span2"><h5 style="color: #99003d" >${product.productName}</h5>
  <h6 style="color: #99003d">Price:${product.price}</h6></li></ul>
  <div class="w3-container">
  <p><a href="addtocart?productId=${product.productId}"><button class="w3-button w3-pink">Add To Cart</button></a></p>
  <p><a href="afterlogin"><button align="left" class="w3-button w3-purple">Go Back</button></a></p> 
       
</div>
</div>
<
</body>
</html>

