<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <form action="addProduct" method="post" enctype="multipart/form-data">
 
  <br><br><br><br>Product Name:<br>
  <input type="text" name="ProductName" required><br><br>
  Product Description:<br>
  <input type="text" name="ProductDescription" required><br><br>
  Category:<br>
  <select name="Category">
  <br><br><option value="">Select Category</option><br><br>
  <c:forEach items="${categoryList}" var="category" varStatus="status"><br><br>
  <option value="${category.categoryName}">${category.categoryName}</option>
  </c:forEach>
</select>
 
 <br><br> SupplierName:<br>
  <select name="SupplierName"><br><br>
  <option value="">Select Supplier</option><br><br>
  <c:forEach items="${supplierList}" var="supplier" varStatus="status"><br><br>
  <option value="${supplier.supplierName}">${supplier.supplierName}</option>
  </c:forEach>
</select>
 <br><br> Price:<br>
  <input type="text" name="Price" required><br><br>
  Stock:<br>
  <input type="text" name="Stock" required><br><br>
  
 File to upload:
 <input type="file" name="file">
  <input type="submit" value="Submit">
  
</form>
 