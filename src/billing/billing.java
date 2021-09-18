package billing;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class billing extends javax.swing.JFrame {

    // Popup menu and menu items
    private final JPopupMenu popupMenu = new JPopupMenu();
    private JMenuItem menuItem = null;

    int finalTotal = 0;

    public billing() {
        initComponents();
        setLocationRelativeTo(null);
        dateTime();
        randomNumber();
        createPopupMenu(null);
        tableDesign();

    }

    public void tableDesign() {
        JTableHeader th = billTable.getTableHeader();
        th.setBackground(Color.BLUE);
        th.setFont(new java.awt.Font("tahome", Font.BOLD, 16));
        th.setForeground(Color.white);

    }

    public void dateTime() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        fdate.setText(df.format(date));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        ftime.setText(tf.format(now));

    }

    public void randomNumber() {
        Random ran = new Random();
        int n = ran.nextInt(10000) + 1;
        String val = String.valueOf(n);
        invtext.setText(val);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btncustomer = new javax.swing.JButton();
        ftotal = new javax.swing.JTextField();
        fpaid = new javax.swing.JTextField();
        freturn = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ftime = new javax.swing.JLabel();
        fdate = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        invoice = new javax.swing.JLabel();
        invtext = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        taddress = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        tcontact = new javax.swing.JTextField();
        tname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/billing.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 64, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, 68, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Product Management :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 230, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 147, 1440, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 287, 1440, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1440, 10));

        billTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        billTable.setForeground(new java.awt.Color(51, 102, 0));
        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        billTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(billTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 820, 381));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Customer Management :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 240, 40));

        btncustomer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btncustomer.setText("Add");
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 90, 40));

        ftotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(ftotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, 210, 40));

        fpaid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpaidActionPerformed(evt);
            }
        });
        getContentPane().add(fpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, 210, 40));

        freturn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(freturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 670, 210, 40));

        btnsave.setBackground(new java.awt.Color(24, 54, 4));
        btnsave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 510, 130, 50));

        btnprint.setBackground(new java.awt.Color(51, 193, 222));
        btnprint.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print.png"))); // NOI18N
        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        getContentPane().add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 670, 130, 50));

        btnclose.setBackground(new java.awt.Color(255, 102, 102));
        btnclose.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close Jframe.png"))); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 760, 156, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 220, -1, 40));

        btnreset.setBackground(new java.awt.Color(159, 114, 4));
        btnreset.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Reset.png"))); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 590, 130, 50));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Calculate Details :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 210, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 140, 40));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Paid Amount :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 130, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Return Amount :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, 150, 40));

        ftime.setBackground(new java.awt.Color(0, 0, 0));
        ftime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ftime.setForeground(new java.awt.Color(221, 147, 26));
        getContentPane().add(ftime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 60, 150, 30));

        fdate.setBackground(new java.awt.Color(0, 0, 0));
        fdate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fdate.setForeground(new java.awt.Color(221, 147, 26));
        getContentPane().add(fdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, 150, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email: www.abccompany@gmail.com");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 320, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ABC Company Ltd.");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 250, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("- Save Money, Live Better -");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 220, 30));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Dhaka-1207");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 110, 30));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Copyright@2021");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 870, 130, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Website: www.rakib.com.bd");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 870, 180, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Email: www.rakib@gmail.com");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 870, 190, -1));

        invoice.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        invoice.setForeground(new java.awt.Color(255, 255, 255));
        invoice.setText("INVOICE NO :");
        getContentPane().add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 101, -1, 30));

        invtext.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        invtext.setForeground(new java.awt.Color(255, 0, 255));
        getContentPane().add(invtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 100, 80, 30));

        btnadd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 100, 40));

        taddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 220, 200, 40));

        temail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 200, 40));

        tcontact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(tcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 200, 40));

        tname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 200, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/billing background1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
        AddCustomer cust = new AddCustomer();
        cust.setVisible(true);
        cust.tname1 = tname;
        cust.tcontact1 = tcontact;
        cust.temail1 = temail;
        cust.taddress1 = taddress;
    }//GEN-LAST:event_btncustomerActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

        AddProduct a = new AddProduct();
        a.tbl = billTable;
        a.total = ftotal;
        a.paid = fpaid;
        a.returnamount = freturn;
        a.setVisible(true);

