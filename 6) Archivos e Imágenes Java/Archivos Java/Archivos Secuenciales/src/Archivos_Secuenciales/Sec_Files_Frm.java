/*************************************************************************
 * ARCHIVOS SECUENCIALES - Ing. Santiago Rodrํguez P.
 * Creado: 22 de octubre de 2007, 11:54 PM
 **************************************************************************/
package Archivos_Secuenciales;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class Sec_Files_Frm extends javax.swing.JFrame {
    
    public Sec_Files_Frm() {
        initComponents();
    }
    //------------------------------------------------
    //Declaraci๓n de Variables
    //------------------------------------------------
    //Creamos un fujo de datos
    private DataOutputStream Flujo_Salida;
    //Creamos un fujo de entrada a disco
    private DataInputStream Flujo_Entrada;
        
    public void Crear_Archivo(){
        try {
            /* บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ 
             * El fujo de salida ObjectOutputStream es el que procesa 
             * los datos y se ha de vincular a un objeto fileOut de la 
             * clase FileOutputStream 
             * บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ */
            Flujo_Salida = new DataOutputStream(new FileOutputStream("XQ24.txt"));
         }// procesar excepciones que pueden ocurrir al abrir el archivo
         catch ( IOException excepcionES ) {
            JOptionPane.showMessageDialog( this, "Error al abrir el archivo", 
               "Error", JOptionPane.ERROR_MESSAGE );
         }  
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
    
    public void Cerrar_Flujo_Salida(){
        try {
         Flujo_Salida.close();
      }// procesar excepciones que pueden ocurrir al cerrar el archivo 
      catch( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, "Error al cerrar el archivo", 
            "Error", JOptionPane.ERROR_MESSAGE );
      }
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
    
    public void Escribir_Archivo(String Texto){
        try {
            Flujo_Salida.writeUTF(Texto);
            //Flujo_Salida.writeInt(123); // Solo de demostraci๓n
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
    
    public void Leer_Archivo(){ 
        try {
            Nombre_Txt.setText(Flujo_Entrada.readUTF());
        } catch (IOException ex) {
            Logger.getLogger(Sec_Files_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ 

    public void Cerrar_Flujo_Entrada()
   {
      try {
         Flujo_Entrada.close();
      }// procesar excepci๓n que puede ocurrir mientras se cierra el archivo
      catch ( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, "Error al cerrar el archivo",
            "Error", JOptionPane.ERROR_MESSAGE );
      }
   }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ 
    
    public void Abrir_Archivo(){
         try {
            /* บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ 
             * El fujo de entrada ObjectOutputStream es el que procesa 
             * los datos y se ha de vincular a un objeto fileIn de la 
             * clase FileInputStream 
             * บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ */
 
            Flujo_Entrada = new DataInputStream(new FileInputStream("XQ24.txt"));
         }// procesar excepciones que pueden ocurrir al abrir el archivo
         catch ( IOException excepcionES ) {
            JOptionPane.showMessageDialog( this, "Error al abrir el archivo", 
               "Error", JOptionPane.ERROR_MESSAGE );
         }  
    }//บบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบบ
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre_Txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Guardar_Btn = new javax.swing.JButton();
        Salir_Btn = new javax.swing.JButton();
        Abrir_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite su Nombre:");

        Guardar_Btn.setText("Guardar");
        Guardar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_BtnActionPerformed(evt);
            }
        });

        Salir_Btn.setText("Salir");
        Salir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_BtnActionPerformed(evt);
            }
        });

        Abrir_Btn.setText("Abrir");
        Abrir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nombre_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir_Btn, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Abrir_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Guardar_Btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar_Btn)
                    .addComponent(Abrir_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir_Btn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Abrir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_BtnActionPerformed
        Abrir_Archivo();
        Leer_Archivo();
        Cerrar_Flujo_Entrada();
    }//GEN-LAST:event_Abrir_BtnActionPerformed

    private void Salir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_BtnActionPerformed
        System.exit( 0 );
    }//GEN-LAST:event_Salir_BtnActionPerformed

    private void Guardar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_BtnActionPerformed
        Crear_Archivo();
        Escribir_Archivo(Nombre_Txt.getText());//Esta linea se repite para guardar varias lineas en el archivo
        Cerrar_Flujo_Salida();
        Nombre_Txt.setText("");
    }//GEN-LAST:event_Guardar_BtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sec_Files_Frm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir_Btn;
    private javax.swing.JButton Guardar_Btn;
    private javax.swing.JTextField Nombre_Txt;
    private javax.swing.JButton Salir_Btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
