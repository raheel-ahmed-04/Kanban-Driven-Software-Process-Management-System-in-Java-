/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author pakis
 */
public class LoginRegistration2 extends javax.swing.JFrame {
    ArrayList<Task> tasks = new ArrayList<Task>();
    /**
     * Creates new form LoginRegistration2
     */
    public LoginRegistration2() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/img/w.png")).getImage();
        this.setIconImage(icon);
        DataBase.loadTasksFromDatabaseDEVELOPER(tasks);
    }
    public LoginRegistration2(Task UpdTask) {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/img/w.png")).getImage();
        this.setIconImage(icon);

        DataBase.loadTasksFromDatabase(tasks);
        Dev.DevelopersFunctionality_updateStatusofDev(tasks, UpdTask);
        DataBase.saveTasksToDatabase(tasks);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kanban driven(WPMS)");
        setMaximumSize(new java.awt.Dimension(390, 480));
        setMinimumSize(new java.awt.Dimension(390, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 250, 80, 30);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 250, 180, 30);

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 290, 180, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 290, 20, 30);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 30.png"))); // NOI18N
        jButton2.setAlignmentY(0.0F);
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 350, 200, 40);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 34 (3).png"))); // NOI18N
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(0, 0, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/the-initials-w-logo-is-simple-and-modern8868-free-vector 1 (no bg) (1).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 30, 190, 140);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("by your Project Manager");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 190, 152, 20);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Write the username and ID provided to you");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 170, 270, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rectangle 66 (2).png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(390, 480));
        jLabel1.setMinimumSize(new java.awt.Dimension(390, 480));
        jLabel1.setPreferredSize(new java.awt.Dimension(390, 480));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 390, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String DevName = jTextField1.getText();
        String devID = jTextField2.getText();

        if (Dev.DevelopersFunctionality_checkTaskofDev(tasks, DevName, devID)){

            Task DevTask = Dev.DevelopersFunctionality_getTaskofDev(tasks, DevName, devID);
            JOptionPane.showMessageDialog(null, "Welcome ' "+DevName+ "'! " );

            DeveloperUI developerUI = new DeveloperUI(DevTask);
            this.dispose();
            developerUI.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Error! No record Present for ' "+DevName+ "' " );
        }



    }//GEN-LAST:event_jButton2ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:

        //first save to database

        MainScreen mainScreen = new MainScreen();
        this.dispose();
        mainScreen.setVisible(true);

    }//GEN-LAST:event_BackButtonActionPerformed


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
            java.util.logging.Logger.getLogger(LoginRegistration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRegistration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRegistration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegistration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegistration2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
