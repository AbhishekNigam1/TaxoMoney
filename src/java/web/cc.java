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

/**
 *
 * @author Abhishek Nigam
 */
public class cc extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
                out.println("<h4>Enter Amount : <input type=\"text\" name=\"num1\" /><br>");
                out.println("<center><h3>Currency Converter</h3></center>");
                out.println("<select>");
                out.println("<option value=\"val1\" name=\"c1\">US Dollar</option>");
                out.println("<option value=\"val2\" name=\"c2\">Indian Rupee</option>");
                out.println("<option value=\"val3\" name=\"c3\">Yen</option>");
                out.println("<option value=\"val4\" name=\"c4\">Euro</option>");
                out.println("<option value=\"val5\" name=\"c5\">Pound</option>");
                out.println("<option value=\"val6\" name=\"c6\">Dinar</option>");
                out.println("<option value=\"val7\" name=\"c7\">Nepaleese Rupee</option>");
                out.println("<option value=\"val8\" name=\"c8\">Pakistani Rupee</option>");
                out.println("<option value=\"val9\" name=\"c9\">Sri Lankan Rupee</option>");
                out.println("<option value=\"val10\" name=\"c10\">Frank</option>");
                out.println("<option value=\"val11\" name=\"c11\">Australian Dollar</option>");
                out.println("</select>");
                
                out.println("&nbsp&nbsp&nbsp&nbsp&nbsp");
                out.println("Covert to");
                
                out.println("<select>");
                out.println("<option value=\"val1\">US Dollar</option>");
                out.println("<option value=\"val2\">Indian Rupee</option>");
                out.println("<option value=\"val3\">Yen</option>");
                out.println("<option value=\"val4\">Euro</option>");
                out.println("<option value=\"val5\">Pound</option>");
                out.println("<option value=\"val6\">Dinar</option>");
                out.println("<option value=\"val7\">Nepaleese Rupee</option>");
                out.println("<option value=\"val8\">Pakistani Rupee</option>");
                out.println("<option value=\"val9\">Sri Lankan Rupee</option>");
                out.println("<option value=\"val10\">Frank</option>");
                out.println("<option value=\"val11\">Australian Dollar</option>");
                //out.println("<option value=\"val1\"></option>");
                out.println("</select>");
                out.println("&nbsp<input type=\"submit\" value=\"Convert\" /></h4>");
                
                String c1 = request.getParameter("value");
                out.print(c1);
                //x = Integer.parseInt(a);
                if(!c1.equals("val1"))
                {
                }
                else
                {
                    out.println("Coverted '"+c1+"' to '"+c1+"");
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
