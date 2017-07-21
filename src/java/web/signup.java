
package web;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class signup extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();       
            
		
        
        try  {
            
             HttpSession s = request.getSession();
                
                String n=request.getParameter("id1");
		String p=request.getParameter("pass1");
                Statement s1=jdbc.DAOLayer.getCon().createStatement();      
                String q="insert into login values('"+n+"','"+p+"','user','1999=07-08')";
                int ar=s1.executeUpdate(q);
              
		if(ar>0) {
                    
                    RequestDispatcher rd = request.getRequestDispatcher("loginpage");
                    out.print("<center><span class=\"\" style=\"color: red; font-size: 12px; border: 1px solid;\">");
                    out.print("You are successfully registered... Login to cotinue");
                    out.print("</span></center>");
                    //out.println("<span style=\"font-size:30px;cursor:pointer\" >go on</span>");
                    rd.include(request, response);
                } else {
                    out.println("Unsuccessfull signup");
                }
                
        
        } finally {
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
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
