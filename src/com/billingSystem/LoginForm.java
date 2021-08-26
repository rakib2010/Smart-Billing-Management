
package com.billingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 767));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 220, 110));

        user.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, 196, 30));

        password.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 196, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, 114, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 360, 114, 30));

        loginbtn.setBackground(new java.awt.Color(22, 91, 22));
        loginbtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.setBorder(null);
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 530, 97, 40));

        resetbtn.setBackground(new java.awt.Color(255, 153, 153));
        resetbtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.setBorder(null);
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 530, 81, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login background.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rakib","root","123456");
            String sql = "select * from login where username = ? and password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getText());
            pst.setString(2, password.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Successful");
                HomeMenu hm = new HomeMenu();
                hm.setVisible(true);
            
            
            }else{
                JOptionPane.showMessageDialog(null, "Username and Password doesn't match !!");
                user.setText("");
                password.setText("");
            
            
            
            }
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_loginbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        user.setText("");
        password.setText("");
    }//GEN-LAST:event_resetbtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
