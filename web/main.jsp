<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>MAIN</h3>
	<ol>
		<li><a href="register.jsp">Register</a></li>
		<li><a href="modify.jsp">Modify</a></li>
		<li><a href="delete.jsp">Delete</a></li>
		<li><a href="search.jsp">Search</a></li>
		<li><a href="<%=request.getContextPath()%>/list">List</a></li>
	</ol>	
</body>
</html>