<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>

<button type="button"><span style="float: center;"><a href="shippingaddressPage">New Shipping Address</a></span></button><br><br>


<c:forEach items="${shippingList}" var="shipping" >
<div class="col-sm-3 col-sm-offset-1" style="width:300px;heigth:500px;border:5px solid grey; float: left; margin-left: 1.5em;" >
<br><font color="#ff0066">Shipping address</font><br><br>


Name:${shipping.userName}<br>

Contact Number:${shipping.contactNumber}<br>
Address:${shipping.address}<br>
Zipcode:${shipping.zipcode}

<br><br><button ><a href="loginPage?">Deliver Here</a></button><br><br>
</div>
</c:forEach>
<br><br>

</body>
</html>
