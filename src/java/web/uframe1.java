/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek Nigam
 */
public class uframe1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
               HttpSession s = request.getSession(false);
               
         out.print("<link rel=\"stylesheet\" href=\"res/Site.css\"/>");
         out.print("<link rel=\"stylesheet\" href=\"res/w3.css\"/>");
        
         if(s!=null){
         String l = (String)s.getAttribute("lid");   
         
         
         out.print("<h4 class=\"lime w3-border-top w3-border-bottom w3-border-white w3-hover-red\"><img src=\"res/students.jpg\" height=\"30\" width=\"30\"/>&nbsp Welcome: "+l+" </h4>");
         out.print("<body class='green' >");
         //out.println("<hr size=\"89px\">");
         
         //out.print("<div class=\"w3-bar-block w3-light-grey w3-border\">");
         out.print("<a class=\"w3-bar-item w3-outline w3-button w3-hover-red w3-block w3-padding\" href=\"it\" target=\"uf3\"><abr title=\"Click Here To Calculate Income Tax \">IT Calculator</abr></a>");
         
         out.print("<a class=\"w3-bar-item w3-button w3-hover-teal w3-block w3-padding w3-grey\" href=\"gst\" target=\"uf3\"><abr title=\"Click Here To Calculate Gross Service Tax\">GST Calculator</abr></a>");
         //out.print("<hr>");
         out.print("<a class=\"w3-bar-item w3-button w3-hover-yellow w3-block w3-padding\" href=\"emi\" target=\"uf3\"><abr title=\"Click Here To Calculate Every Month Installments and Interest\">EMI Calculator</abr></a>");
         //out.print("<hr>");
         out.print("<a class=\"w3-bar-item w3-button w3-hover-indigo w3-block w3-padding w3-grey\" href=\"ebill\" target=\"uf3\"><abr title=\"Click Here To Calculate Electricity Bill\">E-Bill Calculator</abr></a>");
         //out.print("<hr>");
         out.print("<a class=\"w3-bar-item w3-button w3-hover-orange w3-block w3-padding\" href=\"emjsp.jsp\" target=\"uf3\"><abr title=\"Click Here To Manage and Keep Of Your Expense\">Expense Manager</abr></a>");
         //out.print("<hr>");
         //out.print("</div><br>");
         out.print("<a class=\"w3-bar-item w3-button w3-hover-lime w3-block w3-padding w3-grey\" href=\"cc\" target=\"uf3\"><abr title=\"Click Here To Convert Currecy\">Currency Converter</abr></a>");
         out.print("<br>");
    
         out.print("<a class=\"w3-button w3-hover-red w3-block w3-lime\" href=\"logout\" target=\"_top\"><abr title=\"Click Here To Logout\">LOGOUT</abr></a>");
         

         
         
         
         out.print("</font>");
         out.print("</body>");
         //<abr title="">HPES-RCPL</abr>
        }
        else{
         out.print("<h3>PLEASE LOGIN TO ACCESS PAGE!!</h3>");
        }  
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
