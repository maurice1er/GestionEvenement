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
@Table(name = "villes")
@NamedQueries({
    @NamedQuery(name = "Villes.findAll", query = "SELECT v FROM Villes v"),
    @NamedQuery(name = "Villes.findById", query = "SELECT v FROM Villes v WHERE v.id = :id"),
    @NamedQuery(name = "Villes.findByName", query = "SELECT v FROM Villes v WHERE v.name = :name")})
public class Villes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "paysId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pays paysId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "villeId")
    private Collection<Adresses> adressesCollection;

    public Villes() {
    }

    public Villes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pays getPaysId() {
        return paysId;
    }

    public void setPaysId(Pays paysId) {
        this.paysId = paysId;
    }

    public Collection<Adresses> getAdressesCollection() {
        return adressesCollection;
    }

    public void setAdressesCollection(Collection<Adresses> adressesCollection) {
        this.adressesCollection = adressesCollection;
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
        if (!(object instanceof Villes)) {
            return false;
        }
        Villes other = (Villes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Villes[ id=" + id + " ]";
    }
    
}
