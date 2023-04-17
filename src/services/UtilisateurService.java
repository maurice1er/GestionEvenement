package services;

import daos.IUtilisateur;
import javax.persistence.*;
import models.Utilisateurs;
import utils.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author AMY
 */
public class UtilisateurService implements IUtilisateur {

    private EntityManager entityManager = null;

    // Constructeur qui initialise l'EntityManager
    public UtilisateurService() {
        entityManager = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    // Ajouter un nouvel utilisateur dans la base de données
    @Override
    public Utilisateurs addUser(Utilisateurs utilisateur) {
        EntityTransaction et = null;
        Utilisateurs utilisateurSaved;
        try {
            // Récupération de l'objet de transaction
            et = entityManager.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de l'utilisateur dans la base de données
            entityManager.persist(utilisateur);
            entityManager.flush();
            // Validation de la transaction
            et.commit();
            // Affectation de l'utilisateur persisté à la variable utilisateurSaved
            utilisateurSaved = utilisateur;
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (et != null && et.isActive()) {
                et.rollback();
            }
            // Affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de l'insertion de l'utilisateur " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne l'utilisateur persisté
        return utilisateurSaved;
    }

    // Récupérer tous les utilisateurs depuis la base de données
    @Override
    public List<Utilisateurs> allUsers() {
        List<Utilisateurs> utilisateurList;
        try {
            // Récupération de tous les utilisateurs de la base de données
            utilisateurList = entityManager.createNamedQuery("Utilisateurs.findAll", Utilisateurs.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la récupération des utilisateurs " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la liste des utilisateurs récupérés
        return utilisateurList;
    }

    @Override
    public void deleteUser(Utilisateurs u) {
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(entityManager.merge(u));
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Erreur lors de la suppression de l'utilisateur : " + ex.getMessage());
            throw ex;
        }
    }
// Mettre à jour un utilisateur dans la base de données

    public void editUser(Utilisateurs u) {
        EntityTransaction et = null;
        Utilisateurs registerSaved;

        try {
            et = entityManager.getTransaction();
            et.begin();

            TypedQuery<Utilisateurs> query = entityManager.createQuery("SELECT u FROM Utilisateurs u WHERE u.id = :id", Utilisateurs.class);
            query.setParameter("id", u.getId());
            Utilisateurs existingUser = query.getSingleResult();
            
            System.out.println("utilisateur trouvé");
            System.out.println(existingUser);
            
            if (existingUser != null) {
                // Si l'utilisateur existe, mettre à jour ses informations
                existingUser.setNom(u.getNom());
                existingUser.setPrenom(u.getPrenom());
                existingUser.setEmail(u.getEmail());
                existingUser.setTelephone(u.getTelephone());
                existingUser.setActive(u.getActive());
                existingUser.setMotDePasse(u.getMotDePasse());
                existingUser.setRole(u.getRole());
                entityManager.merge(existingUser);
                registerSaved = existingUser;
            } else {
                // Sinon, insérer le nouvel utilisateur
                entityManager.persist(u);
                entityManager.flush();
                registerSaved = u;
            }

            et.commit();
            System.out.println("Utilisateur modifié avec succès");
            System.out.println(registerSaved);
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
            System.err.println("Erreur lors de l'insertion de la modification " + ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Utilisateurs findUserByEmail(String email) {
        try {
            // Création de la requête JPQL pour récupérer l'utilisateur
//            EntityManagerFactory EMF = Persistence.createEntityManagerFactory("GestionEvenementsPU");
//            EntityManager EM = EMF.createEntityManager();
            TypedQuery<Utilisateurs> query = entityManager.createQuery("SELECT u FROM Utilisateur u WHERE u.email = :email", Utilisateurs.class);
            // Passage du paramètre à la requête
            query.setParameter("email", email);
            // Exécution de la requête et récupération de l'utilisateur s'il existe
            Utilisateurs utilisateur = query.getSingleResult();
            return utilisateur;
        } catch (NoResultException ex) {
            // Si aucun utilisateur n'est trouvé avec ce nom d'utilisateur, renvoyer null
            return null;
        }
    }

    @Override
    public Utilisateurs login(String email, String motDePasse) {
        // Exécution de la requête et récupération de l'utilisateur s'il existe
        Utilisateurs utilisateur = null;
        try {
            //Utilisateurs user = entityManager.createNamedQuery("Utilisateurs.login", Utilisateurs.class).get();
            //TypedQuery<Utilisateurs> query = entityManager.createQuery("Utilisateurs.login", Utilisateurs.class);

            TypedQuery<Utilisateurs> query = entityManager.createQuery("SELECT u FROM Utilisateurs u WHERE u.email = :email AND u.motDePasse = :motDePasse", Utilisateurs.class);

            // Passage du paramètre à la requête
            query.setParameter("email", email);
            query.setParameter("motDePasse", motDePasse);
            //System.out.println(query);

            // Exécution de la requête et récupération de l'utilisateur s'il existe
            utilisateur = query.getSingleResult();
            //return utilisateur;
        } catch (NoResultException ex) {
            // Si aucun utilisateur n'est trouvé avec ce nom d'utilisateur, renvoyer null
            return null;
        }
        return utilisateur;
    }

    @Override
    public Utilisateurs addRegister(Utilisateurs u) {
        EntityTransaction et = null;
        Utilisateurs registerSaved;
        try {
            // Récupération de l'objet de transaction
            et = entityManager.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de la catégorie dans la base de données
            entityManager.persist(u);
            entityManager.flush();
            // Validation de la transaction
            et.commit();
            // Affectation de la catégorie persistée à la variable categorieSaved
            registerSaved = u;
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

    public Utilisateurs findUserById(int id) {
        System.out.println("Model GetUserById");

        Utilisateurs user = null;
        try {
            TypedQuery<Utilisateurs> query = entityManager.createNamedQuery("Utilisateurs.findById", Utilisateurs.class);
            query.setParameter("id", id);
            user = query.getSingleResult();
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération de l'events " + ex.getMessage());
            throw ex;
        }
        return user;
    }

}
