/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarymanagement;


import java.sql.*;
/**
 *
 * @author 123
 */
public class Welcome_131 extends javax.swing.JFrame {
        String str,strr,strrr,str1,sql1,sql2,sql3,sql4,sql5;
    PreparedStatement pst;
    Connection con;
    ResultSet rs;
    
    /**
     * Creates new form Welcome_131
     * @throws java.sql.SQLException
     */
    public Welcome_131() throws SQLException {
        
        sql2 = RegistrationPage_130.usernamespace.getText();
        sql3 = RegistrationPage_130.passwordspace1.getText();
        sql4 = RegistrationPage_130.phonespace.getText();
        sql5 = RegistrationPage_130.addressspace.getText();
        con = DBClass.getConnection();
        sql1 = "select id from userdata where name=? and password = ? and phonenumber = ? and address = ?";
        pst = con.prepareStatement(sql1);
        pst.setString(1, sql2);
        
        pst.setString(2, sql3);
        pst.setString(3, sql4);
        pst.setString(4, sql5);
        
        rs = pst.executeQuery();
        rs.next();
        str1=rs.getString(1);
        str = "Your ID number is: "+str1+".";
        strr="Please remember that.";
        strrr="You'll use it to sign in.";
        initComponents();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        statement = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        statement1 = new javax.swing.JLabel();
        statement2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to HNU Library");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 440, 97);

        jPanel3.setOpaque(false);

        statement.setText(str);
        statement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OKButton.setText("OK");
        OKButton.setOpaque(false);
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        statement1.setText(strr);
        statement1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        statement2.setText(strrr);
        statement2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statement1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statement, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statement2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(statement, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statement1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(statement2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(OKButton)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 440, 230);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/创造性的学校图书馆-荡桨在蓝色背景的白色空白的书-回到与拷贝空间的学校背景-121723381.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, -10, 610, 530);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginMenu_100.rp.dispose();
        Main.lm.setVisible(true);
    }//GEN-LAST:event_OKButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel statement;
    private javax.swing.JLabel statement1;
    private javax.swing.JLabel statement2;
    // End of variables declaration//GEN-END:variables
}
