/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author 26625
 */
public class AdminManageMenu_110 extends javax.swing.JFrame {

    /**
     * Creates new form AdminManageMenu_110
     */
    String str,adminnm;
    PreparedStatement pst;
    Connection con;
    ResultSet rs1;
    public AdminManageMenu_110() {
        try {
            con = DBClass.getConnection();
            str = "select * from admindata where id = ?";
            pst = con.prepareStatement(str);
            pst.setString(1,LoginMenu_100.idinput.getText());
            rs1 = pst.executeQuery();
            rs1.next();
            adminnm = rs1.getString(2);
            initComponents();
        } catch (SQLException ex) {
            Logger.getLogger(AdminManageMenu_110.class.getName()).log(Level.SEVERE, null, ex);
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Admininame = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        managebooks = new javax.swing.JLabel();
        systemmanagement = new javax.swing.JLabel();
        manageusers = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HNU_Library_System");
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel6.setText("EXIT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(920, 10, 60, 40);

        jLabel5.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel5.setText("Report");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(670, 210, 90, 60);
        jLayeredPane1.add(jSeparator1);
        jSeparator1.setBounds(10, 160, 990, 20);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator4);
        jSeparator4.setBounds(290, 0, 10, 160);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator2);
        jSeparator2.setBounds(530, 0, 50, 440);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Administer");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 26));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 34));

        Admininame.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        Admininame.setText(adminnm);
        jPanel2.add(Admininame, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, 26));

        number.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        number.setText(LoginMenu_100.idinput.getText());
        jPanel2.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 90, 130, 34));

        jLabel4.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel4.setText("Personal Information");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 276, -1));

        jLayeredPane1.add(jPanel2);
        jPanel2.setBounds(0, 0, 290, 160);

        managebooks.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        managebooks.setText("ManageBooks");
        managebooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managebooksMouseClicked(evt);
            }
        });
        jLayeredPane1.add(managebooks);
        managebooks.setBounds(630, 60, 139, 57);

        systemmanagement.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        systemmanagement.setText("System Management");
        systemmanagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                systemmanagementMouseClicked(evt);
            }
        });
        jLayeredPane1.add(systemmanagement);
        systemmanagement.setBounds(150, 240, 215, 28);

        manageusers.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        manageusers.setText("ManageUsers");
        manageusers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageusersMouseClicked(evt);
            }
        });
        jLayeredPane1.add(manageusers);
        manageusers.setBounds(350, 50, 139, 73);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/背景（几何）1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 990, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageusersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageusersMouseClicked

        // TODO add your handling code here:
        AdminManageUser_111 AMU = new AdminManageUser_111();
        AMU.setLocationRelativeTo(null);
        AMU.setVisible(true);
       
        
    }//GEN-LAST:event_manageusersMouseClicked

    private void systemmanagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemmanagementMouseClicked
       AdminManageSystem_114 AMS = new AdminManageSystem_114();
       AMS.setLocationRelativeTo(null);
       AMS.setVisible(true);
        // TODO add your handling code here:
   }//GEN-LAST:event_systemmanagementMouseClicked

    private void managebooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managebooksMouseClicked

        // TODO add your handling code here:
        AdminManageBooks_112 AMB = new AdminManageBooks_112();
        AMB.setLocationRelativeTo(null);
        AMB.setVisible(true);
    }//GEN-LAST:event_managebooksMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
               AdminReport_113 AR =new AdminReport_113();
               AR.setLocationRelativeTo(null);
               AR.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admininame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel managebooks;
    private javax.swing.JLabel manageusers;
    private javax.swing.JLabel number;
    private javax.swing.JLabel systemmanagement;
    // End of variables declaration//GEN-END:variables
}