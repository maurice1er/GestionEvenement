/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.userpage;

import main.adminpage.*;
import main.*;
import daos.IEvenement;
import daos.IUtilisateur;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import main.panels.EventPanelAdd;
import main.panels.EventPanelDetails;
import main.panels.EventPanelUserDetails;
import main.panels.UserPanelAdd;
import main.panels.UserPanelDetails;
import main.panels.UserPanelUserDetails;
import models.Evenements;
import models.Utilisateurs;
import services.EvenementService;
import services.UtilisateurService;

/**
 *
 * @author user
 */
public class UserPageForm extends javax.swing.JFrame {

    // public String myUserFullName;
    public Utilisateurs userInfo;
    
    private int singleEventId = -1;
    private int singleUserId = -1;

    private Layout _layout = new Layout();
    public IEvenement ie;
    public IUtilisateur iu;

    HashMap<String, List<List>> _data = new HashMap<>();

    /**
     * Creates new form DashboardForm
     */
    
    public UserPageForm() {
        initComponents();
        setUserInfo(userInfo);
        ie = new EvenementService();
        iu = new UtilisateurService();
    }
    
    public UserPageForm(Utilisateurs user) {
        this.userInfo = user;
        initComponents();
        ie = new EvenementService();
        iu = new UtilisateurService();
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        setSize(screenSize.width, screenSize.height);

        System.out.println("Dashboard with constructor..");

        handlePanelBoxContent(jfPageTitle, "LIST EVENTS", jfPanelBox);
        if (jfBtnListEvent.isEnabled() == true) {
            jfBtnListEvent.setEnabled(false);
        }
        
        /*if(user.getRole() == "user"){
            this.setVisible(false);
            RegisterForm rf = new RegisterForm();
            rf.setVisible(true);
        }*/
        
        setUserInfo(user);
        
        System.out.println(userInfo);
        jLabelUsername.setText(user.getPrenom() + " " + user.getNom());
        jLabelUserRole.setText(user.getRole());
    }

    public void setUserInfo(Utilisateurs user) {

        if(user == null){
            invalidUser();
        }
        
        userInfo = user;
        
        /*if(jLabelUserRole.getText().toString().toLowerCase() != "admin"){
            this.setVisible(false);
            RegisterForm rf = new RegisterForm();
            rf.setVisible(true);
            
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
        }*/
    }

