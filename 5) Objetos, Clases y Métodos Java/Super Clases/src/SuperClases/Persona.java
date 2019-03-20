package SuperClases;
//Definición de la Super Clase
public class Persona {
    //Variables declaradas como protected
    //para que sean accesibles para las sub clases
    protected String Cedula, Nombre, Telefono;
    
    //Constructor #1 sin argumentos
    public Persona() {
        //Llamada implicita del constructor
    }
    
    //Constructor #2 "Normal" de la Super Clase
    public Persona(String Ced,String Nom,String Tel) {
            Cedula = Ced;
            Nombre = Nom;
            Telefono = Tel;
    }
}
