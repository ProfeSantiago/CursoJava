 class MyHilo extends Thread{
  	String palabra;
  	Aplicacion ref;
  	
  	//CONSTRUCTOR DE LA CLASE MyHilo
  	public MyHilo(Aplicacion app){
  		ref = app;  		
  	}
  	 	
  	public void run(){
  		while(true){ 
  			palabra = ref.getTexto();
  			ref.setTexto("CARACTERES: "+palabra.length());  				
  		}
  	}//FIN DEL run  	
  }//FIN DE LA CLASE MyHilo