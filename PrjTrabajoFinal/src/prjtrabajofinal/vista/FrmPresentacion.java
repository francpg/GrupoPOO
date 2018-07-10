/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjtrabajofinal.vista;

import anajarro.vista.FormularioMultiResta;
import fpuerta.vista.FormularioLetras;
import rdiaz.vista.FormularioNumeros;

/**
 *
 * @author dsistemas
 */
public class FrmPresentacion extends javax.swing.JFrame {

    /**
     * Creates new form FrmPresentacion
     */
    public FrmPresentacion() {
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
        btnRdiaz = new javax.swing.JButton();
        btnAnajarro = new javax.swing.JButton();
        btnMpolo = new javax.swing.JButton();
        btnFpuerta = new javax.swing.JButton();
        btnAsanchez = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRdiaz.setText("Rubén Darío Díaz Saldaña");
        btnRdiaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRdiazActionPerformed(evt);
            }
        });
        jPanel1.add(btnRdiaz);

        btnAnajarro.setText("Alejandro Najarro Martínez");
        btnAnajarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnajarroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnajarro);

        btnMpolo.setText("Martin Polo Olivares");
        jPanel1.add(btnMpolo);

        btnFpuerta.setText("Francisco Puerta Grimaldo");
        btnFpuerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFpuertaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFpuerta);

        btnAsanchez.setText("Adriel Alejandro Sanchez Farro");
        jPanel1.add(btnAsanchez);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grupo 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFpuertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFpuertaActionPerformed
        // TODO add your handling code here:
        FormularioLetras objFrm = new FormularioLetras();
        objFrm.setLocationRelativeTo(null);
        objFrm.setDefaultCloseOperation(objFrm.DISPOSE_ON_CLOSE);
        objFrm.setVisible(true);
    }//GEN-LAST:event_btnFpuertaActionPerformed

    private void btnRdiazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRdiazActionPerformed
        // TODO add your handling code here:
        FormularioNumeros objFrm = new FormularioNumeros();
        objFrm.setLocationRelativeTo(null);
        objFrm.setDefaultCloseOperation(objFrm.DISPOSE_ON_CLOSE);
        objFrm.setVisible(true);
    }//GEN-LAST:event_btnRdiazActionPerformed

    private void btnAnajarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnajarroActionPerformed
        // TODO add your handling code here:
        FormularioMultiResta objFrm = new FormularioMultiResta();
        objFrm.setLocationRelativeTo(null);
        objFrm.setDefaultCloseOperation(objFrm.DISPOSE_ON_CLOSE);
        objFrm.setVisible(true);
    }//GEN-LAST:event_btnAnajarroActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPresentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnajarro;
    private javax.swing.JButton btnAsanchez;
    private javax.swing.JButton btnFpuerta;
    private javax.swing.JButton btnMpolo;
    private javax.swing.JButton btnRdiaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
