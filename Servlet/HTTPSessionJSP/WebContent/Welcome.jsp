<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body>
<%
String unm = request.getParameter("username");//Joy
session.setAttribute("usernm", unm);//usernm -> Joy
%>
Hello <%=unm %>
Welcome to JSP
<a href="./LogOut.jsp">Logout</a>
</body>
</html>