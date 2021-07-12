/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.IAnimal;
import Interfaces.IVertebrate;

/**
 *
 * @author andreamartinez
 */
public class clsPet implements IAnimal, IVertebrate{
    
    private String code;
    private String name;
    private int born_year;
    private String color;
    private String health_status;
    private clsVeterinary veterinary;

    

    //parametros que ingresan

    public clsPet(String code, String name, int born_year, String color, String health_status) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.health_status = health_status;
    }
  
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
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
     * @return the health_status
     */
    public String getHealth_status() {
        return health_status;
    }

    /**
     * @param health_status the health_status to set
     */
    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }
   
    /*Definicion de metodos*/
    //void metodos sin respuesta
    public void Eat(){
        
        System.out.println("la mascota "+ this.name + " está comiendo");
        
    }
    public void Move(){
        
        System.out.println("la mascota "+ this.name + " se está moviendo");
        
    }
    public void Sound(){
        
        System.out.println("la mascota "+ this.name + " está realizando un sonido");
        
    }

    /**
     * @return the veterinary
     */
    public clsVeterinary getVeterinary() {
        return veterinary;
    }

    /**
     * @param veterinary the veterinary to set
     */
    public void setVeterinary(clsVeterinary veterinary) {
        this.veterinary = veterinary;
    }

    @Override
    public String getAnimalType() {
        return ("doméstico"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfBones() {
        return 0;
    }
        
}
