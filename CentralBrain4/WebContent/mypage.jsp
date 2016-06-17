<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
</head>
<body>
<h1>マイページ</h1>
<jsp:include page="tag.jsp" />
<br>
<table border="3">
	<tr>
		<td rowspan="5">
			<img src="samplePicture/sample.png" width="200" height="200" alt="代替テキスト" align="left">
		</td>
		<td>山田太郎　男　1990/01/01</td>
	</tr>
	<tr>
		<td>回答数:</td>
	</tr>
	<tr>
		<tr>
		<td>ベストアンサー数:</td>
	</tr>
	<tr>
		<td>
			ここに文字を入力する。<br>
   			ここに文字を入力する。<br>
   			ここに文字を入力する。<br>
   			<br>
   			<form method="POST" action="ProfileServlet"><input type="submit" value ="編集" style="width:50px; height:25px"></form>
		</td>
	</tr>
	<tr>
		<td>
			<form method="POST" action="MyQuestionListServlet"><input type="submit" value ="質問一覧" style="width:180px; height:40px"></form>
		</td>
		<td>
			<form method="POST" action="MyAnswerListServlet"><input type="submit" value ="回答一覧" style="width:180px; height:40px"></form>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<form method="POST" action="FavoriteListServlet"><input type="submit" value ="お気に入り一覧" style="width:360px; height:80px"></form>
		</td>
	</tr>
</table>
<br>
<br>
<form method="post" action="TopServlet"> <input type="submit" value="戻る"></form>
</body>
</html>