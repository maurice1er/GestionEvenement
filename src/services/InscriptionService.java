/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import daos.IInscription;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import models.Evenements;
import models.Inscriptions;
import models.Utilisateurs;
import utils.EntityManagerUtil;

/**
 *
 * @author user
 */
public class InscriptionService implements IInscription {
    private EntityManager entityManager = null;
    
    public InscriptionService(){
        entityManager = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    public void inscrireParticipant(Evenements evenement, Utilisateurs participant) {
        EntityTransaction et = null;
        Evenements registerSaved;
        try {
            entityManager.getTransaction().begin();
            
            Inscriptions inscription = new Inscriptions();
            inscription.setDateInscription(new Date());
            inscription.setEvenementId(evenement);
            inscription.setParticipantId(participant);
            
            entityManager.persist(inscription);
            entityManager.flush();
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
        } finally {
            // entityManager.close();
            // emf.close();
            System.out.println("s'inscrire à un event");
        }
    }

    public boolean subscriptionAlreadyExist(Evenements evenement, Utilisateurs participant) {
        Inscriptions inscriptions = null;
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            TypedQuery<Inscriptions> query = entityManager.createQuery("SELECT i FROM Inscriptions i WHERE i.evenementId = :evenementId AND i.participantId = :participantId", Inscriptions.class);

            // Passage du paramètre à la requête
            query.setParameter("evenementId", evenement);
            query.setParameter("participantId", participant);
            
            inscriptions = query.getSingleResult();
            tx.commit();
        } catch (Exception ex) {
            if (tx.isActive()) {
                tx.rollback();
            }
            ex.printStackTrace();
        } finally {
            System.out.println("s'inscrire à un event");
        }
        System.out.println(inscriptions);
        return (inscriptions == null) ? false : true;
    }
}
