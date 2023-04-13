/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import models.Adresses;

/**
 *
 * @author bambi
 */
public interface IAdresse {
    
    List<Adresses> AllAdresse();
    void editAdresse(Adresses adresses);
    void deleteAdresse(Adresses adresse) ;
    Adresses addAdresses(Adresses adresse);
    
}
