import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Fibonacci extends JApplet implements ActionListener {
   JLabel numeroEtiqueta, resultadoEtiqueta;
   JTextField numeroCampo, resultadoCampo;

   public void init()
   {
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );
      numeroEtiqueta = new JLabel( "Escriba un entero y presione Enter" );
      contenedor.add( numeroEtiqueta );      
      numeroCampo = new JTextField( 10 );
      contenedor.add( numeroCampo );
      numeroCampo.addActionListener( this );
      resultadoEtiqueta = new JLabel( "El valor de Fibonacci es" );
      contenedor.add( resultadoEtiqueta );
      resultadoCampo = new JTextField( 15 );
      resultadoCampo.setEditable( false );
      contenedor.add( resultadoCampo );

   } 
   
   public void actionPerformed( ActionEvent event )
   {  
      long numero, valorFibonacci;
      numero = Long.parseLong( numeroCampo.getText() );
      showStatus( "Calculando ..." ); 
      valorFibonacci = fibonacci( numero );
      showStatus( "Listo." );   
      resultadoCampo.setText( Long.toString( valorFibonacci ) );

   }
   
   public long fibonacci( long n )
   {
      if ( n == 0 || n == 1 )  
         return n;
      else
         return fibonacci( n - 1 ) + fibonacci( n - 2 );
   }
}