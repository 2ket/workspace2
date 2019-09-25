<%@page import="com.bit.model.Bbs04Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
	String param=request.getParameter("num");
	int num=Integer.parseInt(param);
	String sub=request.getParameter("sub");
	String content=request.getParameter("content");
	
	String param1=request.getParameter("ref");
	String param2=request.getParameter("seq");
	String param3=request.getParameter("lev");
	int ref=Integer.parseInt(param1);
	int seq=Integer.parseInt(param2);
	int lev=Integer.parseInt(param3);
	
	Bbs04Dao dao=new Bbs04Dao();
	if(num==ref){
		dao.reAdd2(sub, content, ref, 0, lev);
	}else{
		dao.reAdd2(sub, content, ref, seq, lev);
	}
		response.sendRedirect("list.jsp");
	%>
</body>
</html>