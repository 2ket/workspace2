<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="ex08.jsp">
		id:<input type="text" name="id"><br><br>
		pw:<input type="password" name="pw"><br><br>
		name:<input type="text" name="name"><br><br>
		list: <select name ="sel">
		<option>item1</option>
		<option>item2</option>
		<option>item3</option>
		<option>item4</option>
		<option>item5</option>
	
	</select><br>
	<textarea name = "area" rows="5" cols="10"></textarea>
	<br>
	<input type="radio" name = "ra" value = "ra1">ra1
	<input type="radio" name = "ra" value = "ra2">ra2
	<input type="radio" name = "ra" value = "ra3">ra3
	<input type="radio" name = "ra" value = "ra4">ra4
		<input type = "submit" value="전송">
	</form>
</body>
</html>