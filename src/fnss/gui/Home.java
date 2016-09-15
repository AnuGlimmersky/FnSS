package fnss.gui;

import emp.Emp;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.gui.POS_MainFrame;
import sst.gui.sstHome;
import tms.gui.TMS_home;
import tms.gui.TMS_manageHires;

/**
 *
 * @author afkii
 */
public class Home extends javax.swing.JFrame {

    private pos.gui.POS_MainFrame pos;
    private tms.gui.TMS_home tms;
    private emp.Emp emp;
    private inv.gui.Home inv;
    private sst.gui.sstHome sst;
    
    public Home() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.setExtendedState(MAXIMIZED_BOTH);
            
        } catch (Exception ex) {
            Logger.getLogger(TMS_manageHires.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //close button function
    private void close() {
        if (JOptionPane.showConfirmDialog(null, "Are you Sure?") == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        HomePageContents = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        btnTMS = new javax.swing.JLabel();
        btnPOS = new javax.swing.JLabel();
        btnINV = new javax.swing.JLabel();
        btnEMP = new javax.swing.JLabel();
        btnSST = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JPanel();
        exitButtonLable = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JLabel();
        blueStrip = new javax.swing.JPanel();
        lblBlueStrip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        HomePageContents.setOpaque(false);

        controlPanel.setOpaque(false);

        btnTMS.setForeground(new java.awt.Color(204, 204, 204));
        btnTMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTMS.setText("Vehicle Hire");
        btnTMS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTMSMouseClicked(evt);
            }
        });

        btnPOS.setForeground(new java.awt.Color(204, 204, 204));
        btnPOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPOS.setText("POS");
        btnPOS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPOSMouseClicked(evt);
            }
        });

        btnINV.setForeground(new java.awt.Color(204, 204, 204));
        btnINV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnINV.setText("Inventory Management");
        btnINV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnINV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnINVMouseClicked(evt);
            }
        });

        btnEMP.setForeground(new java.awt.Color(204, 204, 204));
        btnEMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEMP.setText("Employee Management");
        btnEMP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEMPMouseClicked(evt);
            }
        });

        btnSST.setForeground(new java.awt.Color(204, 204, 204));
        btnSST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSST.setText("Stock & Order Management");
        btnSST.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSSTMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/sst car.png"))); // NOI18N

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnINV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSST, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTMS, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnINV, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSST, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HomePageContentsLayout = new javax.swing.GroupLayout(HomePageContents);
        HomePageContents.setLayout(HomePageContentsLayout);
        HomePageContentsLayout.setHorizontalGroup(
            HomePageContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageContentsLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        HomePageContentsLayout.setVerticalGroup(
            HomePageContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane1.add(HomePageContents);

        exitButton.setOpaque(false);

        exitButtonLable.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        exitButtonLable.setForeground(new java.awt.Color(255, 255, 255));
        exitButtonLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButtonLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        exitButtonLable.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exitButtonLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonLableMouseClicked(evt);
            }
        });

        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdmin.setText("Admin");
        btnAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap(1812, Short.MAX_VALUE)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(exitButtonLable)
                .addGap(10, 10, 10))
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButtonLable)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(830, Short.MAX_VALUE))
        );

        jLayeredPane1.add(exitButton);

        blueStrip.setOpaque(false);

        lblBlueStrip.setBackground(new java.awt.Color(52, 73, 94));
        lblBlueStrip.setOpaque(true);

        javax.swing.GroupLayout blueStripLayout = new javax.swing.GroupLayout(blueStrip);
        blueStrip.setLayout(blueStripLayout);
        blueStripLayout.setHorizontalGroup(
            blueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueStripLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblBlueStrip, javax.swing.GroupLayout.DEFAULT_SIZE, 2022, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        blueStripLayout.setVerticalGroup(
            blueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBlueStrip, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );

        jLayeredPane1.add(blueStrip);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonLableMouseClicked
        close();
    }//GEN-LAST:event_exitButtonLableMouseClicked

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnTMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTMSMouseClicked
        if (tms == null) {
            tms = new TMS_home();
        }
        tms.setVisible(true);
    }//GEN-LAST:event_btnTMSMouseClicked

    private void btnPOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPOSMouseClicked
        if (pos == null) {
            pos = new POS_MainFrame();
        }
        pos.setVisible(true);
    }//GEN-LAST:event_btnPOSMouseClicked

    private void btnINVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnINVMouseClicked
        if (inv == null) {
            inv = new inv.gui.Home();
        }
        inv.setVisible(true);
    }//GEN-LAST:event_btnINVMouseClicked

    private void btnEMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEMPMouseClicked
        if (emp == null) {
            emp = new Emp();
        }
        emp.setVisible(true);
    }//GEN-LAST:event_btnEMPMouseClicked

    private void btnSSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSSTMouseClicked
        if (sst == null) {
            sst = new sstHome();
        }
        sst.setVisible(true);
    }//GEN-LAST:event_btnSSTMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePageContents;
    private javax.swing.JPanel blueStrip;
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnEMP;
    private javax.swing.JLabel btnINV;
    private javax.swing.JLabel btnPOS;
    private javax.swing.JLabel btnSST;
    private javax.swing.JLabel btnTMS;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitButtonLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblBlueStrip;
    // End of variables declaration//GEN-END:variables
}
