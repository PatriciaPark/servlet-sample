<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><a href="main.jsp">MAIN</a></h2>
	<table>
		<tr>
			<th>NUM</th>
			<th>ID</th>
			<th>PWD</th>
			<th>NAME</th>
			<th>DATA 1</th>
			<th>DATA 2</th>
			<th>DATA 3</th>
		</tr>
		<c:forEach items="${list}" var="list">
		<tr>
			<td>${list.num}</td>
			<td>${list.id}</td>
			<td>${list.pwd}</td>
			<td>${list.name}</td>
			<td>${list.data1}</td>
			<td>${list.data2}</td>
			<td>${list.data3}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>