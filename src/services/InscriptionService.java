/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import daos.IInscription;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
}
