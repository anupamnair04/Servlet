<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IF-else-if</title>
</head>
<body>
<c:set var="n1" value="${3}"/>  
<c:choose>
 <c:when test="${n1==1}">
    The value of n1 is 1
 </c:when>
 <c:when test="${n1==2}">
    The value of n1 is 2
 </c:when>
 <c:when test="${n1==3}">
    The value of n1 is 3
 </c:when>
 <c:otherwise>
    any other value
 </c:otherwise>
 </c:choose>
</body>
</html>