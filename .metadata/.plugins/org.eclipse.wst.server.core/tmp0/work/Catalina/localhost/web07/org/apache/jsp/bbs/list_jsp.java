/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-05-23 09:52:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");

	String root=request.getContextPath();

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<table width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<img alt=\"logo\" src=\"");
      out.print(root );
      out.write("/imgs/logo.png\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#f0f0f0\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(root );
      out.write("/\">[HOME]</a>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(root );
      out.write("/come.jsp\">[오시는길]</a>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(root );
      out.write("/bbs/list.jsp\">[게 시 판]</a>\r\n");
      out.write("\t\t\t\t");

				if(session.getAttribute("login_id")==null){
				
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(root );
      out.write("/user/login.jsp\">[로 그 인]</a>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(root );
      out.write("/user/logout.jsp\">[로그아웃]</a>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t<h1>게시판</h1>\r\n");
      out.write("\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t<select name=\"option\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"sub\">제목</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"id\">글쓴이</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"keyword\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<table width=\"80%\" border=\"1\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"80\">글번호</th>\r\n");
      out.write("\t\t\t\t\t\t<th>글제목</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"100\">글쓴이</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"100\">날 짜</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");

String option=request.getParameter("option");
if(option==null){
	option="sub";
}
String keyword=request.getParameter("keyword");
if(keyword==null){
	keyword="";
}
String sql="select * from bbs03 where "+option+" like'%";
sql+=keyword+"%' order by num desc";
Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	conn=com.bit.db.MyOracle.getConnection();
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	int cnt=0;
	while(rs.next()){
		cnt++;
		String ele="";
		if(cnt%2==0){
			ele=" bgcolor=\"#ffff90\"";
		}

      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td ");
      out.print(ele );
      out.write('>');
      out.print(rs.getInt("num") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td ");
      out.print(ele );
      out.write("><a href=\"detail.jsp?idx=");
      out.print(rs.getInt("num") );
      out.write('"');
      out.write('>');
      out.print(rs.getString("sub") );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td ");
      out.print(ele );
      out.write('>');
      out.print(rs.getString("id") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td ");
      out.print(ele );
      out.write('>');
      out.print(rs.getDate("nalja") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");

	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}

      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form action=\"add.jsp\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"입 력\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><img alt=\"logo2\" src=\"");
      out.print(root );
      out.write("/imgs/logo2.jpg\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br>\r\n");
      out.write("(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>\r\n");
      out.write("통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>\r\n");
      out.write("Copyright &copy; 비트캠프 All rights reserved.<br><br><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}