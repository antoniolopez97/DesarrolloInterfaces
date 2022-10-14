/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplojoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author AntonioLópezMielgo
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
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

        jButtonMensaje = new javax.swing.JButton();
        jButtonConfirmacion = new javax.swing.JButton();
        jButtonEntrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMensaje.setText("Mensaje");
        jButtonMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensajeActionPerformed(evt);
            }
        });

        jButtonConfirmacion.setText("Confirmacion");
        jButtonConfirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmacionActionPerformed(evt);
            }
        });

        jButtonEntrada.setText("Entrada");
        jButtonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButtonMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirmacion)
                .addGap(18, 18, 18)
                .addComponent(jButtonEntrada)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMensaje)
                    .addComponent(jButtonConfirmacion)
                    .addComponent(jButtonEntrada))
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensajeActionPerformed
        JOptionPane.showMessageDialog(this, "Un mensaje de prueba","Titulo",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButtonMensajeActionPerformed

    private void jButtonConfirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmacionActionPerformed
     int resultado=   JOptionPane.showConfirmDialog(this,"Quieres Borrar este registro","titulo",JOptionPane.YES_NO_OPTION);
     if(resultado==JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(this, "Borramos","Titulo",JOptionPane.INFORMATION_MESSAGE);
     }else if (resultado==JOptionPane.NO_OPTION){
      JOptionPane.showMessageDialog(this, " No Borramos","Titulo",JOptionPane.INFORMATION_MESSAGE);
     }
     
     
    }//GEN-LAST:event_jButtonConfirmacionActionPerformed

    private void jButtonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntradaActionPerformed
     String nombre= JOptionPane.showInputDialog(this,"Intrduce tu nombre","Pregunta",JOptionPane.QUESTION_MESSAGE);
      JOptionPane.showMessageDialog(this, "Hola"+nombre,"Titulo",JOptionPane.INFORMATION_MESSAGE);
      
      
    }//GEN-LAST:event_jButtonEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmacion;
    private javax.swing.JButton jButtonEntrada;
    private javax.swing.JButton jButtonMensaje;
    // End of variables declaration//GEN-END:variables
}
