package Vectores_Polimorfismo;
public class Camioneta extends Vehiculo {
        int Peso_Carga;      
        
        //Constructor #1 sin argumentos
        public Camioneta(){
            //Llamada implicita del constructor
            //Llamar al Constructor de la Super Clase sin argumentos
            super("","","");
        }
        
        //Constructor #2 "Normal"
        public Camioneta(String Placa,String Marca,String Modelo, int Peso_Carga) {
            //Llamar al Constructor de la Super Clase
            super(Placa,Marca,Modelo);
            //Inicializar el miembro "local" de la subclase
            this.Peso_Carga = Peso_Carga;
        }
        
        //#3 Segunda implentación (y segunda forma) 
        //   de la función polimorfica
        public int Precio_Renta(){ 
            return Peso_Carga * 8000;
        }   

}
