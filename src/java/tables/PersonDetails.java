package tables;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class PersonDetails implements Serializable
{
    private String email;
    private String contact;
    private String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
           
}
