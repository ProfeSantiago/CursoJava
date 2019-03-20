package SuperClases;
/* Definición de la Super Clase como Abstracta para que solo pueda 
 * ser utilizada unicamente para proveer una Super Clase apropiada
 * para que la hereden otras Sub Clases (no puede ser instanciada)
 */
public abstract class Persona {
    //Variables declaradas como protected
    //para que sean accesibles para las sub clases
    protected String Cedula, Nombre, Telefono;
    
    //Constructor #1 sin argumentos
    public Persona() {
        //Llamada implicita del constructor
    }
    
    //Constructor #2 de la Super Clase
    public Persona(String Ced,String Nom,String Tel) {
            Cedula = Ced;
            Nombre = Nom;
            Telefono = Tel;
    }
    /* Metodo abstracto que deberá implementarse en cada clase 
     * derivada de Persona (Estudiante y Profesor), aquí en la
     * Super Clase solo se define porque en cada Clase derivada
     * el método Salario() va a tomar muchas formas diferentes
     * o sea es Polimorfico (muchas formas)
     */
    abstract int Salario();//#1 Defición del método polimorfico
}
