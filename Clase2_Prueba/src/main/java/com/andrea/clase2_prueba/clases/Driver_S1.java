/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.clase2_prueba.clases;

/**
 *
 * @author andreamartinez
 */
public class Driver_S1 extends Person {
   
   private int edad;

   //Constructor heredando de la clase persona
    public Driver_S1(int edad, String nombre, String apellidos, String identificacion) {
        super(nombre, apellidos, identificacion);
        this.edad = edad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    //polimorfismo por sobreescritura
    @Override
    public void saludar(Person persona){
        System.out.println("Hola, mucho gusto soy el conductor, ¿eres, " + persona.getNombre()+"?");
    }
    
   
}
