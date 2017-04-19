<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="my.to.CustomerDetails"%>
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
  <li><a href="HomePage.html" class="w3-hover-text-purple">Home</a></li>
 <li>  <a href="" class="w3-hover-text-purple">About us</a></li>
   <li><a href="" class="w3-hover-text-purple">Customer care</a></li>
  <li> <a href="" class="w3-hover-text-purple">Find ATM branch</a></li>
  <li> <a href="MP" class="w3-hover-text-purple w3-text-purple ">View Profile</a></li>
  <li> <a href="ChangePassword.jsp" class="w3-hover-text-purple">Change Password</a></li>
   </ul>
 </div>

 

<%CustomerDetails cds=(CustomerDetails)session.getAttribute("customerdetails");

%>
<h2 align="center" class="w3-text-green">welcome <%=session.getAttribute("name")%></h2>

<table class="w3-table">

<tr>
<td>Name:</td>
<td><%=cds.getName()%></td>
</tr>
<tr>
<td>Address:</td>
<td><%=cds.getAddress()%></td>
</tr>
<tr>
<td>Mobile number:</td>
<td><%=cds.getMobileNumber()%></td>
</tr>
<tr>
<td>Email id:</td>
<td><%=cds.getEmailId() %></td>
</tr>
<tr>
<td>Pan no:</td>
<td><%=cds.getPanNo() %></td>
</tr>
<tr>
<td>Aadhar no:</td>
<td><%=cds.getAadharNo() %></td>
</tr> 
</table>

</body>
</html>