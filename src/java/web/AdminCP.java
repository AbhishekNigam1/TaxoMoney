/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author FAIZ-PC
 */
public class AdminCP extends HttpServlet {

   String [] admin_menu = {"HOME","DELETE USERs","ACTVATE USERs","DEACTIVATE USERs","VIEW LOG DETAILS"};
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        HttpSession s = request.getSession(false);
        
        
        if(s!=null){
         String l = (String)s.getAttribute("lid");   
         out.print("<h2 align=center>ADMIN CONTROL PANEL</h2><hr>");
         out.print("<h3><img src='res/login.png'/>WELCOME ADMIN [ "+l+" ]</h3><hr>");
         out.print("<pre>");
            for (String admin_menu1 : admin_menu) {
                out.println("   <a href='#'>" + admin_menu1 + "</a>");
                out.println("---------------------");
            }
         out.println("   <a href='logout'>LOGOUT</a>");
          out.println("---------------------");
         ServletConfig cfg = getServletConfig();
         String c = cfg.getInitParameter("contact");
         out.println("ADMIN  CONTACT : "+c);
        
         ServletContext ctx = getServletContext();
         String cr = ctx.getInitParameter("copy");
         out.println("RCPL WEB APP "+cr);
         out.print("</pre>");
        }
        else{
         out.print("<h3>PLEASE LOGIN TO ACCESS PAGE!!</h3>");
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
