package getters.setters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GettersSetters {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Carro ArregloCarros[] = new Carro[3]; //Arreglo de Carros
        
        String Marquilla;
        String Modelillo;
        String Preciesillo;
        
        try {
            for (int i =0; i < 3; i++){
                System.out.print("Digite la marca: \n");   
                Marquilla = br.readLine();

                System.out.print("Digite el modelo: \n");   
                Modelillo = br.readLine();

                System.out.print("Digite el Precio: \n");   
                Preciesillo = br.readLine();            

                ArregloCarros[i] = new Carro(Marquilla, Modelillo);
                ArregloCarros[i].SetPrecio(Preciesillo);
            }
             System.out.print("\n Usted digito: \n\n");
            for (int i =0; i < 3; i++){
                System.out.print(ArregloCarros[i].Marca+"\n");
                System.out.print(ArregloCarros[i].Modelo+"\n");
                System.out.print(ArregloCarros[i].GetPrecio()+"\n");
                System.out.print("-------------------------------\n");
            }
            
        } catch (IOException iOException) {
        }
        
        
    }
    
}
