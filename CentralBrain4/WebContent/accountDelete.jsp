<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>社員削除</h1>
<h5>削除する社員を選んでください</h5>
<div style="border: 1px solid #FF0000; padding: 100px;">社員一覧</div>
<br>
<br>
<form method="post" action="AccountDeleteEndServlet"> <input type="submit" value="削除"></form>
<form method="post" action="MypageServlet"> <input type="submit" value="戻る"></form>
</body>
</html>