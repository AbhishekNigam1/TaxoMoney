/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abhishek Nigam
 */
@Entity
@Table(name = "it")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "It.findAll", query = "SELECT i FROM It i")})
    //@NamedQuery(name = "It.findById", query = "SELECT i FROM It i WHERE i.id = :id"),
    //@NamedQuery(name = "It.findByTaxsave", query = "SELECT i FROM It i WHERE i.taxsave = :taxsave")})
public class It implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Column(name = "taxsave")
    private Integer taxsave;

    public It() {
    }

    public It(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaxsave() {
        return taxsave;
    }

    public void setTaxsave(Integer taxsave) {
        this.taxsave = taxsave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof It)) {
            return false;
        }
        It other = (It) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tables.It[ id=" + id + " ]";
    }

    public void setTaxsave(String p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
