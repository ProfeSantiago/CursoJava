/************************************************
 * Principal.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 27 de marzo de 2008, 12:41 PM
 ************************************************/

package Paquete_Formularios;

import Paquete_Clases.*;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    
    //***************************************
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Articulos_Btn = new javax.swing.JToggleButton();
        Facturacion_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Articulos_Btn.setText("Articulos");
        Articulos_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Articulos_BtnActionPerformed(evt);
            }
        });

        Facturacion_Btn.setText("Facturación");
        Facturacion_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Facturacion_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Articulos_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(Facturacion_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Articulos_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Facturacion_Btn)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Articulos_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Articulos_BtnActionPerformed
        //this.dispose();
        new Strings_Frm().setVisible(true);
}//GEN-LAST:event_Articulos_BtnActionPerformed

    private void Facturacion_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Facturacion_BtnActionPerformed
        new Archivos_Frm().setVisible(true);
}//GEN-LAST:event_Facturacion_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Articulos_Btn;
    private javax.swing.JButton Facturacion_Btn;
    // End of variables declaration//GEN-END:variables
    
}
