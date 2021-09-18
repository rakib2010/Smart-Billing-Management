
package Product;

import com.billingSystem.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class NewProduct extends javax.swing.JFrame {

    /**
     * Creates new form NewProduct
     */
    public NewProduct() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        fdescription = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        fid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg5.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New Product ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 40, 275, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new product.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 40, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 121, 510, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descripton");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        fname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 256, 30));

        fprice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 256, 30));

        fdescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 256, 30));

        btnsave.setBackground(new java.awt.Color(39, 117, 12));
        btnsave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 406, 140, 47));

        btnreset.setBackground(new java.awt.Color(182, 122, 4));
        btnreset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Reset.png"))); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 406, 140, 47));

        btnclose.setBackground(new java.awt.Color(104, 7, 34));
        btnclose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close Jframe.png"))); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 406, 140, 47));

        fid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fid.setForeground(new java.awt.Color(255, 102, 255));
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg5.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String pid = fid.getText();
        String pname = fname.getText();
        String price = fprice.getText();
        String desc = fdescription.getText();

        Connection conn = DatabaseConnector.connect();
        String sql = "insert into product values (?,?,?,?)";

        if (!fid.getText().equals("") && !fname.getText().equals("") && !fprice.getText().equals("") && !fdescription.getText().equals("")) {
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, pid);
                pst.setString(2, pname);
                pst.setString(3, price);
                pst.setString(4, desc);
                pst.executeUpdate();
                pst.close();

                JOptionPane.showMessageDialog(null, "New Product Saved Successfully");

                fid.setText("");
                fname.setText("");
                fprice.setText("");
                fdescription.setText("");

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "You must have to fill all fields");

        }


    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        fid.setText("");
        fname.setText("");
        fprice.setText("");
        fdescription.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewProduct().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JTextField fdescription;
    private javax.swing.JTextField fid;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fprice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
