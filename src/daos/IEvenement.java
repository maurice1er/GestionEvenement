/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import java.util.List;
import models.Evenement;

/**
 *
 * @author user
 */
public interface IEvenement {
    List<Evenement> allEvents();
    Evenement addEvent(Evenement p);
    Evenement getEventByTitle(String title);
    Evenement updateEvent(int id, Evenement e);
    void deleteEventById(int id);
    
}
