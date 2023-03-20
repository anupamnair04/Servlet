<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>C:out Tag</title>
</head>
<%--expression language syntax ${}  --%>
<%--out displays value on page  --%>  
<body>
 <c:out value="${'Hello World'}"/>   
 <br>
 <br>
 <c:out value="${'Welcome to JSP JSTL'}"/>
 <hr>
 <!-- It is use to set the value for EL variable -->
<c:set var="n1" value="${4}"   scope="session" />
<c:set var="n2" value="${8}"   scope="session"  />  
addition is <c:out value="${n1+n2}"/>  
<hr>
<c:set var="n1"   value="${1000}"  scope="session"/>  
<p> Value of n1 is: <c:out value="${n1}"/></p>  

<!-- It is used to remove EL variable -->
<c:remove var="n1"/>  
<p>After Remove Value of n1 is: 
<c:out value="${n1}"/>
 </body>
</html>