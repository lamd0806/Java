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
public abstract class Pay {
    abstract void calcularPago();
    
    public void recibirEfectivo(int valor)
    {
        System.out.println("Pago recibido en efectivo " + valor);
    }
}
