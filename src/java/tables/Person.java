package tables;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private int pid;
    private String name;
    @Embedded
    private PersonDetails pd;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDetails getPd() {
        return pd;
    }

    public void setPd(PersonDetails pd) {
        this.pd = pd;
    }
    
    
}
