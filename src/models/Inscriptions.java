/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class Inscriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "dateInscription")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateInscription;
    @JoinColumn(name = "evenementId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Evenements evenementId;
    @JoinColumn(name = "participantId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Utilisateurs participantId;

    public Inscriptions() {
    }

    public Inscriptions(Integer id) {
        this.id = id;
    }

    public Inscriptions(Integer id, Date dateInscription) {
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

    public Evenements getEvenementId() {
        return evenementId;
    }

    public void setEvenementId(Evenements evenementId) {
        this.evenementId = evenementId;
    }

    public Utilisateurs getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Utilisateurs participantId) {
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
        if (!(object instanceof Inscriptions)) {
            return false;
        }
        Inscriptions other = (Inscriptions) object;
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
