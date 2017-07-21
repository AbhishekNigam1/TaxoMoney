package action;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import tables.Employee;

public class EmpAction {
    public static void main(String[] args) {
        //addEmp();
        //deleteEmp(5);
        //updateEmp();
        //showAll();
        System.out.println("-------------------PAGE 1---------------");
        pageWise(0);
        System.out.println("-------------------PAGE 2---------------");
        pageWise(1);
        System.out.println("-------------------PAGE 3---------------");
        pageWise(2);
        System.out.println("-------------------PAGE 4---------------");
        pageWise(3);
    }
    
    static void pageWise(int page){
        Session s = hib.DAOLayer.getSession();
        Criteria c = s.createCriteria(Employee.class);
        c.setFirstResult(page*5);
        c.setMaxResults(5);
        List<Employee> data = c.list();
        for(Employee x : data){
         int i = x.getEmpid();
         String n = x.getName();
         String d = x.getDept();
         System.out.println(i+" : "+n+" : "+d);
        }
    }
    
    static void CriteriaTest(){
        Session s = hib.DAOLayer.getSession();
     
        //Query q = s.createQuery("from Employee");
        Criteria c = s.createCriteria(Employee.class);
         
         c.add(Restrictions.and(Restrictions.like("name","A%"),Restrictions.eq("empid",2)));
        
        List<Employee> data = c.list();
        for(Employee x : data){
         int i = x.getEmpid();
         String n = x.getName();
         String d = x.getDept();
         System.out.println(i+" : "+n+" : "+d);
        }
    }
    
    static void showAll(){
        Session s = hib.DAOLayer.getSession();
     
        Query q = s.createQuery("from Employee");
        List<Employee> data = q.list();
        for(Employee x : data){
         int i = x.getEmpid();
         String n = x.getName();
         String d = x.getDept();
         System.out.println(i+" : "+n+" : "+d);
        }
    }
    
    static void updateEmp()
    {
        Session s = hib.DAOLayer.getSession();
        Employee e = (Employee)s.get(Employee.class, 3);
        e.setDept("ACCOUNTS");
        Transaction t = s.beginTransaction();
        s.update(e);
        t.commit();
        System.out.println("RECORD UPDATED SUCCESSULYY!!");
    }
    
    static void deleteEmp(int eid)
    {
        Employee e = new Employee();
        e.setEmpid(eid);
        Session s = hib.DAOLayer.getSession();
        Transaction t = s.beginTransaction();
        s.delete(e);
        t.commit();
        System.out.println("RECORDS DELETED SUCCESSULYY!!");
    }
    
    static void addEmp()
    {
        Employee [] e = new Employee[4];
        e[0] = new Employee("Vijay Kumar", "MARKETING");
        e[1] = new Employee("Arun Shivam", "SALES");
        e[2] = new Employee("R K Patnayak", "IT");
        e[3] = new Employee("Shivani Dixit", "SALES");
        
        
        Session s = hib.DAOLayer.getSession();
        Transaction t = s.beginTransaction();
        for(Employee i : e)
        {
         s.save(i);
        }
        t.commit();
        System.out.println("4 RECORDS SAVED SUCCESSULYY!!");
    }
    
}
