package Colas_Pack;
public class Nodo_Persona {
    Persona Info;
    Nodo_Persona Sgte;
    
    public Nodo_Persona(Persona Alguien){ //Constructor de la clase
        Info = new Persona(Alguien.Cedula,Alguien.Nombre,Alguien.Telefono);
        Sgte = null;
    }//Fin Constructor ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public static Nodo_Persona Push(Nodo_Persona Cola,Persona Quien_sea){ 
         /***********************************************************************
         * Función que inserta al final de la Lista (Cola)
         **********************************************************************/
        Nodo_Persona Nuevo_Nodo = null;  
        Nodo_Persona Actual = null;      
        Nuevo_Nodo = new Nodo_Persona (Quien_sea);
        if (Cola == null)               // Si la Cola está vacía
            Cola = Nuevo_Nodo;          // Se le asigna el Nuevo Nodo
        else{          
            Actual = Cola;              // Apunta al principio de la Cola
            while (Actual.Sgte != null){ 
                                        // Mientras no llegue al final de la Cola 
              Actual = Actual.Sgte;     // Avanza en la Cola
            }//Fin While
            Actual.Sgte=Nuevo_Nodo;     // El final de la lista apunta a Nuevo_Nodo      
        }//Fin Else
        return Cola;                    // Devuelve la Cola con el Nuevo_Nodo ya insertado
    }//Fin Push ---------------------------------------------------------
  
    
    public static Nodo_Persona Push_Principio(Nodo_Persona Cola,Persona Quien_sea){ 
        /***********************************************************************
         * Función que inserta al principio de la Lista (Cola)
         **********************************************************************/
        Nodo_Persona Nuevo_Nodo = null;      
        Nuevo_Nodo = new Nodo_Persona (Quien_sea);
        if (Cola == null)               // Si la Cola está vacía
            Cola = Nuevo_Nodo;          // Se le asigna el Nuevo Nodo
        else{          
            Nuevo_Nodo.Sgte=Cola;       // El siguiente de Nuevo_Nodo apunta a la Cola
            Cola = Nuevo_Nodo;
        }//Fin Else
        return Cola;                    // Devuelve la Cola con el Nuevo_Nodo ya insertado
    }//Fin Push ---------------------------------------------------------
  
    public static Persona Extrae(Nodo_Persona Cola){ 
        /***********************************************************************
         * Función que extrae el primer elemento de la Lista (Cola)
         **********************************************************************/
        Persona Persona_Extraida = new Persona(); 
        if  (Cola != null)
            Persona_Extraida = Cola.Info;
        return Persona_Extraida;           // Devuelve el info del Nodo extraído
    }
    
    public static Nodo_Persona Pop(Nodo_Persona Cola){ 
        /***********************************************************************
         * Función que borra el primer elemento de la Lista (Cola)
         **********************************************************************/
        Nodo_Persona Actual = Cola;
        if (Actual.Sgte != null){
            Cola = Actual.Sgte;
            Actual.Sgte = null;  //Se borra cualquier vínculo y se deja "Botado"
            //Ojo normalmente deberíamosbuscar la forma de borrar esta variable
            //Pero podemos ser "descuidados" gracias al recolector de basura de Java            
        } 
        return Cola;           // Devuelve el info del Nodo extraído
}//Fin Pop ---------------------------------------------------------
}//Fin Clase Nodo_Persona


