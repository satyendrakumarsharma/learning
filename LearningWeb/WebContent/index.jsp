<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2 align="center">Event Management System</h2>
	<hr color="blue"/>
	<div id="navigation">
		<ul>
			<li>Home</li>
			<li>Events</li>
			<li>Reports</li>
			<li>Contacts</li>
			<li>Logout</li>
		</ul>
	</div>
	<div id="loginPannel" style="border:solid double green">
		<form action='LoginAction'>
			<table>
				<tr>
					<td>Username:</td><td><input type='text' name='username'/></td>
				</tr>
				<tr>
					<td>Password:</td><td><input type='password' name='password'/></td>
				</tr>
				<tr>
					<td></td><td><input type='submit' value='Login'/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
