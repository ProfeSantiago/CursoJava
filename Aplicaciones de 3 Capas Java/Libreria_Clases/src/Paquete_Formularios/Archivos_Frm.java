/************************************************
 * Archivos_Frm.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 6 de abril de 2008, 09:43 AM
 ************************************************/
package Paquete_Formularios;
import Paquete_Clases.Archivos;
public class Archivos_Frm extends javax.swing.JFrame {
    public Archivos_Frm() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    Archivos MiArchivo = new Archivos();
    //***************************************
    
    public void Limpiador(){
        Cedula_txt.setText("");
        Nombre_txt.setText("");
        Edad_txt.setText("");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Archivo_txt = new javax.swing.JTextField();
        Cedula_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Guarda_Btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Nombre_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Edad_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Abrir_Btn = new javax.swing.JButton();
        Liimpiar_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Nombre del Archivo:");

        Archivo_txt.setText("Archivo.txt");

        jLabel2.setText("Cedula:");

        Guarda_Btn.setText("Guardar");
        Guarda_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guarda_BtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad:");

        Abrir_Btn.setText("Abrir");
        Abrir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_BtnActionPerformed(evt);
            }
        });

        Liimpiar_Btn.setText("Limpiar");
        Liimpiar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Liimpiar_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Abrir_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Liimpiar_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Archivo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Guarda_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Abrir_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Liimpiar_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Archivo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guarda_Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void Abrir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_BtnActionPerformed
        MiArchivo.Abrir_Archivo(Archivo_txt.getText());
        Cedula_txt.setText(MiArchivo.Leer_Texto());
        Nombre_txt.setText(MiArchivo.Leer_Texto());
        Edad_txt.setText(String.valueOf(MiArchivo.Leer_Numero()));
        MiArchivo.Cerrar_Flujo_Entrada();        
    }//GEN-LAST:event_Abrir_BtnActionPerformed

    private void Guarda_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guarda_BtnActionPerformed
        MiArchivo.Crear_Archivo(Archivo_txt.getText());
        MiArchivo.Escribir_Texto(Cedula_txt.getText());
        MiArchivo.Escribir_Texto(Nombre_txt.getText());
        MiArchivo.Escribir_Numero(Integer.valueOf(Edad_txt.getText()));
        MiArchivo.Cerrar_Flujo_Salida();
        Limpiador();
    }//GEN-LAST:event_Guarda_BtnActionPerformed

    private void Liimpiar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Liimpiar_BtnActionPerformed
        Limpiador();
}//GEN-LAST:event_Liimpiar_BtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivos_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir_Btn;
    private javax.swing.JTextField Archivo_txt;
    private javax.swing.JTextField Cedula_txt;
    private javax.swing.JTextField Edad_txt;
    private javax.swing.JButton Guarda_Btn;
    private javax.swing.JButton Liimpiar_Btn;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}
