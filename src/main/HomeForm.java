/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import daos.IEvenement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import models.Evenements;
import services.EvenementService;

import org.xml.sax.Attributes;


/**
 *
 * @author user
 */
public class HomeForm extends JFrame {
  private Layout _layout = new Layout();
  IEvenement ie = new EvenementService();
  private List<Evenements> evenements;

  /**
   * Creates new form HomeForm
   */
  public HomeForm() {
    initComponents();

    // set the title and other properties of the JFrame
    setTitle("Events - Home");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // setResizable(false); // prevent resizing beyond the maximum size

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    pack();
    setSize(screenSize.width, screenSize.height);

    evenements = ie.allEvents();
    afficherEvenements(evenements, 4);

    /*IEvenement ie = new EvenementService();
        
        for(Evenements e : ie.allEvents()){
            System.out.println(e);
        }
         */
    Layout layout = new Layout();
    layout.loadCombo(ie.allEvents(), jfPaysCombo, "titre");
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    panelBox = new javax.swing.JPanel();
    jfSearchBar = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    btnRegister = new javax.swing.JButton();
    btnLogin = new javax.swing.JButton();
    btnCreateEvent = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel8 = new javax.swing.JLabel();
    jfPaysCombo = new javax.swing.JComboBox<>();
    jComboBox2 = new javax.swing.JComboBox<>();
    myJScroll = new javax.swing.JScrollPane();
    jLabel11 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setForeground(new java.awt.Color(0, 0, 0));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jfSearchBar.setText("  Créer un évenement");
    jfSearchBar.setToolTipText("");
    jfSearchBar.setBorder(null);
    jfSearchBar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    jfSearchBar.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jfSearchBarActionPerformed(evt);
        }
      }
    );

    jLabel5.setFont(new java.awt.Font("Segoe Print", 2, 28)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 51, 51));
    jLabel5.setText("Events");

    btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnRegister.setForeground(new java.awt.Color(255, 51, 51));
    btnRegister.setText("Ouvrir un compte");
    btnRegister.setBorder(null);
    btnRegister.setBorderPainted(false);
    btnRegister.setContentAreaFilled(false);
    btnRegister.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnRegisterActionPerformed(evt);
        }
      }
    );

    btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnLogin.setForeground(new java.awt.Color(255, 51, 51));
    btnLogin.setText("Connexion");
    btnLogin.setBorder(null);
    btnLogin.setBorderPainted(false);
    btnLogin.setContentAreaFilled(false);
    btnLogin.setFocusPainted(false);
    btnLogin.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnLoginActionPerformed(evt);
        }
      }
    );

    btnCreateEvent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnCreateEvent.setForeground(new java.awt.Color(255, 51, 51));
    btnCreateEvent.setText("Créer un évenement");
    btnCreateEvent.setBorder(null);
    btnCreateEvent.setBorderPainted(false);
    btnCreateEvent.setContentAreaFilled(false);
    btnCreateEvent.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnCreateEventActionPerformed(evt);
        }
      }
    );

    jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jButton2.setForeground(new java.awt.Color(255, 51, 51));
    jButton2.setText("Ressources");
    jButton2.setBorder(null);
    jButton2.setBorderPainted(false);
    jButton2.setContentAreaFilled(false);

    javax.swing.GroupLayout panelBoxLayout = new javax.swing.GroupLayout(
      panelBox
    );
    panelBox.setLayout(panelBoxLayout);
    panelBoxLayout.setHorizontalGroup(
      panelBoxLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          panelBoxLayout
            .createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(jLabel5)
            .addGap(73, 73, 73)
            .addComponent(
              jfSearchBar,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              242,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              396,
              Short.MAX_VALUE
            )
            .addComponent(jButton2)
            .addGap(18, 18, 18)
            .addComponent(btnCreateEvent)
            .addGap(18, 18, 18)
            .addComponent(btnLogin)
            .addGap(18, 18, 18)
            .addComponent(btnRegister)
            .addGap(71, 71, 71)
        )
    );
    panelBoxLayout.setVerticalGroup(
      panelBoxLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          panelBoxLayout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              panelBoxLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  panelBoxLayout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.BASELINE
                    )
                    .addComponent(
                      jfSearchBar,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      31,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addComponent(btnRegister)
                    .addComponent(btnLogin)
                    .addComponent(btnCreateEvent)
                    .addComponent(jButton2)
                )
                .addComponent(
                  jLabel5,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  36,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(8, Short.MAX_VALUE)
        )
    );

    jfSearchBar.getAccessibleContext().setAccessibleName("");

    getContentPane()
      .add(
        panelBox,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1350, 50)
      );

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 51, 51));
    jLabel7.setText("Pour ceux");

    jLabel10.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
    jLabel10.setText("qui adorent sortir");

    jLabel9.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/main/images/image3.png")
      )
    ); // NOI18N
    jLabel9.setAutoscrolls(true);

    jButton1.setBackground(new java.awt.Color(255, 51, 51));
    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Se connecter");
    jButton1.setToolTipText("");
    jButton1.setBorder(null);
    jButton1.setBorderPainted(false);
    jButton1.setFocusPainted(false);
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
      jPanel1
    );
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addGap(53, 53, 53)
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7)
                .addComponent(jLabel10)
                .addComponent(
                  jButton1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  115,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              64,
              Short.MAX_VALUE
            )
            .addComponent(
              jLabel9,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              930,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(71, 71, 71)
        )
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                      jLabel9,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      217,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel7)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(jLabel10)
                    .addGap(18, 18, 18)
                    .addComponent(
                      jButton1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      39,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addContainerGap(27, Short.MAX_VALUE)
        )
    );

    getContentPane()
      .add(
        jPanel1,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1350, 250)
      );

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel8.setText("Événements populaires : ");

    jfPaysCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jfPaysCombo.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }
      )
    );

    jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jComboBox2.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }
      )
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
      jPanel2
    );
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGap(63, 63, 63)
            .addComponent(jLabel8)
            .addGap(18, 18, 18)
            .addComponent(
              jfPaysCombo,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              100,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(26, 26, 26)
            .addComponent(
              jComboBox2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              100,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(891, Short.MAX_VALUE)
        )
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(
                  jfPaysCombo,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  jComboBox2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );

    getContentPane()
      .add(
        jPanel2,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1350, 60)
      );
    getContentPane()
      .add(
        myJScroll,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 1230, 260)
      );

    jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel11.setText("Liste d'évenement à venir");
    getContentPane()
      .add(
        jLabel11,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1)
      );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    closeThisWindowsAndRedirectToLoginForm();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
    // TODO add your handling code here:
    closeThisWindowsAndRedirectToRegisterForm();
  }//GEN-LAST:event_btnRegisterActionPerformed

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    // TODO add your handling code here:
    closeThisWindowsAndRedirectToLoginForm();
  }//GEN-LAST:event_btnLoginActionPerformed

  private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnCreateEventActionPerformed

  private void jfSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfSearchBarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jfSearchBarActionPerformed

  // close windows and open another
  private void closeThisWindowsAndRedirectToLoginForm() {
    this.setVisible(false);
    new LoginForm().setVisible(true);
  }

  private void closeThisWindowsAndRedirectToRegisterForm() {
    this.setVisible(false);
    new RegisterForm().setVisible(true);
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
      java
        .util.logging.Logger.getLogger(HomeForm.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java
        .util.logging.Logger.getLogger(HomeForm.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java
        .util.logging.Logger.getLogger(HomeForm.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java
        .util.logging.Logger.getLogger(HomeForm.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {

        public void run() {
          new HomeForm().setVisible(true);
        }
      }
    );
  }

  JPanel panel = new JPanel();

  public void afficherEvenements(List<Evenements> evenements, int nbColumn) {
    panel.setLayout(new GridLayout(0, nbColumn, 20, 10));
    panel.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 2));

    for (Evenements evenement : evenements) {
      JPanel eventPanel = new JPanel();
      eventPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 2, 5));
      eventPanel.addMouseListener(
        new MouseAdapter() {

          @Override
          public void mouseClicked(MouseEvent e) {
            System.out.println("ID de l'événement : " + evenement.getId());
          }

          @Override
          public void mouseEntered(MouseEvent e) {
            try {
              Thread.sleep(200);
              eventPanel.setBackground(eventPanel.getBackground().darker());
            } catch (InterruptedException ex) {
              ex.printStackTrace();
            }
          }

          @Override
          public void mouseExited(MouseEvent e) {
            eventPanel.setBackground(eventPanel.getBackground().brighter());
          }
        }
      );
      eventPanel.setLayout(new BoxLayout(eventPanel, BoxLayout.Y_AXIS));

      // Générer une couleur de fond aléatoire pour chaque événement
      Color bgColor = new Color((int) (Math.random() * 0x1000000));
      eventPanel.setBackground(bgColor);

      JLabel imageLabel = new JLabel();
      ImageIcon imageIcon = new ImageIcon(
        getClass().getResource("/main/images/image4.png")
      );
      Image image = imageIcon.getImage();

      int labelWidth = eventPanel.getPreferredSize().width * 100 / nbColumn;
      int labelHeight = 130;

      Image scaledImage = image.getScaledInstance(
        labelWidth + 50,
        labelHeight,
        Image.SCALE_FAST
      );
      ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
      imageLabel.setIcon(scaledImageIcon);
      imageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      eventPanel.add(imageLabel);

      JLabel titreLabel = new JLabel(evenement.getTitre());
      titreLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      eventPanel.add(titreLabel);

      JLabel dateDebutLabel = new JLabel(
        _layout.formatDate(evenement.getDateDebut().toString())
      );
      dateDebutLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      eventPanel.add(dateDebutLabel);

      System.out.println("Id=" + evenement.getId());
      int nbIns = ie.countUserByEvenementId(evenement.getId());
      JLabel nbInscritLabel = new JLabel(nbIns + " inscrits");
      nbInscritLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
      eventPanel.add(nbInscritLabel);
      eventPanel.add(new JLabel(""));

      panel.add(eventPanel);
      /*if (evenements.indexOf(evenement) == evenements.size() - 1){
                JPanel panelBreak = new JPanel();
                panelBreak.setLayout(new GridLayout(1, 1, 20, 10));
                panel.add(panelBreak);
                System.out.println("-----"); 
            }*/
    }

    myJScroll.setViewportView(panel);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCreateEvent;
  private javax.swing.JButton btnLogin;
  private javax.swing.JButton btnRegister;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JComboBox<String> jComboBox2;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JComboBox<String> jfPaysCombo;
  private javax.swing.JTextField jfSearchBar;
  private javax.swing.JScrollPane myJScroll;
  private javax.swing.JPanel panelBox;
  // End of variables declaration//GEN-END:variables
}
