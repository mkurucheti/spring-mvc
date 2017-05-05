<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="webjars/bootstrap/3.3.6/css/bootstrap.min.css" />" rel="stylesheet">
<title>Todos List</title>
</head>
<body>
	<h1>Todos are here</h1>
	<div class="container">
		<table class="table table-striped">
			<caption>Your Todos are</caption>
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
		<div>
			<a href="addtodo" class="button">Add</a>
		</div>
	</div>


<script src="<c:url value="webjars/jquery/1.9.1/jquery.min.js" />"></script>
<script src="<c:url value="webjars/bootstrap/3.3.6/js/bootstrap.min.js" />"></script>
</body>
</html>