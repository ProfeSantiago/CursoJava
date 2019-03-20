package Vectores_Polimorfismo;
public class Automovil extends Vehiculo {
        int Pasajeros;      
        
        //Constructor #1 sin argumentos
        public Automovil(){
            //Llamada implicita del constructor
            //Llamar al Constructor de la Super Clase sin argumentos
            super("","","");
        }
        
        //Constructor #2 "Normal"
        public Automovil(String Placa,String Marca,String Modelo, int Pasajeros) {
            //Llamar al Constructor de la Super Clase
            super(Placa,Marca,Modelo);
            //Inicializar el miembro "local" de la subclase
            this.Pasajeros = Pasajeros;
        }
        
        //#2 Primera implentación (y primera forma) 
        //   de la función polimorfica
        public int Precio_Renta(){ 
            return Pasajeros * 5000;
        }   

}
