/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "utilisateurs")
@NamedQueries({
    @NamedQuery(name = "Utilisateurs.findAll", query = "SELECT u FROM Utilisateurs u")
    , @NamedQuery(name = "Utilisateurs.findById", query = "SELECT u FROM Utilisateurs u WHERE u.id = :id")
    , @NamedQuery(name = "Utilisateurs.findByNom", query = "SELECT u FROM Utilisateurs u WHERE u.nom = :nom")
    , @NamedQuery(name = "Utilisateurs.findByPrenom", query = "SELECT u FROM Utilisateurs u WHERE u.prenom = :prenom")
    , @NamedQuery(name = "Utilisateurs.findByEmail", query = "SELECT u FROM Utilisateurs u WHERE u.email = :email")
    , @NamedQuery(name = "Utilisateurs.findByTelephone", query = "SELECT u FROM Utilisateurs u WHERE u.telephone = :telephone")
    , @NamedQuery(name = "Utilisateurs.findByMotDePasse", query = "SELECT u FROM Utilisateurs u WHERE u.motDePasse = :motDePasse")
    , @NamedQuery(name = "Utilisateurs.findByRole", query = "SELECT u FROM Utilisateurs u WHERE u.role = :role")
    , @NamedQuery(name = "Utilisateurs.findByDateCreation", query = "SELECT u FROM Utilisateurs u WHERE u.dateCreation = :dateCreation")
    , @NamedQuery(name = "Utilisateurs.findByDateModification", query = "SELECT u FROM Utilisateurs u WHERE u.dateModification = :dateModification")})
public class Utilisateurs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @Column(name = "mot_de_passe")
    private String motDePasse;
    @Basic(optional = false)
    @Column(name = "role")
    private String role;
    @Basic(optional = false)
    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Column(name = "date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModification;

    public Utilisateurs() {
    }

    public Utilisateurs(Integer id) {
        this.id = id;
    }

    public Utilisateurs(Integer id, String nom, String prenom, String email, String telephone, String motDePasse, String role, Date dateCreation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.motDePasse = motDePasse;
        this.role = role;
        this.dateCreation = dateCreation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
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
        if (!(object instanceof Utilisateurs)) {
            return false;
        }
        Utilisateurs other = (Utilisateurs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Utilisateurs[ id=" + id + " ]";
    }
    
}
