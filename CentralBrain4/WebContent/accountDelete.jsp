<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="message" class="java.lang.String" scope="request" />
<html>
<head>
<link href="style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
			function chkForm(oj) {
				if (oj.id.value == '' && oj.pass.value == '') {
					alert(oj.id.name + 'と' + oj.pass.name + ' が未入力です');
					oj.id.focus()
					return false
				} else if (oj.pass.value == '') {
					alert(oj.pass.name + ' が未入力です');
					oj.pass.focus()
					return false
				} else if (oj.id.value == '') {
					alert(oj.id.name + ' が未入力です');
					oj.id.focus()
					return false
				} else {

				}
			}
		</script>
	<center>
		<form name="form5" action="AccountDeleteEndServlet"
			onsubmit="return chkForm(this)">
			<font size="1" color="#ff0000"><%=message%></font><br>
			<center>
				ID<br>
				<input type="text" name="id"> <br> <br> password
			</center>
			<input type="password" name="pass"><br>
			<br> <input type="submit" value="削除">
		</form>
	</center>
</body>
</html>