/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author andreamartinez
 */
public class clsVeterinary extends AbstHospital{
    private String name;
    private String telephone;
    private String address;
    private clsDoctor doctor;

    public clsVeterinary(String name, String telephone, String address, clsDoctor doctor) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.doctor = doctor;
    }
    
    public String PetCare(clsPet pet){
        
        System.out.println("Atendiendo a la mascota "+ pet.getName());
        return pet.getHealth_status();
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
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the doctor
     */
    public clsDoctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(clsDoctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String PatientType() {
        return "Animal";
    }

    @Override
    public String Surgery() {
        return "Surgery animal data";
    }
    
    
}
