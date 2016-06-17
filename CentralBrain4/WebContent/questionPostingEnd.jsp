<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投稿完了</title>
</head>
<body>
<center>
<form>
		<jsp:include page="tag.jsp" /><br>
		  投稿完了しました<br>
</form>

<form method="POST" action="QuestionServlet"><input type="submit" value="質問を見る" />
</form>
<form method="POST" action="QuestionPostingServlet"><input type="submit" value="back" />
</form>
</center>

</body>
</html>