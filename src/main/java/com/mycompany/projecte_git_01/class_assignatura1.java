/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecte_git_01;

/**
 *
 * @author patriziamanuela.tru
 */
public class class_assignatura1 {
    private final String assignatura;
    private final int codi;
    
    public class_assignatura1(String assignatura,int codi){
        this.assignatura=assignatura;
        this.codi=codi;
    }
    
    public void infocurs(){
        System.out.println("hola,estic cursat l'assignatura de " + assignatura + " amb codi: " + codi);
}
}

