<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  <!--  ここにuseBeanを書く -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>回答画面</title>
<SCRIPT language="JavaScript">
<!--
// 数値のみを入力可能にする
function numOnly() {
  m = String.fromCharCode(event.keyCode);
  if("0123456789\b\r".indexOf(m, 0) < 0) return false;
  return true;
}
//-->
</SCRIPT>
</head>
<body>
       <h1>回答画面</h1><br>
    <jsp:include page="tag.jsp" />
    <br>
     <form method="POST" action="AnswerEndServlet">
	    回答<br>
	    <!-- 質問ID固定値 -->
	    <input type=hidden name="questionID" value="111" >
	    <!-- 投稿日時固定値 -->
	    <input type=hidden name="postDate" value="2016/06/01 12:12:12" >
		<textarea name="answerDetail" rows="10" cols="40"></textarea><br>

		 <br>
		 		アドバイス<br>
		<textarea name="adviceDetail" rows="10" cols="40"></textarea><br>

		<br>
		新入社員が閲覧可能となるまでの期間<br>
		<input type="text" name="viewableTimeH" style="width: 30px;" onkeyDown="return numOnly()">
		時間
		<input type="text" name="viewableTimeM" style="width: 30px;" onkeyDown="return numOnly()">
		分
		<input type="text" name="viewableTimeS" style="width: 30px;" onkeyDown="return numOnly()">
		秒
		<br><br>
			<input type="submit" value ="送信" >
 </form>
<br>
<!-- 質問画面に戻る -->
<form method="POST" action="QuestionServlet"><input type="submit" value="back" />
</form>
</body>
</html>