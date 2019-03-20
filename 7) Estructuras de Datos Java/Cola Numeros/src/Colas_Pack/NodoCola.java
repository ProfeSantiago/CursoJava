package Colas_Pack;

public class NodoCola {
    int Info;
    NodoCola Sgte;
    
    public NodoCola(int numero){ //Constructor de la clase
        Info = numero;
        Sgte = null;
    }//Fin Constructor ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    

     public static NodoCola Push(NodoCola Cola,int Num){
         /***********************************************************************
         * Función que inserta al final de la Lista (Cola)
         **********************************************************************/
        NodoCola Nuevo_Nodo = null;
        NodoCola Actual = null;
        Nuevo_Nodo = new NodoCola (Num);
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

     public static int Extrae(NodoCola Cola){
        /***********************************************************************
         * Función que extrae el primer elemento de la Lista (Cola)
         **********************************************************************/
        int Numero_Extraido = 0;
        if  (Cola != null)
            Numero_Extraido = Cola.Info;
        return Numero_Extraido;           // Devuelve el info del Nodo extraído
    }

     public static NodoCola Pop(NodoCola Cola){
        /***********************************************************************
         * Función que borra el primer elemento de la Lista (Cola)
         **********************************************************************/
        NodoCola Actual = Cola;
        if (Actual.Sgte != null){
            Cola = Actual.Sgte;
            Actual.Sgte = null;  //Se borra cualquier vínculo y se deja "Botado"
            //Ojo normalmente deberíamos buscar la forma de borrar esta variable
            //Pero podemos ser "descuidados" gracias al recolector de basura de Java
        }
        return Cola;           // Devuelve el info del Nodo extraído
}//Fin Pop ---------------------------------------------------------

}//Fin Clase NodoCola


