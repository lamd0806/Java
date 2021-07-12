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
public class Empleado extends Persona{
    private double sueldo;
    private Cargo cargo;
    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Empleado(double sueldo, Cargo cargo, String identificacion, String nombre, String apellidos, String email) {
        super(identificacion, nombre, apellidos, email);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
    

      /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    public void mostrarDatos(Empleado empleado){
        System.out.println("Hola Empleado: \n " + "Sueldo: " + empleado.sueldo +"\n"+ "Cargo Empleado: "+empleado.cargo.getNombre_cargo()+"\n"
                + "Nivel Jerarquico: "+ empleado.cargo.getNivel_jerarquico() +"\n"+ "Identificacion: "+empleado.getIdentificacion()+"\n" + "Nombre: "+ empleado.getNombre()+"\n"+"Apellido: "+empleado.getApellidos()+"\n"+"Email: "+empleado.getEmail()+"\n");
    }
}
