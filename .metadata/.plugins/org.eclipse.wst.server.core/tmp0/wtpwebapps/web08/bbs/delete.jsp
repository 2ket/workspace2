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
	<center>
	<h1>삭제하시겠습니까?</h1>
	<form method="post">
		<input type="hidden" name="num" value="<%=request.getParameter("idx")%>">
		<input type="submit" value="삭 제">
	</form>
	</center>
	<%@ include file="../templete/footer.jspf" %>
	<%
	String method=request.getMethod();
	if("POST".equals(method)){
		String param=request.getParameter("num");
		int num=Integer.parseInt(param);
		Class.forName(driver);
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="delete from bbs03 where num=?";
		
		try{
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement("delete from bbs03 where num=?");
			pstmt.setInt(1, num); //?부분에 보내주는 인자. 파라미터의 인덱스에 해당하는 부분(순서, 인덱스명)
			int result=pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		response.sendRedirect("list.jsp");
	}
	
	%>
</body>
</html>