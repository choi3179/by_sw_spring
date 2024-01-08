<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	<h1>Login HTML</h1><hr />
	<table>
		<form action="../login"  name="frm" method="post">
			<tr>
				<td>User ID : </td>
				<td><input type="text"  name="id" placeholder="id input "/></td>
			</tr>
			<tr>
				<td>User PWD : </td>
				<td><input type="password"  name="pwd" placeholder="password input "/></td>
			</tr>
		
			<tr>
				<td>
					<input type="submit"  value="Submit"  onclick="sendData()"/>
					<input type="reset"  value="Reset" />
				</td>
			</tr>
		</form>
	</table>
</body>
</html>