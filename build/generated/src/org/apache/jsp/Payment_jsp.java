package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Make Payment</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <div class=\"card shadow p-4\">\n");
      out.write("            <h2 class=\"text-center text-primary\">Payment Page</h2><hr>\n");
      out.write("            \n");
      out.write("            ");

                String vehicleNumber = request.getParameter("vehicleNumber");
                String amount = request.getParameter("amount");
            
      out.write("\n");
      out.write("\n");
      out.write("            <p><strong>Vehicle Number:</strong> ");
      out.print( vehicleNumber );
      out.write("</p>\n");
      out.write("            <p><strong>Amount to Pay:</strong> ₹");
      out.print( amount );
      out.write("</p>\n");
      out.write("\n");
      out.write("            <form action=\"ProcessPaymentServlet\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"vehicleNumber\" value=\"");
      out.print( vehicleNumber );
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"amount\" value=\"");
      out.print( amount );
      out.write("\">\n");
      out.write("\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label>Enter Card Details:</label>\n");
      out.write("                    <input type=\"text\" name=\"cardNumber\" class=\"form-control\" placeholder=\"Enter Card Number\" required>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div class=\"text-center mb-4\">\n");
      out.write("                <h5 class=\"text-success\">Or Pay Here by Scanning QR Code</h5>\n");
      out.write("                <img src=\"QR.jpg\" alt=\"QR Code\" class=\"img-fluid\" style=\"max-width: 300px;\">\n");
      out.write("                <p class=\"mt-2\"><strong>UPI ID:</strong> kr2967378@okhdfcbank</p>\n");
      out.write("            </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success\">Pay Now</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
