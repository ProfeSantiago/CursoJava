import java.awt.*;
import javax.swing.*;

public class Factorial extends JApplet {
   JTextArea areaSalida;
   public void init()
   {
      areaSalida = new JTextArea();
      Container contenedor = getContentPane();
      contenedor.add( areaSalida );

      // calcular los factoriales de 0 hasta 10
      for ( long contador = 0; contador <= 10; contador++ )
         areaSalida.append( contador + "! = " +
            factorial( contador ) + "\n" );
   }

   public long factorial( long numero )
   {                  
      if ( numero <= 1 )  
         return 1;
      else                
         return numero * factorial( numero - 1 );
   }
} 
