<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Todo</title>
</head>
<body>
	<p><font color="red">${errorMessage}</font></p>
	<form action="addtodo" method="post">
		Description : <input type="text" name="desc" /> <input type="submit" value="Add"/>
	</form>
</body>
</html>