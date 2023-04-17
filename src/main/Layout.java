/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

    public String formatDate(String dateStr) {
        String formattedDate = dateStr;
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            SimpleDateFormat outputFormat = new SimpleDateFormat("'Lun' dd MMMM yyyy 'à' HH'h'mm 'GMT'", Locale.FRENCH);

            Date date = inputFormat.parse(dateStr);
            formattedDate = outputFormat.format(date);

        } catch (ParseException ex) {

            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return formattedDate;
    }

    public boolean minNChar(String value, int nChar) {
        if (value.length() >= nChar) {
            return true;
        }
        return false;
    }

    public boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
