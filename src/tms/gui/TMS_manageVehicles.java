package tms.gui;

import fnss.functions.DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author afkii
 */
public class TMS_manageVehicles extends javax.swing.JFrame {

    /**
     * Creates new form tmsNewHire
     */
    public TMS_manageVehicles() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.setExtendedState(MAXIMIZED_BOTH);

            manageVehiclesTable.setModel(DbUtils.resultSetToTableModel(DB.getDbCon().query("SELECT * FROM tms_hirevehicle")));

            //this.setExtendedState(MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(TMS_manageVehicles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //TMS_addUpadateVehicle object
    TMS_addUpdateVehicle updateVehicle = new TMS_addUpdateVehicle();

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
        FunctionImage1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ContentArea = new javax.swing.JPanel();
        WhiteArea = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageVehiclesTable = new javax.swing.JTable();
        SideButtons = new javax.swing.JPanel();
        addButton = new javax.swing.JLabel();
        searchButton = new javax.swing.JLabel();
        ExitButton = new javax.swing.JPanel();
        exitButtonLable = new javax.swing.JLabel();
        BackButton = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        BlueStrip = new javax.swing.JPanel();
        lblBlueStrip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        FunctionImage1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tms/gui/images/tanker 116 x 116.png"))); // NOI18N

        javax.swing.GroupLayout FunctionImage1Layout = new javax.swing.GroupLayout(FunctionImage1);
        FunctionImage1.setLayout(FunctionImage1Layout);
        FunctionImage1Layout.setHorizontalGroup(
            FunctionImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunctionImage1Layout.createSequentialGroup()
                .addContainerGap(555, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );
        FunctionImage1Layout.setVerticalGroup(
            FunctionImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunctionImage1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(454, Short.MAX_VALUE))
        );

        jLayeredPane1.add(FunctionImage1);

        ContentArea.setOpaque(false);
        ContentArea.setPreferredSize(new java.awt.Dimension(600, 800));

