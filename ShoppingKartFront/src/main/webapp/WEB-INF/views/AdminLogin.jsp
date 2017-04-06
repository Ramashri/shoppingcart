<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Shopping Cart</title>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome Admin
<div id="logo">
			<h1><a href="/" id="logoLink">Shopping Cart</a></h1>
		</div>
<div id="nav">
<nav role="sub">
			<ul>  

<%@include file="/WEB-INF/views/Menu.jsp" %>

  </ul>
  </div>
  
     <div class="dropdown">
   <button class="dropbtn"><li>Category</li></button>
    <div class="dropdown-content">
      <a href="viewCategory">View</a>
      <a href="categoryPage">Add</a>
    </div>
  </div> 			
  
  <div class="dropdown">
   <button class="dropbtn"><li>Product</li></button>
    <div class="dropdown-content">
      <a href="viewProduct">View</a>
      <a href="productPage">Add</a>
    </div>
  </div> 	
  
  <div class="dropdown">
   <button class="dropbtn"><li>Supplier</li></button>
    <div class="dropdown-content">
      <a href="viewSupplier">View</a>
      <a href="supplierPage">Add</a>
    </div>
  </div> 
  
  <c:choose>
     <c:when test="${not empty AddCategoryButtonClicked}">    
     
      <%@include file="/WEB-INF/views/CategoryForm.jsp" %>
     </c:when>
     
     <c:when test="${not empty ViewCategoryButtonClicked}">
       <%@include file="/WEB-INF/views/ViewCategory.jsp" %>
   
     </c:when>
     
     <c:when test="${not empty editCategoryClicked}">
       <%@include file="/WEB-INF/views/EditCategory.jsp" %>
   
     </c:when>
     
     <c:when test="${not empty AddProductButtonClicked}">    
     
      <%@include file="/WEB-INF/views/NewProduct.jsp" %>
     </c:when>
     
     <c:when test="${not empty ViewProductButtonClicked}">
       <%@include file="/WEB-INF/views/ViewProduct.jsp" %>
   
     </c:when>
     
     <c:when test="${not empty editProductClicked}">
       <%@include file="/WEB-INF/views/EditProduct.jsp" %>
   
     </c:when> 
     
      <c:when test="${not empty AddSupplierButtonClicked}">    
     
      <%@include file="/WEB-INF/views/NewSupplier.jsp" %>
     </c:when>
     
     <c:when test="${not empty ViewSupplierButtonClicked}">
       <%@include file="/WEB-INF/views/ViewSupplier.jsp" %>
   
     </c:when>
     <c:when test="${not empty editSupplierClicked}">
       <%@include file="/WEB-INF/views/EditSupplier.jsp" %>
   
     </c:when>
     
     <c:otherwise>Welcome Admin!!!!!!!!!!!</c:otherwise>
     </c:choose> 
</body>
</html>