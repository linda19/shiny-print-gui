package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background= http://img.wallpaperstock.net:81/color-cube-wallpapers_7959_1920x1200.jpg>\r\n");
      out.write("<br><br><h1>\r\n");
      out.write("\t<p align=\"center\"><b><big>DataBase Course</big></b></p></h1><b>\r\n");
      out.write("\r\n");
      out.write("</b><b><br></b><b></b><P><b>  </b></P><b>\r\n");
      out.write("</b><form><i><p align=\"center\" ><b> </b><font color =\"blue\" ><b>&quot;  A database is an organized collection of data.&quot; </b></font><b> </b></p></i></form><b>\r\n");
      out.write("</b><b><br></b><b>\r\n");
      out.write("</b><form align=\"left\" ><b>DataBase Design Schedule:<br><br>2 hour / week course : 08-10 Thursday Room H11 <br>\r\n");
      out.write("2 hour / week laborator : 16-18/18-20 Monday and Friday Room 36 <br>\r\n");
      out.write("Professor : Calin Cenan\r\n");
      out.write("\t</b><b></b></form><b>\r\n");
      out.write("\r\n");
      out.write("</b><form align=\"right\" style=\"width: 1105px; \"><b></b><table align=\"right\" style=\" height: 181px; width: 322px\"><b> You don't have an account?</b><b><br></b><a href=\"register.jsp\"><b>Register</b></a><b> now!</b></table><b><p></p></b></form><b>\r\n");
      out.write("\t\r\n");
      out.write("\t</b><form align=\"right\" action=\"loginForm\" method=\"get\" style=\"width: 1105px; \"><b>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</b><table align = \"right\" style=\" height: 181px; width: 322px\"><b>\r\n");
      out.write("\t\t\t</b><tr><b>\t\t\t\t\r\n");
      out.write("\t\t\t\t</b><td colspan='2' align=\"center\"><b>Login</b></td><b>\r\n");
      out.write("\t\t\t</b></tr><b>\r\n");
      out.write("\t\t\t</b><tr><b>\r\n");
      out.write("\t\t\t\t</b><td><b>Email:</b></td><b>\r\n");
      out.write("\t\t\t\t</b><td><b><input type=\"text\" name=\"loginEmail\"></b></td><b>\r\n");
      out.write("\t\t\t</b></tr><b>\r\n");
      out.write("\t\t\t</b><tr><b>\r\n");
      out.write("\t\t\t\t</b><td><b>Password:</b></td><b>\r\n");
      out.write("\t\t\t\t</b><td><b><input type=\"password\" name=\"loginPassword\"></b></td><b>\r\n");
      out.write("\t\t\t</b></tr><b>\r\n");
      out.write("\t\t\t</b><tr><b>\r\n");
      out.write("\t\t\t\t</b><td colspan='2' align=\"center\"><b><input name=\"submit\" type=\"submit\" value=\"Login\" style=\"width: 95px;\"></b></td><b>\r\n");
      out.write("\t\t\t</b></tr><b>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</b></table><b><br></b>\r\n");
      out.write("\t</form>\r\n");
      out.write("<form align=\"left\" style=\"width: 700px; \"> \r\n");
      out.write("<table style=\" height: 30px; width: 702px\"><b><br> <i> Why Learn About Databases?</i></b><b><br></b><b><br></b><b>Databases are incredibly prevalent -- they underlie technology used by most people every day if not every hour. Databases reside behind a huge fraction of websites; they're a crucial component of telecommunications systems, banking systems, video games, and just about any other software system or electronic device that maintains some amount of persistent information. In addition to persistence, database systems provide a number of other properties that make them exceptionally useful and convenient: reliability, efficiency, scalability, concurrency control, data abstractions, and high-level query languages. Databases are so ubiquitous and important that computer science graduates frequently cite their database class as the one most useful to them in their industry or graduate-school careers.</b></table><b>\r\n");
      out.write("</form>\r\n");
      out.write("</b>\r\n");
      out.write("<form style=\"width: 700px; \">\r\n");
      out.write("<table style=\" height: 30px; width: 702px\"><b> <br><i>Course Syllabus</i></b><b><br></b><b><br></b><b>This course covers database design and the use of database management systems for applications. It includes extensive coverage of the relational model, relational algebra, and SQL. It also covers XML data including DTDs and XML Schema for validation, and the query and transformation languages XPath, XQuery, and XSLT. The course includes database design in UML, and relational design principles based on dependencies and normal forms. Many additional key database topics from the design and application-building perspective are also covered: indexes, views, transactions, authorization, integrity constraints, triggers, on-line analytical processing (OLAP), JSON, and emerging NoSQL systems. Working through the entire course provides comprehensive coverage of the field, but most of the topics are also well-suited for &quot;a la carte&quot; learning.</b></table><b>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t</b><p align=\"right\"></p></b><b><h1></h1></b><b><br></b><p align=\"right\"><b><br></b></p><b><br></b><b><br></b><b><br></b><b><br></b><b><br></b><b>\r\n");
      out.write("\t</b><form><b>The time on the server is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serverTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(". </b></form><b>\r\n");
      out.write("</b><b><p></p></b></body><b>\r\n");
      out.write("</b></html><b>\r\n");
      out.write("</b>");
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
