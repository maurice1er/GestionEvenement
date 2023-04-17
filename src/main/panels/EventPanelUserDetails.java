/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.panels;

import daos.IEvenement;
import daos.IInscription;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.*;
import javax.swing.JOptionPane;
import main.adminpage.DashResumeForm;
import models.Evenements;
import models.Inscriptions;
import models.Utilisateurs;
import services.EvenementService;
import services.InscriptionService;

/**
 *
 * @author user
 */
public class EventPanelUserDetails extends javax.swing.JPanel {
    public Utilisateurs userInfo;
    public Evenements event;
    
    IEvenement ie = new EvenementService();
    IInscription ii = new InscriptionService();

    /**
     * Creates new form AdminAddEvent
     */
    public EventPanelUserDetails(int id, Utilisateurs user) {
        try {
            event = ie.getEventById(id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        userInfo = user;
        initComponents();
        setFieldsValue(event);
        authorize(event.getOrganisateurId().getId(), userInfo.getId());
    }
    
    private void authorize(int organisateurId, int userId){
        if(organisateurId != userId){
            jfBtnSupprimer.setVisible(false);
            jfBtnModifier.setVisible(false);
            if(ii.subscriptionAlreadyExist(event, userInfo) == false){
                jfBtnInscrire.setVisible(true);
            }
        }else{
            jfBtnInscrire.setVisible(false);
            jfBtnSupprimer.setVisible(true);
            jfBtnModifier.setVisible(true);
        }
    }

    private void setFieldsValue(Evenements e) {
        authorize(event.getOrganisateurId().getId(), userInfo.getId());
        jfEventTitle.setText(e.getTitre());
        jfEventTitle.setEnabled(false);
        
        jfEventDesc.setText(e.getDescription());
        jfEventDesc.setEnabled(false);
        
        jfEventAdresse1.setText(e.getAdresseId().getAdresse1());
        jfEventAdresse1.setEnabled(false);
        
        jfEventAdresse2.setText(e.getAdresseId().getAdresse2());
        jfEventAdresse2.setEnabled(false);

        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        
        try {
            Date dateDebut = e.getDateDebut();
            Date dateDebutFormat = formatter.parse(dateDebut.toString());
            jfEventDebut.setValue(dateDebutFormat);
            jfEventDebut.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(EventPanelUserDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Date dateFin = e.getDateFin();
            Date dateFinFormat = formatter.parse(dateFin.toString());
            
            jfEventFin.setValue(dateFinFormat);
            jfEventFin.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(EventPanelUserDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jfEventVille.removeAllItems();
        jfEventVille.addItem(e.getAdresseId().getVilleId().getName());
        jfEventVille.setEditable(false);
        
        jfEventPays.removeAllItems();
        jfEventPays.addItem(e.getAdresseId().getVilleId().getPaysId().getName());
        jfEventPays.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfBtnModifier = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jfEventAdresse1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jfEventVille = new javax.swing.JComboBox<>();
        jfEventPays = new javax.swing.JComboBox<>();
        jfEventDebut = new javax.swing.JSpinner();
        jfEventFin = new javax.swing.JSpinner();
        jfBtnSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jfEventDesc = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jfEventTitle = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jfEventAdresse2 = new javax.swing.JTextField();
        jfBtnInscrire = new javax.swing.JButton();

        jLabel1.setText("Titre");

        jLabel2.setText("Description");

        jfBtnModifier.setText("Modifier");
        jfBtnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfBtnModifierActionPerformed(evt);
            }
        });

        jLabel3.setText("Date et Heure de début");

        jLabel4.setText("Date et Heure de fin");

        jLabel5.setText("Adresse principale");

        jfEventAdresse1.setFocusable(false);

        jLabel6.setText("Ville");

        jLabel7.setText("Pays");

        jfEventVille.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        jfEventVille.setEnabled(false);
        jfEventVille.setFocusable(false);

        jfEventPays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        jfEventPays.setEnabled(false);
        jfEventPays.setFocusable(false);

        jfEventDebut.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.HOUR));
        jfEventDebut.setFocusable(false);

        jfEventFin.setModel(new javax.swing.SpinnerDateModel());
        jfEventFin.setFocusable(false);

        jfBtnSupprimer.setText("Supprimer");
        jfBtnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfBtnSupprimerActionPerformed(evt);
            }
        });

        jfEventDesc.setEditable(false);
        jfEventDesc.setEnabled(false);
        jScrollPane1.setViewportView(jfEventDesc);

        jfEventTitle.setEditable(false);
        jfEventTitle.setEnabled(false);
        jScrollPane2.setViewportView(jfEventTitle);

        jLabel8.setText("Adresse secondaire");

        jfEventAdresse2.setFocusable(false);

        jfBtnInscrire.setText("S'inscrire");
        jfBtnInscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfBtnInscrireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(90, 90, 90)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jfEventVille, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jfEventPays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jfEventAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jfEventAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jfBtnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jfBtnInscrire)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jfBtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jfEventDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jfEventFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jfEventDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfEventFin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfEventAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfEventAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfEventVille, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfEventPays, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfBtnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfBtnInscrire, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfBtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jfBtnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfBtnModifierActionPerformed
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(null, "Holla holla");
        
        jfEventTitle.setEditable(true);
        jfEventTitle.setEnabled(true);
        
        jfEventDesc.setEditable(true);
        jfEventDesc.setEnabled(true);
        
        jfEventDebut.setEnabled(true);
        jfEventFin.setEnabled(true);
        
        jfEventAdresse1.setEditable(true);
        jfEventAdresse1.setEnabled(true);
        jfEventAdresse1.setFocusable(true);

        jfEventAdresse2.setEditable(true);
        jfEventAdresse2.setEnabled(true);
        jfEventAdresse2.setFocusable(true);
        
        jfEventVille.setEditable(true);
        jfEventVille.setEnabled(true);
        
        jfEventPays.setEditable(true);
        jfEventPays.setEnabled(true);
        
        event.setTitre(jfEventTitle.getText());
        
        updateEvent();
        jfBtnModifier.setText("Mettre à jour");
        
        //new DashResumeForm().handlePanelBoxContent(new DashResumeForm().jfPageTitle, "LIST EVENTS", new DashResumeForm().jfPanelBox);
    }//GEN-LAST:event_jfBtnModifierActionPerformed

    private void updateEvent(){
        if(jfBtnModifier.getText().toLowerCase().contains("mettre")){
            ie.updateEvent(event);
            JOptionPane.showMessageDialog(null, "Modifié");
        }
    }
    
    private void jfBtnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfBtnSupprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfBtnSupprimerActionPerformed

    private void jfBtnInscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfBtnInscrireActionPerformed
        // TODO add your handling code here:
        if(userInfo != null){
            ii.inscrireParticipant(event, userInfo); 
        }
    }//GEN-LAST:event_jfBtnInscrireActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jfBtnInscrire;
    private javax.swing.JButton jfBtnModifier;
    private javax.swing.JButton jfBtnSupprimer;
    private javax.swing.JTextField jfEventAdresse1;
    private javax.swing.JTextField jfEventAdresse2;
    private javax.swing.JSpinner jfEventDebut;
    private javax.swing.JTextPane jfEventDesc;
    private javax.swing.JSpinner jfEventFin;
    private javax.swing.JComboBox<String> jfEventPays;
    private javax.swing.JTextPane jfEventTitle;
    private javax.swing.JComboBox<String> jfEventVille;
    // End of variables declaration//GEN-END:variables
}