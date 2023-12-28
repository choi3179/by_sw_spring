<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Form Page</title>
</head>
<body>
<form action="delete.do"  method="post">

    삭제할 번호 : <input type="text" name="deptno"> <br /><br />

    <input type="submit" value="삭제"> &nbsp; &nbsp;
    <input type="reset" value="취소"> <br />

    <input type="button" value="List Page"  onclick="location.href='list.do' "> &nbsp;&nbsp;
    <input type="button" value="Write Page"  onclick="location.href='writeform.do' ">
</form>
</body>
</html>