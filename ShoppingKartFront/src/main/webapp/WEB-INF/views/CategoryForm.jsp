<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Category</title>
</head>
<body>
    <form action="addCategory" method="post">
 
  <br><br><br>Category Name:<br>
  <input type="text" name="categoryName" required><br><br>
  Category Description:<br>
  <input type="text" name="categoryDescription" required><br><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>