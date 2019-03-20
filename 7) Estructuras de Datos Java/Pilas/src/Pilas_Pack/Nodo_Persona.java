package Pilas_Pack;
public class Nodo_Persona {
    Persona Info;
    Nodo_Persona Sgte;
    
    public Nodo_Persona(Persona Alguien){ //Constructor de la clase
        Info = new Persona(Alguien.Cedula,Alguien.Nombre,Alguien.Telefono);
        Sgte = null;
    }//Fin Constructor ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    
    public static Nodo_Persona Push(Nodo_Persona Pila,Persona Quien_sea){ 
        /***********************************************************************
         * Función que inserta al final de la Lista (Pila)
         **********************************************************************/
        Nodo_Persona Nuevo_Nodo = null;  
        Nodo_Persona Actual = null;      
        Nuevo_Nodo = new Nodo_Persona (Quien_sea);
        if (Pila == null)               // Si la Pila está vacía
            Pila = Nuevo_Nodo;          // Se le asigna el Nuevo Nodo
        else{          
            Actual = Pila;              // Apunta al principio de la Pila
            while (Actual.Sgte != null){ 
                                        // Mientras no llegue al final de la Pila 
              Actual = Actual.Sgte;     // Avanza en la Pila
            }//Fin While
            Actual.Sgte=Nuevo_Nodo;     // El final de la lista apunta a Nuevo_Nodo      
        }//Fin Else
        return Pila;                    // Devuelve la Pila con el Nuevo_Nodo ya insertado
    }//Fin Push ---------------------------------------------------------
  
    public static Persona Pop(Nodo_Persona Pila){ 
        /***********************************************************************
         * Función que extrae y borra el úlimo elemento de la Lista (Pila)
         **********************************************************************/
        Nodo_Persona Actual = Pila; 
        Nodo_Persona Anterior = null; 
        Persona Persona_Extraida;         
        while (Actual.Sgte != null){ 
        // Mientras no llegue al final de la Pila 
          Anterior = Actual;
          Actual = Actual.Sgte; // Avanza en la Pila
        }//Fin While   
        Persona_Extraida = Actual.Info;
        if (Anterior != null){
            Anterior.Sgte = null; //Se borra cualquier vínculo y se deja "Botado"
            //Ojo normalmente deberíamos buscar la forma de borrar esta variable
            //Pero podemos ser "descuidados" gracias al recolector de basura de Java
        }        
        return Persona_Extraida;           // Devuelve el info del Nodo extraído
}//Fin Pop ---------------------------------------------------------
}//Fin Clase Nodo_Persona


