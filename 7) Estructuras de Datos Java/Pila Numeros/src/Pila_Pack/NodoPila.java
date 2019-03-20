package Pila_Pack;

public class NodoPila {
    int Info;
    NodoPila Sgte;
    
    public NodoPila(int numero){ //Constructor de la clase
        Info = numero;
        Sgte = null;
    }//Fin Constructor ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
     public static NodoPila Push(NodoPila Pila,int Num){
         /***********************************************************************
         * Función que inserta al final de la Lista (Pila)
         **********************************************************************/
        NodoPila Nuevo_Nodo = null;
        NodoPila Actual = null;
        Nuevo_Nodo = new NodoPila (Num);
        if (Pila == null)               // Si la Pila está vacía
            Pila = Nuevo_Nodo;          // Se le asigna el Nuevo Nodo
        else{
            Actual = Pila;              // Apunta al principio de la Pila
            while (Actual.Sgte != null){// Mientras no llegue al final de la Pila
              Actual = Actual.Sgte;     // Avanza en la Pila
            }//Fin While
            Actual.Sgte=Nuevo_Nodo;     // El final de la lista apunta a Nuevo_Nodo
        }//Fin Else
        return Pila;                    // Devuelve la Pila con el Nuevo_Nodo ya insertado
    }//Fin Push ---------------------------------------------------------

     public static int Extrae(NodoPila Pila){
        /***********************************************************************
         * Función que extrae el último elemento de la Lista (Pila)
         **********************************************************************/
        int Numero_Extraido = 0;
        NodoPila Actual = Pila;
        while (Actual.Sgte != null){     // Mientras no llegue al final de la Pila
              Actual = Actual.Sgte;     // Avanza en la Pila
        }//Fin While
        Numero_Extraido = Actual.Info;
        return Numero_Extraido;           // Devuelve el info del Nodo extraído
    }
     
     public static boolean BuscaNumero(NodoPila Pila,int numBuscado){
        /***********************************************************************
         * Función que busca un elemento en la Lista (Pila)
         **********************************************************************/
        boolean encontrado = false;
        NodoPila Actual = Pila;
        
        while (Actual != null){     // Mientras no llegue al final de la Pila   
            
            if (Actual.Info == numBuscado){
                encontrado = true;
            }
            Actual = Actual.Sgte;     // Avanza en la Pila
            
        }
        return encontrado;           
    } 

     public static NodoPila Pop(NodoPila Pila){
        /***********************************************************************
         * Función que borra el primer elemento de la Lista (Pila)
         **********************************************************************/
        NodoPila Actual = Pila;
        NodoPila Anterior = null;
        while (Actual.Sgte != null){     // Mientras no llegue al final de la Pila
            Anterior = Actual;
            Actual = Actual.Sgte;     // Avanza en la Pila
        }//Fin While
        if (Anterior.Sgte != null){
            Anterior.Sgte = null;  //Se borra cualquier vínculo y se deja "Botado"
            //Ojo normalmente deberíamosbuscar la forma de borrar esta variable
            //Pero podemos ser "descuidados" gracias al recolector de basura de Java
        }
        return Pila;           // Devuelve el info del Nodo extraído
}//Fin Pop ---------------------------------------------------------

}//Fin Clase NodoPila


