package Listas_Pack;

public class Nodo {
    int Info;
    Nodo Sgte; //Este es nuestro puntero Siguiente
    
    public Nodo(int numero){ //Constructor de la clase
        Info = numero;
        Sgte = null;
    }//Fin Constructor ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public static Nodo Inserta_Numero(Nodo Lista,int Num){
    //Creamos los nodos necesarios para recorrer la Lista
    Nodo Nuevo_Nodo = null;
    Nodo Anterior = null ;
    Nodo Actual = null;
    
    Nuevo_Nodo = new Nodo (Num); //Llamamos al constructor para crear un nuevo nodo
        
if (Lista == null)      // Si la Lista está vacía
    Lista = Nuevo_Nodo; // Se le asigna el Nuevo Nodo
else{   
    Actual = Lista;     // Apunta al principio de la Lista
    Anterior = null;    // Se asigna Null para no tener basura    
    
    while (Actual != null && Actual.Info < Num){
    // Mientras no llegue al final de la lista y 
    // Mientras: "Quien_sea.Nombre" sea menor a: "Actual.Info.Nombre" 
        
      Anterior = Actual;    // Apunta al nodo anterior
      Actual = Actual.Sgte; // Avanza en la Lista

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
}//Fin Inserta_Numero ---------------------------------------------------------

}//Fin Clase Nodo


