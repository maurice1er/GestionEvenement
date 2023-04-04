package daos;

import java.util.List;
import models.Utilisateurs;

public interface IUtilisateur {
    
    /**
     * Ajoute un nouvel utilisateur à la base de données.
     *
     * @param u L'objet Utilisateur à ajouter à la base de données.
     * @return L'objet Utilisateur ajouté et persisté dans la base de données.
     */
    Utilisateurs addUser(Utilisateurs u);

    /**
     * Récupère la liste de tous les utilisateurs stockés dans la base de données.
     *
     * @return Une liste d'objets Utilisateur représentant tous les utilisateurs
     *         enregistrés dans la base de données.
     */
    List<Utilisateurs> allUsers();

    /**
     * Supprime un utilisateur de la base de données.
     *
     * @param u L'objet Utilisateur à supprimer de la base de données.
     */
    void deleteUser(Utilisateurs u);

    /**
     * Récupère un utilisateur par son nom d'utilisateur.
     *
     * @param username Le nom d'utilisateur de l'utilisateur à récupérer.
     * @return L'objet Utilisateur correspondant au nom d'utilisateur donné, ou null si aucun
     *         utilisateur avec ce nom d'utilisateur n'existe dans la base de données.
     */
    void editUser(Utilisateurs utilisateur) ;
    
    Utilisateurs findUserByEmail(String email);
    
    Utilisateurs login(String email, String motDePasse);
}
