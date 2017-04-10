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
<div>

<span style="float: center">New Shipping Address</span>
</div>
<div style="width:500px;heigth:500px;border:5px solid gray;">
<font color="#ff0066">Shipping address</font><br><br>
<c:forEach items="${shippingList}" var="shipping" >
${shipping.userName}<br>
${shipping.emailId}<br>
${shipping.contactNumber}<br>
${shipping.address}<br>
${shipping.zipcode}
</div>
</c:forEach>
</div>

</body>
</html>
