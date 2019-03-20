package MessengerPack;
import java.io.* ;
import java.net.* ;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Socket_Server {

     /***************************************
     *    Declaración de Variables          *
     ****************************************/
    private Socket Socket_Cliente;
    private ServerSocket Socket_Servidor;
    private OutputStream Salida;
    private DataOutputStream Flujo_Salida;
    static final int PUERTO=8080;
    String Mensaje;
    //***************************************

    public void Conectar(){
      try {
          Socket_Servidor = new ServerSocket( PUERTO );
          // Abre Socket y acepta conexion
          Socket_Cliente = Socket_Servidor.accept();
        } catch( Exception e ) {
            System.out.println( e.getMessage() );
        }//Catch
    }//Conectar ------------------------------------------------------------------

    public Socket_Server(){
        Conectar();
    }//Fin Constructor

    public void Set_Mensaje(String Mensaje){
      this.Mensaje = Mensaje;
    }

  public void Envia_Mensaje(){
        try {
            // Crea el flujo de salida
            Salida = Socket_Cliente.getOutputStream();
            Flujo_Salida = new DataOutputStream(Salida);
            // Escribe Mensaje
            Flujo_Salida.writeUTF(Mensaje);
        } catch (IOException ex) {
            Logger.getLogger(Socket_Server.class.getName()).log(Level.SEVERE, null, ex);
        }//Catch
  }//Fin Envia_Mensaje

  public void Desconecta(){ // Cierra Socket
        try {
            Socket_Cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(Socket_Server.class.getName()).log(Level.SEVERE, null, ex);
        }//Fin Catch
  }//Fin Desconecta

}//Socket_Server
