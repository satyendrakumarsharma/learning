<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div id="navigation">
		<ul>
			<li><a href="">Home</a></li>
			<li><a href="">Events</a></li>
			<li><a href="">Reports</a></li>
			<li><a href="">Contacts</a></li>
	<%
		if(session.getAttribute("currently_logged_user") != null) {
	%>
			<li><a href="CentralController?action=logout" onclick="return confirm('Do you want to logout?');">Logout</a></li>
	<%
		}
	%>
		</ul>
	</div>