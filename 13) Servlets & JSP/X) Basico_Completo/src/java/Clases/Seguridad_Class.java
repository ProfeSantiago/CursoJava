/*******************************************************************************
 * ing. Santiago Rodríguez Paniagua 21/10/2008
 ******************************************************************************/
package Clases;
public class Seguridad_Class {
    //------------------------------------
    //Declaración de Variables
        String Name;
        String Password;
    //------------------------------------    
        
     public Seguridad_Class(String Name,String Password){
        this.Name=Name;
        this.Password=Password;
     }
     
     public boolean validar(String Nam,String Pass) {
        if (Nam.equals(Name) == true && Pass.equals(Password) == true){
            return true;
        }else{
            return false;
        }//Fin If                  
     }
}
