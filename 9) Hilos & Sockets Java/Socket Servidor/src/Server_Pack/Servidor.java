package Server_Pack;
import java.io.* ;
import java.net.* ;

class Servidor {
  static final int PUERTO=8080;
  public Servidor( ) { // Constructor
    try {
      ServerSocket skServidor = new ServerSocket( PUERTO );
      // Abre Socke y acepta conexion
      Socket skCliente = skServidor.accept(); 
      // Crea el flujo de salida
      OutputStream aux = skCliente.getOutputStream();
      DataOutputStream flujo= new DataOutputStream( aux );
      // Escribe Mensaje a enviar
      flujo.writeUTF( "Hola cliente");
      // Cierra Socket
      skCliente.close();
    } catch( Exception e ) {
      System.out.println( e.getMessage() );
    }
  }
}

