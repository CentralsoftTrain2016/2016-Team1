<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ベストアンサー数ランキング</title>
</head>
<body>

<h1>ベストアンサー数ランキング</h1>
<jsp:include page="tag.jsp" />
<br><br>

ベストアンサー数
<br>
<div style="border: 1px solid #FF0000; padding: 100px;">ベストアンサー数</div>
<br>
<br>
<form method="post" action="RankingServlet"> <input type="submit" value="戻る"></form>
</body>
</html>