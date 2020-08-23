/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class SearchBillFrame extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    
    public SearchBillFrame() {
        initComponents();
        try{
            this.setExtendedState(SearchBillFrame.MAXIMIZED_BOTH);
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

        jLabel1 = new javax.swing.JLabel();
        btnGet = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbOptions = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        btnFetch = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("SEARCH BILL");
        jLabel1.setAutoscrolls(true);

        btnGet.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnGet.setText("GET");
        btnGet.setAutoscrolls(true);
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setAutoscrolls(true);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("<BACK");
        btnBack.setAutoscrolls(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        tblBill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILL NO", "NAME", "CONTACT NO", "BILL DATE", "TOTAL AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBill.setRowHeight(26);
        tblBill.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBill.getTableHeader().setResizingAllowed(false);
        tblBill.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBill);
        if (tblBill.getColumnModel().getColumnCount() > 0) {
            tblBill.getColumnModel().getColumn(0).setMinWidth(230);
            tblBill.getColumnModel().getColumn(0).setMaxWidth(270);
            tblBill.getColumnModel().getColumn(1).setMinWidth(350);
            tblBill.getColumnModel().getColumn(1).setMaxWidth(520);
            tblBill.getColumnModel().getColumn(2).setMinWidth(150);
            tblBill.getColumnModel().getColumn(2).setMaxWidth(150);
            tblBill.getColumnModel().getColumn(3).setMinWidth(140);
            tblBill.getColumnModel().getColumn(3).setMaxWidth(250);
            tblBill.getColumnModel().getColumn(4).setMinWidth(100);
            tblBill.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SEARCH YOUR BILL BY:");

        cmbOptions.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "BILLNO", "GSTIN", "CONTACT_NO" }));

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText(" ");

        btnFetch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFetch.setText("FETCH");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(btnFetch)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnFetch)
                .addGap(34, 34, 34))
        );

        btnDownload.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDownload.setText("DOWNLOAD");
        btnDownload.setAutoscrolls(true);
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(98, 98, 98)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(104, 104, 104)
                .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(100, 100, 100)
                .addComponent(btnDownload)
                .addGap(195, 195, 195))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        AdminFrame open = new AdminFrame();
        open.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        lblError.setText("");
        txtSearch.setText("");
        cmbOptions.setSelectedIndex(0);
        DefaultTableModel tbl = (DefaultTableModel) tblBill.getModel();
        tbl.setRowCount(0);
        

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        String searchopt = cmbOptions.getSelectedItem().toString().trim();
        String searchval = txtSearch.getText().trim();
       
        try 
        {
            if(!searchval.equals(""))
            {
            if(searchopt.equals("NAME"))
            {
              searchval = searchval.toUpperCase();
              String s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
              rs = stmt.executeQuery(s);
              lblError.setText("");
            }
            else if(searchopt.equals("CONTACT_NO") && searchval.length() == 10)
            {
              String s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
              rs = stmt.executeQuery(s);
              lblError.setText("");
            }
            else if(searchopt.equals("GSTIN") && searchval.length() == 15)
            {
              String s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
              rs = stmt.executeQuery(s); 
              lblError.setText("");
            }
            else if(searchopt.equals("BILLNO") && searchval.length() == 20)
            {
              String s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
              rs = stmt.executeQuery(s);
              lblError.setText("");
            }
            
            if(rs.next()){
            String bill_no, cust_name, contact_no, total_amount, bill_date;
            DefaultTableModel tbl = (DefaultTableModel) tblBill.getModel();
            
            //tbl.setRowCount(0);
            
            while(rs.next())
            {
                bill_no = rs.getString("BILLNO");
                cust_name = rs.getString("NAME");
                contact_no = rs.getString("CONTACT_NO");
                total_amount= rs.getString("TOTAL_AMOUNT");
                bill_date= rs.getString("BILL_DATE");
                
                tbl.addRow(new Object[]{
                   bill_no, cust_name, contact_no, bill_date, total_amount
                });
            }
            }
            else
            {
                lblError.setText("Bill Not Found!");
            }
            }
            else
            {
                lblError.setText("Please enter the detail!");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnFetchActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed

            DefaultTableModel model = (DefaultTableModel) tblBill.getModel();
            int select = tblBill.getSelectedRow();
            if(select == -1)
            {
                
            }
            else
            {
                try
                {
                String bill_no =  (tblBill.getModel().getValueAt(select,0).toString());
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
                // JasperExportManager.exportReportToHtmlFile(jp ,ore);
                JasperViewer.viewReport(jp, false);
                btnClearActionPerformed(evt);
                
                
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        
    }//GEN-LAST:event_btnGetActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if(cmbOptions.getSelectedItem().toString().equals("CONTACT_NO"))
        {
            char vchar = evt.getKeyChar();
      
            if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
            {
                evt.consume();
            }
        }
        
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        String searchopt = cmbOptions.getSelectedItem().toString().trim();
        String searchval = txtSearch.getText().trim();
        String s = "";
        try
        {
            DefaultTableModel model = (DefaultTableModel) tblBill.getModel();
            int row = model.getRowCount();
            if(row > 0)
            {
                if(searchopt.equals("NAME"))
            {
              searchval = searchval.toUpperCase();
              s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
            }
            else if(searchopt.equals("CONTACT_NO") && searchval.length() == 10)
            {
              s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
            }
            else if(searchopt.equals("GSTIN") && searchval.length() == 15)
            {
              s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
            }
            else if(searchopt.equals("BILLNO") && searchval.length() == 20)
            {
              s = "SELECT * FROM USER WHERE "+searchopt+" LIKE '%"+searchval+"%' ";
            }
                
            
                // Generating JASPER REPORTS 
                String reportUrl = "/mypackage/LedgerBill.jrxml"; //path of your report source.
                InputStream reportFile = null;
                reportFile = getClass().getResourceAsStream(reportUrl);
                JasperDesign jasdi=JRXmlLoader.load(reportFile);
            
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(s);
                jasdi.setQuery(newQuery);
             
                
                HashMap<String, Object> para = new HashMap<>();
                para.put("KEY",s);
                
                JasperReport js=JasperCompileManager.compileReport(jasdi);
                JasperPrint jp=JasperFillManager.fillReport(js,para,con);
                
                JasperExportManager.exportReportToPdfFile(jp,"E:\\TransactionBilling\\ledgers\\"+searchval+".pdf");
                JOptionPane.showMessageDialog(null, "YOUR LEDGER IS GENERATED SUCCESSFULLY");
                JasperViewer.viewReport(jp, false);
                btnClearActionPerformed(evt);
               
            } 
            else
            {
                lblError.setText("Please search for ledger");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnDownloadActionPerformed

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
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBillFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnFetch;
    private javax.swing.JButton btnGet;
    private javax.swing.JComboBox<String> cmbOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTable tblBill;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
