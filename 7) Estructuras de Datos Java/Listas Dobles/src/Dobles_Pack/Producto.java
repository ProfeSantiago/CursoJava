/*************************************************************************
 * Listas Doblemente Enlazadas * Ing. Santiago Rodriguez Paniagua.
 **************************************************************************/
package Dobles_Pack;
public class Producto {
    String Codigo;
    String Nombre;
    int Precio;
    
    public Producto(String Codigo, String Nombre, int Precio){ //Constructor #1
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    
    public Producto(){ //Constructor #2
        Codigo = "";
        Nombre = "";
        Precio = 0;
    }

}
