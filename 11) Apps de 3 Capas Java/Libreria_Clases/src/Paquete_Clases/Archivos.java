/*****************************************************************
 * Funciones de Archivos - Ing.Santiago Rodríguez Paniagua
 * Created 21 de Marzo de 2008, 09:35 AM
 *****************************************************************/
package Paquete_Clases;
import java.io.*;
//import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Archivos {
    //------------------------------------------------
    //Declaración de Variables
    //------------------------------------------------
    //Creamos un fujo de datos
    private DataOutputStream Flujo_Salida;
    //Creamos un fujo de entrada a disco
    private DataInputStream Flujo_Entrada;
    //------------------------------------------------
    
    public Archivos(){//Constructor de la clase
    }
    
    public void Crear_Archivo(String Nombre_Archivo){
        try {
            /* ºººººººººººººººººººººººººººººººººººººººººººººººººººººººº 
             * El fujo de salida ObjectOutputStream es el que procesa 
             * los datos y se ha de vincular a un objeto fileOut de la 
             * clase FileOutputStream 
             * ºººººººººººººººººººººººººººººººººººººººººººººººººººººººº */
            Flujo_Salida = new DataOutputStream(new FileOutputStream(Nombre_Archivo));
        } catch (FileNotFoundException fileNotFoundException) { }

    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public void Cerrar_Flujo_Salida(){
        try {
            Flujo_Salida.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public void Escribir_Texto(String Texto){
        try {
            Flujo_Salida.writeUTF(Texto);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public void Escribir_Numero(int Numero){
        try {
            Flujo_Salida.writeInt(Numero);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public String Leer_Texto(){ 
        String Texto="";
        try {
            Texto = Flujo_Entrada.readUTF();
        } catch (IOException iOException) {}
        return Texto;
    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº 

     public int Leer_Numero(){ 
        int Numero=0;
        try {
            Numero = Flujo_Entrada.readInt();
        } catch (IOException iOException) {}
        return Numero;
    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº 

    public void Cerrar_Flujo_Entrada(){
        try {
            Flujo_Entrada.close();
        } catch (IOException iOException) {}
    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    
    public void Abrir_Archivo(String Nombre_Archivo){
        try {
            /* ºººººººººººººººººººººººººººººººººººººººººººººººººººººººº *
             * El fujo de entrada ObjectOutputStream es el que procesa
             * los datos y se ha de vincular a un objeto fileIn de la
             * clase FileInputStream
             * ºººººººººººººººººººººººººººººººººººººººººººººººººººººººº */
            Flujo_Entrada = new DataInputStream(new FileInputStream(Nombre_Archivo));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
    

}
