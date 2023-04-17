/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import models.Evenements;
import models.Utilisateurs;

/**
 *
 * @author user
 */
public interface IInscription {
    void inscrireParticipant(Evenements evenement, Utilisateurs participant);
}
