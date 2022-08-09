<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><a href="main.jsp">MAIN</a></h2>
	<form method="post" action="update">
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>PWD</th>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>DATA 1</th>
				<td><input type="text" name="data1"></td>
			</tr>
			<tr>
				<th>DATA 2</th>
				<td><input type="text" name="data2"></td>
			</tr>
			<tr>
				<th>DATA 3</th>
				<td><input type="text" name="data3"></td>
			</tr>
			<tr>
				<th><input type="submit" value="SUBMIT"></th>
			</tr>
		</table>
		
	</form>
</body>
</html>