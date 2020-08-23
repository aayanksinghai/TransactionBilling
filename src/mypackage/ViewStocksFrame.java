/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewStocksFrame extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    
    public ViewStocksFrame() {
        initComponents();
        try{
            this.setExtendedState(ViewStocksFrame.MAXIMIZED_BOTH);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BILLING","root","root");
            stmt = con.createStatement();
            
            String hsn_code, item_name;
            double tax_slab;
            int counter = 0;
            DefaultTableModel tbl = (DefaultTableModel) tblStock.getModel();
            
            String s = "SELECT * FROM STOCKS";
            rs = stmt.executeQuery(s);
            
            tbl.setRowCount(0);
            while(rs.next())
            {
                hsn_code = rs.getString("HSN_CODE");
                item_name = rs.getString("ITEM_NAME");
                tax_slab = Double.parseDouble(rs.getString("TAX_SLAB"));
                
               
                counter++;
                
                tbl.addRow(new Object[]{
                   counter,hsn_code, item_name, tax_slab
                });
            }
           }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnCheckItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("AVAILABLE STOCK");
        jLabel1.setAutoscrolls(true);

        jScrollPane1.setAutoscrolls(true);

        tblStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblStock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.NO", "HSN CODE", "ITEM NAME", "TAX SLAB %"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStock.setRowHeight(22);
        jScrollPane1.setViewportView(tblStock);
        if (tblStock.getColumnModel().getColumnCount() > 0) {
            tblStock.getColumnModel().getColumn(0).setMinWidth(20);
            tblStock.getColumnModel().getColumn(0).setMaxWidth(50);
            tblStock.getColumnModel().getColumn(1).setMinWidth(150);
            tblStock.getColumnModel().getColumn(1).setMaxWidth(200);
            tblStock.getColumnModel().getColumn(2).setMinWidth(280);
            tblStock.getColumnModel().getColumn(2).setMaxWidth(600);
            tblStock.getColumnModel().getColumn(3).setMinWidth(50);
            tblStock.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("<BACK");
        btnBack.setAutoscrolls(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCheckItem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCheckItem.setText("CHECK ITEM>");
        btnCheckItem.setAutoscrolls(true);
        btnCheckItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(259, 259, 259)
                .addComponent(btnCheckItem)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        AdminFrame open = new AdminFrame();
        open.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckItemActionPerformed
        
            DefaultTableModel model = (DefaultTableModel) tblStock.getModel();
            int select = tblStock.getSelectedRow();
            if(select == -1)
            {
                JOptionPane.showMessageDialog(null,"Please select an item!");
            }
            else
            {
                String hsn_code =  (tblStock.getModel().getValueAt(select,1).toString());
                new AddStocksFrame(hsn_code).setVisible(true);
                dispose();
            }
            
    }//GEN-LAST:event_btnCheckItemActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStocksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStocksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStocksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStocksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStocksFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStock;
    // End of variables declaration//GEN-END:variables
}
