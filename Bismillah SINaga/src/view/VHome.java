/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import view.VPenanaman1;
import java.awt.event.ActionListener;
/**
 *
 * @author Danu
 */
public class VHome extends javax.swing.JFrame {

    /**
     * Creates new form VHome
     */
    public VHome() {
        initComponents();
    }
    public void penanamanbaru_action(ActionListener a){
        this.BPenanamanbaru.addActionListener(a);
    
    }
    public void cektanaman_action(ActionListener a){
        this.BCektanaman.addActionListener(a);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundHome1 = new komponenTambahan.BackgroundHome();
        BLaporanpenjualan = new javax.swing.JButton();
        BPenanamanbaru = new javax.swing.JButton();
        BCektanaman = new javax.swing.JButton();
        BPanen = new javax.swing.JButton();
        BCekPupuk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundHome1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BLaporanpenjualan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BLaporanpenjualan.setText("Laporan Penjualan");
        BLaporanpenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLaporanpenjualanActionPerformed(evt);
            }
        });
        backgroundHome1.add(BLaporanpenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 175, 37));

        BPenanamanbaru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPenanamanbaru.setText("Penanaman Baru");
        backgroundHome1.add(BPenanamanbaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 175, 37));

        BCektanaman.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BCektanaman.setText("Cek Tanaman");
        BCektanaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCektanamanActionPerformed(evt);
            }
        });
        backgroundHome1.add(BCektanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 175, 37));

        BPanen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPanen.setText("Panen");
        BPanen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPanenActionPerformed(evt);
            }
        });
        backgroundHome1.add(BPanen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 175, 37));

        BCekPupuk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BCekPupuk.setText("Cek Pupuk");
        BCekPupuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCekPupukActionPerformed(evt);
            }
        });
        backgroundHome1.add(BCekPupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 175, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundHome1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundHome1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BLaporanpenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLaporanpenjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BLaporanpenjualanActionPerformed

    private void BCektanamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCektanamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCektanamanActionPerformed

    private void BPanenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPanenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPanenActionPerformed

    private void BCekPupukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCekPupukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCekPupukActionPerformed

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
            java.util.logging.Logger.getLogger(VHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCekPupuk;
    private javax.swing.JButton BCektanaman;
    private javax.swing.JButton BLaporanpenjualan;
    private javax.swing.JButton BPanen;
    private javax.swing.JButton BPenanamanbaru;
    private komponenTambahan.BackgroundHome backgroundHome1;
    // End of variables declaration//GEN-END:variables
}