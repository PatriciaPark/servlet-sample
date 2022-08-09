<%@ page import="model.vo.VO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	VO u = (VO)request.getAttribute("result");
%> 
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
		<tr>
			<td><%=u.getNum() %></td>
			<td><%=u.getId() %></td>
			<td><%=u.getPwd() %></td>
			<td><%=u.getName() %></td>
			<td><%=u.getData1() %></td>
			<td><%=u.getData2() %></td>
			<td><%=u.getData3() %></td>
		</tr>
	</table>
</body>
</html>