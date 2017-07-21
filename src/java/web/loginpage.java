
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek Nigam
 */
public class loginpage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.print("<link rel=\"stylesheet\" href=\"res/Site.css\"/>");
            
            out.println("<style>");
            out.println("body {");
            out.println("background: white;");
            out.println("}");

            out.println(".content {");
            out.println("max-width: 700px;");
            out.println("margin: auto;");
            out.println("background: white;");
           
            out.println("}");
            out.println("</style>");
            out.println("<DIV   class=\"content\">");
            
            
            out.println("<h1 align=\"center\" class=\"yellow\">TaxoMoney LOGIN PAGE</h1>");
            out.println("<h3 align=\"center\"><img src=\"res/login.png\" >&nbsp&nbspLOGIN HERE  ");
            out.println("<form action=\"auth\" method=\"POST\" align=\"center\"><br>");
            out.println("User Name : <input type=\"text\" align=\"center\" name=\"id\"/><br><br>");
            out.println("&nbsp&nbspPassword : <input type=\"password\" name=\"pass\"/><br>");  
            //out.println("<a href='signup.jsp'>create new account</a>");
            out.println("<br>");
            
            
            
            //logout successfully
            
            String sl;
            sl = (String) request.getAttribute("err_msg");
            String sl1="null";
            if(sl==null)
            {
                //out.println("");
            }
            else
            {    
            out.print("<h6 style=\"color:green\">");
            out.println("<b>'"+sl+"'</b></h6>");
            }
            //invalid id pass
            String se;
            se = (String) request.getAttribute("error_msg");
            String se1="null";
            if(se==null)
            {
                //out.println("<br>");
            }
            else
            {    
            out.print("<h6 style=\"color:red\">");
            out.println("<b>'"+se+"'</b></h6>");
            }
            
            
            //
            out.println("<pre>");
            out.println("<input type=\"submit\" value=\"LOGIN\" class=\"button yellow\" />      <input type=\"reset\" value=\"RESET\" class=\"button yellow\"/></pre></b>");
            out.println("</form></h3>");
            out.println("<marquee class=\"yellow\">IT Calculator | GST Calculator | EMI Calculator | Electricity Bill Calculator | Expense Manager | Currency Converter</marquee>");
            out.println("<br><br><center>");
            //out.println("A perfect financial assistance application for all !! ");
            //out.println("<footer>All rights reserved @abhiNig</footer>");
            //out.println("</center>");
            
            /*
            out.print("<span class=\"blue\" style=\"color: blue; font-size: 12px; border: 1px solid;\">");
            //String e=(String) request.getAttribute("error_msg");
            out.print(e);           
            out.print("</span>");
            */
            out.println("<h5 align=\"center\" class=\"yellow\">TaxoMoney</h5>");
            
        
             
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">");
            out.println("<style>");
            out.println(".fa {");
            out.println("padding: 10px;");
            out.println("font-size: 20px;");
            out.println("width: 20px;");
            out.println("text-align: center;");
            out.println("text-decoration: none;");
            out.println("margin: 10px 2px;");
            out.println("}");

            out.println(".fa:hover {");
            out.println(" opacity: 0.7;");
            out.println("}");

            out.println(".fa-facebook {");
            out.println("background: #3B5998;");
            out.println(" color: white;");
            out.println("}");

            out.println(".fa-twitter {");
            out.println("background: #55ACEE;");
            out.println("color: white;");
            out.println("}");

            out.println(" .fa-google {");
            out.println("background: #dd4b39;");
            out.println("color: white;");
            out.println("}");

            out.println(".fa-linkedin {");
            out.println("  background: #007bb5;");
            out.println("color: white;");
            out.println("}");

            out.println(".fa-youtube {");
            out.println("background: #bb0000;");
            out.println(" color: white;");
            out.println("}");

            out.println(".fa-android {");
            out.println("background: #a4c639;");
            out.println("color: white;");
            out.println("}");

           
            out.println(" </style>");
            out.println("</head>");
            out.println("<body>");

            //out.println("<h2>Style Social Media Buttons here</h2>");

            out.println("<!-- Add font awesome icons -->");
            out.println("<a href=\"#\" class=\"fa fa-facebook\"></a>");
            out.println("<a href=\"#\" class=\"fa fa-twitter\"></a>");
            out.println("<a href=\"#\" class=\"fa fa-google\"></a>");
            out.println("<a href=\"#\" class=\"fa fa-linkedin\"></a>");
            out.println("<a href=\"#\" class=\"fa fa-youtube\"></a>");
            out.println("<a href=\"#\" class=\"fa fa-android\"></a>");
           
            
            
            out.println("<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<style>\n" +
            "body {\n" +
            "    font-family: \"Lato\", sans-serif;\n" +
            "}\n" +
            "\n" +
            ".sidenav {\n" +
            "    height: 100%;\n" +
            "    width: 0;\n" +
            "    position: fixed;\n" +
            "    z-index: 1;\n" +
            "    top: 7;\n" +
            "    left: 0;\n" +
            "    background-color: #111;\n" +
            "    overflow-x: hidden;\n" +
            "    transition: 0.5s;\n" +
            "    padding-top: 16px;\n" +
            "}\n" +
            "\n" +
            ".sidenav a {\n" +
            "    padding: 4px 4px 4px 12px;\n" +
            "    text-decoration: none;\n" +
            "    font-size: 25px;\n" +
            "    color: #818181;\n" +
            "    display: block;\n" +
            "    transition: 0.3s;\n" +
            "}\n" +
            "\n" +
            ".sidenav a:hover, .offcanvas a:focus{\n" +
            "    color: #f1f1f1;\n" +
            "}\n" +
            "\n" +
            ".sidenav .closebtn {\n" +
            "    position: absolute;\n" +
            "    top: 0;\n" +
            "    right: 20px;\n" +
            "    font-size: 36px;\n" +
            "    margin-left: 30px;\n" +
            "}\n" +
            "\n" +
            "#main {\n" +
            "    transition: margin-left .5s;\n" +
            "    padding: 16px;\n" +
            "}\n" +
            "\n" +
            "@media screen and (max-height: 450px) {\n" +
            "  .sidenav {padding-top: 15px;}\n" +
            "  .sidenav a {font-size: 26px;}\n" +
            "}\n" +
            "</style>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<div id=\"mySidenav\" class=\"sidenav\"><h2><font color='white'>TaxoMoney</font></h2>" +
            "  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>" +
            "<center>"+
            "  <font color='red'>"+
            "<form action=\"signup\" method=\"POST\" align=\"center\"><br>"+

            "User ID : <br><input type=\"text\" align=\"center\" name=\"id1\" placeholder=\"Enter user name\"/><br><br>"+
            "Password : <br><input type=\"password\" name=\"pass1\" placeholder=\"Enter password\"/><br><b>"+
                  "<br>"+
            "<input type=\"submit\" value=\"SIGNUP\" class=\"button red\" />"  +
            "</center></form></font>"+

            "</div>\n" +
            "\n" +
            "<div id=\"main\">\n" +
            "  <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776; SignUp</span>\n" +
            "</div>\n" +
            "\n" +
            "<script>\n" +
            "function openNav() {\n" +
            "    document.getElementById(\"mySidenav\").style.width = \"260px\";\n" +
            "    document.getElementById(\"main\").style.marginLeft = \"200px\";\n" +
            "}\n" +
            "\n" +
            "function closeNav() {\n" +
            "    document.getElementById(\"mySidenav\").style.width = \"0\";\n" +
            "    document.getElementById(\"main\").style.marginLeft= \"0\";\n" +
            "}\n" +
            "</script>\n" +
            "     \n" +
            "</body>\n" +
            "\n" +
            "</html> ");
            //out.println("<form action=\"signup.jsp\" method=\"POST\" align=\"center\">");
            //out.println("<br><input type=\"submit\" value=\"SignUp\" class=\"button blue\" />"); 
            //out.println("</form>");
            
        }
        finally {
            out.close();
        }
    }

    
   
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
