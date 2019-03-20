package SuperClases;
    public class Estudiante extends Persona { 
        String Carnet;
        
        
        public Estudiante(){//Constructor #1 sin argumentos
            //Llamada implicita del constructor
            //Llamar al Constructor de la Super Clase sin argumentos
            super("","","");
        }
        
        public Estudiante(String Cedula,String Nombre,String Telefono,String Carnet){
            //Llamar al Constructor de la Super Clase
            super(Cedula,Nombre,Telefono);
            //Inicializar el miembro "local" de la subclase
            this.Carnet = Carnet;
        }
    }