/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import javax.swing.JOptionPane;
import klinik.Bookingpasien;

/**
 *
 * @author EXPERT-BOOK-USER
 */
public class Booking extends javax.swing.JFrame {

    /**
     * Creates new form Bookingpasien
     */
    public Booking() {
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

        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNamapasien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIDDokter = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        txtLayanan1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("BOOKING");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(102, 51, 0));
        back.setText("KEMBALI");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 280, 40));

        txtNamapasien.setBackground(new java.awt.Color(255, 255, 255));
        txtNamapasien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNamapasien.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(txtNamapasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 280, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pasien");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        txtTanggal.setBackground(new java.awt.Color(255, 255, 255));
        txtTanggal.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 280, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Status");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nama");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        txtIDDokter.setBackground(new java.awt.Color(255, 255, 255));
        txtIDDokter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIDDokter.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(txtIDDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 280, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Dokter");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        simpan.setBackground(new java.awt.Color(102, 51, 0));
        simpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 120, 50));

        txtLayanan1.setBackground(new java.awt.Color(255, 255, 255));
        txtLayanan1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLayanan1.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(txtLayanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 280, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Layanan");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        txtstatus.setBackground(new java.awt.Color(255, 255, 255));
        txtstatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtstatus.setForeground(new java.awt.Color(102, 51, 0));
        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "confirmed", "pending", "canceled" }));
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        getContentPane().add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/12.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        new Home_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        java.sql.Date df = new java.sql.Date(txtTanggal.getDate(). getTime());
        String id = this.txtID.getText().trim();
        String NamaPasien = this.txtNamapasien.getText().trim();
        String IDDokter = this.txtIDDokter.getText().trim();
        String Layanan = this.txtLayanan1.getText().trim();
        String Status = (String) this.txtstatus.getSelectedItem();

        if (id.isEmpty() || NamaPasien.isEmpty() || IDDokter.isEmpty() || Layanan.isEmpty() || Status.isEmpty()) { 
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong");
        } else { 
            Bookingpasien booking = new Bookingpasien();
            booking.ID = id;
            booking.namapasien = NamaPasien;
            booking.tanggal = df;
            booking.IDdokter = IDDokter;
            booking.layanan = Layanan;
            booking.status = Status;

            if (booking.create()) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal disimpan");
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDDokter;
    private javax.swing.JTextField txtLayanan1;
    private javax.swing.JTextField txtNamapasien;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JComboBox<String> txtstatus;
    // End of variables declaration//GEN-END:variables
}