<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String action = request.getParameter("action");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="style/ems_common.css">
</head>
<body>
	<h2 align="center">Event Management System</h2>
	<hr color="blue" />
	<%@include file="nav.jsp" %>
	<div align="center">
	<%if(action!=null && action.equals("loggedout")){
	%>
	<div id="logoutMessageBox">
		Successfully logged out !<br/><br/>
		<a class='switch' href="index.jsp">Login Again</a>
	</div>
	<%
	} else if (session.getAttribute("currently_logged_user") != null) {
		request.getRequestDispatcher("home.jsp").forward(request, response);
	} else {
	%>
		<div id="loginPannel" style="border: solid double green">
			<form action='CentralController' method="post">
				<input type="hidden" name="action" value="login" />
				<table style="opacity: 1;">
				<caption>LOGIN</caption>
					<tr>
						<td>Username:</td>
						<td><input type='text' name='username' size="25" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type='password' name='password' size="25" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type='submit' value='Login' /></td>
					</tr>
					<tr>
						<td colspan="2" align="right">
						<span id="loginErr">
						<%
							if(action != null && action.equals("login_failed")){
								%><small>Username or Password entered wrong!</small><%
							}
						%>
						</span>
						</td>
					</tr>
				</table>
			</form>
		</div>
	<%} %>
	</div>
</body>
</html>