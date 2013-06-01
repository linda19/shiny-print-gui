package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Upload a file please</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"http://img.wallpaperstock.net:81/color-cube-wallpapers_7959_1920x1200.jpg\">\n");
      out.write("\t<h1><small>Upload the  files </small></h1>\n");
      out.write("\tIn order to submit your assignment select the files from your computer and press Send.\n");
      out.write("\t<br><br>\n");
      out.write("\t<form align = \"center\" method=\"post\" action=\"upload.form\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t<input type=\"file\" name=\"file\" /> <input type=\"submit\" /> <span>\n");
      out.write("\t\t<form:errors path=\"file\" cssClass=\"errors\" cssStyle=\"color : red;\"/>\n");
      out.write("\t\t</span>\n");
      out.write("\n");
      out.write("\t</form>\n");
      out.write("<img src=\"http://4.bp.blogspot.com/_nvuscJVsQfA/R-lP7E_01CI/AAAAAAAAAE0/aGYbmi3pMmI/S1600-R/Homework+Image+for+Blog+(garfield+and+books).gif\">\n");
      out.write("</body>\n");
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
