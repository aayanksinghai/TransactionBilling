/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class CustomerDetailsFrame extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    public CustomerDetailsFrame() {
        initComponents();
        try{
            this.setExtendedState(CustomerDetailsFrame.MAXIMIZED_BOTH);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BILLING","root","root");
            stmt = con.createStatement();
            
            String bill_no, cust_name, contact_no, total_amount, bill_date;
            DefaultTableModel tbl = (DefaultTableModel) tblCustDetails.getModel();
            
            String s = "SELECT * FROM USER";
            rs = stmt.executeQuery(s);
            
            tbl.setRowCount(0);
            while(rs.next())
            {
                bill_no = rs.getString("BILLNO");
                cust_name = rs.getString("NAME");
                contact_no = rs.getString("CONTACT_NO");
                total_amount= rs.getString("TOTAL_AMOUNT");
                bill_date= rs.getString("BILL_DATE");
                
                tbl.addRow(new Object[]{
                   bill_no, cust_name, contact_no, total_amount, bill_date
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
        tblCustDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnGetBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("View Customer Details");
        jLabel1.setAutoscrolls(true);

        jScrollPane1.setAutoscrolls(true);

        tblCustDetails.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tblCustDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BILL NO", "NAME", "CONTACT NO", "TOTAL AMOUNT", "BILL DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustDetails.setRowHeight(26);
        tblCustDetails.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCustDetails.getTableHeader().setResizingAllowed(false);
        tblCustDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCustDetails);
        if (tblCustDetails.getColumnModel().getColumnCount() > 0) {
            tblCustDetails.getColumnModel().getColumn(0).setMinWidth(200);
            tblCustDetails.getColumnModel().getColumn(0).setMaxWidth(270);
            tblCustDetails.getColumnModel().getColumn(1).setMinWidth(350);
            tblCustDetails.getColumnModel().getColumn(1).setMaxWidth(520);
            tblCustDetails.getColumnModel().getColumn(2).setMinWidth(150);
            tblCustDetails.getColumnModel().getColumn(2).setMaxWidth(150);
            tblCustDetails.getColumnModel().getColumn(3).setMinWidth(100);
            tblCustDetails.getColumnModel().getColumn(3).setMaxWidth(120);
            tblCustDetails.getColumnModel().getColumn(4).setMinWidth(140);
            tblCustDetails.getColumnModel().getColumn(4).setMaxWidth(250);
        }

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("<BACK");
        btnBack.setAutoscrolls(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnGetBill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnGetBill.setText("GET BILL");
        btnGetBill.setAutoscrolls(true);
        btnGetBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(btnGetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnGetBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        AdminFrame open = new AdminFrame();
        open.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGetBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBillActionPerformed

            DefaultTableModel model = (DefaultTableModel) tblCustDetails.getModel();
            int select = tblCustDetails.getSelectedRow();
            if(select == -1)
            {
                
            }
            else
            {
                try
                {
                String bill_no =  (tblCustDetails.getModel().getValueAt(select,0).toString());
                // Generating JASPER REPORTS 
                String reportUrl = "/mypackage/BillReceipt.jrxml"; //path of your report source.
                InputStream reportFile = null;
                reportFile = getClass().getResourceAsStream(reportUrl);
                JasperDesign jasdi=JRXmlLoader.load(reportFile);
                String billquery = "SELECT USER.BILLNO, USER.NAME, USER.CONTACT_NO, USER.ADDRESS, USER.GSTIN, USER.BILL_DATE, USER.TOTAL_AMOUNT, BILL.HSN_CODE, BILL.ITEM_NAME, BILL.QUANTITY, BILL.TAX_SLAB, BILL.SELLING_PRICE, BILL.BASIC_PRICE, BILL.CGST, BILL.SGST, BILL.TOTAL_PRICE FROM BILL, USER WHERE USER.BILLNO = BILL.BILLNO AND BILL.BILLNO = '"+bill_no+"'";

               
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(billquery);
                jasdi.setQuery(newQuery);

                HashMap<String, Object> para = new HashMap<>();
                para.put("BILL.BILLNO",bill_no);

                JasperReport js=JasperCompileManager.compileReport(jasdi);
                JasperPrint jp=JasperFillManager.fillReport(js,para,con);
                
                JasperViewer.viewReport(jp, false);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
    }//GEN-LAST:event_btnGetBillActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGetBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustDetails;
    // End of variables declaration//GEN-END:variables
}
