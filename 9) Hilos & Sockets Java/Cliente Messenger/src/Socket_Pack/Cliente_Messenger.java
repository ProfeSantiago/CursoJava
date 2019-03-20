/************************************************
 * Cliente_Messenger.java
 * @author Ing.  Santiago Rodríguez Paniagua
 * Created on 26 de marzo de 2008, 11:37 PM
 ************************************************/
package Socket_Pack;
import java.io.*;
import java.net.*;
import javax.swing.SwingUtilities;
public class Cliente_Messenger extends javax.swing.JFrame {
    public Cliente_Messenger() {
        initComponents();
    }
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    private Socket Socket_Cliente;
    private ObjectInputStream Entrada;
    private ObjectOutputStream Salida;
    static final String HOST =  "localhost";
    static final int PUERTO=8080;  
    String Mensaje;
    //***************************************
    
    private void Recibe_Mensaje(){
       try {
           //Lee el flujo de Entrada que obtiene del Cliente
           Entrada = new ObjectInputStream(Socket_Cliente.getInputStream());
           do {
               Mensaje = Entrada.readUTF() + Entrada.readUTF();
               Muestra_Mensaje();
           } while (!(Mensaje.equals("Servidor: Terminar")));
       } catch (IOException iOException) { }
       finally{
           Desconecta_Cliente();
           //System.exit(0);
       }
  }//Lee_Mensaje ---------------------------------------------------------------
  
  public void Conectar_con_Server(){
      try{
            //Crea y Abre el Socket  
            Socket_Cliente = new Socket( HOST , PUERTO ); 
            Mensaje="Cliente Conectado";
            Envia_Mensaje();            
        } catch( Exception e ) {
            System.out.println( e.getMessage() );
        }//catch      
  }//Conectar_con_Server -------------------------------------------------------
    
  private void Ejecutar_Cliente(){
      try {
          Conectar_con_Server();
          Recibe_Mensaje();
      } catch (Exception exception) {}
      finally{
            Desconecta_Cliente();
            //System.exit(0);
      }  
  }//Ejecutar_Servidor ---------------------------------------------------------

  private void Envia_Mensaje(){ 
        try {//Envia el flujo de Salida al Cliente
            Salida = new ObjectOutputStream(Socket_Cliente.getOutputStream());
            Salida.writeUTF("Cliente: ");// Escribe Mensaje
            Salida.flush();
            Salida.writeUTF(Mensaje);// Escribe Mensaje
            Salida.flush();
        } catch (IOException iOException) { }
       Mensaje = ""; 
  }//Envia_Mensaje -------------------------------------------------------------
  
  private void Desconecta_Cliente(){ // Cierra Socket
      try {
          Entrada.close();
          Salida.close();
          Socket_Cliente.close();
      } catch (IOException iOException) { }
  }//Desconecta
    
    private void Muestra_Mensaje(){
        SwingUtilities.invokeLater(
        new Runnable(){//Clase interna
            public void run(){
                if (!(Mensaje.equals(""))){
                Lista_Mensajes.add( Mensaje);
                Mensaje = "";
            }//If 
            }//run             
        }//Runnable           
        );//Fin de SwingUtilities.invokeLater(
    }// Muestra_Enviados -------------------------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Send_txt = new javax.swing.JTextField();
        Enviar_Btn = new javax.swing.JButton();
        Lista_Mensajes = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("-Cliente- Messenger");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Mensaje a Enviar:");

        Send_txt.setText("Terminar");

        Enviar_Btn.setText("Enviar");
        Enviar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviar_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lista_Mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Send_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enviar_Btn)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lista_Mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enviar_Btn)
                    .addComponent(Send_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void Enviar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviar_BtnActionPerformed
        try {
          Conectar_con_Server();
          Mensaje = Send_txt.getText();
          Envia_Mensaje();
          Send_txt.setText("");
        } catch (Exception exception) {}
        finally{
            Desconecta_Cliente();
            System.exit(0);
        }  
    }//GEN-LAST:event_Enviar_BtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Ejecutar_Cliente();
    }//GEN-LAST:event_formWindowOpened
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_Messenger().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar_Btn;
    private java.awt.List Lista_Mensajes;
    private javax.swing.JTextField Send_txt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
