/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import javax.swing.JOptionPane;

/**
 *
 * @author EXPERT-BOOK-USER
 */
public class Home_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Admin
     */
    public Home_Admin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pasien = new javax.swing.JButton();
        layanan = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        booking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        keluar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pasien.setBackground(new java.awt.Color(247, 215, 148));
        pasien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pasien.setForeground(new java.awt.Color(102, 51, 0));
        pasien.setText("Pasien");
        pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasienActionPerformed(evt);
            }
        });
        getContentPane().add(pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 140, 80));

        layanan.setBackground(new java.awt.Color(102, 51, 0));
        layanan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        layanan.setText("Layanan");
        layanan.setToolTipText("");
        layanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layananActionPerformed(evt);
            }
        });
        getContentPane().add(layanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 140, 80));

        dokter.setBackground(new java.awt.Color(102, 51, 0));
        dokter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dokter.setText("Dokter");
        dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterActionPerformed(evt);
            }
        });
        getContentPane().add(dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 140, 80));

        transaksi.setBackground(new java.awt.Color(247, 215, 148));
        transaksi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        transaksi.setForeground(new java.awt.Color(102, 51, 0));
        transaksi.setText("Transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 140, 80));

        booking.setBackground(new java.awt.Color(102, 51, 0));
        booking.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        booking.setForeground(new java.awt.Color(255, 255, 255));
        booking.setText("Cek Booking");
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });
        getContentPane().add(booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LuxeSkin (1) (3).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 150));

        kembali.setBackground(new java.awt.Color(102, 51, 0));
        kembali.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("KEMBALI");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 40));

        keluar1.setBackground(new java.awt.Color(102, 51, 0));
        keluar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        keluar1.setForeground(new java.awt.Color(255, 255, 255));
        keluar1.setText("KELUAR");
        keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar1ActionPerformed(evt);
            }
        });
        getContentPane().add(keluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_bookingActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        // TODO add your handling code here:
        new Menu_Dokter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dokterActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        new Menu_Transaksi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transaksiActionPerformed

    private void layananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layananActionPerformed
        // TODO add your handling code here:
        new Menu_Pelayanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_layananActionPerformed

    private void pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienActionPerformed
        // TODO add your handling code here:
        new Menu_Pasien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pasienActionPerformed

    private void keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booking;
    private javax.swing.JButton dokter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton keluar1;
    private javax.swing.JButton kembali;
    private javax.swing.JButton layanan;
    private javax.swing.JButton pasien;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
