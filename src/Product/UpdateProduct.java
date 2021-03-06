package Product;

import com.billingSystem.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateProduct extends javax.swing.JFrame {

    public UpdateProduct() {
        initComponents();
        setLocationRelativeTo(null);
        btnupdate.setVisible(false);
        fname.setVisible(false);
        fprice.setVisible(false);
        fdescription.setVisible(false);
        btndelete.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fdescription = new javax.swing.JTextField();
        btnclose = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnsearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btndelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg2.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg5.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update product.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update product ani.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 144, -1, -1));

        fid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fid.setForeground(new java.awt.Color(204, 0, 204));
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 140, 44));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 221, -1, -1));

        fname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 210, 250, 42));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 281, -1, -1));

        fprice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 270, 250, 42));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 341, -1, -1));

        fdescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 330, 250, 41));

        btnclose.setBackground(new java.awt.Color(113, 0, 85));
        btnclose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 130, 50));

        btnupdate.setBackground(new java.awt.Color(0, 69, 16));
        btnupdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 140, 50));

        btnreset.setBackground(new java.awt.Color(176, 131, 131));
        btnreset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 128, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 91, 546, 10));

        btnsearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 0, 0));
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 131, -1, 45));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 194, 546, 10));

        btndelete.setBackground(new java.awt.Color(153, 0, 51));
        btndelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 140, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg5.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String pid = fid.getText();
        String sql = "select * from product where pId = '" + pid + "'";
        Connection conn = DatabaseConnector.connect();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                fid.setText(rs.getString(1));
                fname.setText(rs.getString(2));
                fprice.setText(rs.getString(3));
                fdescription.setText(rs.getString(4));
                btnupdate.setVisible(true);
                fname.setVisible(true);
                fprice.setVisible(true);
                fdescription.setVisible(true);
                btndelete.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Product Does not Match");
                btnupdate.setVisible(false);
                fname.setVisible(false);
                fprice.setVisible(false);
                fdescription.setVisible(false);
                btndelete.setVisible(false);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }


    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String id = fid.getText();
        String name = fname.getText();
        String price = fprice.getText();
        String desc = fdescription.getText();

        String sql = "update product set pName = '" + name + "', price ='" + price + "',description ='" + desc + "' where pId = '" + id + "' ";
        Connection conn = DatabaseConnector.connect();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            fid.setText("");
            fname.setText("");
            fprice.setText("");
            fdescription.setText("");

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }


    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        fid.setText("");
        fname.setText("");
        fprice.setText("");
        fdescription.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String id1 = fid.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Product ?","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
        Connection conn = DatabaseConnector.connect();
        String sql = "delete from product where pId = '"+id1+"'";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                fid.setText("");
                fname.setText("");
                fprice.setText("");
                fdescription.setText("");
                
                
            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        
       
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateProduct().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField fdescription;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fprice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
