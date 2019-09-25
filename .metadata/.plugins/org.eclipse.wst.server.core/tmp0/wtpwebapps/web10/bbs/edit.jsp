<%@page import="java.sql.CallableStatement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp"></jsp:include>
	<!-- content -->
	<jsp:useBean id="bean" class="com.bit.dto.Bbs03Bean"></jsp:useBean>
	<jsp:setProperty property="num" name="bean"/>
	
	<%
	
	
	%>
	<h1 align="center">수정 페이지</h1>
	<table width="80%" align="center">
		<tr>
			<td>글번호</td>	
			<td><jsp:getProperty property="num" name="bean"/></td>
			<td>글쓴이</td>
			<td><jsp:getProperty property="id" name="bean"/></td>
			<td>날짜</td>
			<td><jsp:getProperty property="nalja" name="bean"/></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan=5><jsp:getProperty property="sub" name="bean"/></td>
		</tr>
		<tr>
			<td bgcolor="#CCCCCC" colspan=6><pre><jsp:getProperty property="content" name="bean"/></pre></td>
		</tr>
		<tr>
			<td colspan=6>
				<input type="submit" value="수정">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>