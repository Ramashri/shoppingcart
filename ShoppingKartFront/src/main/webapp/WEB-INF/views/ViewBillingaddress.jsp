<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<button type="button"><span style="float: center;"><a href="billingaddressPage">New Billing Address</a></span></button><br><br>


<c:forEach items="${billingList}" var="shipping" >
<div class="col-sm-3 col-sm-offset-1" style="width:300px;heigth:500px;border:5px solid grey; float: left; margin-left: 1.5em;" >

<a href="deletebillingAddress?billingId=${billing.billId}">
<span style="float: right;" class="glyphicon glyphicon-trash"></span> 
</a>
<a href="editbillingAddress?shippingId=${billing.billId }">
<span style="float: right;"class="glyphicon glyphicon-pencil"></span>
</a>

<br><font color="#ff0066">Billing address</font><br><br>

Name:${billing.userName}<br>

Contact Number:${billing.contactNumber}<br>
Address:${billing.address}<br>
Zipcode:${billing.zipcode}

<br><br><button ><a href="billingAddress?billingId=${billing.billId}">Deliver Here</a></button><br><br>
</div>
</c:forEach>
<br><br>

</body>
</html>
