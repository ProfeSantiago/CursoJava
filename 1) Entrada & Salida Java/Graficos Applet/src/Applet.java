import java.awt.Graphics;    // import class Graphics
import javax.swing.*;  // import class JApplet

public class Applet extends java.applet.Applet {
    String nombre;
   public void init() {
      nombre = JOptionPane.showInputDialog("Digite su nombre: ");
    }
    public void paint( Graphics g )
   {
      super.paint( g );
      g.drawString( "Hola " + nombre + "!", 15, 50 );
      g.drawString( "Como estas??", 15, 65 );
      g.drawRect( 10, 35, 140, 35 );
      for ( int counter = 1; counter <= 10; counter++ ) 
         g.drawLine( 10, 10, 550, counter * 10 ); 
      
      int counter = 1;   // initialize counter

      do {
         g.drawOval( 180 - counter * 10, 180 - counter * 10,
            counter * 20, counter * 20 );
         ++counter;
      } while ( counter <= 10 );  // end do...while 
   } 
}
