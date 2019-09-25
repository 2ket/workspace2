<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<%
	
	String sql = "";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	int result=0;
	
	Class.forName(driver);
	Connection conn=null;
	Statement stmt=null;
	try{
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		result=stmt.executeUpdate(sql);
	}finally{
		if(stmt!=null){stmt.close();}
		if(conn!=null){conn.close();}
	}
	if(result>0){
		out.print("<h1>수정 성공</h1>");
	}else{
		out.print("<h1>수정 실패</h1>");
	}
	%>
</body>
</html>