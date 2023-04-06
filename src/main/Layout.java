/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.lang.reflect.Field;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author user
 */
public class Layout<T> {
     
    /*
        Layout<Personne> layout = new Layout<>();
        layout.setComboValue(personnes, combo, "nom");
    */
    public void loadCombo(List<T> listT, JComboBox<String> combo, String attribut) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        
        model.addElement("---");
        
        for (T t : listT) {
            try {
                Field field = t.getClass().getDeclaredField(attribut);
                field.setAccessible(true);
                Object value = field.get(t);
                
                model.addElement(value.toString());
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                System.err.println("Erreur : impossible d'accéder à l'attribut " + attribut + " de l'objet " + t);
            }
        }
        combo.setModel(model);
    }
    
    
}
