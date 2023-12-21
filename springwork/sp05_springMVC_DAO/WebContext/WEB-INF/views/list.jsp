
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Page</h1>
    <c:forEach items = "${list}" var="list">
        ${list.deploctno}
        ${list.dname}
        ${list.deptno} <hr/>
    </c:forEach>

    <input type="button" value="지점저장" onclick="javascript:window.location.href = 'writeform.do'" >
</body>
</html>
