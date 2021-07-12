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
public class Client_S2 extends Person{
    //1 Defino atributos
    
    private String correo;
    private String telefono;

    //Constructor heredando de la clase persona
    public Client_S2(String correo, String telefono, String nombre, String apellidos, String identificacion) {
        super(nombre, apellidos, identificacion);
        this.correo = correo;
        this.telefono = telefono;
    }
      
    //2. Encapsular atributos

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //polimorfismo por sobreescritura
    @Override
     public void saludar(Person persona){
        System.out.println("Hola, mucho gusto soy el cliente, ¿eres, " + persona.getNombre() + "?");
    }  

     ////polimorfismo por sobrecarga
    
    public void pagar(int valor){
        System.out.println("Hola, te voy a pagar ," + valor + " en efectivo");
    }
    
    public void pagar(int valor, String medio_pago){
        System.out.println("Hola, te voy a pagar , " + valor + "con " + medio_pago);
    }
    
    public void pagar(int valor, String medio_pago, int bono){
        System.out.println("Hola, te voy a pagar , " + valor + " con " + medio_pago + " usando un bono de "
                + bono);
    }
    
}
