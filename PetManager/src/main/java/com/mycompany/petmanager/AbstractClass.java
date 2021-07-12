/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petmanager;

import Clases.clsDoctor;
import Clases.clsVeterinary;

/**
 *
 * @author andreamartinez
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsDoctor doctor = new clsDoctor("Andrea", "Lic 23456");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria el último paseo", "3298798", "calle 32 C", doctor);

        veterinary.setData(veterinary.getName()+ "-" + veterinary.getAddress());
        
        String data = veterinary.getHopsitalInformation();
        String type = veterinary.PatientType();
        String surgery = veterinary.Surgery();

        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("Surgery: " + surgery);

    }

}
