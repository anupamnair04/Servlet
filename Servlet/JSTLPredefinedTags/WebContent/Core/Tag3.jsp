<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Multiple IF</title>
</head>
<body>
<%--Multiple if in JSTL --%>
<c:set var="n1" value="${5}" scope="session" />  
<c:if test="${n1%2 == 0}">  
   <p>The number is Even  ${n1} </p>  
</c:if>

<c:if test="${n1%2 != 0}">  
   <p>The number is Odd   ${n1} </p>  
</c:if>

<c:set var="n1" value="${6}" scope="session" />
<!-- using another EL syntax of operators-->
<c:if test="${n1%2 eq 0}">  
   <p>The number is Even:<c:out value="${n1}"/></p>  
</c:if>
<c:if test="${n1%2 ne 0}">  
   <p>The number is Odd:<c:out value="${n1}"/></p>  
</c:if>    
</body>
</html>