<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Server Test</title>
</head>
<body>
<%
	Date today = new Date();
	for(int i=1; i<=10; i++) {
		out.println(i);
	}
	
	for(int i=1; i<=10; i++) { %>
	
	<%= i %><br />
	
<% } %>	

<h1><%= today %></h1>
</body>
</html>