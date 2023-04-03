/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class EntityManagerUtil {
    // L'instance singleton de l'EntityManagerFactory
    private static EntityManagerFactory EMF;

    /**
     * Récupère l'instance unique d'EntityManagerFactory. Si l'instance n'a pas
     * encore été créée, elle est initialisée avec la configuration
     * "GestionEvenements".
     *
     * @return L'instance unique d'EntityManagerFactory.
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        if (EMF == null) {
            EMF = Persistence.createEntityManagerFactory("GestionEvenements");
        }
        return EMF;
    }

    /**
     * Ferme l'instance unique d'EntityManagerFactory si elle a été créée et
     * est ouverte. Cette méthode doit être appelée à la fin de l'exécution de
     * l'application pour libérer les ressources associées.
     */
    public static void closeEntityManagerFactory() {
        if (EMF != null && EMF.isOpen()) {
            EMF.close();
        }
    }
}
