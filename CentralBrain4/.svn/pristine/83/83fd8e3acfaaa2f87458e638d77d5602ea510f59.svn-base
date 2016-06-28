<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- Beanを取得 --%>
<jsp:useBean id="bean" class="service.bean.QuestionModifyBean" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   質問内容修正ページ<br>
    <jsp:include page="tag.jsp" />

<form method="POST" action="QuestionModifyEndServlet">

    質問内容<br>
<textarea name="QuestionDetail" rows="4" cols="40" maxlength="2000"><%= bean.getQuestionDetail() %></textarea><br>
<input type="hidden" name="questionID" value="<%= bean.getQuestionID() %>" />
<input type="submit" value="修正する" />

</form>


</body>
</html>