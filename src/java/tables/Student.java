package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;

@Entity
@SecondaryTable(name = "StudentDetails")
public class Student 
{
  
    @Id
    private int rollno;
    private String name;
    
    @Column(table = "StudentDetails")
    private String address;
    @Column(table = "StudentDetails")
    private String email;
    @Column(table = "StudentDetails")
    private String fname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    
    
  
}
