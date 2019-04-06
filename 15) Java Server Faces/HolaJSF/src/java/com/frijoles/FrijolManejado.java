package com.frijoles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author santiagoRP1979
 */
@Named(value = "frijolManejado")
@Dependent
public class FrijolManejado {

    private String userName = "";
     
    public FrijolManejado() {
        System.out.println("Created GreetingsBean instance...");
    }
     
    public String getUserName() {
        return this.userName.trim();
    }
     
    public void setUserName(String userName) {
        this.userName = userName.trim();
    }
     
    public String greetUser() {
        return "greeting";
    }
    
}
