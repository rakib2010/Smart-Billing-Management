package customer;

import com.billingSystem.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateCustomer extends javax.swing.JFrame {

    public UpdateCustomer() {
        initComponents();
        setLocationRelativeTo(null);
        fcontact.setVisible(false);
        fname.setVisible(false);
        femail.setVisible(false);
        faddress.setVisible(false);
        btnupdate.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        faddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fsearch = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        femail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        fcontact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg5.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg5.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 208, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update buyer.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        btnupdate.setBackground(new java.awt.Color(51, 106, 42));
        btnupdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 107, 48));

        jButton2.setBackground(new java.awt.Color(172, 122, 72));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 100, 48));

        btnclose.setBackground(new java.awt.Color(255, 102, 102));
        btnclose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 97, 48));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        faddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(faddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 274, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        fsearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearchActionPerformed(evt);
            }
        });
        fsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fsearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fsearchKeyTyped(evt);
            }
        });
        getContentPane().add(fsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 100, 230, 40));

        fname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 274, 37));

        femail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 274, 40));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 487, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 498, 10));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact No");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        fcontact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 274, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 30, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg5.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String name1 = fsearch.getText();
        String name2 = fname.getText();
        String email = femail.getText();
        String address = faddress.getText();
        String contact = fcontact.getText();

        Connection conn = DatabaseConnector.connect();
        String sql = "update customer set Contact = '" + contact + "', Name ='" + name2 + "', Email ='" + email + "', Address = '" + address + "' where Name like '" + name1 + "%'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Updated Successfully");

            fname.setText("");
            fsearch.setText("");
            femail.setText("");
            faddress.setText("");
            fcontact.setText("");

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void fsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearchActionPerformed

    }//GEN-LAST:event_fsearchActionPerformed

    private void fsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fsearchKeyPressed

    }//GEN-LAST:event_fsearchKeyPressed

    private void fsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fsearchKeyTyped
        String searchb = fsearch.getText();
        Connection conn = DatabaseConnector.connect();
        String sql = "select * from customer where Name like '" + searchb + "%'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                fcontact.setText(rs.getString(2));
                fname.setText(rs.getString(1));
                femail.setText(rs.getString(3));
                faddress.setText(rs.getString(4));
                fname.setVisible(true);
                femail.setVisible(true);
                faddress.setVisible(true);
                btnupdate.setVisible(true);
                fcontact.setVisible(true);

            } else {
//                JOptionPane.showMessageDialog(null, "Contact Does not match");
                fname.setVisible(false);
                femail.setVisible(false);
                faddress.setVisible(false);
                btnupdate.setVisible(false);
                fcontact.setVisible(false);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_fsearchKeyTyped

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
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateCustomer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField faddress;
    private javax.swing.JTextField fcontact;
    private javax.swing.JTextField femail;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fsearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
