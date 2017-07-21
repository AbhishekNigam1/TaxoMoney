package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Consumer {
    @Id
    private int cid;
    private String name;
    
    @OneToOne
    @JoinColumn(name = "cdid_FK")
    ConsumerDetails cd;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConsumerDetails getCd() {
        return cd;
    }

    public void setCd(ConsumerDetails cd) {
        this.cd = cd;
    }
    
    
}
