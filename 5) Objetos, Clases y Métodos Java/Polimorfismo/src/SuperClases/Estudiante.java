package SuperClases;
    public class Estudiante extends Persona { 
        String Carnet;
        private int Beca;
        
        //Constructor #1 sin argumentos
        public Estudiante(){
            //Llamada implicita del constructor
            //Llamar al Constructor de la Super Clase sin argumentos
            super("","","");
        }
        
        //Constructor #2 "Normal
        public Estudiante(String Cedula,String Nombre,String Telefono,String Carnet){
            //Llamar al Constructor de la Super Clase
            super(Cedula,Nombre,Telefono);
            //Inicializar el miembro "local" de la subclase
            this.Carnet = Carnet;
        }
        public void Set_Beca(int Beca){ 
            this.Beca = Beca;
        }
        
        //#2 Primera implentación (y primera forma) 
        //   de la función polimorfica
        public int Salario(){ 
            return Beca;
        }
    }