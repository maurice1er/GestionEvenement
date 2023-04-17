/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import daos.IAdresse;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import models.Adresses;

/**
 *
 * @author bambi
 */
public class AdresseService implements IAdresse {

    private EntityManagerFactory EMF = null;
    private EntityManager EM = null;

    public AdresseService() {
        EMF = Persistence.createEntityManagerFactory("GestionEvenementsPU");
        EM = EMF.createEntityManager();

    }

    public List<Adresses> Adresses() {
        List<Adresses> adresseList = null;
        try {
            adresseList = EM.createNamedQuery("Adresses.findAll", Adresses.class).getResultList();
        } catch (PersistenceException ex) {
            System.out.println("Erreur lors de la recuperation des adresses" + ex.getMessage());
        }
        return adresseList;
    }

    @Override
    public void editAdresse(Adresses adresses) {
        EntityTransaction transaction = EM.getTransaction();
        try {
            // Début de la transaction
            transaction.begin();
            // Mettre à jour l'utilisateur dans la base de données
            EM.merge(adresses);
            // Validation de la transaction
            transaction.commit();
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            // Affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la mise à jour de l'adresse : " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
    }

    public void deleteAdresse(Adresses adresse) {
    EntityTransaction transaction = null;
    try {
        transaction = EM.getTransaction();
        transaction.begin();
        EM.remove(EM.merge(adresse));
        transaction.commit();
    } catch (Exception ex) {
        if (transaction != null && transaction.isActive()) {
            transaction.rollback();
        }
        System.err.println("Erreur lors de la suppression de l'Adresse : " + ex.getMessage());
        throw ex;
    }
}
    public Adresses addAdresses(Adresses adresse) {
        EntityTransaction et = null;
        Adresses categorieSaved;

        try {
            et = EM.getTransaction();
            et.begin();
            EM.persist(adresse);
            EM.flush();
            et.commit();
            categorieSaved = adresse;

        } catch (Exception ex) {
            if (et == null && et.isActive()) {
                et.rollback();
            }
            System.err.println("Erreur lors de la récupération des adresses" + ex.getMessage());
            throw ex;
        }
        return categorieSaved;
    }


    @Override
    public List<Adresses> AllAdresse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
