package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class issueChallan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Issue Challan - FinePayGo</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            background: linear-gradient(to right, #dfe9f3, #ffffff);\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("    background: url('minor.avif') no-repeat center center fixed;\n");
      out.write("    background-size: cover;\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 30px 40px;\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo {\n");
      out.write("            width: 120px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            margin-bottom: 25px;\n");
      out.write("            color: #2c3e50;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            gap: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            text-align: left;\n");
      out.write("            font-weight: 600;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            color: #34495e;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"number\"],\n");
      out.write("        select {\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            transition: border-color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"]:focus,\n");
      out.write("        input[type=\"number\"]:focus,\n");
      out.write("        select:focus {\n");
      out.write("            border-color: #3498db;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color: #3498db;\n");
      out.write("            color: white;\n");
      out.write("            padding: 12px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #2980b9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 40px;\n");
      out.write("            padding: 15px;\n");
      out.write("           \n");
      out.write("            font-size: 14px;\n");
      out.write("            color: #777;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Page Container -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- Logo -->\n");
      out.write("        <img src=\"fine pay go.png\" alt=\"FinePayGo Logo\" class=\"logo\">\n");
      out.write("        \n");
      out.write("        <!-- Heading -->\n");
      out.write("        <h2>Issue a Challan</h2>\n");
      out.write("\n");
      out.write("        <!-- Form -->\n");
      out.write("        <form action=\"IssueChallanServlet\" method=\"post\">\n");
      out.write("            <label for=\"vehicleNumber\">Vehicle Number:</label>\n");
      out.write("            <input type=\"text\" id=\"vehicleNumber\" name=\"vehicleNumber\" placeholder=\"Enter vehicle number\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"amount\">Amount:</label>\n");
      out.write("            <input type=\"number\" id=\"amount\" name=\"amount\" placeholder=\"Enter challan amount\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"description\">Challan Type:</label>\n");
      out.write("            <select id=\"description\" name=\"description\" required>\n");
      out.write("                <option value=\"\">-- Select a Challan Type --</option>\n");
      out.write("                <option value=\"Overspeeding\">Overspeeding</option>\n");
      out.write("                <option value=\"No Helmet\">No Helmet</option>\n");
      out.write("                <option value=\"Drunk Driving\">Drunk Driving</option>\n");
      out.write("                <option value=\"Red Light Jumping\">Red Light Jumping</option>\n");
      out.write("                <option value=\"No Seatbelt\">No Seatbelt</option>\n");
      out.write("                <option value=\"Driving Without License\">Driving Without License</option>\n");
      out.write("                <option value=\"Illegal Parking\">Illegal Parking</option>\n");
      out.write("                <option value=\"Expired Insurance\">Expired Insurance</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Issue Challan\">\n");
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
