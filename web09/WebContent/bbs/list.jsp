<%@page import="com.bit.model.Bbs04Bean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="../err.jsp"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.bit.model.Bbs04Dao" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%!
%>
<body>
	<!-- main start -->
	<%@ include file="../template/header.jspf" %>
	<%
	ArrayList<Bbs04Bean> list=null;
	Bbs04Dao dao=new Bbs04Dao();
	list=dao.getList();
	%>
	
		<h1>게시판 페이지</h1>
		<table width=80% align="center" border=1 cellspacing=0>
			<tr>
				<th width=80>글번호</th>
				<th>제목</th>
				<th width=100>날짜</th>
			</tr>
			<%for(int i=0; i<list.size(); i++){
				Bbs04Bean bean =list.get(i); 
			%>
			<tr>
				<a href="detail.jsp?idx=<%=bean.getNum() %>">
				<td><%= bean.getNum() %></td>
				<td><%= bean.getSub()%></td>
				<td><%= bean.getNalja()%></td>
				</a>
			</tr>
			<%} %>
		</table>
		<center>
			<a href="add.jsp">[입 력]</a>
		</center>
		
	<%@ include file="../template/footer.jspf" %>
	<!-- main end -->
</body>
</html>