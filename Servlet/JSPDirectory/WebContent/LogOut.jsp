<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogOut JSP</title>
</head>
<body>
 <%=session.getAttribute("uname") %> Successfully Log Out.
 <% session.invalidate(); %>
 <%@ include file="/header.jsp" %>
 <jsp:include page="/footer.jsp" />
</body>
</html>