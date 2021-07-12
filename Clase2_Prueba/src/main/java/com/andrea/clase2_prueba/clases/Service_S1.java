/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.clase2_prueba.clases;
   
import Interfaces.validarServicio;

/**
 *
 * @author andreamartinez
 */
public class Service_S1 extends Pay implements validarServicio{
   private String fecha;
   private Driver_S1 conductor;
   private Car_S1 vehiculo;
   private int precio_hora;
   private Client_S2 usuario;

        /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the conductor
     */
    public Driver_S1 getConductor() {
        return conductor;
    }

    /**
     * @param conductor the conductor to set
     */
    public void setConductor(Driver_S1 conductor) {
        this.conductor = conductor;
    }

    /**
     * @return the vehiculo
     */
    public Car_S1 getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Car_S1 vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the precio_hora
     */
    public int getPrecio_hora() {
        return precio_hora;
    }

    /**
     * @param precio_hora the precio_hora to set
     */
    public void setPrecio_hora(int precio_hora) {
        this.precio_hora = precio_hora;
    }

    /**
     * @return the usuario
     */
    public Client_S2 getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Client_S2 usuario) {
        this.usuario = usuario;
    }
 

   public Service_S1(String fecha, Driver_S1 conductor, Car_S1 vehiculo, int precio_hora, Client_S2 usuario) {
        this.fecha = fecha;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.precio_hora = precio_hora;
        this.usuario = usuario;
        
    }

    @Override
    public void procesarPago(int pago) {
        System.out.println("Procesar pago :" + pago);
    }

    @Override
    public void validarMedioPago(String medio_pago) {
        if (medio_pago=="tarjeta de credito") {
            System.out.println("aceptado");
        }
        else{
            System.out.println("ingrese otro medio");
        }
    }

    @Override
    public void calcularPago() {
        System.out.println("El pago es 70000");
    }
   
}

    