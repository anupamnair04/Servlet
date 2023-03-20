<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="ob" class="seed.jsp.LogBean"></jsp:useBean>
    
    <!-- when RP names match BP names -->
    <jsp:setProperty name="ob" property="*" />

    <!-- Explicit mapping when Request parameter names dont match bean property name -->
    <jsp:setProperty name="ob" property="username" param="userId"/> 

    <!-- Pass data from web.xml -->
    <jsp:setProperty name="ob" property="dbDriver" value='<%=application.getInitParameter("dbdriver")%>'/>
    <jsp:setProperty name="ob" property="dbUrl" value='<%=application.getInitParameter("dburl")%>'/>
    <jsp:setProperty name="ob" property="dbUser" value='<%=application.getInitParameter("dbuser")%>'/>
    <jsp:setProperty name="ob" property="dbPass" value='<%=application.getInitParameter("dbpass")%>'/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CheckUser JSP</title>
</head>
<body>
 <%
		boolean ret = ob.validateUser();
		if (ret == true) {
 %>
 <h1>Welcome!!! <jsp:getProperty name="ob" property="username" /></h1>	
	
	<jsp:include page="catalog.jsp">
	<jsp:param value='<%=request.getParameter("userId")%>' name="personName"/>
	</jsp:include>
 <%
	} else {
 %>
	<jsp:forward page="invalid.jsp"></jsp:forward>
 <%
	}
 %>
 
</body>
</html>