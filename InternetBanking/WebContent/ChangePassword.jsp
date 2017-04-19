<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
   <li> <a href="" class="w3-hover-text-purple">Find ATM branch</a></li>
  <li><a href="MP" class="w3-hover-text-purple">View Profile</a></li>
   <li> <a href="ChangePassword.jsp" class="w3-text-purple">Change Password</a></li>
   </ul>
 </div>
 <h2 align="center" class="w3-text-green">welcome <%=session.getAttribute("name")%></h2>

 <div>
<form action="CP" method="post">
<table>
<tr>
<td>Old password</td>
<td><input type="password" name="t1"></td>
</tr>
<tr>

<td>New password</td>
<td><input type="password" name="t2"></td>
</tr>
<tr>
<td>Retype new password</td>
<td><input type="password" name="t3"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="update"></td>
</tr>
</table>
</form>
</div>
<div class="w3-container w3-teal w3-orange" align="center">
  <h3>All rights reserved for users</h3>
</div>
	
</body>
</html>
