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
	<table border="1">
<%
	String empno = request.getParameter("empno");
	String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
	
	oracle.jdbc.driver.OracleDriver driver;
	driver=new oracle.jdbc.OracleDriver();
	Connection conn = null;
	Statement stmt=null;
	ResultSet rs = null;
	try{
		conn = DriverManager.getConnection(url);
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select empno, ename, sal, hiredate from emp where empno="+empno);
		while(rs.next()){
			out.print("<tr><td>사번</td><td>"+rs.getObject(1)+"</td></tr>");
			out.print("<tr><td>이름</td><td>"+rs.getObject(2)+"</td></tr>");
			out.print("<tr><td>연봉</td><td>"+rs.getObject(3)+"</td></tr>");
			out.println("<tr><td>입사일</td><td>"+rs.getObject(4)+"</td></tr>");
			
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