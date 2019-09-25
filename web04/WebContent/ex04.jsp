<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>선언부</h1>
	<p>&lt;%! <br><br> %&gt;</p>
	<%!
	public void func(){
		
	}
	public void func2(int a){
		
	}
	public static void func3(){
		
	}
	
	%>
	
	
	<table border=1>
	<%
	String msg ="";
		for(int i=2; i<10; i++){
			msg+="<th>"+i+"단</th>";
		}
		for(int i=1; i<10; i++){
			msg+="<tr>";
			for(int j=2; j<10; j++){
				msg+="<td>"+j+" * "+i+ " = " +(i*j)+"</td>";
			}
			msg+="</tr>";
		}
	%>
	<%= msg %>
	</table>
</body>
</html>