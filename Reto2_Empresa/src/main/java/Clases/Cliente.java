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
public class Cliente extends Persona{
    private String telefono;
    private String direccion_residencia;

    public Cliente(String telefono, String direccion_residencia, String identificacion, String nombre, String apellidos, String email) {
        super(identificacion, nombre, apellidos, email);
        this.telefono = telefono;
        this.direccion_residencia = direccion_residencia;
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

    /**
     * @return the direccion_residencia
     */
    public String getDireccion_residencia() {
        return direccion_residencia;
    }

    /**
     * @param direccion_residencia the direccion_residencia to set
     */
    public void setDireccion_residencia(String direccion_residencia) {
        this.direccion_residencia = direccion_residencia;
    }
    
    public void mostrarDatos(Cliente cliente){
        System.out.println("Bienvenido Cliente: \n " + "Identificacion: "+cliente.getIdentificacion()+"\n" + "Nombre: "+ cliente.getNombre()+"\n"+"Apellido: "+cliente.getApellidos()+"\n"+"Email: "+cliente.getEmail()+"\n"+ "Dirección residencia cliente: "+cliente.direccion_residencia +"\n"
                + "Telefono Cliente: "+ cliente.telefono +"\n");
    }
    
    
}
