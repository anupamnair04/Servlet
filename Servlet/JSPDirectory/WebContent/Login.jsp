<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login JSP</title>
<%@ include file="/header.jsp" %>
</head>
<body>
 <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if(username.equals("joy") && password.equals("joy123")){
 %>
	<jsp:forward page="./Welcome.jsp">
	<jsp:param name="role" value="student"/>
	</jsp:forward>
	
 <% }else{
	out.println("<p>Invalid Login</p>");
 %>
	
 <% } %>
</body>
<jsp:include page="/footer.jsp" />
</html>