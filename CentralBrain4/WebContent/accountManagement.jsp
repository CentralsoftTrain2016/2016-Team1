<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		アカウント管理<jsp:include page="tag2.jsp" /></h1>
	<input type="text">
	<input type="submit" value="検索">
	<br>
	<h2>社員一覧</h2>


	<form method="POST" action="AccountRegistrationServlet">
		<input type="submit" value="登録">
	</form>


	<br>

	<form method="POST" action="../AdminServlet">
		<input type="submit" value="削除">
	</form>

	<br>
</body>
</html>
