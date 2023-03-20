<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <% response.setStatus(200); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error JSP</title>
</head>
<body>
<%@ page isErrorPage="true"%>
<h3>Exception Occured</h3>

Exception:<%= exception.getMessage() %><br>
Exception:<%= exception %><br>
</body>
</html>