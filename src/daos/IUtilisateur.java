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
    List<Utilisateurs> allUsers();
    void deleteUser(Utilisateurs u);
    void editUser(Utilisateurs utilisateur) ;
    
    Utilisateurs findUserByEmail(String email);
    Utilisateurs findUserById(int id);
    
    Utilisateurs login(String email, String motDePasse);
    Utilisateurs addRegister(Utilisateurs u);
}
