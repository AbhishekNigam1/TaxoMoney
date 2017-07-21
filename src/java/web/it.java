package web;

import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek Nigam
 */
public class it extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.print("<link rel=\"stylesheet\" href=\"res/Site.css\"/>");
            //out.println("<body bgcolor=\"Gainsboro\">");
            out.println("<body bgcolor=\"WhiteSmoke\">");
            out.println("<form action=\"it\" method='post'>");
            out.println("<center><h3 class=\"red\">Income Tax Calculator</h3><center>");
            out.println("<br><center>");
            out.println("<center><h3>Select your Age category</h3><center>");
            out.println("<input type='radio' name='Age' value='a60'>Age Under 60");
            //out.println("<input type=\"radio\" name=\"Age\" value=\"a600\"/>Age Under 60");
            out.println("<input type='radio' name='Age' value='a6080'>Age 60-80");
            out.println("<input type='radio' name='Age' value='a80'>Age Above 80");
            out.println("</center>");
            
            
        
            
            
            out.println("<center><h3>Income Tax Calculator</h3><center>");
            //out.println("<form action=\"it\">");
            out.println("<h4>Enter Salary : <input type=\"text\" name=\"num1\" />");
            out.println("&nbsp<input type=\"submit\" value=\"Calcualte IT\" /></h4>");
            //out.println("</form>");
            //out.println("");
            String value = request.getParameter("Age");
            //out.print("You have select "+value+" category<br>");
            int tax=0;
            int x;
            
            if(value.equals(null))
            {
                
                //out.print("Null category <br>");
            }
            else
            {
                String a = request.getParameter("num1");
                x = Integer.parseInt(a);
                //out.print("You have select "+value+" category<br>");
                //age  60-
                if(value.equals("a60"))
                {
                    //out.println("Age Under 60");
                    if(x<=250000 && x>0)
                    {
                        
                        tax=0;
                        out.println("The Payable Income Tax is: INR " + tax);
                        
                    }
                    else if(x>250000 && x<=500000)
                    {
                        int t1=x-250000;
                        int tax1=(int) (t1*(0.05));
                        tax=(int)(tax1+(tax1*(0.03)));
                        out.println("<br>The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 3% Cess on Income Tax");
                    }
                    else if(x>500000 && x<=1000000)
                    {
                        int t1=x-500000;
                        int tax1=(int) (t1*(0.2))+12500;
                        tax=(int)(tax1+(tax1*(0.03)));
                        out.println("<br>The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 3% Cess on Income Tax");
                    }
                    else if(x>1000000 && x<=10000000)
                    {
                        if(x<5000001)
                        {
                         int t1=x-1000000;
                         int tax1=(int) (t1*(0.3))+112500;
                         tax=(int)(tax1+(tax1*(0.03)));
                         out.println("<br>The Payable Income Tax is: INR " + tax);
                         out.println("<br>**Including 3% Cess on Income Tax");
                        }
                        else
                        {
                         int t1=x-5000000;
                         int tax0=(int) (t1*(0.3));
                         int tax1=(int) (tax0*(0.15)) + 112500+ (int)(4000000*(0.3))+tax0;
                         int tax2=(int) (tax1+(tax1*(0.1)));
                         tax=(int)(tax2+(tax2*(0.03)));
                         out.println("<br>The Payable Income Tax is: INR " + tax);
                         out.println("<br>**Including 10% Surcharge on Income Tax above INR 50L");
                         out.println("<br>**Including 3% Cess on Income Tax + Surcharge");

                        }

                    }
                    else if(x>10000000)
                    {
                        int t1=x-10000000;
                        int s1=(int)(1500000*(0.1)); //surchage on 50l-1cr
                        int tax1=(int)(t1*(0.3));
                        int tax2=(int)(tax1+(tax1*(0.15))); //tax+surcharge
                        int tax1cr=112500+2700000;
                        int tax3=s1+tax2+ tax1cr;
                        tax=(int)(tax3+(tax3*(0.03)));
                        out.println("The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 10% surcharge on Income Tax above INR 50 L and 15% above INR 1cr");
                        out.println("<br>**Including 3% Cess on Income Tax + Surcharge");
                    }

                    else
                    {
                        out.println("Plz Enter a valid Income");
                    }
                }
                       
                //age 60-80
                else if(value.equals("a6080"))
                 {
                    //out.println("Age Betwen 60-80");
                    
                    if(x<=250000 && x>0)
                    {
                        tax=0;
                        request.setAttribute("a", tax);
                        out.println("The Payable Income Tax is: INR " + tax);
                    }
                    else if(x>300000 && x<=500000)
                    {
                        int t1=x-300000;
                        int tax1=(int) (t1*(0.05));
                        tax=(int)(tax1+(tax1*(0.03)));
                        out.println("<br>The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 3% Cess on Income Tax");
                    }
                    else if(x>500000 && x<=1000000)
                    {
                        int t1=x-500000;
                        int tax1=(int) (t1*(0.2))+10000;
                        tax=(int)(tax1+(tax1*(0.03)));
                        out.println("<br>The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 3% Cess on Income Tax");
                    }
                    else if(x>1000000 && x<=10000000)
                    {
                        if(x<5000001)
                        {
                         int t1=x-1000000;
                         int tax1=(int) (t1*(0.3))+110000;
                         tax=(int)(tax1+(tax1*(0.03)));
                         out.println("<br>The Payable Income Tax is: INR " + tax);
                         out.println("<br>**Including 3% Cess on Income Tax");
                        }
                        else
                        {
                         int t1=x-5000000;
                         int tax0=(int) (t1*(0.3));
                         int tax1=(int) (tax0*(0.15)) + 112500+ (int)(4000000*(0.3))+tax0;
                         int tax2=(int) (tax1+(tax1*(0.1)));
                         tax=(int)(tax2+(tax2*(0.03)));
                         out.println("<br>The Payable Income Tax is: INR " + tax);
                         out.println("<br>**Including 10% Surcharge on Income Tax above INR 50L");
                         out.println("<br>**Including 3% Cess on Income Tax + Surcharge");

                        }

                    }
                    else if(x>10000000)
                    {
                        int t1=x-10000000;
                        int s1=(int)(1500000*(0.1)); //surchage on 50l-1cr
                        int tax1=(int)(t1*(0.3));
                        int tax2=(int)(tax1+(tax1*(0.15))); //tax+surcharge
                        int tax1cr=112500+2700000;
                        int tax3=s1+tax2+ tax1cr;
                        tax=(int)(tax3+(tax3*(0.03)));
                        out.println("<br>The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 10% surcharge on Income Tax above INR 50 L and 15% above INR 1cr");
                        out.println("<br>**Including 3% Cess on Income Tax + Surcharge");
                    }

                    else
                    {
                        out.println("Plz Enter a valid Income");
                    }                   
                    
                 }
                
                
                //age 80+
                else if(value.equals("a80"))
                {
                    //out.println("<br>Age Above 80<br>");
                    
                    if(x<=500000 && x>0)
                    {
                        tax=0;
                        out.println("<br>The Payable Income Tax is: INR " + tax);
                    }
                    else if(x>500000 && x<=1000000)
                    {
                        int t1=x-500000;
                        int tax1=(int) (t1*(0.20));
                        tax=(int)(tax1+(tax1*(0.03)));
                        out.println("<br>The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 3% Cess on Income Tax");
                    }
                    
                    else if(x>1000000 && x<=10000000)
                    {
                        if(x<5000001)
                        {
                         int t1=x-1000000;
                         int tax1=(int) (t1*(0.3))+100000;
                         tax=(int)(tax1+(tax1*(0.03)));
                         out.println("<br>The Payable Income Tax is: INR " + tax);
                         out.println("<br>**Including 3% Cess on Income Tax");
                        }
                        else
                        {
                         int t1=x-5000000;
                         int tax0=(int) (t1*(0.3));//tax on 50lakh above
                         int tax1= 100000+ (int)(4000000*(0.3))+tax0;
                         int tax2=(int) (tax0*(0.1));
                         tax=(int)(tax2+tax1+((tax1+tax2)*(0.03)));
                         out.println("<br>The Payable Income Tax is: INR " + tax);
                         out.println("<br>**Including 10% Surcharge on Income Tax above INR 50L");
                         out.println("<br>**Including 3% Cess on Income Tax + Surcharge");

                        }

                    }
                    else if(x>10000000)
                    {
                        int t1=x-10000000;
                        int s1=(int)(1500000*(0.1)); //surchage on 50l-1cr
                        int tax1=(int)(t1*(0.3));
                        int tax2=(int)(tax1+(tax1*(0.15))); //tax+surcharge
                        int tax1cr=110000+2700000;
                        int tax3=s1+tax2+ tax1cr;
                        tax=(int)(tax3+(tax3*(0.03)));
                        out.println("The Payable Income Tax is: INR " + tax);
                        out.println("<br>**Including 10% surcharge on Income Tax above INR 50 L and 15% above INR 1cr");
                        out.println("<br>**Including 3% Cess on Income Tax + Surcharge");
                    }

                    else
                    {
                        out.println("Plz Enter a valid Income");
                    }
                 }
                else
                {
                    out.println("error");
                }
                
                
            }
            out.println("</form>");
            out.println("<form action=\"itback\" method=\"post\" >");
           
            HttpSession s1 = request.getSession();
            s1.setAttribute("z", tax);
          
            out.println("&nbsp<br><br><input class=\"green\" type=\"submit\" value=\" SAVE \" /> </h4><br><br>");
            
            out.println("</form>");
            
            
            //request.setAttribute("z",tax);
                    
            //out.println("<br>To be saved : "+tax);
                
               /*
                It i=new It();        
                i.setTaxsave(tax);
                Session s= hib.DAOLayer.getSession();
                Transaction t=s.beginTransaction();
                s.save(i);
                t.commit();
                out.println("<font color=\"red\">Record saved</font>");
                */
        }
        finally {
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            processRequest(request, response);
           
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
