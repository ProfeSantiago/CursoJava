package Ascensor;


import java.util.logging.Level;


import java.util.logging.Logger;


public class Hilote extends Thread{
  	Ascensor_Frm referencia;
  	
  	public Hilote(Ascensor_Frm applicacion){
  		referencia = applicacion;  		
  	}
  	 	
  	public void run(){
  	while(true){ 
            try {
                Thread.sleep(500);             
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilito.class.getName()).log(Level.SEVERE, null, ex);
            }
  	}
  	}
}
