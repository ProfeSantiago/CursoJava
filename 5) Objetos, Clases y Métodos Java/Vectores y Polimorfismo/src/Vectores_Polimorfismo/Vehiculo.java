package Vectores_Polimorfismo;

/* Definición de la Super Clase como Abstracta para que solo pueda 
 * ser utilizada unicamente para proveer una Super Clase apropiada
 * para que la hereden otras Sub Clases (no puede ser instanciada)
 */
public abstract class Vehiculo {
    //Variables declaradas como protected
    //para que sean accesibles para las sub clases
    protected String Placa, Marca, Modelo;
    
    //Constructor #1 sin argumentos
    public Vehiculo() {
        //Llamada implicita del constructor
    }
    
    //Constructor #2 de la Super Clase
    public Vehiculo(String Placa,String Marca,String Modelo) {
            this.Placa = Placa;
            this.Marca  = Marca;
            this.Modelo = Modelo;
    }
    /* Metodo abstracto que deberá implementares en cada clase 
     * derivada de Persona (Estudiante y Profesor), aquí en la
     * Super Clase solo se define porque en cada Clase derivada
     * el método Salario() va a tomar muchas formas diferentes
     * o sea es Polimorfico (muchas formas)
     */
    abstract int Precio_Renta();//#1 Defición del método polimorfico
}
