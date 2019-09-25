<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
				<a href="<%=root %>/user/login.jsp>">[LOGIN]</a>
			</td>
		</tr>	
		<tr>
			<td>
				<center>
				<!-- 메인시작 -->
				
				
				
				
				<!-- 메인끝 -->
				</center>
			</td>
		</tr>	
		<tr>
			<td>
				<table align="center">
					<tr>
						<td><img alt="logo2" src="<%=root %>/imgs/logo2.jpg"></td>
						<td>
						비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928
(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245
통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진
Copyright &copy; 비트캠프 All rights reserved.
						</td>
					</tr>
				
				</table>
			
			</td>
		</tr>	
	</table>


</body>
</html>