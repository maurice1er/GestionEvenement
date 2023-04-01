/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.Pays;
import models.Adresses;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bambi
 */
@Entity
@Table(name = "villes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Villes.findAll", query = "SELECT v FROM Villes v")
    , @NamedQuery(name = "Villes.findById", query = "SELECT v FROM Villes v WHERE v.id = :id")
    , @NamedQuery(name = "Villes.findByName", query = "SELECT v FROM Villes v WHERE v.name = :name")})
public class Villes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "pays_id", referencedColumnName = "id")
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

    @XmlTransient
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
        return "main.Villes[ id=" + id + " ]";
    }
    
}
