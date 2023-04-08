/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import daos.IEvenement;
import java.util.List;
import javax.persistence.EntityManager;
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
    public Evenements addEvent(Evenements p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public Evenements updateEvent(int id, Evenements e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            
            Long _nbInscrit = query.getSingleResult();
            nbInscrit = _nbInscrit.intValue();            
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération des produits " + ex.getMessage());
            throw ex;
        }
        // Retour du nombre d'inscrits à l'événement
        return nbInscrit;
    }
}

