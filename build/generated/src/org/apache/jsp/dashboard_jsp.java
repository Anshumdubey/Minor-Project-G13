package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>FinePayGo Dashboard</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"dashboard.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Header with Logo -->\n");
      out.write("    <header>\n");
      out.write("        <img src=\"fine pay go.png\" alt=\"FinePayGo Logo\">\n");
      out.write("        <h1>Welcome to FinePayGo Dashboard</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- Main Content Section -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img src=\"fine pay go image.jpg\" alt=\"Chart\">\n");
      out.write("            <h3><a href=\"chart.html\">Challan Data Chart</a></h3>\n");
      out.write("            <p>Visualize challan data over time.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Challan 1 -->\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img src=\"minor1.png\" alt=\"Challan Image 1\">\n");
      out.write("            <h3> <a href=\"issueChallan.jsp\"> Challan Issued</a></h3>\n");
      out.write("            <p>View issued challans and update payment status.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Challan 2 -->\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img src=\"minor2.jpg\" alt=\"Challan Image 2\">\n");
      out.write("            <h3> <a href=\"pay.html\">Payment Status</a></h3>\n");
      out.write("            <p>Track pending payments and challan history.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Challan 3 -->\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img src=\"minor3.png\" alt=\"Challan Image 3\">\n");
      out.write("             <h3> <a href=\"ownerInfo.jsp\">Vehicle Owner Information</a></h3>\n");
      out.write("            <p>Access vehicle and owner details.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Profile -->\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img src=\"minor4.jpg\" alt=\"Profile\">\n");
      out.write("            <h3> <a href=\"profile.jsp\">Traffic Police Profile</a></h3>\n");
      out.write("            <h3></h3>\n");
      out.write("            <p>Update your profile information and settings.</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer>\n");
      out.write("        <p>&copy; 2024 FinePayGo. All Rights Reserved.</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>                                 ");
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
