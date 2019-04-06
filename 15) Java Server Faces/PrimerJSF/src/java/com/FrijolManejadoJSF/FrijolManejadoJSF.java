/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.FrijolManejadoJSF;
import javax.faces.bean.*;
import javax.inject.Named;
import javax.enterprise.context.Dependent;


/*
 *
 * @author santiagoRP1979
 */
@Named(value = "frijolManejadoJSF")
@Dependent
public class FrijolManejadoJSF {

    private String NombreUsuario = "";
     
    public FrijolManejadoJSF() {
        System.out.println("Hola Mundo...");
    }
     
    public String getNombreUsuario() {
        return this.NombreUsuario.trim();
    }
     
    public void setNombreUsuario(String userName) {
        this.NombreUsuario = userName.trim();
    }
     
    public String saludaUsuario() {
        return "Saludito";
    }
    
}
