


<center><h3>Income Tax Calculator</h3><center>
        <br><center>
            <center><h3>Select your Age category</h3></center>
                    <input type='radio' name='Age' value='a60'>Age Under 60
                    <input type="radio" name="Age" value="a600"/>Age Under 60
                    <input type='radio' name='Age' value='a6080'>Age 60-80
                    <input type='radio' name='Age' value='a80'>Age Above 80
                </center>
                <% String value = request.getParameter("Age"); %>
                
                you have select this value "+<%=value%>+" yes


                <center><h3>Income Tax Calculator</h3><center>
                        <form action="itc.jsp?num1=0">
                            <h4>Enter Salary : <input type="text" name="num1" />
                                <input type="submit" value="Calcualte IT" /></h4>
                        </form>
                        <%!
                            int tax;
                            int x=0; %>
<%
                            String a = request.getParameter("num1");
                            x = Integer.parseInt(a);

                            if(x<=250000 && x>0)
                            {
                            tax=0;

                            out.println("The Payable Income Tax is: INR " + tax);
                            }
                            //else
                            //{
                            //out.println("Enter The Income");
                           // }
                            
                        else if(x>250000 && x<=500000)
                        {
                        int t1=x-250000;
                        int tax1=(int) (t1*(0.05));
                        tax=(int)(tax1+(tax1*(0.03))); 
                        out.println("The Payable Income Tax is: INR "+ tax);
                        **Including 3% Cess on Income Tax
                        }
                        else if(x>500000 && x<=1000000)
                        {
                        int t1=x-500000;
                        int tax1=(int) (t1*(0.2))+12500;
                        tax=(int)(tax1+(tax1*(0.03))); 
                        The Payable Income Tax is: INR <%=tax%>);
                        **Including 3% Cess on Income Tax");
                        }
                        else if(x>1000000 && x<=10000000)
                        {
                        if(x<5000001)
                        {
                        int t1=x-1000000;
                        int tax1=(int) (t1*(0.3))+112500;
                        tax=(int)(tax1+(tax1*(0.03))); 
                        The Payable Income Tax is: INR  + <%=tax%>
                        **Including 3% Cess on Income Tax
                        }
                        else
                        {
                        int t1=x-5000000;
                        int tax0=(int) (t1*(0.3));
                        int tax1=(int) (tax0*(0.15)) + 112500+ (int)(4000000*(0.3))+tax0;
                        int tax2=(int) (tax1+(tax1*(0.1)));
                        tax=(int)(tax2+(tax2*(0.03))); 
                        The Payable Income Tax is: INR <%=tax%>
                        **Including 10% Surcharge on Income Tax above INR 50L
                        **Including 3% Cess on Income Tax + Surcharge

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
                        tax=(int)(tax3+(tax3*(0.03))); %>
                        The Payable Income Tax is: INR <%=tax%>
                        **Including 10% surcharge on Income Tax above INR 50 L and 15% above INR 1cr
                        **Including 3% Cess on Income Tax + Surcharge
                        }

                        else
                        {
                        Plz Enter a valid Income
                        }
                                %>
                        
                     }
                        



