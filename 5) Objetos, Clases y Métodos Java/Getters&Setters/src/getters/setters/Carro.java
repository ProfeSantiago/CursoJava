
package getters.setters;

public class Carro {
    String Marca;
    String Modelo;
    private String Precio; //Es privado porque no quermos que todo mundo lo accese
    
    public Carro(String Marca, String Modelo){//Constructor de la clase        
        this.Marca=Marca;
        this.Modelo=Modelo;
    }//Fin Constructor
    
    //==================================================
    //Estos 2 métodos hacen publico 
    //al miembro de clase: Precio
    //Que originalmente era privado.
    //==================================================
    public void SetPrecio(String Precio){
         this.Precio=Precio;
    }
    
    public String GetPrecio(){
         return Precio;
    }
    
}
