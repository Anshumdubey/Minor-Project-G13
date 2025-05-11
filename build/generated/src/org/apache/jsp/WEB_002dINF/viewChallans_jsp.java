package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class viewChallans_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    List<String> vehicleNumbers = (List<String>) request.getAttribute("vehicleNumbers");
    List<Integer> amounts = (List<Integer>) request.getAttribute("amounts");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>View Challans - FinePayGo</title>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"viewChallans.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <img src=\"logo.jpg\" alt=\"FinePayGo Logo\">\n");
      out.write("        <h1>Challan Overview - FinePayGo</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <canvas id=\"challanChart\"></canvas>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        const ctx = document.getElementById('challanChart').getContext('2d');\n");
      out.write("        const vehicleNumbers = ");
      out.print( vehicleNumbers );
      out.write(";\n");
      out.write("        const amounts = ");
      out.print( amounts );
      out.write(";\n");
      out.write("\n");
      out.write("        new Chart(ctx, {\n");
      out.write("            type: 'bar',\n");
      out.write("            data: {\n");
      out.write("                labels: vehicleNumbers,\n");
      out.write("                datasets: [{\n");
      out.write("                    label: 'Challan Amounts (in ?)',\n");
      out.write("                    data: amounts,\n");
      out.write("                    backgroundColor: 'rgba(54, 162, 235, 0.6)',\n");
      out.write("                    borderColor: 'rgba(54, 162, 235, 1)',\n");
      out.write("                    borderWidth: 1\n");
      out.write("                }]\n");
      out.write("            },\n");
      out.write("            options: {\n");
      out.write("                scales: {\n");
      out.write("                    y: {\n");
      out.write("                        beginAtZero: true\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
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
