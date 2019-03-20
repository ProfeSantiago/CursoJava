/*************************************************************************
 *Estudiante.java
 *Ing. Santiago Rodríguez P.
 *Creado: 10 de octubre de 2007, 10:30 PM
 **************************************************************************/
package objetosjava;
public class Estudiante {
    
    String Cedula;
    String Nombre;
    String Telefono;
    //Se declara como privado para que no sea accesible
    private String Salario; 
    
    public Estudiante(String Cedula,String Nombre,String Telefono) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }
    
    //Este método es el unico modo de guardar el valor del salario
    public void Set_Salario(String Salario){
        this.Salario = Salario;
    }
    
    //Este método es el unico modo de obtener el valor del salario
    public String Get_Salario(){return Salario;}
}
