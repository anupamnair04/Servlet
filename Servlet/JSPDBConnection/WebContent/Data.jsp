<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data JSP</title>
</head>
<body>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
//Establish Connection between Java Application & Oracle Data Base
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anupam");

Statement stmt = con.createStatement();

ResultSet rs = stmt.executeQuery("select * from emp");
%>

<table border="1">
<tr><th>EMP ID</th><th>EMP NAME</th><th>EMP SALARY</th></tr>

<%
while(rs.next())
{
%>

<tr>
  <td><%=rs.getInt(1) %></td>
  <td><%=rs.getString(2) %></td>
  <td><%=rs.getDouble(3)%></td>
</tr>

<% } %>  
</table>
</body>
</html>