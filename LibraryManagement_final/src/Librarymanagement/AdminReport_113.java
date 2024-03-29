/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarymanagement;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 26625
 */
public class AdminReport_113 extends javax.swing.JFrame {

    /**
     * Creates new form AdminReport_113
     */
      String [] a;
      String str11;
    Statement stmt;
    PreparedStatement pst;
    Connection con=DBClass.getConnection();//连接数据库
    ResultSet rs;
    DefaultTableModel tm;
    PreparedStatement preparedStatement;
    public AdminReport_113() {
        initComponents();

       bookreportpanel.setVisible(false);
       this.setDefaultCloseOperation(0x1);
        
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
        top = new javax.swing.JLabel();
        bookbutton = new javax.swing.JLabel();
        bookreportpanel = new javax.swing.JPanel();
        searchbooktxt = new javax.swing.JTextField();
        searchbutton2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        booktable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        booktype = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        top.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top.setText("Report");
        jPanel1.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 20, 680, 52));

        bookbutton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        bookbutton.setText("Book&User Report");
        bookbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookbuttonMouseClicked(evt);
            }
        });
        jPanel1.add(bookbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, 44));

        bookreportpanel.setOpaque(false);
        bookreportpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbooktxt.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        bookreportpanel.add(searchbooktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 287, 44));

        searchbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/search2.png"))); // NOI18N
        searchbutton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbutton2MouseClicked(evt);
            }
        });
        bookreportpanel.add(searchbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jScrollPane2.setOpaque(false);

        booktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BookID", "BookName", "UserAction", "UserID", "ActionTime"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booktable.setOpaque(false);
        booktable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(booktable);

        bookreportpanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 680, 120));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book&User Report");
        bookreportpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 230, 33));

        booktype.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        booktype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BookID", "Title" }));
        booktype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktypeActionPerformed(evt);
            }
        });
        bookreportpanel.add(booktype, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 44));

        jPanel1.add(bookreportpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 730, 290));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/HUNI.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 82, 759, 13));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 7, 21, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/背景（几何）1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookbuttonMouseClicked

       bookreportpanel.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_bookbuttonMouseClicked

    private void searchbutton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbutton2MouseClicked
        // TODO add your handling code here:
         try{    
                String sql=null;
                str11 = this.searchbooktxt.getText();
                //通过组合框进行选择
                if(booktype.getSelectedIndex()==0){
                    sql = "select * from bookreport where BookID= ?";
                }
                else if(booktype.getSelectedIndex()==1){
                    sql = "select * from bookreport where BookName= ?";
                }
                con = DBClass.getConnection();
                pst = con.prepareStatement(sql);//查询
                pst.setString(1, str11);
                rs = pst.executeQuery();//执行语句
                ResultSetMetaData rsmd = rs.getMetaData();//获取原数据，数据的数据，比如行数列数，列名
		int ColumnCount = rsmd.getColumnCount();//获取表格列数
                tm = (DefaultTableModel) booktable.getModel();//建立表格模型，editbooktable表格变量名
                tm.setRowCount(0);//更新行数据，使表格清空
		while (rs.next())//结果不为空，执行，以行进行循环，一次提取一条结果
		{
                    for (int i = 1; i <= ColumnCount; i++)//小于列数循环
                            {  // tm.addColumn(rsmd.getColumnName(i));//添加列头
                                a=new String[ColumnCount];//获取列头名字
                                for (int s =0; s < ColumnCount; s++)//小于行循环
                                {
					a[s]=rs.getString(s+1);//获取列数据
				}
                            }
			tm.addRow(a);//将行和列的数据整合，进行输出
			}
                        //当文本字段为空时弹出Warming窗口
                        if(searchbooktxt.getText().length()==0)
                        {
                            JOptionPane.showMessageDialog(this, "Empty!","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                        tm.fireTableDataChanged();
		}
		catch (SQLException e) {
                   JOptionPane.showMessageDialog(this, e, e.getMessage(), WIDTH, null);
                  }//数据库报错
                catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
                }//整体报错
    }//GEN-LAST:event_searchbutton2MouseClicked

    private void booktypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booktypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookbutton;
    private javax.swing.JPanel bookreportpanel;
    private javax.swing.JTable booktable;
    private javax.swing.JComboBox booktype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField searchbooktxt;
    private javax.swing.JLabel searchbutton2;
    private javax.swing.JLabel top;
    // End of variables declaration//GEN-END:variables
}
