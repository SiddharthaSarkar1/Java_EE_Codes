<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="st" uri="WEB-INF/mytags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<st:MyDate/>
	<st:CustomDateTag format="dd.mm.yy"/>
	<br/>
	<st:upper>this will be displayed in upper case.</st:upper>
</body>
</html>