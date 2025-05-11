package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ownerInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Vehicle Owner Info - FinePayGo</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"ownerInfo.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Page Container -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- Logo -->\n");
      out.write("        <img src=\"fine pay go.png\" alt=\"FinePayGo Logo\" class=\"logo\">\n");
      out.write("\n");
      out.write("        <!-- Page Title -->\n");
      out.write("        <h2>Vehicle Owner Information</h2>\n");
      out.write("\n");
      out.write("        <!-- Form -->\n");
      out.write("        <form action=\"OwnerInfoServlet\" method=\"get\">\n");
      out.write("            <label for=\"vehicleNumber\">Vehicle Number:</label>\n");
      out.write("            <input type=\"text\" id=\"vehicleNumber\" name=\"vehicleNumber\" placeholder=\"Enter vehicle number\" required>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Get Information\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer>\n");
      out.write("        <p>&copy; 2024 FinePayGo. All Rights Reserved.</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
