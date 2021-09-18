
package com.billingSystem;


import Product.NewProduct;
import Product.ProductDetails;
import customer.CustomerDetails;
import customer.DeleteCustomer;
import customer.NewCustomer;
import customer.UpdateCustomer;
import javax.swing.JOptionPane;
import Product.UpdateProduct;
import billing.billing;



public class HomeMenu extends javax.swing.JFrame {

    /**
     * Creates new form HomeMenu
     */
    public HomeMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        newCustomer = new javax.swing.JButton();
        customerdetails = new javax.swing.JButton();
        updatecustomer = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnnewproduct = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnbilling = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home1.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        newCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new buyer.png"))); // NOI18N
        newCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(newCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        customerdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buyer Details.png"))); // NOI18N
        customerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(customerdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        updatecustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update buyer.png"))); // NOI18N
        updatecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecustomerActionPerformed(evt);
            }
        });
        getContentPane().add(updatecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete buyer.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, -1, -1));

        btnnewproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new product.png"))); // NOI18N
        btnnewproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewproductActionPerformed(evt);
            }
        });
        getContentPane().add(btnnewproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 720, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 120, -1, -1));

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update product.png"))); // NOI18N
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 720, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/details product.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 720, -1, -1));

        btnbilling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/billing.png"))); // NOI18N
        btnbilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbillingActionPerformed(evt);
            }
        });
        getContentPane().add(btnbilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 720, -1, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 720, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Customer Management");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel12);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 840, 30));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Product Management");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel13);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, 860, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 110, 24));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Customer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, 24));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 130, 24));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delete Customer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 120, 24));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New Product");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 800, 94, 24));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Update Product");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 800, 120, 24));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 800, 120, 24));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Billing Information");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 800, 130, 24));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Smart Billing Management System");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 1190, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Copyright @ 2021 Rakib Hasan");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 840, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Home");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Logout");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 800, 50, 24));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Close Application");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 200, -1, 24));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home2.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setMaximumSize(new java.awt.Dimension(1440, 900));
        jLabel11.setMinimumSize(new java.awt.Dimension(1440, 900));
        jLabel11.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1440, 900));

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(340, 32771));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Create New");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Print");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Exit");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("View");
        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Navigate");
        jMenuBar1.add(jMenu6);

        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setText("Profile");
        jMenuBar1.add(jMenu7);

        jMenu8.setForeground(new java.awt.Color(255, 255, 255));
        jMenu8.setText("Preference");
        jMenuBar1.add(jMenu8);

        jMenu9.setForeground(new java.awt.Color(255, 255, 255));
        jMenu9.setText("Run");
        jMenuBar1.add(jMenu9);

        jMenu10.setForeground(new java.awt.Color(255, 255, 255));
        jMenu10.setText("Help");
        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you want to Logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
            setVisible(false);
            new LoginForm().setVisible(true);
        
        
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        UpdateProduct up = new UpdateProduct();
        up.setVisible(true);
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       int a = JOptionPane.showConfirmDialog(null,"Do you want to Exit Application ?","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        
        
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void newCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerActionPerformed
       NewCustomer customer = new NewCustomer();
       customer.setVisible(true);
    }//GEN-LAST:event_newCustomerActionPerformed

    private void updatecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecustomerActionPerformed
        UpdateCustomer update = new UpdateCustomer();
        update.setVisible(true);
    }//GEN-LAST:event_updatecustomerActionPerformed

    private void customerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerdetailsActionPerformed
        CustomerDetails custdetails = new CustomerDetails();
        custdetails.setVisible(true);
    }//GEN-LAST:event_customerdetailsActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DeleteCustomer deletecust = new DeleteCustomer();
        deletecust.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnnewproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewproductActionPerformed
        NewProduct nproduct = new NewProduct();
        nproduct.setVisible(true);
    }//GEN-LAST:event_btnnewproductActionPerformed

    private void btnbillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillingActionPerformed
        billing bill = new billing();
        bill.setVisible(true);
    }//GEN-LAST:event_btnbillingActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ProductDetails pd = new ProductDetails();
        pd.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbilling;
    private javax.swing.JButton btnnewproduct;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton customerdetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton newCustomer;
    private javax.swing.JButton updatecustomer;
    // End of variables declaration//GEN-END:variables
}
