/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daos.IPays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import models.Adresses;
import models.Pays;

/**
 *
 * @author bambi
 */
public class PaysService implements IPays {
    private EntityManagerFactory EMF = null;
    private EntityManager EM = null;

    public PaysService() {
        EMF = Persistence.createEntityManagerFactory("GestionEvenementsPU");
        EM = EMF.createEntityManager();

    }
    public List<Pays> pays() {
        List<Pays> paysList = null;
        try {
            paysList = EM.createNamedQuery("Pays.findAll", Pays.class).getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Erreur lors de la recuperation des Pays" + ex.getMessage());
        }
        return paysList;
    }
    public void editPays(Pays pays) {
        EntityTransaction transaction = EM.getTransaction();
        try {
            // Début de la transaction
            transaction.begin();
            // Mettre à jour l'utilisateur dans la base de données
            EM.merge(pays);
            // Validation de la transaction
            transaction.commit();
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            // Affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la mise à jour de Pays : " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
    }

    public void deletePays(Pays pays) {
    EntityTransaction transaction = null;
    try {
        transaction = EM.getTransaction();
        transaction.begin();
        EM.remove(EM.merge(pays));
        transaction.commit();
    } catch (Exception ex) {
        if (transaction != null && transaction.isActive()) {
            transaction.rollback();
        }
        System.err.println("Erreur lors de la suppression de pays : " + ex.getMessage());
        throw ex;
    }
}
    public Pays addPays(Pays pays) {
        EntityTransaction et = null;
        Pays categorieSaved;

        try {
            et = EM.getTransaction();
            et.begin();
            EM.persist(pays);
            EM.flush();
            et.commit();
            categorieSaved = pays;

        } catch (Exception ex) {
            if (et == null && et.isActive()) {
                et.rollback();
            }
            System.err.println("Erreur lors de la récupération des pays" + ex.getMessage());
            throw ex;
        }
        return categorieSaved;
    }




    
}
