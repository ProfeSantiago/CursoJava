
package paquetin;

import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;
import javax.faces.bean.RequestScoped;

@Named(value = "mifrijolito")
@RequestScoped
public class mifrijolito {

    public mifrijolito() {
    }
    
    private double numero1;
    private double numero2;
    private double resultado;

    public double getNumero1() {
      return numero1;
    }
    
     public void setNumero1(double numero1) {
       this.numero1 = numero1;
    }
  
    public double getNumero2() {
       return numero2;
    }
 
     public void setNumero2(double numero2) {
       this.numero2 = numero2;
    }
  
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
       this.resultado = resultado;
    }
    
     public String suma(){
       resultado = numero1 + numero2;
      return "";
    }
}
