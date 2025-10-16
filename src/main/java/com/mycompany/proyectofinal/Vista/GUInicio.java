
package com.mycompany.proyectofinal.Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;


public class GUInicio extends javax.swing.JFrame {

    /**
     * Creates new form GUInicio
     */
    public GUInicio(ActionListener controlador) {
        initComponents();
        setVisible(true);
        escucharBtn(controlador);
    }

    private void escucharBtn(ActionListener controlador) {
        this.btnPlay.addActionListener(controlador);
        this.btnSalir.addActionListener(controlador);
        this.btnInstrucciones.addActionListener(controlador);
        this.btnCreditos.addActionListener(controlador);
        this.btnHistoria.addActionListener(controlador);

        //Colores
        this.btnAzul.addActionListener(controlador);
        this.btnAmarillo.addActionListener(controlador);
        this.btnVerde.addActionListener(controlador);
        this.btnRojo.addActionListener(controlador);
    }

    public JButton getBtnPlay() {
        return this.btnPlay;
    }

    public JButton getBtnSalir() {
        return this.btnSalir;
    }

    public JButton getBtnInstrucciones() {
        return this.btnInstrucciones;
    }

    public JButton getBtnCreditos() {
        return this.btnCreditos;
    }

    public JButton getBtnHistoria() {
        return this.btnHistoria;
    }

    public JButton getBtnAzul() {
        return this.btnAzul;
    }

    public JButton getBtnVerde() {
        return this.btnVerde;
    }

    public JButton getBtnAmarillo() {
        return this.btnAmarillo;
    }

    public JButton getBtnRojo() {
        return this.btnRojo;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHistoria = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnAmarillo = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(768, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnHistoria.png"))); // NOI18N
        btnHistoria.setBorder(null);
        btnHistoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaActionPerformed(evt);
            }
        });
        btnHistoria.setOpaque(false);
        btnHistoria.setContentAreaFilled(false);
        btnHistoria.setBorderPainted(false);
        btnHistoria.setFocusPainted(false);
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 120, 120));

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnPlay.png"))); // NOI18N
        btnPlay.setBorder(null);
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        btnPlay.setOpaque(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setBorderPainted(false);
        btnPlay.setFocusPainted(false);
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, 110));

        btnAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnAzul.png"))); // NOI18N
        btnAzul.setBorder(null);
        btnAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulActionPerformed(evt);
            }
        });
        btnAzul.setOpaque(false);
        btnAzul.setContentAreaFilled(false);
        btnAzul.setBorderPainted(false);
        btnAzul.setFocusPainted(false);
        getContentPane().add(btnAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 110, 110));

        btnInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnInstrucciones.png"))); // NOI18N
        btnInstrucciones.setBorder(null);
        btnInstrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        btnInstrucciones.setOpaque(false);
        btnInstrucciones.setContentAreaFilled(false);
        btnInstrucciones.setBorderPainted(false);
        btnInstrucciones.setFocusPainted(false);
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 120, 120));

        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnInfo.png"))); // NOI18N
        btnCreditos.setBorder(null);
        btnCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        btnCreditos.setOpaque(false);
        btnCreditos.setContentAreaFilled(false);
        btnCreditos.setBorderPainted(false);
        btnCreditos.setFocusPainted(false);
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 120, 110));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 120, 120));

        btnVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnVerde.png"))); // NOI18N
        btnVerde.setBorder(null);
        btnVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });
        btnVerde.setOpaque(false);
        btnVerde.setContentAreaFilled(false);
        btnVerde.setBorderPainted(false);
        btnVerde.setFocusPainted(false);
        getContentPane().add(btnVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 110, 110));

        btnAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnAmarillo.png"))); // NOI18N
        btnAmarillo.setBorder(null);
        btnAmarillo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmarilloActionPerformed(evt);
            }
        });
        btnAmarillo.setOpaque(false);
        btnAmarillo.setContentAreaFilled(false);
        btnAmarillo.setBorderPainted(false);
        btnAmarillo.setFocusPainted(false);
        getContentPane().add(btnAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 110, 110));

        btnRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnRojo.png"))); // NOI18N
        btnRojo.setBorder(null);
        btnRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });
        btnRojo.setOpaque(false);
        btnRojo.setContentAreaFilled(false);
        btnRojo.setBorderPainted(false);
        btnRojo.setFocusPainted(false);
        getContentPane().add(btnRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 100, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistoriaActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAzulActionPerformed

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstruccionesActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAmarilloActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRojoActionPerformed

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
            java.util.logging.Logger.getLogger(GUInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmarillo;
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerde;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
