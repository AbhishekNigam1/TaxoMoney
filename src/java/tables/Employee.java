package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee 
{
 @Id
 @GeneratedValue
 private int empid;
 private String name;
 private String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public Employee() {
    }

 
 
 
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
 
 
}
