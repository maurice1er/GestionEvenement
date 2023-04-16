/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import models.Villes;
import models.Pays;

/**
 *
 * @author bambi
 */
public interface IVille {
    List<Villes> Ville();
    
    Villes getVilleByName(String name);
    
    void editVille(Villes villes);
    
    List<Villes> getVillesByPaysId(int paysId);
    
    void deleteVilles(Villes ville);
    Villes addVilles(Villes ville);
    
}