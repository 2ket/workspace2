<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 리스트</h1>
	<table border="1" width=400>
	<tr>
		<th width="80">사번</th>
		<th>이름</th>
		<th width="100">연봉</th>
	</tr>
<%
	String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
	
	oracle.jdbc.driver.OracleDriver driver;
	driver=new oracle.jdbc.OracleDriver();
	Connection conn = null;
	Statement stmt=null;
	ResultSet rs = null;
	try{
		conn = DriverManager.getConnection(url);
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select empno, ename, sal from emp");
		while(rs.next()){
			out.print("<tr><td>"+rs.getObject(1)+"</td>");
			out.print("<td><a href=\"detail.jsp?empno="+rs.getObject(1)+"\">"+rs.getObject(2)+"<a></td>");
			out.println("<td>"+rs.getObject(3)+"</td>"+"</tr>");
			
		}
		
		
	}finally{
	if(rs!=null){rs.close();}
	if(stmt!=null){stmt.close();}
	if(conn!=null){conn.close();}
	}
%>
	
	</table>
</body>
</html>