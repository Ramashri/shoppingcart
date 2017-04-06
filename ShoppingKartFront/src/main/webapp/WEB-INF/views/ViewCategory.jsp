<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
List of Category


<table  width="50%" class="table table-hover">
	<tr>
	    <th align="left">S.No</th>
		<th align="left">Id</th>
		<th align="left">Name</th>
		<th align="left">Description</th>
		<th align="left">Edit</th>
		<th align="left">Delete</th>
		
	</tr>
	<c:forEach items="${categoryList}" var="category" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${category.categoryId}</td>
			<td>${category.categoryName}</td>
			<td>${category.categoryDescription}</td>
			<td><a href="editCategory?categoryId=${category.categoryId}">edit</a></td>
			<td><a href="deleteCategory?categoryId=${category.categoryId}" onclick="return confirm('Are You Sure? Do you Want Delete Category : ${category.categoryName} ?')">delete</a></td>
		</tr>
	</c:forEach>
</table>