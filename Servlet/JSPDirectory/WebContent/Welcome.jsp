<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body>
 <%
    String name=request.getParameter("username");
    String role=request.getParameter("role");
 %>
 Welcome <%=name%>,
 <%
    //session is an object of HttpSession 
      session.setAttribute("uname",name);
      out.print("<br>Role:"+role);  
 %>
 
 Click below to view Products<br>
 <a href="ViewProduct.jsp">View Product</a>
 <%@ include file="/header.jsp" %>
 <jsp:include page="/footer.jsp" />
</body>
</html>