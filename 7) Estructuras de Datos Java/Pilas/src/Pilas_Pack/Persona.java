/*************************************************************************
 * Ing. Santiago Rodriguez Paniagua. Creado: 10 de Mayo de 2008, 10:30 PM
 **************************************************************************/
package Pilas_Pack;
public class Persona {
    
    String Cedula;
    String Nombre;
    String Telefono;
    
    //Constructor #1
    public Persona(String Cedula,String Nombre,String Telefono) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }
    
    //Constructor #2
    public Persona() {
        Cedula =  new String();
        Nombre =  new String();
        Telefono =  new String();
    }
}
