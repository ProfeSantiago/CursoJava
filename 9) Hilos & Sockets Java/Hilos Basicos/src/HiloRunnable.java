//Clase HiloRunnable
public class HiloRunnable implements Runnable{
    public void run(){
        while(true){
            System.out.println("Hola mundo,soy el hilo #2 HiloRunnable");
        }
    }
}