package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"http://img.wallpaperstock.net:81/color-cube-wallpapers_7959_1920x1200.jpg\">\r\n");
      out.write("\r\n");
      out.write("\t<h2>Complete the sign up process</h2>\r\n");
      out.write("\t<form style=\"height: 40px; \"> <img src=\"http://www.y-nottouring.com/images/info.jpg\" width=\"30\" height=\"30\"> Please fill all fields in order to register! </form>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"register\" method=\"post\">\r\n");
      out.write("\t\t &nbsp; &nbsp;&nbsp;\r\n");
      out.write("\t\t<table  align = \"left\" style=\"height: 372px; width: 388px; \">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Full Name:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"fullname\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Email:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"email\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Password:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"password\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan='2' align = \"center\"><input name=\"submit\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\tvalue=\"Register\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table> \r\n");
      out.write("\t\t<img align = \"center\" src=\"http://www.marblewebsites.co.uk/images/database.jpg\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
