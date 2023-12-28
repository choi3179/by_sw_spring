
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="ex_loginOK.jsp" method="post">
        ID : <input type="text"  name="userId"> <br />
        PWD : <input type="password"  name="pwd"> <br />
        Hobby :
        <input type="checkbox"  name="hobby"  value="baseball"> Baseball
        <input type="checkbox"  name="hobby"  value="soccer"> Soccer
        <input type="checkbox"  name="hobby"  value="basketball"> Basketball	 <br />
        <input type="submit"  value="로그인">
    </form>
</body>
</html>
