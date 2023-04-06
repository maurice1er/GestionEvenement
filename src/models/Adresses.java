/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "adresses")
@NamedQueries({
    @NamedQuery(name = "Adresses.findAll", query = "SELECT a FROM Adresses a"),
    @NamedQuery(name = "Adresses.findById", query = "SELECT a FROM Adresses a WHERE a.id = :id"),
    @NamedQuery(name = "Adresses.findByAdresse1", query = "SELECT a FROM Adresses a WHERE a.adresse1 = :adresse1"),
    @NamedQuery(name = "Adresses.findByAdresse2", query = "SELECT a FROM Adresses a WHERE a.adresse2 = :adresse2"),
    @NamedQuery(name = "Adresses.findByCodePostal", query = "SELECT a FROM Adresses a WHERE a.codePostal = :codePostal")})
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adresseId")
    private Collection<Evenements> evenementsCollection;
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

    public Collection<Evenements> getEvenementsCollection() {
        return evenementsCollection;
    }

    public void setEvenementsCollection(Collection<Evenements> evenementsCollection) {
        this.evenementsCollection = evenementsCollection;
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
