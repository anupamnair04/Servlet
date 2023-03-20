<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REDIRECT</title>
</head>
<body>
<c:set var="url" value="2" scope="request"/>  
  <c:if test="${url<=1}">  
     <c:redirect url="first.html"/>  
  </c:if>  
  <c:if test="${url>1}">  
     <c:redirect url="https://www.w3schools.com"/>  
  </c:if>  
</body>
</html>