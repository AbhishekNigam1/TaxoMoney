package action;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tables.LiveProject;
import tables.Person;
import tables.PersonDetails;
import tables.Project;
import tables.Student;

public class Test {
    public static void main(String[] args) {
        
        Project p1 = new Project();
        p1.setPid(101);
        p1.setName("ONLINE EXAM");
        p1.setDb("mysql");
        p1.setTech("JSP");
        LiveProject p2 = new LiveProject();
        p2.setPid(102);
        p2.setName("FACEBOOK");
        p2.setDb("mysql");
        p2.setTech("PHP");
        p2.setCost(30000.00f);
        Session s = hib.DAOLayer.getSession();
        Transaction t = s.beginTransaction();
        s.save(p1);
        s.save(p2);
        t.commit();
        System.out.println("data saved");
    }
    
}
