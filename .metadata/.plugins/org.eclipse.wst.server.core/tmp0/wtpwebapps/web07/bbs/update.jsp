<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,com.bit.db.MyOracle"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String param=request.getParameter("num");
	int num=Integer.parseInt(param);
	String sub=request.getParameter("sub");
	String content=request.getParameter("content");
	String sql="update bbs03 set sub='";
	sql+=sub+"', content='"+content+"' where num="+num;
	
	Connection conn=null;
	Statement stmt=null;
	
	try{
		conn=MyOracle.getConnection();
		stmt=conn.createStatement();
		int result=stmt.executeUpdate(sql);
		if(result>0){
			response.sendRedirect("detail.jsp?idx="+num);
		}else{
			response.sendRedirect("edit.jsp?idx="+num);
		}
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	
	%>
</body>
</html>