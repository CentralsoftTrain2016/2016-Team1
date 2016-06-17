<%@page import="service.bean.CategoryBean"%>
<%@page import="service.CategoryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="bean" class="service.bean.Bean" scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<div style="display:inline-flex">
<form method="POST" action="TagTopServlet"><input type="submit" value ="トップ"></form>
<form method="POST" action="CategoryServlet"><input type="submit" value ="カテゴリ"></form>
<form method="POST" action="MypageServlet"><input type="submit" value ="マイページ"></form>
<form method="POST" action="UnansweredListServlet"><input type="submit" value ="未回答一覧"></form>
<form method="POST" action="AnsweredListServlet"><input type="submit" value ="回答済一覧"></form>
<form method="POST" action="RankingServlet"><input type="submit" value ="ランキング"></form>
<form method="POST" action="QuestionPostingServlet"><input type="submit" value ="質問投稿"></form>
<form method="POST" action="LogoutEndServlet"><input type="submit" value ="ログアウト"></form>

</div>
 <br><br>
<div style="display:inline-flex">

 <!-- beanからカテゴリ名を取得して数によって動的に表示 -->
<form method="POST" action="SearchResultServlet">
 	<SELECT name="searchCategory">
	<% for( domain.Category category : bean.getCategories() ){ %>
		<OPTION value = <%= category.getCategoryName().get() %>><%= category.getCategoryName().get() %></OPTION>
	<% } %>
</SELECT> <input type="text" name="searchWord"><input type="submit" value="検索"> <br>
</form>

</div>
<br>
</body>
</html>