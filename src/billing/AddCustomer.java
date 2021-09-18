package billing;

import com.billingSystem.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddCustomer extends javax.swing.JFrame {

    JTextField tname1;
    JTextField tcontact1;
    JTextField temail1;
    JTextField taddress1;

    public AddCustomer() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fsearch = new javax.swing.JTextField();
        btnaddcustomer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fcontact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        femail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        faddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setText("Search Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 73, 442, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 160, 442, 10));

        fsearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearchActionPerformed(evt);
            }
        });
        getContentPane().add(fsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 103, 180, 39));

        btnaddcustomer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnaddcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnaddcustomer.setText("Add");
        btnaddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 101, 113, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 29, 41));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 189, 62, 37));

        fname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 188, 326, 39));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Contact");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 246, 62, 37));

        fcontact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 245, 326, 39));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 303, 54, 37));

        femail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 302, 326, 39));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 360, 70, 37));

        faddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(faddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 359, 326, 39));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new buyer.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg4.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcustomerActionPerformed

        tname1.setText(fname.getText());
        tcontact1.setText(fcontact.getText());
        temail1.setText(femail.getText());
        taddress1.setText(faddress.getText());
        setVisible(false);


    }//GEN-LAST:event_btnaddcustomerActionPerformed

    private void fsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearchActionPerformed

        String name = fsearch.getText();
        String sql = "select * from customer where Name like '" + name + "%'";
        Connection conn = DatabaseConnector.connect();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                fname.setText(rs.getString(1));
                fcontact.setText(rs.getString(2));
                femail.setText(rs.getString(3));
                faddress.setText(rs.getString(4));
                fname.setVisible(true);
                fcontact.setVisible(true);
                femail.setVisible(true);
                faddress.setVisible(true);

            } else {
                fname.setVisible(false);
                fcontact.setVisible(false);
                femail.setVisible(false);
                faddress.setVisible(false);
                JOptionPane.showMessageDialog(null, "Customer Does not Match");

            }

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }


    }//GEN-LAST:event_fsearchActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcustomer;
    private javax.swing.JTextField faddress;
    private javax.swing.JTextField fcontact;
    private javax.swing.JTextField femail;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
