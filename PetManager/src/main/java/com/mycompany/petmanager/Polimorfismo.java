/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petmanager;

import Clases.clsCat;
import Clases.clsDoctor;
import Clases.clsDog;
import Clases.clsVeterinary;

/**
 *
 * @author andreamartinez
 */
public class Polimorfismo {
    public static void main(String[] args) {
        
        //Polimorfismo puro
        //Instancias de las clases hijas
        clsDog dog1=new clsDog("criollo",false,"002","Tango",2018,"Negro","Enfermo");
        clsCat cat1 = new clsCat("Angora","003","Adivine",2016,"Blanco","Sano");
        
        //Instancia de veterinaria
        clsDoctor doctor=new clsDoctor("Andrea","Lic 23456");
        clsVeterinary veterinary= new clsVeterinary( "Veterinaria el último paseo",  "3298798",  "calle 32 C",  doctor);
        
        String careDog = veterinary.PetCare(dog1);
        System.out.println("El estado de salud de: " +dog1.getName() +"es: "+ careDog);
        
        String careCat = veterinary.PetCare(cat1);
        System.out.println("El estado de salud de: " +cat1.getName() +"es: "+ careCat);
    }
}
