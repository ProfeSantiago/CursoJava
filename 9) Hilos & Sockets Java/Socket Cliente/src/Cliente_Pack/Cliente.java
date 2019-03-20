package Cliente_Pack;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

class Cliente {
  static final String HOST = "localhost";
  static final int PUERTO=8080;
  
  public Cliente( ){//Constructor
    try{
      //Crea y Abre el Socket  
      Socket skCliente = new Socket( HOST , PUERTO ); 
      //Lee el flujo de Entrada que obtiene del Servidor
      InputStream aux = skCliente.getInputStream();
      DataInputStream flujo = new DataInputStream( aux );
      //Imprime en pantalla el texto leido del Servidor
      JOptionPane.showMessageDialog(null,flujo.readUTF());
      //Cierra el Socket
      skCliente.close(); 
    } catch( Exception e ) {
      System.out.println( e.getMessage() );
    }//catch
  }
}
