/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import models.Pays;

/**
 *
 * @author bambi
 */
public interface IPays {
    List<Pays> pays();
    void editPays(Pays pays);
    void deletePays(Pays pays);
    Pays addPays(Pays pays);
    
}
