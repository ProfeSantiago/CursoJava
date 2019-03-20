package SuperClases;
    public class Profesor extends Persona { 
        String Carrera;
        //Constructor sin argumentos
        
        public Profesor(){
            //Llamada implicita del constructor
            //Llamar al Constructor de la Super Clase sin argumentos
            super("","","");
        }
        
        public Profesor(String Cedula,String Nombre,String Telefono,String Carrera){
            //Llamar al Constructor de la Super Clase
            super(Cedula,Nombre,Telefono);
            //Inicializar el miembro "local" de la subclase
            this.Carrera = Carrera;
        }
    }