//        ac.temail1 = temail;
//        ac.tcontact1 = tcontact;
//        ac.taddress1 = taddress;

    }//GEN-LAST:event_btnaddActionPerformed

    private void fpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpaidActionPerformed
        int totalamount = Integer.parseInt(ftotal.getText());
        int paidamount = Integer.parseInt(fpaid.getText());
        int returnamount = paidamount - totalamount;
        freturn.setText(String.valueOf(returnamount));


    }//GEN-LAST:event_fpaidActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        tname.setText("");
        taddress.setText("");
        tcontact.setText("");
        temail.setText("");
        taddress.setText("");
        ftotal.setText("");
        fpaid.setText("");
        freturn.setText("");
        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_btnresetActionPerformed

    private void billTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billTableMouseClicked
        int mousex = MouseInfo.getPointerInfo().getLocation().x;
        int mousey = MouseInfo.getPointerInfo().getLocation().y;
        popupMenu.show(this, mousex, mousey);
    }//GEN-LAST:event_billTableMouseClicked

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // ========== Pdf create ============

        String name = tname.getText();
        String contact = tcontact.getText();
        String email = temail.getText();
        String address = taddress.getText();
        String invoice = invtext.getText();
        String path = "G:\\JEE\\JAVA\\java_example\\BillingSystem\\Print";
        Document doc = new Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + " " + name + " " + fdate.getText() + " .pdf"));
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                                           ABC Company Ltd.\n                                                 Contact NO: +880 1771886601\n                                                             Dhaka-1207\n                                         Email: www.abccompanyltd@gmail.com\n\n\n\n\n");
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph("INVOICE NO : " + invoice + "\nDate & Time : " + fdate.getText() + "   " + ftime.getText() + "\nCustomer Information :\nName : " + name + "\nContact No : " + contact + "\nEmail Address : " + email + "\nAddress : " + address + "\n\n\n");
            doc.add(paragraph2);
            PdfPTable ptbl = new PdfPTable(5);
            ptbl.addCell("Name");
            ptbl.addCell("Description");
            ptbl.addCell("Price");
            ptbl.addCell("Quantity");
            ptbl.addCell("Sub Total");

            for (int i = 0; i < billTable.getRowCount(); i++) {
                String n = billTable.getValueAt(i, 0).toString();
                String d = billTable.getValueAt(i, 1).toString();
                String p = billTable.getValueAt(i, 2).toString();
                String q = billTable.getValueAt(i, 3).toString();
                String s = billTable.getValueAt(i, 4).toString();
                ptbl.addCell(n);
                ptbl.addCell(d);
                ptbl.addCell(p);
                ptbl.addCell(q);
                ptbl.addCell(s);

            }
            doc.add(ptbl);
            Paragraph paragraph3 = new Paragraph("\nTotal Amount : " + ftotal.getText() + "\nPaid Amount : " + fpaid.getText() + "\nReturn Amount : " + freturn.getText() + "\n\nThank your for visiting ! Please come to visit again.\nEmail: www.rakib@gmail.com\nMd. Rakib Hasan\n\n\n");
            doc.add(paragraph3);
            Paragraph paragraph5 = new Paragraph("______________________________________________________________________________");
            doc.add(paragraph5);
            Paragraph paragraph4 = new Paragraph("Receiver's Signature                                                                                     Authorized Signature");
            doc.add(paragraph4);
            JOptionPane.showMessageDialog(null, "Bill Generated Successfully");

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());

        }
        doc.close();


    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            billTable.print();
        } catch (PrinterException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnprintActionPerformed

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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new billing().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billTable;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel fdate;
    private javax.swing.JTextField fpaid;
    private javax.swing.JTextField freturn;
    private javax.swing.JLabel ftime;
    private javax.swing.JTextField ftotal;
    private javax.swing.JLabel invoice;
    private javax.swing.JLabel invtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField taddress;
    private javax.swing.JTextField tcontact;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables

    // Create a Popup Menu Method ====================
    private void createPopupMenu(JFrame frame) {
        menuItem = new JMenuItem(
                "Delete", new ImageIcon("G:\\JEE\\JAVA\\java_example\\BillingSystem\\src\\icon\\delete icon.png")
        );
        menuItem.getAccessibleContext().setAccessibleDescription("Delete");

        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) billTable.getModel();
                model.removeRow(billTable.getSelectedRow());

                JOptionPane.showMessageDialog(frame, "Deleted Successfully");

            }
        });

        popupMenu.add(menuItem);

    }

}
