<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%
	String root = request.getContextPath();
%>

<body>
	<table>
		<tr bgcolor = "#7BD4B4">
			<td>
				<center>
				<img alt="logo" src="<%=root %>/imgs/logo.png">
				</center>
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor = "#7BD4B4">
				<a href="<%=root %>/">[HOME]</a>
				<a href="<%=root%>/bbs/list.jsp">[BBS]</a>
<%
String id=request.getParameter("id");
if(id.contains("--") || id.contains(",")|| id.contains(")")){
	response.sendRedirect("login.jsp");
}else{
				
String pw=request.getParameter("pw");
String sql="select name from user03 where id='"+id+"' and pw='"+pw+"'";
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="hr";
String password="hr";

System.out.println(sql);

Class.forName(driver);
Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
String name=null;

try{
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	if(rs.next())name=rs.getString(1);
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
				if(session.getAttribute("login_id")==null){
				%>
				<a href="<%=root %>/user/login.jsp">[LOGOUT]</a>
				<%}else{ %>
				<a href="<%=root %>/user/logout.jsp">[LOGIN]</a>
				<%} %>
			</td>
		</tr>	
		<tr>
			<td>
				<center>
				<!-- 메인시작 bgcolor="#A1D9B2" -->

				<%
if(name==null){
	out.print("<h1>로그인 실패</h1>");
}else{
	out.print("<h1>"+name+"님 로그인되었습니다.</h1>");
	session.setAttribute("login_user", name);
	session.setAttribute("login_id",id);
}
}
				%>
				<!-- 메인끝 -->
				</center>
			</td>
		</tr>	
		<tr>
			<td>
				<table align="center"  bgcolor = "#7BD4B4">
					<tr>
					
						<td><img alt="logo2" src="<%=root %>/imgs/logo2.png" style="width: 100px; height: auto;"></td>
						<td>
						<font color="#ffffff">
						비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br>
(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>
통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>
Copyright &copy; 비트캠프 All rights reserved.
						</font>
						</td>
				
					</tr>
				
				</table>
			
			</td>
		</tr>	
	</table>


</body>
</html>