<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="message" class="java.lang.String" scope="request" />
<jsp:useBean id="userNamemessage" class="java.lang.String" scope="request" />
<jsp:useBean id="passwordmessage" class="java.lang.String" scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社員新規登録</title>
</head>
<body>
	<center>
		<h1>新規社員登録</h1>
		<h5>全ての項目を入力してください</h5>
		<form action="AccountRegistrationEndServlet">

			<font size="1" color="#ff0000"><%= message %></font><br>
			<div style="display: inline-flex">
				ユーザーID：
				<input type="text" name="id" >
			</div>
<br>
<br>
			<font size="1" color="#ff0000"><%= passwordmessage %></font><br>
			<div style="display: inline-flex">
				パスワード：
				<input type="text" name="pass" >
			</div>
<br>
<br>
			<font size="1" color="#ff0000"><%= userNamemessage %></font><br>
			<div style="display: inline-flex">
				名前：
				<input type="text" name="userName" >
			</div>
<br>
<br>
			<div style="display: inline-flex">
				性別：
				<input type="radio" name="sex" value="male" checked>男 <input
					type="radio" name="sex" value="female">女<br>
			</div>
<br>
<br>
			生年月日：
			<SELECT name="year">
				<OPTION value="1960">1960</OPTION>
				<OPTION value="1961">1961</OPTION>
				<OPTION value="1962">1962</OPTION>
				<OPTION value="1963">1963</OPTION>
			</SELECT> <SELECT name="month">
				<OPTION value="01">1</OPTION>
				<OPTION value="02">2</OPTION>
				<OPTION value="03">3</OPTION>
				<OPTION value="04">4</OPTION>
				<OPTION value="05">5</OPTION>
				<OPTION value="06">6</OPTION>
				<OPTION value="07">7</OPTION>
				<OPTION value="08">8</OPTION>
				<OPTION value="09">9</OPTION>
				<OPTION value="10">10</OPTION>
				<OPTION value="11">11</OPTION>
				<OPTION value="12">12</OPTION>
			</SELECT> <SELECT name="day">
				<OPTION value="01">1</OPTION>
				<OPTION value="02">2</OPTION>
				<OPTION value="03">3</OPTION>
				<OPTION value="04">4</OPTION>
				<OPTION value="05">5</OPTION>
				<OPTION value="06">6</OPTION>
				<OPTION value="07">7</OPTION>
				<OPTION value="08">8</OPTION>
				<OPTION value="09">9</OPTION>
				<OPTION value="10">10</OPTION>
				<OPTION value="11">11</OPTION>
				<OPTION value="12">12</OPTION>
				<OPTION value="13">13</OPTION>
				<OPTION value="14">14</OPTION>
				<OPTION value="15">15</OPTION>
				<OPTION value="16">16</OPTION>
				<OPTION value="17">17</OPTION>
				<OPTION value="18">18</OPTION>
				<OPTION value="19">19</OPTION>
				<OPTION value="20">20</OPTION>
				<OPTION value="21">21</OPTION>
				<OPTION value="22">22</OPTION>
				<OPTION value="23">23</OPTION>
				<OPTION value="24">24</OPTION>
				<OPTION value="25">25</OPTION>
				<OPTION value="26">26</OPTION>
				<OPTION value="27">27</OPTION>
				<OPTION value="28">28</OPTION>
				<OPTION value="29">29</OPTION>
				<OPTION value="30">30</OPTION>
				<OPTION value="31">31</OPTION>
			</SELECT> <br> <br><input type="radio" name="usertype"
				value="NewEmployee" checked>新入社員 <input type="radio"
				name="usertype" value="OldEmployee">既存社員






				 <br> <br> <input
				type="submit" value="新規登録">
		</form>
		<form action="AccountManagementServlet">
			<input type="submit" value="戻る">
		</form>
		<br> <br> <br>
	</center>
</body>
</html>