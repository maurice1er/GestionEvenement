/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
@Table(name = "evenements")
@NamedQueries({
    @NamedQuery(name = "Evenements.findAll", query = "SELECT e FROM Evenements e"),
    @NamedQuery(name = "Evenements.findById", query = "SELECT e FROM Evenements e WHERE e.id = :id"),
    @NamedQuery(name = "Evenements.findByTitre", query = "SELECT e FROM Evenements e WHERE e.titre = :titre"),
    @NamedQuery(name = "Evenements.findByDateDebut", query = "SELECT e FROM Evenements e WHERE e.dateDebut = :dateDebut"),
    // @NamedQuery(name = "Evenements.findByDateFin", query = "SELECT e FROM Evenements e WHERE e.dateFin = :dateFin"),
    // @NamedQuery(name = "Evenements.findByDateCreation", query = "SELECT e FROM Evenements e WHERE e.dateCreation = :dateCreation"),
    // @NamedQuery(name = "Evenements.findByDateModification", query = "SELECT e FROM Evenements e WHERE e.dateModification = :dateModification")
})
public class Evenement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "titre")
    private String titre;
    @Basic(optional = false)
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "date_debut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Basic(optional = false)
    @Column(name = "date_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    @Basic(optional = false)
    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Column(name = "date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evenementId")
    private Collection<Inscription> inscriptionsCollection;
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Adresse adresseId;
    @JoinColumn(name = "organisateur_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Utilisateur organisateurId;

    public Evenement() {
    }

    public Evenement(Integer id) {
        this.id = id;
    }

    public Evenement(Integer id, String titre, String description, Date dateDebut, Date dateFin, Date dateCreation) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.dateCreation = dateCreation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
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

    public Collection<Inscription> getInscriptionsCollection() {
        return inscriptionsCollection;
    }

    public void setInscriptionsCollection(Collection<Inscription> inscriptionsCollection) {
        this.inscriptionsCollection = inscriptionsCollection;
    }

    public Adresse getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(Adresse adresseId) {
        this.adresseId = adresseId;
    }

    public Utilisateur getOrganisateurId() {
        return organisateurId;
    }

    public void setOrganisateurId(Utilisateur organisateurId) {
        this.organisateurId = organisateurId;
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
        if (!(object instanceof Evenement)) {
            return false;
        }
        Evenement other = (Evenement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Evenements[ id=" + id + " ]";
    }
    
}