        WhiteArea.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Clarendon Blk BT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 71, 71));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Vehicles");

        manageVehiclesTable.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        manageVehiclesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg. Number", "Type", "Capacity", "Current Milage", "Hourly Rate", "Daily Rate", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        manageVehiclesTable.setGridColor(new java.awt.Color(255, 255, 255));
        manageVehiclesTable.setRowHeight(26);
        manageVehiclesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        manageVehiclesTable.getTableHeader().setReorderingAllowed(false);
        manageVehiclesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageVehiclesTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageVehiclesTableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(manageVehiclesTable);
        if (manageVehiclesTable.getColumnModel().getColumnCount() > 0) {
            manageVehiclesTable.getColumnModel().getColumn(0).setResizable(false);
            manageVehiclesTable.getColumnModel().getColumn(1).setResizable(false);
            manageVehiclesTable.getColumnModel().getColumn(2).setResizable(false);
            manageVehiclesTable.getColumnModel().getColumn(3).setResizable(false);
            manageVehiclesTable.getColumnModel().getColumn(4).setResizable(false);
            manageVehiclesTable.getColumnModel().getColumn(5).setResizable(false);
            manageVehiclesTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout WhiteAreaLayout = new javax.swing.GroupLayout(WhiteArea);
        WhiteArea.setLayout(WhiteAreaLayout);
        WhiteAreaLayout.setHorizontalGroup(
            WhiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteAreaLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
            .addGroup(WhiteAreaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        WhiteAreaLayout.setVerticalGroup(
            WhiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhiteAreaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout ContentAreaLayout = new javax.swing.GroupLayout(ContentArea);
        ContentArea.setLayout(ContentAreaLayout);
        ContentAreaLayout.setHorizontalGroup(
            ContentAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentAreaLayout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(WhiteArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        ContentAreaLayout.setVerticalGroup(
            ContentAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentAreaLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(WhiteArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLayeredPane1.add(ContentArea);

        SideButtons.setOpaque(false);
        SideButtons.setPreferredSize(new java.awt.Dimension(600, 800));

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tms/gui/images/add button.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addButtonMouseReleased(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tms/gui/images/search blue.png"))); // NOI18N

        javax.swing.GroupLayout SideButtonsLayout = new javax.swing.GroupLayout(SideButtons);
        SideButtons.setLayout(SideButtonsLayout);
        SideButtonsLayout.setHorizontalGroup(
            SideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideButtonsLayout.createSequentialGroup()
                .addContainerGap(1039, Short.MAX_VALUE)
                .addGroup(SideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton)
                    .addComponent(addButton))
                .addGap(127, 127, 127))
        );
        SideButtonsLayout.setVerticalGroup(
            SideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideButtonsLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(addButton)
                .addGap(30, 30, 30)
                .addComponent(searchButton)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        jLayeredPane1.add(SideButtons);

        ExitButton.setOpaque(false);
        ExitButton.setPreferredSize(new java.awt.Dimension(600, 800));

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

        javax.swing.GroupLayout ExitButtonLayout = new javax.swing.GroupLayout(ExitButton);
        ExitButton.setLayout(ExitButtonLayout);
        ExitButtonLayout.setHorizontalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitButtonLayout.createSequentialGroup()
                .addContainerGap(1186, Short.MAX_VALUE)
                .addComponent(exitButtonLable)
                .addContainerGap())
        );
        ExitButtonLayout.setVerticalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitButtonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(exitButtonLable)
                .addContainerGap(641, Short.MAX_VALUE))
        );

        jLayeredPane1.add(ExitButton);

        BackButton.setOpaque(false);
        BackButton.setPreferredSize(new java.awt.Dimension(600, 800));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout BackButtonLayout = new javax.swing.GroupLayout(BackButton);
        BackButton.setLayout(BackButtonLayout);
        BackButtonLayout.setHorizontalGroup(
            BackButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackButtonLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBack)
                .addContainerGap(1076, Short.MAX_VALUE))
        );
        BackButtonLayout.setVerticalGroup(
            BackButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackButtonLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBack)
                .addContainerGap(531, Short.MAX_VALUE))
        );

        jLayeredPane1.add(BackButton);

        BlueStrip.setOpaque(false);
        BlueStrip.setPreferredSize(new java.awt.Dimension(600, 800));

        lblBlueStrip.setBackground(new java.awt.Color(52, 73, 94));
        lblBlueStrip.setOpaque(true);

        javax.swing.GroupLayout BlueStripLayout = new javax.swing.GroupLayout(BlueStrip);
        BlueStrip.setLayout(BlueStripLayout);
        BlueStripLayout.setHorizontalGroup(
            BlueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueStripLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblBlueStrip, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        BlueStripLayout.setVerticalGroup(
            BlueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueStripLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblBlueStrip, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jLayeredPane1.add(BlueStrip);

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
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonLableMouseClicked
        close();
    }//GEN-LAST:event_exitButtonLableMouseClicked

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        new TMS_home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseReleased

    private void addButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseReleased
        new TMS_addUpdateVehicle(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonMouseReleased

    private void manageVehiclesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageVehiclesTableMouseClicked
        int index = manageVehiclesTable.getSelectedRow();
        TableModel model = manageVehiclesTable.getModel();

        String regNo = model.getValueAt(index, 0).toString();/**/
        String vtype = model.getValueAt(index, 1).toString();/**/
        String capacity = model.getValueAt(index, 2).toString();
        String milage = model.getValueAt(index, 3).toString();
        String hourly = model.getValueAt(index, 4).toString();
        String daily = model.getValueAt(index, 5).toString();
        String available = model.getValueAt(index, 6).toString();

        updateVehicle.setVisible(true);
        this.dispose();

        updateVehicle.vehicleNumberTxt.setText(regNo);
        updateVehicle.typeComboBox.setSelectedItem(vtype);
        updateVehicle.capacityTxt.setText(capacity);
        updateVehicle.currentMilateTxt.setText(milage);
        updateVehicle.hourlyRateTxt.setText(hourly);
        updateVehicle.dailyRateTxt.setText(daily);
        updateVehicle.vehicleAvailabilityTxt.setText(available);
    }//GEN-LAST:event_manageVehiclesTableMouseClicked

    private void manageVehiclesTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageVehiclesTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_manageVehiclesTableMouseEntered

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
            java.util.logging.Logger.getLogger(TMS_manageVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TMS_manageVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TMS_manageVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TMS_manageVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TMS_manageVehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackButton;
    private javax.swing.JPanel BlueStrip;
    private javax.swing.JPanel ContentArea;
    private javax.swing.JPanel ExitButton;
    private javax.swing.JPanel FunctionImage1;
    private javax.swing.JPanel SideButtons;
    private javax.swing.JPanel WhiteArea;
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel exitButtonLable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBlueStrip;
    private javax.swing.JTable manageVehiclesTable;
    private javax.swing.JLabel searchButton;
    // End of variables declaration//GEN-END:variables
}
