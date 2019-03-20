package MessengerPack;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Socket_Cliente {   
    /***************************************
     *    Declaración de Variables          *
     ****************************************/
    private Socket Socket_Cliente;
    private InputStream Entrada;
    private DataInputStream Flujo_Entrada;
    static final String HOST =  "localhost";
    static final int PUERTO=8080;
    private String Mensaje;
    //***************************************

    public void Conectar(){
      try{
            //Crea y Abre el Socket
            Socket_Cliente = new Socket( HOST , PUERTO );
            Mensaje = "";
        } catch( Exception e ) {
            System.out.println( e.getMessage() );
        }//catch
    }//Conectar_con_Server -------------------------------------------------------

    public Socket_Cliente(){
        Conectar();
    }//Fin Constructor

    public String Get_Mensaje(){
      return Mensaje;
    }

    public void Limpia_Mensaje(){
        Mensaje="";
    }
    public void Recibe_Mensaje(){
        try {
            //Lee el flujo de Entrada que obtiene del Servidor
            Entrada = Socket_Cliente.getInputStream();
            Flujo_Entrada = new DataInputStream(Entrada);
            //Captura el texto leido del Servidor
            Mensaje =Flujo_Entrada.readUTF();
        } catch (IOException ex) {
            Logger.getLogger(Socket_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin Recibe_Mensaje
  
    public void Desconecta(){ // Cierra Socket
        try {// Cierra Socket
            Socket_Cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(Socket_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin Desconecta
    
}//Fin Socket_Cliente
