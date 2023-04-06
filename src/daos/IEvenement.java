/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import java.util.List;
import models.Evenements;

/**
 *
 * @author user
 */
public interface IEvenement {
    List<Evenements> allEvents();
    Evenements addEvent(Evenements p);
    Evenements getEventByTitle(String title);
    Evenements updateEvent(int id, Evenements e);
    void deleteEventById(int id);
    int countUserByEvenementId(int eventId);
    
}
