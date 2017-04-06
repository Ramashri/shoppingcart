<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
List of Product

<table  width="50%" class="table table-hover">
	<tr>
	    <th align="left">S.No</th>
		<th align="left">Id</th>
		<th align="left">Name</th>
		<th align="left">Description</th>
		<th align="left">Stock</th>
		<th align="left">Price</th>
		<th align="left">Category</th>
		<th align="left">SupplierName</th>
		<th align="left">Edit</th>
		<th align="left">Delete</th>
		
	</tr>
	<c:forEach items="${productList}" var="product" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${product.productId}</td>
			<td>${product.productName}</td>
			<td>${product.productDescription}</td>
			<td>${product.stock}</td>
			<td>${product.price}</td>
			<td>${product.category}</td>
			<td>${product.supplierName}</td>
			<td><a href="editProduct?productId=${product.productId}">edit</a></td>
			<td><a href="deleteProduct?productId=${product.productId}" onclick="return confirm('Are You Sure? Do you Want Delete Product : ${product.productName} ?')">delete</a></td>
		</tr>
	</c:forEach>
</table>