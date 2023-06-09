/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daos.IVille;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import models.Adresses;
import models.Villes;

/**
 *
 * @author bambi
 */
public class VilleService implements IVille {
     private EntityManagerFactory EMF = null;
    private EntityManager EM = null;

    public VilleService() {
        EMF = Persistence.createEntityManagerFactory("GestionEvenementsPU");
        EM = EMF.createEntityManager();

    }

    public List<Villes> Ville() {
        List<Villes> villeList = null;
        try {
            villeList = EM.createNamedQuery("villes.findAll", Villes.class).getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Erreur lors de la recuperation des villes" + ex.getMessage());
        }
        return villeList;
    }

    public void editVille(Villes villes) {
        EntityTransaction transaction = EM.getTransaction();
        try {
            // Début de la transaction
            transaction.begin();
            // Mettre à jour l'utilisateur dans la base de données
            EM.merge(villes);
            // Validation de la transaction
            transaction.commit();
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            // Affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la mise à jour de Ville : " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
    }

    public void deleteVilles(Villes ville) {
    EntityTransaction transaction = null;
    try {
        transaction = EM.getTransaction();
        transaction.begin();
        EM.remove(EM.merge(ville));
        transaction.commit();
    } catch (Exception ex) {
        if (transaction != null && transaction.isActive()) {
            transaction.rollback();
        }
        System.err.println("Erreur lors de la suppression de Ville : " + ex.getMessage());
        throw ex;
    }
}
    public Villes addVilles(Villes ville) {
        EntityTransaction et = null;
        Villes categorieSaved;

        try {
            et = EM.getTransaction();
            et.begin();
            EM.persist(ville);
            EM.flush();
            et.commit();
            categorieSaved = ville;

        } catch (Exception ex) {
            if (et == null && et.isActive()) {
                et.rollback();
            }
            System.err.println("Erreur lors de la récupération des villes" + ex.getMessage());
            throw ex;
        }
        return categorieSaved;
    }

    
}
