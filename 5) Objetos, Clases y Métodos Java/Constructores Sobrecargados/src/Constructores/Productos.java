package Constructores;
/* 
 * Cuando se crea un objeto, sus miembros pueden inicializarse
 * con un método CONTRUCTOR. Un CONSTRUCTOR es un método que 
 * tiene el mismo nombre de la clase.
 * Podemos SOBRECARGAR los constructores si necesitamos 
 * diversas maneras de inicializar los objetos de una clase.
 */
public class Productos {
     // Declaración de Variables Ejemplar (Miembros de Clase)
     String Codigo, Nombre;
     int Cantidad, Costo, Utilidad, Precio_Venta;
       
    // Constructor #1 "Normal" de la Clase
    public Productos(String Codigo, String Nombre, int Cantidad, int Costo, int Utilidad, int Precio_Venta) {
            Set_Productos( Codigo, Nombre,  Cantidad,  Costo,  Utilidad,  Precio_Venta);
    }
    
    /* Constructor #2 sin parámetros que inicializa todas las Variables Ejemplar 
     * en cero o espacio para asegurarse que inician en un estado consistente */
    public Productos() {
            Set_Productos( "", "",  0,  0,  0,  0);
    }
    
    // Constructor #3 que crea un nuevo producto(Solo Código y Nombre)
    // Sin preocuparse por lo demás (Cantidad, Utilidad, Costo y Precio_Venta)
    public Productos(String Codigo, String Nombre) {
            Set_Productos( Codigo, Nombre,  0,  0,  0,  0);
    }
    
    // Método utilizado para inicializar las Variables  
    // Ejemplares (Miembros de la Clase)
    public void Set_Productos(String Codigo, String Nombre, int Cantidad, int Costo, int Utilidad, int Precio_Venta) {
            this.Codigo = Codigo;
            this.Nombre = Nombre;
            this.Cantidad =Cantidad;
            this.Costo = Costo;
            this.Utilidad = Utilidad; 
            this.Precio_Venta = Precio_Venta;            
    }
}