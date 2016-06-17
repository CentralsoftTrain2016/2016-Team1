<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <jsp:useBean id="bean" class="service.bean.AnsweredListBean" scope="request" />
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>回答済質問一覧</title>
	<jsp:include page="pageSplit.jsp" />
</head>
<body>
	<h1>回答済質問一覧</h1>
	<jsp:include page="tag.jsp" /><br>

	<table>
		<tr><th>質問</th></tr>
			<% for( domain.Question question : bean.getAnswered() ){ %>
				<tr><td><%= question.getQuestionDetail().get() %></td></tr>
			<% } %>
	</table>
	<span id="prev">＜</span>　<span id="page"></span>　<span id="next">＞</span><br>

	<form method="POST" action="TopServlet"><input type="submit" value="戻る" /></form>
</body>
</html>