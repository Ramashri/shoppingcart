<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br><br><br>List of Supplier<br><br>

<head>
<style>
table, th, td{
          border:1px solid black;
          border-collapse: collapse;
}
th,td{
    padding:5px;
}
th {
    text-align: left;
}
</style>
</head>
<body>
<table  style ="width:100%">

	<tr>
	    <th align="left">S.No</th>
		<th align="left">Id</th>
		<th align="left">Name</th>
		<th align="left">ContactNumber</th>
		<th align="left">Edit</th>
		<th align="left">Delete</th>
		
	</tr>
	<c:forEach items="${supplierList}" var="supplier" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${supplier.supplierId}</td>
			<td>${supplier.supplierName}</td>
			<td>${supplier.contactNumber}</td>
			<td><a href="editSupplier?supplierId=${supplier.supplierId}">edit</a></td>
			<td><a href="deleteSupplier?supplierId=${supplier.supplierId}"onclick="return confirm('Are You Sure? Do you Want Delete Category : ${category.categoryName} ?')">delete</a></td>
		</tr>
	</c:forEach>
</table>