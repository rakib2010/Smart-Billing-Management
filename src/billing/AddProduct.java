package billing;

import com.billingSystem.DatabaseConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Rakib
 */
public class AddProduct extends javax.swing.JFrame {

    int sum = 0;
    JTable tbl;
    JTextField total;
    JTextField paid;
    JTextField returnamount;

    public AddProduct() {
        initComponents();
        setLocationRelativeTo(null);
        settbllistio();
        theader();

    }

    public void theader() {
        JTableHeader th = addProductTable.getTableHeader();
        th.setBackground(Color.CYAN);
        th.setFont(new Font("tahome", Font.BOLD, 16));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addProductTable = new javax.swing.JTable();
        btnadd1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Search Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 230, 27));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 580, 10));

        fsearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearchActionPerformed(evt);
            }
        });
        fsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fsearchKeyTyped(evt);
            }
        });
        getContentPane().add(fsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 285, 40));

        addProductTable.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        addProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Description", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(addProductTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 170, 590, 330));

        btnadd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnadd1.setText("Add");
        btnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 100, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 42));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 142, 580, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update product.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearchActionPerformed
        String id = fsearch.getText();
        String name = fsearch.getText();

        String sql = "select * from product where pId = '" + id + "'";
        String sql2 = "select * from product where pName like '" + name + "%'";
        Connection conn = DatabaseConnector.connect();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            PreparedStatement pst1 = conn.prepareStatement(sql2);
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst1.executeQuery();
            while (rs.next()) {
                String[] s = {rs.getString(2), rs.getString(4), rs.getString(3)};
                DefaultTableModel model = (DefaultTableModel) addProductTable.getModel();
                model.addRow(s);

            }
            while (rs2.next()) {
                String[] s = {rs2.getString(2), rs2.getString(4), rs2.getString(3)};
                DefaultTableModel model = (DefaultTableModel) addProductTable.getModel();
                model.addRow(s);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_fsearchActionPerformed

    private void btnadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd1ActionPerformed
        DefaultTableModel ptbl = (DefaultTableModel) addProductTable.getModel();

        int[] index1 = addProductTable.getSelectedRows();
        Object[] row = new Object[5];

        DefaultTableModel billtableModel = (DefaultTableModel) tbl.getModel();

        for (int i = 0; i < index1.length; i++) {
            row[0] = ptbl.getValueAt(index1[i], 0);
            row[1] = ptbl.getValueAt(index1[i], 1);
            row[2] = ptbl.getValueAt(index1[i], 2);
            row[3] = ptbl.getValueAt(index1[i], 3);
            row[4] = ptbl.getValueAt(index1[i], 4);

            sum += Integer.parseInt(String.valueOf(row[4]));

            billtableModel.addRow(row);

        }
        total.setText(String.valueOf(sum));

        setVisible(false);


    }//GEN-LAST:event_btnadd1ActionPerformed

    private void fsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fsearchKeyTyped

    }//GEN-LAST:event_fsearchKeyTyped

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddProduct().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addProductTable;
    private javax.swing.JButton btnadd1;
    private javax.swing.JTextField fsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void settbllistio() {
        DefaultTableModel ptbl = (DefaultTableModel) addProductTable.getModel();

        ptbl.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {

                if (tme.getType() == TableModelEvent.UPDATE) {
                    int quantity = Integer.parseInt((String) ptbl.getValueAt(addProductTable.getSelectedRow(), addProductTable.getSelectedColumn()));
                    int price = Integer.parseInt((String) ptbl.getValueAt(addProductTable.getSelectedRow(), 2));
                    if (tme.getColumn() == 3) {
                        ptbl.setValueAt(quantity * price, addProductTable.getSelectedRow(), 4);
                    }

                }

            }
        });
    }
}