    public void invalidUser() {
        this.setVisible(false);
        RegisterForm rf = new RegisterForm();
        rf.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jfPageTitle = new javax.swing.JLabel();
        panelBox = new javax.swing.JPanel();
        jfSearchBar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jLabelUserRole = new javax.swing.JLabel();
        jfPanelBox = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jfBtnAddEvent = new javax.swing.JButton();
        jfBtnListEvent = new javax.swing.JButton();
        jfBtnMyAccount = new javax.swing.JButton();
        jfBtnLougout2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        jfPageTitle.setText("ADD EVENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jfPageTitle)
                .addContainerGap(981, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jfPageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jfSearchBar.setText("  Créer un évenement");
        jfSearchBar.setToolTipText("");
        jfSearchBar.setBorder(null);
        jfSearchBar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jfSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfSearchBarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 2, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Events");

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 51, 51));
        btnLogout.setText("Deconnexion");
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabelUsername.setText("Anonymous");

        jLabelUserRole.setText("jLabel1");

        javax.swing.GroupLayout panelBoxLayout = new javax.swing.GroupLayout(panelBox);
        panelBox.setLayout(panelBoxLayout);
        panelBoxLayout.setHorizontalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoxLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addGap(73, 73, 73)
                .addComponent(jfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jLabelUserRole)
                .addGap(91, 91, 91)
                .addComponent(jLabelUsername)
                .addGap(322, 322, 322)
                .addComponent(btnLogout)
                .addGap(71, 71, 71))
        );
        panelBoxLayout.setVerticalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogout)
                        .addComponent(jLabelUsername)
                        .addComponent(jLabelUserRole))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jfPanelBoxLayout = new javax.swing.GroupLayout(jfPanelBox);
        jfPanelBox.setLayout(jfPanelBoxLayout);
        jfPanelBoxLayout.setHorizontalGroup(
            jfPanelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jfPanelBoxLayout.setVerticalGroup(
            jfPanelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        jfBtnAddEvent.setText("ADD EVENT");
        jfBtnAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfBtnAddEventActionPerformed(evt);
            }
        });

        jfBtnListEvent.setText("LIST EVENTS");
        jfBtnListEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfBtnListEventActionPerformed(evt);
            }
        });

        jfBtnMyAccount.setText("My Account");
        jfBtnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfBtnMyAccountActionPerformed(evt);
            }
        });

        jfBtnLougout2.setText("Deconnexion");
        jfBtnLougout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfBtnLougout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jfBtnLougout2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jfBtnAddEvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jfBtnListEvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jfBtnMyAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jfBtnAddEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfBtnListEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jfBtnMyAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfBtnLougout2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jfPanelBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfPanelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfBtnListEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfBtnListEventActionPerformed
        // TODO add your handling code here:
        ie = new EvenementService();
        handlePanelBoxContent(jfPageTitle, "LIST EVENTS", jfPanelBox);
        
        if (jfBtnListEvent.isEnabled() == true) {
            jfBtnListEvent.setEnabled(false);
            // jfBtnListEvent.setBackground(Color.decode("#a3a693 "));

            jfBtnAddEvent.setEnabled(true);
            jfBtnMyAccount.setEnabled(true);
        }
    }//GEN-LAST:event_jfBtnListEventActionPerformed

    private void jfBtnAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfBtnAddEventActionPerformed
        // TODO add your handling code here:
        handlePanelBoxContent(jfPageTitle, "ADD EVENT", jfPanelBox);
        if (jfBtnAddEvent.isEnabled() == true) {
            jfBtnAddEvent.setEnabled(false);
            //jfBtnAddEvent.setBackground(Color.decode("#a3a693 "));
            
            jfBtnMyAccount.setEnabled(true);
            jfBtnListEvent.setEnabled(true);
        }
    }//GEN-LAST:event_jfBtnAddEventActionPerformed


    private void jfSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfSearchBarActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HomeForm().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jfBtnLougout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfBtnLougout2ActionPerformed
        // TODO add your handling code here:
        userInfo = null;
        this.setVisible(false);
        new HomeForm().setVisible(true);
    }//GEN-LAST:event_jfBtnLougout2ActionPerformed

    private void jfBtnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfBtnMyAccountActionPerformed
        // TODO add your handling code here:
        handlePanelBoxContent(jfPageTitle, "MY ACCOUNT", jfPanelBox);
        if (jfBtnMyAccount.isEnabled() == true) {
            jfBtnMyAccount.setEnabled(false);
            // jfBtnMyAccount.setBackground(Color.decode("#a3a693 "));

            jfBtnAddEvent.setEnabled(true);
            jfBtnListEvent.setEnabled(true);
        }
    }//GEN-LAST:event_jfBtnMyAccountActionPerformed

    public void handlePanelBoxContent(JLabel jLabel, String message, JPanel myPanel) {
        clearPanel(myPanel);
        jLabel.setText(message);

        String labelValue = jLabel.getText();
        
        if (labelValue.contains("ADD") && labelValue.contains("EVENT")) {
            
            System.out.println("Add event");
            EventPanelAdd addE = new EventPanelAdd();
            addE.userInfo = userInfo;
            myPanel.removeAll();
            myPanel.add(addE);
            myPanel.revalidate();
            myPanel.repaint();
            
        } else if (labelValue.contains("LIST") && labelValue.contains("EVENTS")) {
            System.out.println("List events");
            List<Evenements> events = ie.allEvents();
            setEventsTable(events, myPanel);
            jTable.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) { // Si l'utilisateur a double-cliqué
                        JTable target = (JTable) e.getSource();
                        int row = target.getSelectedRow();
                        int column = target.getSelectedColumn();
                        Object value = target.getValueAt(row, column);
                        Object eventId = target.getValueAt(row, 0);
                        // Récupération des éléments de la ligne sélectionnée
                        /*System.out.println("Selected row: " + row);
                        System.out.println("Selected column: " + column);
                        System.out.println("Selected value: " + value);*/
                        System.out.println("Selected Event Id: " + eventId);
                        singleEventId = (int) eventId;
                        
                        EventPanelUserDetails eventDetails = new EventPanelUserDetails(singleEventId, userInfo);
                        eventDetails.userInfo = userInfo;
                        myPanel.removeAll();
                        jfPageTitle.setText("Event Details");
                        myPanel.add(eventDetails);
                        myPanel.revalidate();
                        myPanel.repaint();
                    }
                }
            });

        } else {
            // if (labelValue.contains("MY") && labelValue.contains("ACCOUNT")) 
            System.out.println("My account");
            UserPanelUserDetails detailsU = new UserPanelUserDetails(userInfo.getId());
                    
                    
            myPanel.removeAll();
            myPanel.add(detailsU);
            myPanel.revalidate();
            myPanel.repaint();
            
        } 
    }


    JTable jTable = new JTable();
    public void setEventsTable(List<Evenements> events, JPanel panel) {
        clearPanel(panel);
        

        panel.setLayout(new GridLayout(1, 1, 20, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 2));
        //Color bgColor = new Color((int) (Math.random() * 0x1000000));
        //panel.setBackground(bgColor);

        Vector<String> columns = new Vector<String>();
        columns.add("Id");
        columns.add("Organisateur");
        columns.add("Téléphone");
        columns.add("Titre");
        columns.add("Description");
        columns.add("Date de début");
        columns.add("Date de fin");
        columns.add("Nombre d'inscrit");

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();

        if (events != null) {
            for (Evenements event : events) {
                
                int nbIns = event.getInscriptionsCollection().size();
                
                Vector<Object> row = new Vector<Object>();
                row.add(event.getId());
                row.add(event.getOrganisateurId().getNom() + " " + event.getOrganisateurId().getPrenom());
                row.add(event.getOrganisateurId().getTelephone());
                row.add(event.getTitre());
                row.add(event.getDescription());
                row.add(_layout.formatDate(event.getDateDebut().toString()));
                row.add(_layout.formatDate(event.getDateFin().toString()));
                row.add(String.valueOf(nbIns));

                data.add(row);
            }
            
        }

        // DefaultTableModel tableModel = new DefaultTableModel(data, columns);
        DefaultTableModel tableModel = new DefaultTableModel(data, columns);
        tableModel.fireTableDataChanged();
        jTable.setModel(tableModel);


        // Désactiver l'édition de toutes les cellules
        jTable.setDefaultEditor(Object.class, null);
        
        JScrollPane jScrollPane = new JScrollPane(jTable);
        panel.add(jScrollPane);
    }

   

    // supprime tous les composants de ce panel
    public void clearPanel(JPanel panel) {
        panel.removeAll();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPageForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabelUserRole;
    public javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jfBtnAddEvent;
    private javax.swing.JButton jfBtnListEvent;
    private javax.swing.JButton jfBtnLougout2;
    private javax.swing.JButton jfBtnMyAccount;
    public javax.swing.JLabel jfPageTitle;
    public javax.swing.JPanel jfPanelBox;
    private javax.swing.JTextField jfSearchBar;
    private javax.swing.JPanel panelBox;
    // End of variables declaration//GEN-END:variables
}