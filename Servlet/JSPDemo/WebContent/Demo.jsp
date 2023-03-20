<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP DEMO</title>
</head>
<body>

 <!-- HTML COMMENT --><br>
 
 <%-- JSP COOMENT --%><br>
 
 <!-- Scriplet Tag -->
 <% out.println("Welcome to JSP"); %><br>
 
 <!-- Declaration Tag -->
 <% int a = 10; %><br>
 
 <!-- Expression Tag --><br>
 <%= a %><br>
 
 <% out.print(2*5); %>  
</body>
</html>