/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-05-27 08:55:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bit.model.*;

public final class reAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/bbs/../template/footer.jspf", Long.valueOf(1558921726064L));
    _jspx_dependants.put("/bbs/../template/header.jspf", Long.valueOf(1558921577884L));
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
      out.write("    <!-- main color #7BD4B4 dark color #2D303F-->\r\n");
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
      out.write("\t<table width=800 align=center border=1>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=center bgcolor=\"#7BD4B4\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(path );
      out.write("/imgs/logo.png\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=center bgcolor=\"#2D303F\">\r\n");
      out.write("\t\t\t<font color=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t[<a href=\"/web09/\" >HOME</a>]\r\n");
      out.write("\t\t\t\t[<a href=\"/web09/intro.jsp?idx=1234\">jsp에러처리</a>]\r\n");
      out.write("\t\t\t\t[<a href=\"/web09/\">게시판</a>]\r\n");
      out.write("\t\t\t\t[<a href=\"/web09/\">방명록</a>]\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.write('\r');
      out.write('\n');
      out.write('	');

	String param=request.getParameter("idx");
	int num=Integer.parseInt(param);
	
	Bbs04Dao dao= new Bbs04Dao();
	Bbs04Bean bean = dao.getTitle(num);
	
	
      out.write("\r\n");
      out.write("\t\t<h1>답글달기</h1>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<form action=\"reInsert.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"ref\" value=\"");
      out.print(bean.getRe_ref());
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"seq\" value=\"");
      out.print(bean.getRe_seq());
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"lev\" value=\"");
      out.print(bean.getRe_lev());
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(bean.getNum() );
      out.write("\">\r\n");
      out.write("\t\t\t\t<table width=\"500\" >\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>답</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"sub\" value=\"re:");
      out.print(bean.getSub());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"content\" rows=\"6\" cols=\"50\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"답글\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"reset\" value=\"취소\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\r\n");
      out.write("\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<br><br><br><br>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("\t\t\t<td>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br>\r\n");
      out.write("(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>\r\n");
      out.write("통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>\r\n");
      out.write("Copyright &copy; 비트캠프 All rights reserved.</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>    \t\t");
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
