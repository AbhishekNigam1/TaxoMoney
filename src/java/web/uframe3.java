
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
public class uframe3 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.print("<link rel=\"stylesheet\" href=\"res/w3.css\"/>");
            out.println("<center><body background =\"res/bg.jpeg\" ></body>");
            out.println("<br><div class=\"w3-container w3-teal\">");
            out.println("<h3>Summer Training Program-2017</h3></div>");
            out.println("<br><pre><a class=\"w3-hover-teal\" href=\"it\"><img src=\"res/IT.png\" height=\"100\" width=\"100\" alt=\"Income tax Calculator\"></a>                   <a href=\"gst\"><img src=\"res/gst.png\" height=\"100\" width=\"100\" alt=\"Income tax Calculator\"></a>                  <a href=\"emi\"><img src=\"res/emi.png\" height=\"100\" width=\"100\" alt=\"Income tax Calculator\"></a>");       
            out.println("<br><a href=\"ebill\"><img src=\"res/ebill.png\" height=\"100\" width=\"100\" alt=\"Income tax Calculator\"></a>                   <a href=\"em\"><img src=\"res/em.png\" height=\"100\" width=\"100\" alt=\"Income tax Calculator\"></a>                  <a href=\"cc\"><img src=\"res/cc.png\" height=\"100\" width=\"100\" alt=\"Income tax Calculator\"></a>");
            out.println("</pre><center>");
            out.println("<br><div class=\"w3-container w3-teal\">");
            out.println("<h3>Summer Training Program-2017</h3></div>");
        } finally {
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
