<%@ page import="com.encore.ex04.Emp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ex04_emp.jsp</title>
</head>
<body>
    <%
        Emp e = new Emp();
        out.print(e);

        e.setEmpno(7788);
        e.setName("choi");
        e.setPay(5000);

        out.print(e.toString());
    %>
</body>
</html>
