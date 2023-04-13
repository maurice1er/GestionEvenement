/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bambi
 */
@Entity
@Table(name = "adresses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adresses.findAll", query = "SELECT a FROM Adresses a")
    , @NamedQuery(name = "Adresses.findById", query = "SELECT a FROM Adresses a WHERE a.id = :id")
    , @NamedQuery(name = "Adresses.findByAdresse1", query = "SELECT a FROM Adresses a WHERE a.adresse1 = :adresse1")
    , @NamedQuery(name = "Adresses.findByAdresse2", query = "SELECT a FROM Adresses a WHERE a.adresse2 = :adresse2")
    , @NamedQuery(name = "Adresses.findByCodePostal", query = "SELECT a FROM Adresses a WHERE a.codePostal = :codePostal")})
public class Adresses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "adresse1")
    private String adresse1;
    @Column(name = "adresse2")
    private String adresse2;
    @Column(name = "codePostal")
    private String codePostal;
    @JoinColumn(name = "villeId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Villes villeId;

    public Adresses() {
    }

    public Adresses(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Villes getVilleId() {
        return villeId;
    }

    public void setVilleId(Villes villeId) {
        this.villeId = villeId;
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
        if (!(object instanceof Adresses)) {
            return false;
        }
        Adresses other = (Adresses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Adresses[ id=" + id + " ]";
    }
    
}
