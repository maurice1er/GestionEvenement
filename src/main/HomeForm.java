/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import daos.IEvenement;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import models.Evenements;
import services.EvenementService;

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


  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    panelBox = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel8 = new javax.swing.JLabel();
    jComboBox1 = new javax.swing.JComboBox<>();
    jComboBox2 = new javax.swing.JComboBox<>();
    jPanel3 = new javax.swing.JPanel();
    jLabel11 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel12 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    jPanel5 = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    jPanel6 = new javax.swing.JPanel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    jLabel27 = new javax.swing.JLabel();

<<<<<<< HEAD
        jfSearchBar.setText("  Créer un évenement");
        jfSearchBar.setToolTipText("");
        jfSearchBar.setBorder(null);
        jfSearchBar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jfSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfSearchBarActionPerformed(evt);
            }
        });
=======
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setForeground(new java.awt.Color(0, 0, 0));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 51, 51));
    jLabel1.setText("Connexion");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 51, 51));
    jLabel2.setText("Ouvrir un compte");

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 51, 51));
    jLabel3.setText("Créer un évenement");

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 51, 51));
    jLabel4.setText("Ressources");
>>>>>>> e3330c4 (update branch dev)

    jTextField1.setText("  Créer un évenement");
    jTextField1.setToolTipText("");
    jTextField1.setBorder(null);
    jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    jTextField1.setFocusable(false);

<<<<<<< HEAD
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 51, 51));
        btnRegister.setText("Ouvrir un compte");
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 51, 51));
        btnLogin.setText("Connexion");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCreateEvent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCreateEvent.setForeground(new java.awt.Color(255, 51, 51));
        btnCreateEvent.setText("Créer un évenement");
        btnCreateEvent.setBorder(null);
        btnCreateEvent.setBorderPainted(false);
        btnCreateEvent.setContentAreaFilled(false);
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Ressources");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

        javax.swing.GroupLayout panelBoxLayout = new javax.swing.GroupLayout(panelBox);
        panelBox.setLayout(panelBoxLayout);
        panelBoxLayout.setHorizontalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoxLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addGap(73, 73, 73)
                .addComponent(jfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(btnCreateEvent)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnRegister)
                .addGap(71, 71, 71))
        );
        panelBoxLayout.setVerticalGroup(
            panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegister)
                        .addComponent(btnLogin)
                        .addComponent(btnCreateEvent)
                        .addComponent(jButton2))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jfSearchBar.getAccessibleContext().setAccessibleName("");

        getContentPane().add(panelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1350, 50));
=======
    jLabel5.setFont(new java.awt.Font("Segoe Print", 2, 28)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 51, 51));
    jLabel5.setText("Events");

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
              jTextField1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              242,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              402,
              Short.MAX_VALUE
            )
            .addComponent(jLabel4)
            .addGap(18, 18, 18)
            .addComponent(jLabel3)
            .addGap(18, 18, 18)
            .addComponent(jLabel1)
            .addGap(27, 27, 27)
            .addComponent(jLabel2)
            .addGap(56, 56, 56)
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
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(
                      jTextField1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      31,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addComponent(
                  jLabel5,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  36,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(18, Short.MAX_VALUE)
        )
    );

    jTextField1.getAccessibleContext().setAccessibleName("");
>>>>>>> e3330c4 (update branch dev)

    getContentPane()
      .add(
        panelBox,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1350, 60)
      );

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 51, 51));
    jLabel7.setText("Pour ceux");

    jLabel10.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
    jLabel10.setText("qui adorent sortir");

<<<<<<< HEAD
        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Se connecter");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
=======
    jLabel9.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/main/images/image3.png")
      )
    ); // NOI18N
    jLabel9.setAutoscrolls(true);
>>>>>>> e3330c4 (update branch dev)

    jButton1.setBackground(new java.awt.Color(255, 51, 51));
    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Se connecter");
    jButton1.setToolTipText("");
    jButton1.setBorder(null);

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
<<<<<<< HEAD
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1350, 250));
=======
                    .addGap(18, 18, 18)
                    .addComponent(
                      jButton1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      39,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addContainerGap(7, Short.MAX_VALUE)
        )
    );

    getContentPane()
      .add(
        jPanel1,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1350, 230)
      );
>>>>>>> e3330c4 (update branch dev)

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel8.setText("Événements populaires : ");

<<<<<<< HEAD
        jfPaysCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jfPaysCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
=======
    jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jComboBox1.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }
      )
    );
>>>>>>> e3330c4 (update branch dev)

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
              jComboBox1,
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
<<<<<<< HEAD
                .addGap(18, 18, 18)
                .addComponent(jfPaysCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(891, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jfPaysCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1350, 60));
        getContentPane().add(myJScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 1230, 260));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Liste d'évenement à venir");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));
