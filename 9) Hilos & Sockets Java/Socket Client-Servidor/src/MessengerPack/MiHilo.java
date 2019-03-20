package MessengerPack;
public class MiHilo extends Thread{
    Messenger_Frm Ventana_Messenger;

    public MiHilo(Messenger_Frm Ventana_Messenger){
            this.Ventana_Messenger = Ventana_Messenger;
    }//Fin Constructro

    public void run(){
        while(true){
                Ventana_Messenger.Repite_Recibe();
        }
    }//FIN DEL run

}//FIN MiHilo


