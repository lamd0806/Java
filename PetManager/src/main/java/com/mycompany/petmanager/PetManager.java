/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petmanager;

import Clases.clsCat;
import Clases.clsDog;
import Clases.clsPet;
import java.util.Date;

/**
 *
 * @author andreamartinez
 */
public class PetManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsDog dog1=new clsDog("criollo",false,"002","Tango",2018,"Negro","Enfermo");
        clsCat cat1 = new clsCat("Angora","003","Adivine",2016,"Blanco","Sano");
        
        Date current_date= new Date();
        int current_year=current_date.getYear();
        
        int edadPet1=current_year-dog1.getBorn_year();
        int edadPet2=current_year-cat1.getBorn_year();
        
        if (edadPet1>edadPet2){
            System.out.println("la mascota "+ dog1.getName()+" es mayor que la mascota "+cat1.getName());
        }
        else{
            if(edadPet2>edadPet1){
                System.out.println("la mascota "+ cat1.getName()+" es mayor que la mascota "+dog1.getName());
            }
            else{
            System.out.println("la edad de la mascota 1 y 2 es la misma");
            }
        }
    
        /*Invocar metodo en la clase principal*/
        dog1.Eat();
        cat1.Eat();
        dog1.Move();
        dog1.Sound();
        
        dog1.WalkAround();
        cat1.selfCleaning();
    }
    
}
