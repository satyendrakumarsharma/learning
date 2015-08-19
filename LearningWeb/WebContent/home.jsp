<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>.:: Home ::.</title>
	<link rel="stylesheet" type="text/css" href="style/ems_common.css">
	<style type="text/css">
		body{
			background-color: #99C68E; 
		}
	</style>
</head>
<body>
	<h2 align="center">Event Management System</h2>
	<hr color="green" />
	<%@include file="nav.jsp"%>
	<div style="float: right; padding-right:50px;">
		Welcome&nbsp;<b><%=request.getSession().getAttribute("currently_logged_user") %></b> !
	</div>
</body>
</html>