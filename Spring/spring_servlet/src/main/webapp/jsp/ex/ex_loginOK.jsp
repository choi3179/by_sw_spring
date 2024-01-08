
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ex_loginOK.jsp</title>
</head>
<body>
    <%
        String id = request.getParameter("userId");
        String pwd = request.getParameter("pwd");

        String[] hobbys = request.getParameterValues("hobby");
    %>
    당신의 id : <%= id %> <br>
    당신의 password : <%= pwd%><br>
    당신의 취미는 :

    <%
        if(hobbys != null){
            for(int i=0;i<hobbys.length;i++){
    %>
                <%= hobbys[i]%> &nbsp;&nbsp;
    <%
            }
        }
    %>
</body>
</html>
