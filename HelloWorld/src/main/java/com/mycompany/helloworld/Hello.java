/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

/**
 *
 * @author andreamartinez
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Java en Netbeans");
        int numero = 10;
        double decimal = 5.4;        
        String nombre;
        boolean vacunado = true;
        nombre = "Andrea";
        for(int i =0; i<5; i++){
            if(nombre == "Andrea"){
                System.out.println("Hola Andrea");
            }
            else{
                System.out.println("Adios");
            }
        }
    }
    
}
