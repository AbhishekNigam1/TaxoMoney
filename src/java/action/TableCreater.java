package action;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import tables.*;

public class TableCreater {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Project.class);
        cfg.addAnnotatedClass(LiveProject.class);
        cfg.configure();
        
        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);
        
        System.out.println("TABLE CREATED!!");
        
    }
    
}
