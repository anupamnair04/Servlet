<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Arethmatic Operation</title>
</head>
<body>
<%@page errorPage="Error.jsp"%>
 <%
  int a = Integer.parseInt(request.getParameter("n1"));
  int b = Integer.parseInt(request.getParameter("n2"));
  
  int c= a/b;
  
  out.print("Division:"+ c);
 %>
</body>
</html>