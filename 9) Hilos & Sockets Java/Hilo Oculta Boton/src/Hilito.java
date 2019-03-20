
import java.util.logging.Level;
import java.util.logging.Logger;
 class Hilito extends Thread{
  	Ventanita referencia;
  	
  	public Hilito(Ventanita applicacion){
  		referencia = applicacion;  		
  	}
  	 	
  	public void run(){
  	while(true){ 
            try {
                
                referencia.Oculta_Boton();
                Thread.sleep(500);
                referencia.Muestra_Boton();
                Thread.sleep(250);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilito.class.getName()).log(Level.SEVERE, null, ex);
            }
  	}
  	}
  }
