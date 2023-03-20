<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Collections FOR EACH</title>
</head>
<body>
<%--printing collections with for each loop --%>
<c:set var="n1">1,2,3,4,5,6,7,8,9,10</c:set>
Values are:<br>
<c:forEach var="x"  items="${n1}">
<c:out value="${x}"/><br>
</c:forEach>
<hr>
</body>
</html>