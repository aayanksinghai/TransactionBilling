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


public class AdminFrame extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    
    public AdminFrame() {
        initComponents();
        try{
            this.setExtendedState(AdminFrame.MAXIMIZED_BOTH);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BILLING","root","root");
            stmt = con.createStatement();
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

        lblLogout = new javax.swing.JLabel();
        lblChangePassword = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmenuAddStocks = new javax.swing.JMenuItem();
        jmenuEntryBill = new javax.swing.JMenuItem();
        jmenuViewStocks = new javax.swing.JMenuItem();
        jmenuViewBill = new javax.swing.JMenuItem();
        jmenuSearchBill = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 0, 0));
        lblLogout.setText("LOGOUT");
        lblLogout.setAutoscrolls(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        lblChangePassword.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblChangePassword.setForeground(new java.awt.Color(204, 0, 0));
        lblChangePassword.setText(" CHANGE PASSWORD?");
        lblChangePassword.setAutoscrolls(true);
        lblChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChangePasswordMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("MAHAVIR MARKET");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("WELCOME:");

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblUser.setForeground(new java.awt.Color(51, 153, 0));
        lblUser.setText("ADMIN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("JAIN MOTORS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(115, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(130, 130, 130)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel3)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");

        jmenuAddStocks.setText("Add Stocks");
        jmenuAddStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuAddStocksActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuAddStocks);

        jmenuEntryBill.setText("Entry Bill");
        jmenuEntryBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuEntryBillActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuEntryBill);

        jmenuViewStocks.setText("View Stocks");
        jmenuViewStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuViewStocksActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuViewStocks);

        jmenuViewBill.setText("View Bills");
        jmenuViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuViewBillActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuViewBill);

        jmenuSearchBill.setText("Search Bills");
        jmenuSearchBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuSearchBillActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuSearchBill);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(lblChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addComponent(lblChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(103, 103, 103))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangePasswordMouseClicked
        
        ForgotPasswordFrame open = new ForgotPasswordFrame();
        open.setVisible(true);
        dispose();

    }//GEN-LAST:event_lblChangePasswordMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked

        WelcomeFrame open = new WelcomeFrame();
        open.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jmenuAddStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuAddStocksActionPerformed

        if(jmenuAddStocks.isSelected() == false)
        {
            AddStocksFrame open = new AddStocksFrame();
            open.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jmenuAddStocksActionPerformed

    private void jmenuEntryBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuEntryBillActionPerformed

        if(jmenuEntryBill.isSelected() == false)
        {
            EntryBillFrame open = new EntryBillFrame();
            open.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jmenuEntryBillActionPerformed

    private void jmenuViewStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuViewStocksActionPerformed
        
        if(jmenuViewStocks.isSelected() == false)
        {
            ViewStocksFrame open = new ViewStocksFrame();
            open.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jmenuViewStocksActionPerformed

    private void jmenuViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuViewBillActionPerformed

        if(jmenuViewBill.isSelected() == false)
        {
            CustomerDetailsFrame open = new CustomerDetailsFrame();
            open.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jmenuViewBillActionPerformed

    private void jmenuSearchBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSearchBillActionPerformed

        if(jmenuSearchBill.isSelected() == false)
        {
            SearchBillFrame open = new SearchBillFrame();
            open.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jmenuSearchBillActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmenuAddStocks;
    private javax.swing.JMenuItem jmenuEntryBill;
    private javax.swing.JMenuItem jmenuSearchBill;
    private javax.swing.JMenuItem jmenuViewBill;
    private javax.swing.JMenuItem jmenuViewStocks;
    private javax.swing.JLabel lblChangePassword;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
