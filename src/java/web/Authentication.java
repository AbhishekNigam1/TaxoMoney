package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek Nigam
 */
public class Authentication extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String l = request.getParameter("id");
        String p = request.getParameter("pass");
        
        l = l.replace("'", "\\'");
        p = p.replace("'", "\\'");
        
        String q = "select *from login where lid='"+l+"' and pass='"+p+"'";
        ResultSet rs = jdbc.DAOLayer.selectData(q);
        try{
        if(rs.next()){//VALID
          HttpSession s = request.getSession();
          String r = rs.getString(3);  
          s.setAttribute("lid", l);
          s.setAttribute("role", r);
          
         if(r.equalsIgnoreCase("user")){
           response.sendRedirect("uframe");
          }
         else if(r.equalsIgnoreCase("admin")){
           //response.sendRedirect("acp");
             out.print("HELLO ADMIN FROM AUTH");
             RequestDispatcher rd = request.getRequestDispatcher("acp");
             rd.include(request, response);
          }
         }
        else{//INVALID ID or PASSWORD
          //out.print("<font size=3 color='red' align='center'>");   
          //out.print("<center>INVALID LOGIN ID or PASSWORD</center>");
          //out.print("</font>");
          //RequestDispatcher rd = request.getRequestDispatcher("loginpage");
          //rd.include(request, response);
          RequestDispatcher rd = request.getRequestDispatcher("loginpage");
          request.setAttribute("error_msg", "INVALID LOGIN ID or PASSWORD");
          rd.forward(request, response);
        }
        }catch(SQLException e){} catch (IOException e) {
        } catch (ServletException e) {
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
