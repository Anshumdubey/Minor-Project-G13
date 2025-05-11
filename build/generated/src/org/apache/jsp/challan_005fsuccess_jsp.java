package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public final class challan_005fsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Challan Issued</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"challan-style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("    <script>\n");
      out.write("        setTimeout(function() {\n");
      out.write("            document.getElementById(\"alertBox\").style.display = \"none\";\n");
      out.write("        }, 5000);\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <div class=\"card shadow p-4\">\n");
      out.write("            <h2 class=\"text-center text-success\">Challan Issued Successfully</h2><hr>\n");
      out.write("\n");
      out.write("            <div class=\"alert alert-warning text-center\" id=\"alertBox\">\n");
      out.write("                <strong>Notice:</strong> A fine has been issued against vehicle <b>");
      out.print( request.getParameter("vehicleNumber") );
      out.write("</b>.\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");

                String vehicleNumber = request.getParameter("vehicleNumber");
                String amount = request.getParameter("amount");
                String description = request.getParameter("description");
                String ownerName = "", contactNumber = "", address = "";

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finepaygo", "root", "");

                    // Fetch owner details
                    PreparedStatement pst = con.prepareStatement("SELECT * FROM vehicle_owners WHERE vehicle_number=?");
                    pst.setString(1, vehicleNumber);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        ownerName = rs.getString("owner_name");
                        contactNumber = rs.getString("contact_number");
                        address = rs.getString("address");
                    }

                    // Insert challan
                    PreparedStatement insertChallan = con.prepareStatement(
                        "INSERT INTO challans (vehicle_number, amount, description) VALUES (?, ?, ?)"
                    );
                    insertChallan.setString(1, vehicleNumber);
                    insertChallan.setDouble(2, Double.parseDouble(amount));
                    insertChallan.setString(3, description);
                    insertChallan.executeUpdate();

                    // ✅ Twilio Integration
                    final String ACCOUNT_SID = "AC7c2b540010524b867ed44e51019e2f83";  // Replace with your Account SID
                    final String AUTH_TOKEN = "d1e2d75f70c5c89b5ef13e32c927b45c";                  // Replace with your Auth Token
                    final String FROM_PHONE = "+12183002496";                    // Replace with your Twilio number

                    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

                  String smsMessage = "🚨 Challan Issued 🚨\n"
    + "Vehicle: " + vehicleNumber + "\n"
    + "Amount: ₹" + amount + "\n"
    + "Pay at: yourdomain.com/pay";

                    Message.creator(
                        new PhoneNumber(contactNumber), // To
                        new PhoneNumber(FROM_PHONE),    // From (Twilio)
                        smsMessage
                    ).create();

                    con.close();
                } catch (Exception e) {
                    out.println("<div class='alert alert-danger'>SMS sending failed: " + e.getMessage() + "</div>");
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("\n");
      out.write("            <table class=\"table table-bordered mt-4\">\n");
      out.write("                <tr><th>Owner Name</th><td>");
      out.print( ownerName );
      out.write("</td></tr>\n");
      out.write("                <tr><th>Contact Number</th><td>");
      out.print( contactNumber );
      out.write("</td></tr>\n");
      out.write("                <tr><th>Address</th><td>");
      out.print( address );
      out.write("</td></tr>\n");
      out.write("                <tr><th>Challan Amount</th><td>₹");
      out.print( amount );
      out.write("</td></tr>\n");
      out.write("                <tr><th>Violation</th><td>");
      out.print( description );
      out.write("</td></tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <a href=\"Payment.jsp?vehicleNumber=");
      out.print( vehicleNumber );
      out.write("&amount=");
      out.print( amount );
      out.write("\" class=\"btn btn-success\">\n");
      out.write("                    Pay Challan Now\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
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
