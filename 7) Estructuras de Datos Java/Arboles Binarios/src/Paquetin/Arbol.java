package Paquetin;

public class Arbol {
    
    String Texto;
    Arbol izq;
    Arbol der;

    public Arbol (String Texto){ //Constructor #1
       this.Texto = Texto;
        izq = der = null;
    } //Fin Constructor #1

     public Arbol (){ //Constructor #2
       this.Texto = "";
        izq = der = null;
     }//Fin Constructor #2
    
    private void Inserta_Hoja(String NuevoTexto){  //Funcion Recursiva
        //Este procedimiento inserta nodos en el árbol en forma ordenada
        if (NuevoTexto.compareTo(Texto) > 0){
            if(der==null)
               der= new Arbol(NuevoTexto);
            else
               der.Inserta_Hoja(NuevoTexto);//Llamada Recursiva
        }//Fin if
        else if(NuevoTexto.compareTo(Texto) < 0){
           if(izq==null)
               izq=new Arbol(NuevoTexto);
            else
               izq.Inserta_Hoja(NuevoTexto);//Llamada Recursiva
        }//Fin Else
    }//Fin Inserta_Hoja
    
    public Arbol Inserta(Arbol Raiz,String NuevoTexto){
       if( (Raiz == null) || (Raiz.Texto.compareTo("")) == 0){
            Raiz.Texto = NuevoTexto;
            Raiz.izq = null;
            Raiz.der = null;
        }else{  
            Inserta_Hoja(NuevoTexto);
        }
       return Raiz;
    }//Inserta
    
     public Arbol Busca(Arbol Raiz, String TextoBuscado){
     //Ojo: En Construcion
     //Esta función busca un nodo específico en el árbol a partir de un número
        if (Raiz == null){
           return null;
        }else
         {   if (Texto.compareTo(TextoBuscado) > 0){
                return Busca(Raiz.izq, TextoBuscado);
             }else{
                 if (Texto.compareTo(TextoBuscado) < 0){
                     return Busca(Raiz.der, TextoBuscado);
                  }else{
                      return Raiz;
                  }
              }
         }
    }//Busca

}//Fin Arbol
