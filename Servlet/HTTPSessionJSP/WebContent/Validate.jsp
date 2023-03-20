<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validate JSP</title>
</head>
<body>
<% 
String username = request.getParameter("username");
String password = request.getParameter("password");

if( username.equals("Joy") && password.equals("Joy123"))
{
	RequestDispatcher rd = request.getRequestDispatcher("/Welcome.jsp");
	rd.forward(request, response);
	
}
else
{
	out.println("<p>Invalid username or password</p>");
	RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
	rd.include(request, response);
}
%>
</body>
</html>