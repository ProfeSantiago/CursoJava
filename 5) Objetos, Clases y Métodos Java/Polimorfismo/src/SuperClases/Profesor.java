package SuperClases;
    public class Profesor extends Persona { 
        String Carrera;
        private int Salario_x_Hora = 0;
        private int Horas_Trabajadas = 0;
        
        
        //Constructor #1 sin argumentos
        public Profesor(){
            //Llamada implicita del constructor
            //Llamar al Constructor de la Super Clase sin argumentos
            super("","","");
        }
        
        //Constructor #2 "Normal"
        public Profesor(String Cedula,String Nombre,String Telefono,String Carrera){
            //Llamar al Constructor de la Super Clase
            super(Cedula,Nombre,Telefono);
            //Inicializar el miembro "local" de la subclase
            this.Carrera = Carrera;
        }
        
        public void Set_Salario_x_Hora(int Salario_x_Hora){
            this.Salario_x_Hora = Salario_x_Hora;            
        }
        
        public void Set_Horas_Trabajadas(int Horas_Trabajadas){
            this.Horas_Trabajadas = Horas_Trabajadas;            
        }
        
        public int Get_Salario_x_Hora(){
            return Salario_x_Hora;            
        }
        
        public int Get_Horas_Trabajadas(){
            return Horas_Trabajadas;            
        }
        //#3 Segunda implentación (y segunda forma) 
        //   de la función polimorfica
        public int Salario(){ 
            return Salario_x_Hora * Horas_Trabajadas;
        }  
       
    }