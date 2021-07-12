/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.reto2_empresa;

import Clases.Cargo;
import Clases.Cliente;
import Clases.Empleado;
import Clases.Empresa;



/**
 *
 * @author andreamartinez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cargo cargo1=new Cargo("Analista de Pruebas", "Nivel 3");
        Empleado emp1=new Empleado(3700000,cargo1, " 66952652", "Andrea", "Martinez", "lamd@yahoo.com");
        Cliente cliente1=new Cliente("3474569","Calle San Juan", "1152448963", "Martin", "Henao", "martinhenao@hotmail.com");
        Empresa empresa1=new Empresa("123456", "Importaciones Asturias", "Avenida 67", emp1, cliente1);
        
        //Mostrar datos empleado
        System.out.println("Datos Empleado \n ");
        emp1.mostrarDatos(emp1);
        //Mostrar datos cliente
        System.out.println("Datos Cliente \n ");
        cliente1.mostrarDatos(cliente1);
        //Mostrar datos empresa
        System.out.println("Datos Empresa \n ");
        empresa1.mostrarDatos(empresa1);
        
    }
    
}
