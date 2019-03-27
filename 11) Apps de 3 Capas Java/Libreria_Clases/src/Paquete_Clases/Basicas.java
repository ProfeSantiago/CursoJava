/*****************************************************************
 * Funciones Basicas - Ing.Santiago Rodríguez Paniagua
 * Created 21 de Marzo de 2008, 09:35 AM
 *****************************************************************/
package Paquete_Clases;
import javax.swing.JOptionPane;
public class Basicas {   
    public Basicas(){//Constructor de la clase
    }//Constructor

    public void Mensaje(String Texto){
        JOptionPane.showMessageDialog(null,Texto);
    }//Fin Mensaje
    
    public String Ultima_Letra(String Texto){
        return String.valueOf(Texto.charAt(Texto.length()-1));
    }// Fin Ultima_Letra
    
    public String Primera_Letra(String Texto){
        return String.valueOf(Texto.charAt(0));
    }//Fin Primera_Letra
    
    public String Al_Reves(String Texto){
        String alreves = "";
        for (int i = Texto.length() - 1; i >=0; i--){
            alreves = alreves + String.valueOf(Texto.charAt(i));
        }    
        return alreves;
    }//Fin Al_Reves
    
    public String Mayuscula(String Texto){
        return Texto.toUpperCase();
    }//Fin Mayuscula
    
    public String Minuscula(String Texto){
        return Texto.toLowerCase();
    }//Fin Minuscula
            
    public String Largo(String Texto){
        return String.valueOf(Texto.length());
    }//Fin Largo
    
    public String Texto_Apartirde(String Texto, String Pos){
        int posicion=0;
        posicion = Integer.valueOf(Pos);
        return Texto.substring(posicion);
    }//Fin Texto_Apartirde 
    
    public String Busca_Pos_Letra(String Texto, String Letra){
        return String.valueOf(Texto.indexOf(Letra)+1);
    }//Fin Busca_Pos_Letra 
    
     public String Cambia_Letras(String Texto, String Original, String Nueva){
        return Texto.replace(Original,Nueva);
    }//Fin Busca_Pos_Letra 
    
}//Fin class Funciones_Basicas
