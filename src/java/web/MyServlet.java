package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet
{

    int x;
    public void init(ServletConfig config) throws ServletException {
        String q = "select *from hum1";
        ResultSet rs = jdbc.DAOLayer.selectData(q);
        try{
        if(rs.next()){
         x = rs.getInt(1);
        }
        }catch(Exception e){
            System.out.println("SELECTION ERROR "+e );
        }
    }

    public ServletConfig getServletConfig() {
      return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        x++;
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<h1 align='center'>PAGE HIT : "+x+" </h1>");
        out.println("<marquee>SERVER IS READY TO HANDLE RESPONSE</marquee>");
    }

    public String getServletInfo() {
      String info = "This is mmy first servlet";
      return info;
    }

    public void destroy() {
      String q = "update hum1 set hit = "+x;
      jdbc.DAOLayer.updateData(q);
        System.out.println("COUNTER PERSIST..");
    }
    
}
