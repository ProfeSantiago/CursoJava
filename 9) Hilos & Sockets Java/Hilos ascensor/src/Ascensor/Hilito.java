
package Ascensor;

import java.util.logging.Level;
import java.util.logging.Logger;
 class Hilito extends Thread{
  	Ascensor_Frm referencia;
  	
 public Hilito(Ascensor_Frm applicacion){
  
     referencia = applicacion;  		
  	}
  	 	

 public void run(){
  	while(true){ 
            try {
                Thread.sleep(500);
                referencia.Sube();
                Thread.sleep(500);
                referencia.Stat2();               
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilito.class.getName()).log(Level.SEVERE, null, ex);
            }
  	}
  	}
}