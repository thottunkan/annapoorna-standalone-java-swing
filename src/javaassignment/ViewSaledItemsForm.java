/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.openide.util.Exceptions;

/**
 *
 * @author AMBADY MONU
 */
public class ViewSaledItemsForm extends javax.swing.JFrame {

    /**
     * Creates new form ViewSaledItemsForm
     */
    public ViewSaledItemsForm() {
        initComponents();
        setTitle("All Saled Items");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.jTable1.setAlignmentY(CENTER_ALIGNMENT);
        DefaultTableModel tm = (DefaultTableModel) saletable.getModel();
        tm.setRowCount(0);
        
        try {
            PreparedStatement ps = DbCon.getConnection().prepareStatement("SELECT * FROM SELL INNER JOIN PRODUCTS ON SELL.PROD_ID = PRODUCTS.ID INNER JOIN CUSTOMER ON SELL.CUST_ID = CUSTOMER.CUST_ID");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object obj[] ={rs.getDate("date"),rs.getString("product_name"),rs.getInt("product_price"),
                                rs.getString("quantity"),rs.getInt("total_price"),rs.getString("cust_name"),rs.getString("cust_phone"),rs.getString("prod_id")};
                tm.addRow(obj);
            }
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saletable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        generateReportbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        curdate = new com.toedter.calendar.JDateChooser();
        todaySalebtn = new javax.swing.JButton();
        startDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        endDate = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblTotalPrice = new javax.swing.JLabel();
        resetTableBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        saletable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saletable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Product Name", "Product /Rs", "Quantity", "Total Price", "Customer Name", "Phone No", "Product id"
            }
        ));
        saletable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saletable.setOpaque(false);
        jScrollPane1.setViewportView(saletable);

        generateReportbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        generateReportbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate_report.png"))); // NOI18N
        generateReportbtn.setText("Generate Report");
        generateReportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SALED PRODUCTS");

        curdate.setDateFormatString("dd-M-yyyy"); // NOI18N
        curdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        todaySalebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        todaySalebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculate.png"))); // NOI18N
        todaySalebtn.setText("Calculate");
        todaySalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todaySalebtnActionPerformed(evt);
            }
        });

        startDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("TO");

        endDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculate.png"))); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(22, 54, 17));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1263, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 185, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1253, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(22, 54, 17));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1253, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(255, 0, 0));

        resetTableBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resetTableBtn.setText("Reset Table");
        resetTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTotalPrice)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(generateReportbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(curdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(todaySalebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(curdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(todaySalebtn)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generateReportbtn)
                        .addComponent(lblTotalPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 185, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1253, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void todaySalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todaySalebtnActionPerformed
               
                String date = curdate.getDate().toString();
                if( !(date == null)){
        
                   DefaultTableModel tm = (DefaultTableModel) saletable.getModel();
                   tm.setRowCount(0);
                   SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                   String todaydate = sdf.format(curdate.getDate());
                   System.out.println("javaassignment.ViewSaledItemsForm.todaySalebtnActionPerformed() ="+todaydate);
                   try {
                    PreparedStatement ps = DbCon.getConnection().prepareStatement("SELECT * FROM SELL INNER JOIN PRODUCTS ON SELL.PROD_ID = PRODUCTS.ID INNER JOIN CUSTOMER ON SELL.CUST_ID = CUSTOMER.CUST_ID where date=?");
                    ps.setDate(1, Date.valueOf(todaydate));
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                    Object obj[] ={rs.getDate("date"),rs.getString("product_name"),rs.getInt("product_price"),
                                rs.getString("quantity"),rs.getInt("total_price"),rs.getString("cust_name"),rs.getString("cust_phone"),rs.getString("prod_id")};
                    tm.addRow(obj);
                    }
                    
                    PreparedStatement totalpricePrepare = DbCon.getConnection().prepareStatement("SELECT sum(total_price) FROM SELL INNER JOIN PRODUCTS ON SELL.PROD_ID = PRODUCTS.ID INNER JOIN CUSTOMER ON SELL.CUST_ID = CUSTOMER.CUST_ID where date=?");
                    totalpricePrepare.setDate(1, Date.valueOf(todaydate));
                    ResultSet resultSet = totalpricePrepare.executeQuery();
                       while (resultSet.next()) {                           
                           lblTotalPrice.setText("Today total sale : "+resultSet.getString(1)+"/-");
                       }
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }else if(curdate.getDate().toString().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Date Missing.... Please chosse the date");
                }     
    }//GEN-LAST:event_todaySalebtnActionPerformed

    private void generateReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportbtnActionPerformed
               MessageFormat head = new MessageFormat("PRODUCT REPORT");
               MessageFormat footer = new MessageFormat("annapoorna food products");
               try {
                   saletable.print(JTable.PrintMode.FIT_WIDTH, head, footer);
                   
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
               }
               
    }//GEN-LAST:event_generateReportbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd");
            String startdate = sdf1.format(startDate.getDate());
            String enddate = sdf1.format(endDate.getDate());
            
            DefaultTableModel tm = (DefaultTableModel) saletable.getModel();
            tm.setRowCount(0);
            PreparedStatement tabledataprepare = DbCon.getConnection().prepareStatement("SELECT * FROM SELL INNER JOIN PRODUCTS ON SELL.PROD_ID = PRODUCTS.ID INNER JOIN CUSTOMER ON SELL.CUST_ID = CUSTOMER.CUST_ID where date between ? and ?");
            tabledataprepare.setDate(1, Date.valueOf(startdate));
            tabledataprepare.setDate(2, Date.valueOf(enddate));
            ResultSet tableDataResultSet = tabledataprepare.executeQuery();
            while (tableDataResultSet.next()) {
               Object obj[] ={tableDataResultSet.getDate("date"),tableDataResultSet.getString("product_name"),tableDataResultSet.getInt("product_price"),
                                tableDataResultSet.getString("quantity"),tableDataResultSet.getInt("total_price"),tableDataResultSet.getString("cust_name"),tableDataResultSet.getString("cust_phone"),tableDataResultSet.getString("prod_id")};
                    tm.addRow(obj);
            }
            
            PreparedStatement totalPricePrepare = DbCon.getConnection().prepareStatement("SELECT sum(total_price) FROM SELL INNER JOIN PRODUCTS ON SELL.PROD_ID = PRODUCTS.ID INNER JOIN CUSTOMER ON SELL.CUST_ID = CUSTOMER.CUST_ID where date between ? and ?");
            totalPricePrepare.setDate(1, Date.valueOf(startdate));
            totalPricePrepare.setDate(2, Date.valueOf(enddate));
            ResultSet totalPriceResultset = totalPricePrepare.executeQuery();
            totalPriceResultset.next();
            lblTotalPrice.setText("Total sale from "+startdate+" to "+enddate+" is "+totalPriceResultset.getString(1)+"/-");
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resetTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableBtnActionPerformed
             DefaultTableModel tm = (DefaultTableModel) saletable.getModel();
              tm.setRowCount(0);
        
            try {
                PreparedStatement ps = DbCon.getConnection().prepareStatement("SELECT * FROM SELL INNER JOIN PRODUCTS ON SELL.PROD_ID = PRODUCTS.ID INNER JOIN CUSTOMER ON SELL.CUST_ID = CUSTOMER.CUST_ID");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Object obj[] ={rs.getDate("date"),rs.getString("product_name"),rs.getInt("product_price"),
                                    rs.getString("quantity"),rs.getInt("total_price"),rs.getString("cust_name"),rs.getString("cust_phone"),rs.getString("prod_id")};
                    tm.addRow(obj);
                }
                lblTotalPrice.setText("");
            } catch (SQLException ex) {
                Exceptions.printStackTrace(ex);
            }
    }//GEN-LAST:event_resetTableBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSaledItemsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSaledItemsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSaledItemsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSaledItemsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSaledItemsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser curdate;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JButton generateReportbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JButton resetTableBtn;
    private javax.swing.JTable saletable;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JButton todaySalebtn;
    // End of variables declaration//GEN-END:variables
}
