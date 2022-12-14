/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import javax.swing.*;
import controllers.ControllerBarang;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/**
 *
 * @author WAHYU
 */
public class Menu extends javax.swing.JFrame {
    ControllerBarang elektronik;

    /**
     * Creates new form Menu
     */
    public Menu() throws ClassNotFoundException, SQLException {
        elektronik = new ControllerBarang();
        initComponents();
        this.showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        delData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        addData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 78, 104));

        delData.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        delData.setText("Hapus");
        delData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delDataMouseClicked(evt);
            }
        });
        delData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Organ Farmer Demo", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabel Barang");

        jButton1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        back.setFont(new java.awt.Font("Inter Light", 0, 12)); // NOI18N
        back.setText("Logout");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        addData.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        addData.setText("Tambah");
        addData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDataMouseClicked(evt);
            }
        });
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });

        tbData = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };

        tbData.getTableHeader().setReorderingAllowed(false);
        tbData.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Barang", "Stok", "Harga Satuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbDataMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(0).setResizable(false);
            tbData.getColumnModel().getColumn(1).setResizable(false);
            tbData.getColumnModel().getColumn(2).setResizable(false);
            tbData.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(delData)
                        .addGap(56, 56, 56)
                        .addComponent(back))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addData)
                    .addComponent(jButton1)
                    .addComponent(delData)
                    .addComponent(back))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDataActionPerformed

    private void delDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delDataActionPerformed

    private void addDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataMouseClicked
        try {
            new Tambah().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_addDataMouseClicked

    private void delDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delDataMouseClicked
        try {    
            int opsi = JOptionPane.showConfirmDialog(null, "Yakin ?");
            switch(opsi){
                case JOptionPane.YES_OPTION:
                    TableModel mdl = tbData.getModel();
                    int row = tbData.getSelectedRow();
                    int idx = Integer.parseInt((String) mdl.getValueAt(row, 0));
                    int ib = idx;
                    String message = "HAPUS DATA GAGAL";

                    try {
                        if (elektronik.checkelektronik(ib)) {
                            message = "HAPUS DATA BERHASIL";
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try {
                        elektronik.deleteelektronik(ib);
                        this.showData();
                    } catch (SQLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(null, message);
                    break;
            
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null, "OKEH");
                    break;               
            }
            
            
        } catch (Exception e){
            try {
                new Menu().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_delDataMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{    
            this.dispose();
            TableModel mdl = tbData.getModel();
            int row = tbData.getSelectedRow();
            int idx = Integer.parseInt((String) mdl.getValueAt(row, 0));
            System.out.println(idx);
            int ib = idx;
            try {
                if(elektronik.checkelektronik(ib)) {
                    try {
                        new Update(ib).setVisible(true);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e){
            try {
                new Menu().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       JOptionPane.showMessageDialog(null, "ANDA AKAN LOGOUT");
        try {
            new Login().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        System.out.println(tbData);
        TableModel mdl = tbData.getModel();
        int row = tbData.getSelectedRow();
        String idx = mdl.getValueAt(row, 0).toString();
        System.out.println(idx);
        
    }//GEN-LAST:event_tbDataMouseClicked

    private void tbDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDataMouseExited

    private void tbDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDataMouseEntered

    public void showData() throws SQLException {
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            elektronik.showelektronik(),
            new String [] {
                "ID", "Nama Barang", "Stok Barang", "Harga Satuan"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delData;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    // End of variables declaration//GEN-END:variables
}
