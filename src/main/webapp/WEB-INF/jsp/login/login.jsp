<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
let checkLogin=function() {
	let f=document.loginForm
	
	if(f.id.value==''){
		alert('아이디를 입력하세요')
		f.id.focus()
		return false
	}
	if(f.password.value==''){
		alert('패스워드를 입력하세요')
		f.password.focus()
		return false
	}
	return true
	
}

</script>
</head>
<body>
<div align="center">
	<H2>로그인</H2>
	<form method="post" name="loginForm" onsubmit="return checkLogin()"><!-- return true은 넘어가게, return false는 안넘어가게 웹브라우저 이벤트는 자바스크립트 -->
	
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
			<th>password</th>
			<td><input type="password" name="password"></td>
			</tr>
		</table>
		<br>
		<button type="submit" >로그인</button>

	</form>
</div>


</body>
</html>