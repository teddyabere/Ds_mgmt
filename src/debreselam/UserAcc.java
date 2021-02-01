/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debreselam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class UserAcc extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public UserAcc() {
        initComponents();
        
        this.ic_invisible.setVisible(false);     // initially make the password invisible
        conn = db.java_db();
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
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ic_eye = new javax.swing.JLabel();
        ic_invisible = new javax.swing.JLabel();
        ic_invisible1 = new javax.swing.JLabel();
        ic_eye1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        cmb_division = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_bg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Account Pane");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 440, 70));

        txt_username.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 200, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Username :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 40));

        ic_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ic_eyeMousePressed(evt);
            }
        });
        jPanel1.add(ic_eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 40));

        ic_invisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ic_invisibleMousePressed(evt);
            }
        });
        jPanel1.add(ic_invisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 40));

        ic_invisible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/debreselam/images/pwd_invisible.png"))); // NOI18N
        ic_invisible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ic_invisible1MousePressed(evt);
            }
        });
        jPanel1.add(ic_invisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 30, 40));

        ic_eye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/debreselam/images/pwd_eye.png"))); // NOI18N
        ic_eye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ic_eye1MousePressed(evt);
            }
        });
        jPanel1.add(ic_eye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 40));

        txt_password.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 200, 40));

        cmb_division.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        cmb_division.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel1.add(cmb_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 200, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Division :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, 40));

        btn_delete.setBackground(new java.awt.Color(153, 153, 153));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 110, 50));

        btn_update.setBackground(new java.awt.Color(153, 153, 153));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 110, 50));

        btn_clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 110, 50));

        btn_save.setBackground(new java.awt.Color(153, 153, 153));
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Member ID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 110, 40));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Lucida Calligraphy", 0, 13)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 200, 40));
        jPanel1.add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 480));

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/debreselam/images/home.png"))); // NOI18N
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/debreselam/images/logout.png"))); // NOI18N
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        MainMenu ds = new MainMenu();
        ds.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        login ds = new login();
        ds.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

        //search by event key released

        try{

            String sql =  "select * from Users where id=?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();

            String add1 = rs.getString("id");
            txt_id.setText(add1);

            String add2 = rs.getString("username");
            txt_username.setText(add2);

            String add3 = rs.getString("password");
            txt_password.setText(add3);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{

            try{

                rs.close();
                pst.close();

            }catch(Exception e){

            }

        }

    }//GEN-LAST:event_txt_searchKeyReleased

    private void ic_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_eyeMousePressed

        ic_eye.setVisible(false);
        ic_invisible.setVisible(true);
        txt_password.setEchoChar((char)0);
    }//GEN-LAST:event_ic_eyeMousePressed

    private void ic_invisibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_invisibleMousePressed

        ic_invisible.setVisible(false);
        ic_eye.setVisible(true);
        txt_password.setEchoChar('*');
    }//GEN-LAST:event_ic_invisibleMousePressed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        //confirmation
        int jk = JOptionPane.showConfirmDialog(null, "Are you sure you wanna delete record?", "Debre Selam Beale Egziabher Sunday School" , JOptionPane.YES_NO_OPTION);

        if(jk == 0){

            //delete recored from the database where id=?

            try{

                String sql = "delete from Users where id=?";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_id.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null, "One record deleted successfully!");

                txt_search.setText("");
                txt_id.setText("");
                txt_username.setText("");
                txt_password.setText("");
                cmb_division.setSelectedIndex(0);

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }
            finally{

                try{

                    rs.close();
                    pst.close();

                }catch(Exception e){

                }

            }
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        //confirmation
        String value4 = txt_id.getText();

        int jk = JOptionPane.showConfirmDialog(null, "Are you sure you wanna update record?", "Debre Selam Beale Egziabher Sunday School" , JOptionPane.YES_NO_OPTION);
        if(jk == 0){

            //update user inforrmation in database

            try{

                String value = txt_username.getText();
                String value2 = txt_password.getText();
                String access = (cmb_division.getSelectedItem().toString());
                String value3 = access;

                String sql = "update Users set id = '"+value4+"', username = '"+value+"', password = '"+value2+"', division = '"+value3+"'  where id='"+value4+"' ";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated successfully!");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            finally{

                try{

                    rs.close();
                    pst.close();

                }catch(Exception e){

                }

            }
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        txt_search.setText("");
        txt_id.setText("");
        txt_username.setText("");
        txt_password.setText("");
        cmb_division.setSelectedIndex(0);

    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        //confirmation
        int jk = JOptionPane.showConfirmDialog(null, "Are you sure you wanna Add new record?", "Debre Selam Beale Egziabher Sunday School" , JOptionPane.YES_NO_OPTION);

        if(jk == 0){
            try{

                String sql = "insert into Users"
                + "(username,password,division) values(?,?,?) ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_username.getText());
                pst.setString(2, txt_password.getText());

                String access = (cmb_division.getSelectedItem().toString());
                pst.setString(3, access);

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){

                }
            }
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void ic_invisible1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_invisible1MousePressed

        ic_invisible.setVisible(false);
        ic_eye.setVisible(true);
        txt_password.setEchoChar('*');
    }//GEN-LAST:event_ic_invisible1MousePressed

    private void ic_eye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_eye1MousePressed

        ic_eye.setVisible(false);
        ic_invisible.setVisible(true);
        txt_password.setEchoChar((char)0);
    }//GEN-LAST:event_ic_eye1MousePressed

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
            java.util.logging.Logger.getLogger(UserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_division;
    private javax.swing.JLabel ic_eye;
    private javax.swing.JLabel ic_eye1;
    private javax.swing.JLabel ic_invisible;
    private javax.swing.JLabel ic_invisible1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JTextField txt_id;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
