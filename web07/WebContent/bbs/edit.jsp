<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%
	String root=request.getContextPath();
%>
<body>
	<table width="100%">
		<tr>
			<td>
			<img alt="logo" src="<%=root %>/imgs/logo.png">
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#f0f0f0">
				<a href="<%=root %>/">[HOME]</a>
				<a href="<%=root %>/come.jsp">[���ô±�]</a>
				<a href="<%=root %>/bbs/list.jsp">[�� �� ��]</a>
				<%
				if(session.getAttribute("login_id")==null){
				%>
				<a href="<%=root %>/user/login.jsp">[�� �� ��]</a>
				<%}else{ %>
				<a href="<%=root %>/user/logout.jsp">[�α׾ƿ�]</a>
				<%} %>
			</td>
		</tr>
		<tr>
			<td>
				<center>
				<h1>����������</h1>
				<form action="update.jsp">
					<table>
						<tr>
							<td width="100">����</td>
							<td colspan="5"><input type="text" name="sub" value="<%=request.getParameter("sub")%>"></td>
						</tr>
						<tr>
							<td>�۹�ȣ</td>
							<td><%=request.getParameter("num") %><input type="hidden" name="num" value="<%=request.getParameter("num")%>"></td>
							<td width="100">�۾���</td>
							<td><%=request.getParameter("id") %></td>
							<td width="100">��¥</td>
							<td><%=request.getParameter("nalja") %></td>
						</tr>
						<tr>
							<td colspan="6"><textarea name="content" cols="60" rows="5"><%=request.getParameter("content") %></textarea></td>
						</tr>
						<tr>
							<td colspan="6">
								<input type="submit" value="�� ��">
								<input type="reset" value="�� ��">
							</td>
						</tr>
					</table>
				</form>
				</center>
			</td>
		</tr>
		<tr>
			<td>
				<table align="center">
					<tr>
						<td><img alt="logo2" src="<%=root %>/imgs/logo2.jpg"></td>
						<td><br><br><br>
						��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br>
(��)��Ʈ��ǻ�� ���ʺ��� ��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br>
����Ǹž� �Ű���ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br>
Copyright &copy; ��Ʈķ�� All rights reserved.<br><br><br>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>