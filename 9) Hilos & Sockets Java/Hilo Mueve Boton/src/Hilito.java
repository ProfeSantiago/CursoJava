
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
                Thread.sleep(250);
                referencia.Mueve_Boton();         
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilito.class.getName()).log(Level.SEVERE, null, ex);
            }
  	}
  	}
  }
