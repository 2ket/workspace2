<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../templete/header.jspf" %>
	<%
	request.setCharacterEncoding("euc-kr");
	//POST방식 한글처리
	String method = request.getMethod();//"GET"
	if("POST".equals(method)){
		String sub=request.getParameter("sub");
		String content=request.getParameter("content");
		String id=request.getParameter("id");
		String sql="insert into bbs03 (num, sub, content, nalja, id) values (bbs03_seq.nextval, '"+sub+"', '"+content+"', sysdate, '"+id+"')";
		System.out.println(sql);
		Class.forName(driver);
		Connection conn=null;
		Statement stmt=null;
		try{
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql);
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		response.sendRedirect("list.jsp");
	}
	
	
	%>
	
	
	<h1>입력 페이지</h1>
	
	<form method="post">
		<table align="center">
			<tr>
				<td width=80 bgcolor="#E2E2E2">제목</td>
				<td><input type="text" name="sub" size=50></td>
			</tr>
			<tr>
				<td width=80 bgcolor="#E2E2E2">글쓴이</td>
				<td><input type="text" name="id"  size=50></td>
			</tr>
			<tr>
				<td align="center" colspan=2><textarea name="content" rows="5" cols="50"></textarea>
			</td>
			</tr>
			<tr>
				<td align="center" colspan=2 bgcolor="#E2E2E2">
				<input type="submit" value="입 력">
				<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
	
	<%@ include file="../templete/footer.jspf" %>
</body>
</html>