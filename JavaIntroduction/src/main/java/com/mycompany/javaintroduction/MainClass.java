/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaintroduction;

/**
 *
 * @author andreamartinez
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar variable: tipo, nombre y opcional inicializarla
        //Finalizar una instruccion siempre con ;
        int edad=15;
        String nombre="Andrea";
        boolean esMujer=true;
        
        if(edad>=18){
            System.out.println("la persona es mayor de edad");
        }
        else{
            System.out.println("la persona es menor de edad");
        }
     
        for (int i = 0; i < 5; i++) {
            System.out.println("el valor de i es: " + i);
        }
        
    }
    
}
