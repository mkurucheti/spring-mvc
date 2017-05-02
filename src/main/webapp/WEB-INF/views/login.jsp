<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<p><font color="red">${errorMessage}</font></p>
	<form method="POST" action="login">
		Login Name: <input type="text" name="name"/>
		Password: <input type="password" name="password"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>