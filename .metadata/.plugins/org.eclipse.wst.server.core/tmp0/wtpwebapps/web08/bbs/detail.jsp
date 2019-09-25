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
	<%!
		Connection conn;
		Statement stmt;
		ResultSet rs;
	%>
<%
class Row{
	int num;
	String id;
	String sub;
	String content;
	Date nalja;
	
	public String getNalja(){
		String msg=(nalja.getYear()+1900)+"��"
				+(nalja.getMonth()+1)+"��"
				+nalja.getDate()+"��";
		return msg;
	}
}
Row row=new Row();
String param=request.getParameter("idx");
int num=0;
try{
	num=Integer.parseInt(param);
}catch(Exception e){
	response.sendRedirect("list.jsp");
	return;
}

String id="-";
String sub="-";
String content="-";
Date nalja=null;
String sql="select * from bbs03 where num="+num;
Class.forName(driver);
try{
	conn=DriverManager.getConnection(url, user, password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	if(rs.next()){
		row.num=rs.getInt("num");
		row.sub=rs.getString("sub");
		row.content=rs.getString("content");
		row.nalja=rs.getDate("nalja");
		row.id=rs.getString("id");
	}else{
		response.sendRedirect("list.jsp");
		return;
	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}

%>
	<h1 align="center">�� ������</h1>
	<table width=80% align=center>
		<tr>
			<td bgcolor="#E2E2E2" width=100>�۹�ȣ</td>
			<td><%=row.num %></td>
			<td bgcolor="#E2E2E2" width=100>�۾���</td>
			<td><%=row.id %></td>
			<td bgcolor="#E2E2E2" width=100>�ۼ���</td>
			<td><%=row.nalja %></td>
		</tr>
		<tr>
			<td bgcolor="#E2E2E2">����</td>
			<td colspan="5"><%=row.sub %></td>
		</tr>
		<tr>
			<td colspan=6><pre><%=row.content %></pre></td>
		</tr> <% //pre: pre���̿� �ִ� ������ �״�� ������-> ���Ϳ� �ڵ� br��ȯ %>
		<tr>
			<td colspan=6 bgcolor="#BFB9B6">
				<a href="edit.jsp?idx=<%=row.num %>">[�� ��]</a>
				<a href="delete.jsp?idx=<%=row.num %>">[�� ��]</a>
			</td>
		</tr>
	</table>


	<%@ include file="../templete/footer.jspf" %>
</body>
</html>