package hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import tables.*;


public class DAOLayer {
    private static SessionFactory sessionFactory;
    static {
         Configuration cfg = new Configuration();
         cfg.addAnnotatedClass(Employee.class);
         cfg.addAnnotatedClass(Student.class);
         cfg.addAnnotatedClass(Person.class);
         cfg.addAnnotatedClass(PersonDetails.class);
         cfg.addAnnotatedClass(Movie.class);
         cfg.addAnnotatedClass(Login.class);
         cfg.addAnnotatedClass(Project.class);
         cfg.addAnnotatedClass(LiveProject.class);
         cfg.addAnnotatedClass(It.class);
         cfg.configure();
         sessionFactory = cfg.buildSessionFactory();
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
