<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body><%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String area = request.getParameter("area");
	String sel = request.getParameter("sel");
	
	java.util.Enumeration hnames = request.getHeaderNames();
	while(hnames.hasMoreElements()){
		System.out.println(hnames.hasMoreElements());
	}
	%>
	<h1>파라미터 읽기</h1>
	<p>id:<%= id%></p> 
	<p>pw:<%= pw%></p> 
	<p>name:<%= name%></p> 
	<p>sel:<%= sel %></p>
	
</body>
</html>