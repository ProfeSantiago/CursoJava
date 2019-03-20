package Listas_Pack;
import javax.swing.JOptionPane;
public class Nodo_Persona {
    Persona Info;
    Nodo_Persona Sgte;
    
    public Nodo_Persona(Persona Alguien){ //Constructor de la clase
        Info = new Persona(Alguien.Cedula,Alguien.Nombre,Alguien.Telefono);
        Sgte = null;
    }//Fin Constructor ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public static int Comparacion(Nodo_Persona Nodo_Actual,String Persona_Buscada){
        int respuesta=0;
        if (Nodo_Actual != null) 
            respuesta= Nodo_Actual.Info.Nombre.compareTo(Persona_Buscada);    
            /******************************************************************* 
            * resultado es: 
            *         igual a cero, si Actual.Info.Nombre == Quien_sea.Nombre
            *         menor que cero, si Actual.Info.Nombre < Quien_sea.Nombre
            *         mayor que cero, si Actual.Info.Nombre > Quien_sea.Nombre 
            *******************************************************************/
        return respuesta;
    }//Fin  Comparacion ºººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public static Nodo_Persona Inserta_Persona(Nodo_Persona Lista,Persona Quien_sea){ 
    
    Nodo_Persona Nuevo_Nodo = null; 
    Nodo_Persona Anterior = null ; 
    Nodo_Persona Actual = null;
    
    int resultado=0;    // Usada para comparaciones
    
    Nuevo_Nodo = new Nodo_Persona (Quien_sea);
        
if (Lista == null)      // Si la Lista está vacía
    Lista = Nuevo_Nodo; // Se le asigna el Nuevo Nodo
else{   
    Actual = Lista;     // Apunta al principio de la Lista
    Anterior = null;    // Se asigna Null para no tener basura
    
    resultado = Comparacion(Actual,Quien_sea.Nombre);
    
    
    while (Actual != null && resultado < 0){ 
    // Mientras no llegue al final de la lista y 
    // Mientras: "Quien_sea.Nombre" sea menor a: "Actual.Info.Nombre" 
        
      Anterior = Actual;    // Apunta al nodo anterior
      Actual = Actual.Sgte; // Avanza en la Lista
      
      resultado = Comparacion(Actual,Quien_sea.Nombre);

    }//Fin While

    if (Anterior == null){      
                                
      Nuevo_Nodo.Sgte = Lista;  // Nuevo_Nodo apunta al principio de la lista y
      Lista = Nuevo_Nodo;       // ahora la Lista apunta al Nuevo_Nodo,
                                // O sea inserta al principio
    }else{ 
        
      Nuevo_Nodo.Sgte = Actual;     // Nuevo_Nodo apunta a Actual y 
      Anterior.Sgte = Nuevo_Nodo;   // luego Actual apunta a Nuevo Nodo
      
    }//Fin segundo else
}//Fin Primer else
    return Lista;           // Devuelve la Lista con el Nuevo_Nodo ya insertado
}//Fin Inserta_Persona ---------------------------------------------------------
  

public static Persona Consulta_Persona(Nodo_Persona Lista, String llave_Busqueda){   
    Nodo_Persona Actual; 
    Actual = Lista;
    
    int result = 0; // Usada para comparaciones
    result = Comparacion(Actual,llave_Busqueda);

    while (Actual != null && result != 0){   
        Actual = Actual.Sgte;
        result = Comparacion(Actual,llave_Busqueda);
    }//Fin While

    if (result != 0) //Si la variable result no es igual acero es porque no está
        JOptionPane.showMessageDialog(null, "no se encontro la persona");        //Actual.Info.Nombre ="no se encontro la persona";

    if (Actual != null){
      return Actual.Info;      
    }else{
      return null;
    }//Fin else
    }//Fin Consulta_Persona ºººººººººººººººººººººººººººººººººººººººººººººººººººº 

}//Fin Clase Nodo_Persona


