
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
 class Hilito extends Thread{
  	Ventanita referencia;
        javax.swing.JButton miBoton;
        Random Aleatorio = new Random();
        int menor = 10;
        int mayor = 250;
        int miRandom = 0;
  	
  	public Hilito(Ventanita applicacion, javax.swing.JButton elBoton ){
  		referencia = applicacion;  
                miBoton = elBoton;
  	}
  	 	
  	public void run(){
  	while(true){ 
            try {
                miRandom = Aleatorio.nextInt(mayor-menor) + menor;               
                Thread.sleep(miRandom);
                referencia.Mueve_Boton(miBoton);         
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilito.class.getName()).log(Level.SEVERE, null, ex);
            }
  	}
  	}
  }
