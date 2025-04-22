package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gate Pass </title>\n");
      out.write("     <style>\n");
      out.write("         <center>\n");
      out.write("         \n");
      out.write("            .dark{\n");
      out.write("                padding:15px;\n");
      out.write("                background:#e6e6e6;\n");
      out.write("                margin-top:10px;\n");
      out.write("                margin-bottom:10px;\n");
      out.write("                float:left;\n");
      out.write("                width:30%;}\n");
      out.write("            </center>\n");
      out.write("     </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1> Material Gate Pass System</h1></center>\n");
      out.write("    <center><div class=\"dark\"></center>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"Users?action=validate\">\n");
      out.write("            \n");
      out.write("    <center><label for=\"user_name\">User Name:</label>\n");
      out.write("  <input type=\"text\" id=\"user_name\" name=\"user_name\"><br><br></center>\n");
      out.write("  <center><label for=\"passwd\">Password:</label>\n");
      out.write("  <input type=\"password\" id=\"passwd\" name=\"passwd\"><br><br></center>\n");
      out.write("  <center><button type=\"submit\">Login</button>\n");
      out.write("  <button type=\"submit\">Clear</button></center>\n");
      out.write("        </form>\n");
      out.write("    <span style=\"color:red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginResult}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
