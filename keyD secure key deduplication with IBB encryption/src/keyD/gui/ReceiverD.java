/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyD.gui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import javax.swing.JOptionPane;
import keyD.dbutill.DBconnection;

/**
 *
 * @author DELL
 */
public class ReceiverD extends javax.swing.JFrame {

    String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
    String fname, ct;

    /**
     * Creates new form ReceiverD
     */
    public ReceiverD() {
        initComponents();
        setTitle("UserD :: KeyD");

        int[] ports = new int[]{9994};

        for (int i = 0; i < 1; i++) {
            Thread t = new Thread(new PortListener(ports[i]));
            t.setName("Listener-" + ports[i]);
            t.start();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("File Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 96, 106, 31));

        txtFileName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 96, 117, 31));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 133, 364, 263));

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(102, 204, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 427, 125, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keyD/images/receiverback11.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            PrintStream out1 = null;
            try {
                out1 = new PrintStream(new FileOutputStream("ReceiverA\\" + fname));
                out1.print(ct);
            } finally {
                if (out1 != null) {
                    out1.close();
                }
            }

            JOptionPane.showMessageDialog(null, "File Stored Successfully");

        } catch (Exception es) {
            System.out.println(es);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ReceiverD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiverD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiverD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiverD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiverD().setVisible(true);
            }
        });
    }

    class PortListener implements Runnable {

        int port;

        public PortListener(int port) {
            this.port = port;
        }

        public void run() {
            DBconnection db = new DBconnection();
            Connection connect = db.getConnection();

            if (this.port == 9994) {
                try {

                    ServerSocket sst = new ServerSocket(9994);
                    Socket cn;
                    while (true) {
                        cn = sst.accept();

                        DataInputStream in3 = new DataInputStream(cn.getInputStream());
                        fname = in3.readUTF();
                        ct = in3.readUTF();

                        txtFileName.setText(fname);
                        txtArea.setText(ct);

                        DataOutputStream dos9 = new DataOutputStream(cn.getOutputStream());
                        dos9.writeUTF("success");
                    }
                } catch (Exception es) {
                    System.out.println(es);
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtFileName;
    // End of variables declaration//GEN-END:variables
}
