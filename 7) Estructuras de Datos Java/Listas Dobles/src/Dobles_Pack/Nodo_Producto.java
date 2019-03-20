/*************************************************************************
 * Listas Doblemente Enlazadas * Ing. Santiago Rodriguez Paniagua.
 **************************************************************************/
package Dobles_Pack;

import javax.swing.JOptionPane;

public class Nodo_Producto {
    Nodo_Producto Ante;
    Producto Info;
    Nodo_Producto Sigte;
    
    public Nodo_Producto(Producto Articulo){ //Constructor de la clase
        Ante = null;
        Info = new Producto(Articulo.Codigo,Articulo.Nombre,Articulo.Precio);
        Sigte = null;
    }//Fin Constructor ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public static int Comparacion(Nodo_Producto Nodo_Actual,String Producto_Buscado){
        int respuesta=0;
        if (Nodo_Actual != null) 
            respuesta= Nodo_Actual.Info.Nombre.compareTo(Producto_Buscado);    
            /******************************************************************* 
            * resultado es: 
            *         igual a cero, si Actual.Info.Nombre == Articulo.Nombre
            *         menor que cero, si Actual.Info.Nombre < Articulo.Nombre
            *         mayor que cero, si Actual.Info.Nombre > Articulo.Nombre 
            *******************************************************************/
        return respuesta;
    }//Fin  Comparacion ºººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public static Nodo_Producto Inserta_Producto(Nodo_Producto Lista,Producto Articulo){ 
        Nodo_Producto Nuevo_Nodo = null; 
        Nodo_Producto Anterior = null ; 
        Nodo_Producto Actual = null;    
        int resultado=0;                    // Usada para comparaciones    
        Nuevo_Nodo = new Nodo_Producto (Articulo);
        
        if (Lista == null)                  // Si la Lista está vacía
            Lista = Nuevo_Nodo;             // Se le asigna el Nuevo Nodo
        else{   
            Actual = Lista;                 // Apunta al principio de la Lista
            Anterior = null;                // Se asigna Null para no tener basura
            resultado = Comparacion(Actual,Articulo.Nombre);
            while (Actual != null && resultado < 0){ 
                                            // Mientras no llegue al final de la lista y 
                                            // Mientras: "Articulo.Nombre" sea menor a: "Actual.Info.Nombre" 
              Anterior = Actual;            // Apunta al nodo anterior
              Actual = Actual.Sigte;        // Avanza en la Lista
              resultado = Comparacion(Actual,Articulo.Nombre);
            }//Fin While
            if (Anterior == null){ 
              Nuevo_Nodo.Sigte = Lista;     // Nuevo_Nodo apunta al principio de la lista y
              Lista = Nuevo_Nodo;           // ahora la Lista apunta al Nuevo_Nodo,
                                            // O sea inserta al principio
            }else{
              Nuevo_Nodo.Ante = Anterior;                
              Nuevo_Nodo.Sigte = Actual;    // Nuevo_Nodo apunta a Actual y 
              Anterior.Sigte = Nuevo_Nodo;  // luego Actual apunta a Nuevo Nodo
            }//Fin segundo else
        }//Fin Primer else
            return Lista;// Devuelve la Lista con el Nuevo_Nodo ya insertado
}//Fin Inserta_Producto --------------------------------------------------------

public static Producto Busca_Producto(Nodo_Producto Lista, String llave_Busqueda){   
    Nodo_Producto Actual; 
    Actual = Lista;    
    int result = 0; // Usada para comparaciones
    result = Comparacion(Actual,llave_Busqueda);
    while (Actual != null && result != 0){   
        Actual = Actual.Sigte;
        result = Comparacion(Actual,llave_Busqueda);
    }//Fin While
    if (result != 0){//Si la variable result no es igual acero es porque no está
        JOptionPane.showMessageDialog(null, "no se encontro el Producto");        
        Actual.Info.Nombre ="no se encontro el Producto";
    }//Fin If
    if (Actual != null){return Actual.Info;}
    else{return null;}//Fin else
    }//Fin Busca_Producto ºººººººººººººººººººººººººººººººººººººººººººººººººººº     
    
}//Fin Clase Nodo_Producto
