/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petmanager;

import Clases.clsDog;

/**
 *
 * @author andreamartinez
 */
public class Polimorfismo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Sobrecarga de metodos
        clsDog dog1=new clsDog("criollo",false,"002","Tango",2018,"Negro","Enfermo");
        dog1.WalkAround();
        dog1.WalkAround(8);
        dog1.WalkAround(true);
    }
    
}
