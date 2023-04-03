/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author user
 */
@Entity
@Table(name = "inscriptions")
@NamedQueries({
    @NamedQuery(name = "Inscriptions.findAll", query = "SELECT i FROM Inscriptions i"),
    @NamedQuery(name = "Inscriptions.findById", query = "SELECT i FROM Inscriptions i WHERE i.id = :id"),
    @NamedQuery(name = "Inscriptions.findByDateInscription", query = "SELECT i FROM Inscriptions i WHERE i.dateInscription = :dateInscription")})
public class Inscription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date_inscription")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateInscription;
    @JoinColumn(name = "evenement_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Evenement evenementId;
    @JoinColumn(name = "participant_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Utilisateur participantId;

    public Inscription() {
    }

    public Inscription(Integer id) {
        this.id = id;
    }

    public Inscription(Integer id, Date dateInscription) {
        this.id = id;
        this.dateInscription = dateInscription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Evenement getEvenementId() {
        return evenementId;
    }

    public void setEvenementId(Evenement evenementId) {
        this.evenementId = evenementId;
    }

    public Utilisateur getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Utilisateur participantId) {
        this.participantId = participantId;
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
        if (!(object instanceof Inscription)) {
            return false;
        }
        Inscription other = (Inscription) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Inscriptions[ id=" + id + " ]";
    }
    
}
