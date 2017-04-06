
<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Shopping Cart</title>
	
<style>
p{ line-height: 1em; }
h1, h2, h3, h4{

        color: orange;
	font-weight: normal;
	line-height: 1.2em;
	margin: 0 0 .5em 0;
}
h1{ font-size: 1.7em; }
h2{ font-size: 1.5em; }
a{
	color: black;
	text-decoration: none;

}
	a:hover,
	a:active{ text-decoration: none; }

body{
   font-family: arial; font-size: 100%;line-height: 1.2em; width: 100%; margin: 0 0 .5em 0; background: #eee; text-align: center;
}
#nav ul {
    list-style-type: none;
    margin:0 0 .5em 0;
    padding: 0;
    font-weight: normal;
    line-height: 1.2em;
    overflow: hidden;
    background-color: black;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: orange; 
}



#page{ margin: 20px; }



</style>
</head>
<body>
<div id="logo">
			<h1><a href="/" id="logoLink">Shopping Cart</a></h1>
		</div>		
 <%@include file="/WEB-INF/views/Menu.jsp" %>
 
  <c:choose>
     <c:when test="${not empty loginButtonClicked}">    
     
      <%@include file="/WEB-INF/views/NewLogin.jsp" %>
     </c:when>
     
     <c:when test="${not empty signupButtonClicked}">
     
    <%@include file="/WEB-INF/views/NewSignup.jsp" %>
     </c:when>
     
     <c:otherwise>Hai</c:otherwise>
     </c:choose> 
      
</body>
</html>
