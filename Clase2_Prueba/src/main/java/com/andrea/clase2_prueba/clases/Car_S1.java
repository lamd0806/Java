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
public class Car_S1 {
   /* 
   public String color="Rojo";
   public String placa="IFU23F";
   public String marca="Ford";
   public int modelo= 2019;
   public int kilometraje= 101000;*/
   
   private String color;
   private String placa;
   private String marca;
   private int modelo;
   private int kilometraje;

  

    public Car_S1(String color, String placa, String marca, int modelo, int kilometraje ) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        
    }

   public boolean cambioEstado(){
   if(  getKilometraje()>100000){
       return true;
   }
   else{
       return false;
   }
   }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
   
}
