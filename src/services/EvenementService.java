/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import daos.IEvenement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import models.Evenements;
import utils.EntityManagerUtil;

/**
 *
 * @author user
 */
public class EvenementService implements IEvenement {

    private EntityManager entityManager = null;

    public EvenementService() {
        entityManager = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    @Override
    public List<Evenements> allEvents() {
        List<Evenements> evenementList;

        try {
            evenementList = entityManager.createNamedQuery("Evenements.findAll", Evenements.class).getResultList();
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération des produits " + ex.getMessage());
            throw ex;
        }
        // Retour de la liste de tous les produits
        return evenementList;
    }

    @Override
    public List<Evenements> allEventsByVille(String ville) {
        List<Evenements> evenementList;

        try {
            //evenementList = entityManager.createNamedQuery("Evenements.findAllByVille", Evenements.class);
        
            TypedQuery<Evenements> query = entityManager.createNamedQuery("Evenements.findAllByVille", Evenements.class);
            query.setParameter("ville", ville);

            evenementList = query.getResultList();
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération des produits " + ex.getMessage());
            throw ex;
        }
        // Retour de la liste de tous les produits
        return evenementList;
    }
    
    

    @Override
    public Evenements addEvent(Evenements e) {
        EntityTransaction et = null;
        Evenements registerSaved;
        try {
            // Récupération de l'objet de transaction
            et = entityManager.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de la catégorie dans la base de données
            entityManager.persist(e);
            entityManager.flush();
            // Validation de la transaction
            et.commit();
            // Affectation de la catégorie persistée à la variable categorieSaved
            registerSaved = e;

            System.out.println("Evenement ajouté avec succès");
            System.out.println(e);
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (et != null && et.isActive()) {
                et.rollback();
            }
            // Affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de l'insertion de l inscription " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la catégorie persistée
        return registerSaved;
    }

    @Override
    public Evenements getEventByTitle(String title) {
        Evenements events = null;
        try {
            TypedQuery<Evenements> query = entityManager.createNamedQuery("Evenements.findByTitre", Evenements.class);
            query.setParameter("titre", title);

            events = query.getSingleResult();
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération de l'events " + ex.getMessage());
            throw ex;
        }
        return events;
    }

    @Override
    public Evenements getEventById(int id) {
        System.out.println("Model GetEventByEvent");
        Evenements event = null;
        try {
            TypedQuery<Evenements> query = entityManager.createNamedQuery("Evenements.findById", Evenements.class);
            query.setParameter("id", id);

            event = query.getSingleResult();
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération de l'events " + ex.getMessage());
            throw ex;
        }
        return event;
    }

    @Override
    public Evenements updateEvent(Evenements e) {
        System.out.println("UpdateEvent");
        EntityTransaction et = null;
        Evenements registerSaved;
        try {
            // Récupération de l'objet de transaction
            et = entityManager.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de la catégorie dans la base de données
            entityManager.persist(e);
            entityManager.flush();
            // Validation de la transaction
            et.commit();
            // Affectation de la catégorie persistée à la variable categorieSaved
            registerSaved = e;

            System.out.println("Evenement modifié avec succès");
            System.out.println(e);
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (et != null && et.isActive()) {
                et.rollback();
            }
            // Affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de l'insertion de la modification " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la catégorie persistée
        return registerSaved;
    }

    @Override
    public void deleteEventById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int countUserByEvenementId(int eventId) {
        int nbInscrit = 0;
        try {
            TypedQuery<Long> query = entityManager.createNamedQuery("Evenements.countUserByEventId", Long.class);
            query.setParameter("eventId", eventId);

            //  Long _nbInscrit = query.getSingleResult();
            //  nbInscrit = _nbInscrit.intValue();   
            List<Long> results = query.getResultList();
            if (!results.isEmpty()) {
                nbInscrit = results.get(0).intValue();
            }
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération des produits " + ex.getMessage());
            throw ex;
        }
        // Retour du nombre d'inscrits à l'événement
        return nbInscrit;
    }
}
