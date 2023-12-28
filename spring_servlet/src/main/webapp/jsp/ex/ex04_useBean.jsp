
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.encore.ex04.Emp"%>

<jsp:useBean id="e" class="com.encore.ex04.Emp"/>
<jsp:setProperty name="e" property="name" value="choi"/>
<jsp:setProperty name="e" property="pay" value="9876"/>
<jsp:setProperty name="e" property="empno" value="1234"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%= e.toString()%> <br>
<%
    e.setName("kim");
    e.setPay(3000);
    out.print(e);
%>
</body>
</html>
