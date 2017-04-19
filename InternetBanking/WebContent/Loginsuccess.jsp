<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="my.to.Customer" import="java.sql.*" import="my.to.AccountDetails"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="w3.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="w3-container w3-teal">
   <img src="images/index.jpeg" class="w3-round" alt="Norway" height=100 width=1500>
 
   </div> 
   <div class="w3-container w3-row w3-orange w3-padding-8">
      <ul class="w3-navbar w3-orange"> 
 <li> <a href="HomePage.html" class="w3-hover-text-purple">Home</a></li>
  <li> <a href="" class="w3-hover-text-purple">About us</a></li>
   <li><a href="" class="w3-hover-text-purple">Customer care</a></li>
   <li><a href="" class="w3-hover-text-purple">Find ATM branch</a></li>
   <li><a href="MP" class="w3-hover-text-purple">View Profile</a></li>
   <li><a href="ChangePassword.jsp" class="w3-hover-text-purple">Change Password</a></li>
   </ul>
 </div>
    <div class="w3-container w3-center">
  <h3 class="w3-text-cyan">welcome to Internet banking</h3>
</div> 





<%
Customer c=(Customer)session.getAttribute("customer");
AccountDetails ac=(AccountDetails)session.getAttribute("account");
session.setAttribute("name",ac.getName());
%>
<h2 align="center" class="w3-text-green">welcome <%=ac.getName()%></h2>

	<table border=1 class=w3-table>
	<tr>
	<th>Account Holder Name</th>
	<th>Account Number</th>
	<th>Available Balance</th>
	<th>Account Type</th>
	
	</tr>
	<tr>
	<td><%=ac.getName() %>
	<td><%=ac.getAccNumber()%></td>
	<td><%=ac.getAccBalance()%></td>
	<td><%=ac.getAccType()%></td>
	
	
	</tr>
	</table>
	
	
	<div class="w3-container w3-teal w3-orange" align="center">
  <h3>All rights reserved for users</h3>
</div>
	
</body>
</html>