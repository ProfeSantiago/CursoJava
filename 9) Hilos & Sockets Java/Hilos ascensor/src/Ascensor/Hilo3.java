package  Ascensor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo3 extends Thread{
Ascensor_Frm  referencia;

    public Hilo3(Ascensor_Frm applicacion){
    referencia = applicacion;    
    }
 public void run(){
  	while(true){ 
            try {
                Thread.sleep(500);
                referencia.Baja();
                Thread.sleep(500);
                referencia.Stat();               
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilito.class.getName()).log(Level.SEVERE, null, ex);
            }
  	}
  	}
}
