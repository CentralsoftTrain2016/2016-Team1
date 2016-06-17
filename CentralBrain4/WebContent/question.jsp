<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   質問ページ<br>
    <jsp:include page="tag.jsp" />
<form>

    質問内容<br>
<textarea name="kanso" rows="4" cols="40"></textarea><br>

ベストアンサー<br>
   <textarea name="kanso" rows="2" cols="40"></textarea><br>

その他の回答<br>
   <textarea name="kanso" rows="2" cols="40"></textarea><br>
</form>

<form method="POST" action="AnswerServlet"><input type="submit" value="回答する" />
</form>

<form method="POST" action="QuestionListServlet"><input type="submit" value="戻る" />
</form>
</body>
</html>