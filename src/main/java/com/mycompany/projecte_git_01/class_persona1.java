/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecte_git_01;

/**
 *
 * @author patriziamanuela.tru
 */
public class class_persona1 {

    private final String nom;
    private final int edat;

    public class_persona1(String nom,int edat){
        this.nom=nom;
        this.edat=edat;
    }
    
    public void saludar(){
        System.out.println("hola,soc en/na " + nom + " i tinc " + edat + " anys.");
    }
}
