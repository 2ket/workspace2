/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-05-24 10:27:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {



String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="hr";
String password="hr";

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/bbs/../templete/footer.jspf", Long.valueOf(1558675790353L));
    _jspx_dependants.put("/bbs/../templete/header.jspf", Long.valueOf(1558680455327L));
  }

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
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path=request.getRequestURI();
int cnt=-2;
for(int i=0; i<path.length(); i++){
	if(path.charAt(i)=='/'){cnt++;}
}
path="./";
for(int j=0; j<cnt; j++){
	path+="../";
}//상대경로 만드는 함수


      out.write("\r\n");
      out.write("\t<table width=\"800\" align=\"center\" border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">로그인</a>\r\n");
      out.write("\t\t\t\t\t\t\t/\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">회원가입</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"><img src=\"");
      out.print(path );
      out.write("/imgs/logo.png\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"200\"></td>\r\n");
      out.write("\t\t\t<td width=\"100\"><a href=\"");
      out.print(path );
      out.write("\">[HOME]</a></td>\r\n");
      out.write("\t\t\t<td width=\"100\"><a href=\"");
      out.print(path );
      out.write("comming.jsp\">[오시는길]</a></td>\r\n");
      out.write("\t\t\t<td width=\"100\"><a href=\"");
      out.print(path );
      out.write("bbs/list.jsp\">[게 시 판]</a></td>\r\n");
      out.write("\t\t\t<td width=\"100\"><a href=\"#\">[방 명 록]</a></td>\r\n");
      out.write("\t\t\t<td width=\"200\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t<!-- main start -->\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<h1>삭제하시겠습니까?</h1>\r\n");
      out.write("\t<form method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(request.getParameter("idx"));
      out.write("\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"삭 제\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\t\t<!-- main end -->\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<br><br><br><br>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td><img align=\"right\" width=70% height=auto alt=\"logo2\" src=\"");
      out.print(path);
      out.write("/imgs/logo2.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=5>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br>\r\n");
      out.write("(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>\r\n");
      out.write("통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>\r\n");
      out.write("Copyright &copy; 비트캠프 All rights reserved.</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');

	String method=request.getMethod();
	if("POST".equals(method)){
		String param=request.getParameter("num");
		int num=Integer.parseInt(param);
		Class.forName(driver);
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="delete from bbs03 where num=?";
		
		try{
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement("delete from bbs03 where num=?");
			pstmt.setInt(1, num); //?부분에 보내주는 인자. 파라미터의 인덱스에 해당하는 부분(순서, 인덱스명)
			int result=pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		response.sendRedirect("list.jsp");
	}
	
	
      out.write("\r\n");
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
