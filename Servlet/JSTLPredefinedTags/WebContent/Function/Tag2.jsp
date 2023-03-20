<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>String Length</title>
</head>
<body>
<c:set var="str1" value="Java Is object oriented language"/>  
<c:set var="str2" value="Hello, Welcome to JSP"/>  
Length of the String-1 is: ${fn:length(str1)}<br>  
Length of the String-2 is: ${fn:length(str2)}  
</body>
</html>