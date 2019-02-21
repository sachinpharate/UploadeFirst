<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="home">
		Name :-<input type="text" name="name" placeholder="name"><br>
		Age :-<input type="text" name="age" placeholder="age"><br>
		<input type="submit"><br>
	</form>
	I am in home jsp Welcome ${Obj.name} , ${Obj.age}
</body>
</html>