=======
                .addComponent(
                  jComboBox1,
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
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1350, 50)
      );

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setAutoscrolls(true);

    jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel11.setText("Événements à");

    jPanel4.setBackground(new java.awt.Color(238, 238, 238));

    jLabel12.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/main/images/image5.png")
      )
    ); // NOI18N
    jLabel12.setMaximumSize(new java.awt.Dimension(600, 900));
    jLabel12.setMinimumSize(new java.awt.Dimension(600, 900));
    jLabel12.setPreferredSize(new java.awt.Dimension(600, 900));

    jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(255, 51, 51));
    jLabel14.setText("jeu., mai 4, 18:30");

    jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel15.setText("Conference Hall - CCIAD • Dakar");

    jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel16.setText("B2B Opportunity Forum 2023");

    jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel22.setText("7 abonnés");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
      jPanel4
    );
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          jLabel12,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
        .addGroup(
          jPanel4Layout
            .createSequentialGroup()
            .addGroup(
              jPanel4Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel4Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                      jPanel4Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addComponent(jLabel16)
                    )
                )
                .addGroup(
                  jPanel4Layout
                    .createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addComponent(jLabel22)
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel4Layout
            .createSequentialGroup()
            .addComponent(
              jLabel12,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              99,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel16)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jLabel15,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              22,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel22)
            .addContainerGap(29, Short.MAX_VALUE)
        )
    );

    jPanel5.setBackground(new java.awt.Color(238, 238, 238));

    jLabel13.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/main/images/image5.png")
      )
    ); // NOI18N
    jLabel13.setMaximumSize(new java.awt.Dimension(600, 900));
    jLabel13.setMinimumSize(new java.awt.Dimension(600, 900));
    jLabel13.setPreferredSize(new java.awt.Dimension(600, 900));

    jLabel17.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(255, 51, 51));
    jLabel17.setText("sam., avr. 29, 09:00");

    jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel18.setText("Radisson Blu Hotel • Dakar");

    jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel19.setText("LES RENCONTRES FISCALES DE DAKAR");

    jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel21.setText("60 abonnés");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
      jPanel5
    );
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          jLabel13,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
        .addGroup(
          jPanel5Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel5Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel21)
                .addGroup(
                  jPanel5Layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.LEADING
                    )
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel5Layout
            .createSequentialGroup()
            .addComponent(
              jLabel13,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              99,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel19)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel17)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jLabel18,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              22,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel21)
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );

    jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel20.setText("Dakar");

    jPanel6.setBackground(new java.awt.Color(238, 238, 238));

    jLabel23.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/main/images/image5.png")
      )
    ); // NOI18N
    jLabel23.setMaximumSize(new java.awt.Dimension(600, 900));
    jLabel23.setMinimumSize(new java.awt.Dimension(600, 900));
    jLabel23.setPreferredSize(new java.awt.Dimension(600, 900));

    jLabel24.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
    jLabel24.setForeground(new java.awt.Color(255, 51, 51));
    jLabel24.setText("jeu., mai 4, 18:30");

    jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel25.setText("Conference Hall - CCIAD • Dakar");

    jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel26.setText("B2B Opportunity Forum 2023");

    jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel27.setText("7 abonnés");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
      jPanel6
    );
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          jLabel23,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
        .addGroup(
          jPanel6Layout
            .createSequentialGroup()
            .addGroup(
              jPanel6Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel6Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                      jPanel6Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabel25)
                        .addComponent(jLabel24)
                        .addComponent(jLabel26)
                    )
                )
                .addGroup(
                  jPanel6Layout
                    .createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addComponent(jLabel27)
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel6Layout
            .createSequentialGroup()
            .addComponent(
              jLabel23,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              99,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel26)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel24)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jLabel25,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              22,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel27)
            .addContainerGap(29, Short.MAX_VALUE)
        )
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
      jPanel3
    );
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addGap(63, 63, 63)
            .addGroup(
              jPanel3Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel3Layout
                    .createSequentialGroup()
                    .addComponent(
                      jPanel5,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      265,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(54, 54, 54)
                    .addComponent(
                      jPanel4,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      265,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(61, 61, 61)
                    .addComponent(
                      jPanel6,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      265,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  jPanel3Layout
                    .createSequentialGroup()
                    .addComponent(jLabel11)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(jLabel20)
                )
            )
            .addContainerGap(377, Short.MAX_VALUE)
        )
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(
              jPanel3Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jLabel20)
            )
            .addGap(18, 18, 18)
            .addGroup(
              jPanel3Layout
                .createParallelGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  false
                )
                .addComponent(
                  jPanel6,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
                .addGroup(
                  jPanel3Layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.LEADING,
                      false
                    )
                    .addComponent(
                      jPanel4,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      jPanel5,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                )
            )
            .addContainerGap(67, Short.MAX_VALUE)
        )
    );

    getContentPane()
      .add(
        jPanel3,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 1350, 360)
      );
>>>>>>> e3330c4 (update branch dev)

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


    JPanel panel = new JPanel();

    public void afficherEvenements(List<Evenements> evenements, int nbColumn) {

        panel.setLayout(new GridLayout(0, nbColumn, 20, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 2));

        for (Evenements evenement : evenements) {
            JPanel eventPanel = new JPanel();
            eventPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 2, 5));
            eventPanel.addMouseListener(new MouseAdapter() {
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
            });
            eventPanel.setLayout(new BoxLayout(eventPanel, BoxLayout.Y_AXIS));

            // Générer une couleur de fond aléatoire pour chaque événement
            Color bgColor = new Color((int) (Math.random() * 0x1000000));
            eventPanel.setBackground(bgColor);

            JLabel imageLabel = new JLabel();
            ImageIcon imageIcon = new ImageIcon(getClass().getResource("/main/images/image4.png"));
            Image image = imageIcon.getImage();

            int labelWidth = eventPanel.getPreferredSize().width * 100 / nbColumn;
            int labelHeight = 130;

            Image scaledImage = image.getScaledInstance(labelWidth + 50, labelHeight, Image.SCALE_FAST);
            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
            imageLabel.setIcon(scaledImageIcon);
            imageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            eventPanel.add(imageLabel);

            JLabel titreLabel = new JLabel(evenement.getTitre());
            titreLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            eventPanel.add(titreLabel);

            JLabel dateDebutLabel = new JLabel(_layout.formatDate(evenement.getDateDebut().toString()));
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


    // Variables declaration - do not modify                     
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
    // End of variables declaration                   


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JComboBox<String> jComboBox2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JPanel panelBox;
  // End of variables declaration//GEN-END:variables
}
