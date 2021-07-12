/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petmanager;

import Clases.clsCat;
import Clases.clsDog;

/**
 *
 * @author andreamartinez
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsDog dog1=new clsDog("criollo",false,"002","Tango",2018,"Negro","Enfermo");
        clsCat cat1 = new clsCat("Angora","003","Adivine",2016,"Blanco","Sano");
        
        //Sobreescribir
        dog1.Sound();
        cat1.Sound();
        
    }
    
}
