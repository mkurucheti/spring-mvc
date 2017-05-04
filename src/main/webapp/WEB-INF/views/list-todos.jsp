<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos List</title>
</head>
<body>
	<h1>Todos are here</h1>
	<div>
		<table>
			<thead>
				<tr>
					<td>Name</td>
					<td>Description</td>
					<td>Due Date</td>
					<td>Is Completed</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.user}</td>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
					</tr>				
				</c:forEach>
			</tbody>
		</table>
	</div>

<a href="addtodo" class="button">Add</a>
</body>
</html>