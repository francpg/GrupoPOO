/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpuerta.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author fapg3
 */
public class FormularioLetras extends javax.swing.JFrame {

    /**
     * Creates new form frmOperaciones
     */
    public FormularioLetras() {
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

        txtTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnBorrarVocales = new javax.swing.JButton();
        btnContarLetras = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese texto:");

        jLabel2.setText("Resultado: ");

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnBorrarVocales.setText("Borrar Vocales");
        btnBorrarVocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVocalesActionPerformed(evt);
            }
        });

        btnContarLetras.setText("Contar Letras");
        btnContarLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarLetrasActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Reporte");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBorrarVocales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnContarLetras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)
                                .addGap(0, 29, Short.MAX_VALUE))
                            .addComponent(txtTexto))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarVocales)
                    .addComponent(btnContarLetras)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarVocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVocalesActionPerformed
        // TODO add your handling code here:
        if(validarIngreso()){
            String texto = this.txtTexto.getText();
            String nuevo = "";
            for(int i=0; i<texto.length(); i++){
                if(!(texto.charAt(i) == 'a' ||
                     texto.charAt(i) == 'e' ||
                     texto.charAt(i) == 'i' ||
                     texto.charAt(i) == 'o' ||
                     texto.charAt(i) == 'u' ||
                     texto.charAt(i) == 'A' ||
                     texto.charAt(i) == 'E' ||
                     texto.charAt(i) == 'I' ||
                     texto.charAt(i) == 'O' ||
                     texto.charAt(i) == 'U')){
                    nuevo += texto.charAt(i);
                }
            }
            this.txtResultado.setText(nuevo);
        }
    }//GEN-LAST:event_btnBorrarVocalesActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.txtTexto.setText("");
        this.txtResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnContarLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarLetrasActionPerformed
        // TODO add your handling code here:
        if(validarIngreso()){
            String texto = this.txtTexto.getText();
            int cantVocales = 0;
            int cantOtros = 0;
            for(int i=0; i<texto.length(); i++){
                if(texto.charAt(i) == 'a' ||
                   texto.charAt(i) == 'e' ||
                   texto.charAt(i) == 'i' ||
                   texto.charAt(i) == 'o' ||
                   texto.charAt(i) == 'u' ||
                   texto.charAt(i) == 'A' ||
                   texto.charAt(i) == 'E' ||
                   texto.charAt(i) == 'I' ||
                   texto.charAt(i) == 'O' ||
                   texto.charAt(i) == 'U'){
                    cantVocales++;
                }else{
                    cantOtros++;
                }
            }
            this.txtResultado.setText("Cantidad de vocales: " + cantVocales);
            this.txtResultado.append("\nCantidad de otros caracteres: " + cantOtros);
        }
    }//GEN-LAST:event_btnContarLetrasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ReporteLibros objFrm = new ReporteLibros();
        objFrm.setLocationRelativeTo(null);
        objFrm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioLetras().setVisible(true);
            }
        });
    }
    
    private boolean validarIngreso(){
        if(this.txtTexto.getText().contentEquals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un texto.");
            return false;
        }else{
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarVocales;
    private javax.swing.JButton btnContarLetras;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
