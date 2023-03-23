<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from HTML</h1>
	<%= "<h1>Hello from HTML</h1>" %>
	
	<%
		int x=10;
	%>
	<input type="text" value="<%= x %>" />
	<br/>
	
	<%
		for(int i=0;i<=10;i++){
			out.print("i = "+i+"<br/>");
		}
	%>
	
	The current date is = <%= new Date() %>
	<br/>
	
	<form action="">
	Enter your name : <input type="text" name="fname">
	<br/>
	<input type="submit" name="click" value="Click Me">
	</form>
	
	<%
		if(request.getParameter("click") != null){
			out.print("Hello "+request.getParameter("fname"));
		}
	%>
	
	<%@include file="footer.html" %>
	
</body>
</html>