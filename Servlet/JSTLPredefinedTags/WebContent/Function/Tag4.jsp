<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contains</title>
</head>
<body>
<c:set var="S1" value="Hello World Welcome to JSP JSTL"/>  
  
<c:if test="${fn:contains(S1, 'Welcome')}">  
   <p>Found Welcome word in a String<p>  
</c:if>  
</body>
</html>