<%@page import="service.bean.CategoryBean"%>
<%@page import="service.CategoryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="service.bean.Bean" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>質問投稿</title>
</head>
<body>

	<h1>質問投稿ページ</h1>
	<jsp:include page="tag.jsp" />


	<form method="POST" action="QuestionPostingEndServlet">
		<br>
<!-- 		<select name="cate1"> -->
<%-- 			<% for( domain.Category category : bean.getCategories() ){ %> --%>
<%-- 				<OPTION value = <%= category.getCategoryName().get() %>><%= category.getCategoryName().get() %></OPTION> --%>
<%-- 			<% } %> --%>
<!-- 		</select> -->
<!-- 		<select name="cate2"> -->
<%-- 			<% for( domain.Category category : bean.getCategories() ){ %> --%>
<%-- 				<OPTION value = <%= category.getCategoryName().get() %>><%= category.getCategoryName().get() %></OPTION> --%>
<%-- 			<% } %> --%>
<!-- 		</select> -->
<!-- 		<select name="cate3"> -->
<%-- 			<% for( domain.Category category : bean.getCategories() ){ %> --%>
<%-- 				<OPTION value = <%= category.getCategoryName().get() %>><%= category.getCategoryName().get() %></OPTION> --%>
<%-- 			<% } %> --%>
<!-- 		</select> -->

			<select name = "category" multiple>
 			<% for( domain.Category category : bean.getCategories() ){ %>
 				<OPTION value = <%= category.getCategoryName().get() %>><%= category.getCategoryName().get() %></OPTION>
 			<% } %>
			</select>
			<font color="#ff0000">*最低10文字以上入力してください </font><br>
			　　　　　　　　　　カテゴリはCtrlまたはShiftで複数選択できます。

		<br><textarea name="detail" rows="6" cols="80"  maxlength="2000"></textarea><br>
		<%= bean.getMessage() %><br>
		<input type="submit"  value="送信" />
	</form>


</body>
</html>