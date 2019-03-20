package Paquetin;

public class Arbol {
    
    int numero; //Info
    Arbol izq;
    Arbol der;

    public Arbol (int numero){ //Constructor #1
       this.numero = numero; //Info
        izq = der = null;
    } //Fin Constructor #1

     public Arbol (){ //Constructor #2
       this.numero = 0;
        izq = der = null;
     }//Fin Constructor #2
    
    private void Inserta_Hoja(int NuevoNumero){  //Funcion Recursiva
        //Este procedimiento inserta nodos en el árbol en forma ordenada
        if (NuevoNumero > numero){
            if(der==null)
               der= new Arbol(NuevoNumero);
            else
               der.Inserta_Hoja(NuevoNumero);//Llamada Recursiva
        }//Fin if
        else if(NuevoNumero < numero){
           if(izq==null)
               izq=new Arbol(NuevoNumero);
            else
               izq.Inserta_Hoja(NuevoNumero);//Llamada Recursiva
        }//Fin Else
    }//Fin Inserta_Hoja
    
    public Arbol Inserta(Arbol Raiz,int NuevoNumero){     
       if( (Raiz == null) || (Raiz.numero == 0)){
            Raiz.numero = NuevoNumero;
            Raiz.izq = null;
            Raiz.der = null;
        }else{  
            Inserta_Hoja(NuevoNumero); 
        }
       return Raiz;
    }//Inserta
    
     public Arbol Busca(Arbol Raiz, int NumeroBuscado){
     //Ojo: En Construcion
     //Esta función busca un nodo específico en el árbol a partir de un número
        if (Raiz == null){
           return null;
        }else
         {   if (numero > NumeroBuscado){
                return Busca(Raiz.izq, NumeroBuscado);
             }else{
                 if (numero < NumeroBuscado){
                     return Busca(Raiz.der, NumeroBuscado);                       
                  }else{
                      return Raiz;
                  }
              }
         }
    }//Busca

}//Fin Arbol
