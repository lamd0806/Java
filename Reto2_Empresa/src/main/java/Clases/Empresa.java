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
public class Empresa {
    private String nit;
    private String Nombre_empresa;
    private String direccion_empresa;
    private Empleado empleado;
    private Cliente cliente;

    public Empresa(String nit, String Nombre_empresa, String direccion_empresa, Empleado empleado, Cliente cliente) {
        this.nit = nit;
        this.Nombre_empresa = Nombre_empresa;
        this.direccion_empresa = direccion_empresa;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    
    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the Nombre_empresa
     */
    public String getNombre_empresa() {
        return Nombre_empresa;
    }

    /**
     * @param Nombre_empresa the Nombre_empresa to set
     */
    public void setNombre_empresa(String Nombre_empresa) {
        this.Nombre_empresa = Nombre_empresa;
    }

    /**
     * @return the direccion_empresa
     */
    public String getDireccion_empresa() {
        return direccion_empresa;
    }

    /**
     * @param direccion_empresa the direccion_empresa to set
     */
    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
     public void mostrarDatos(Empresa empresa){
        System.out.println("Empresa " + empresa.Nombre_empresa +"\n"+ "NIT: "+empresa.nit+"\n"+"Dirección Empresa: "+empresa.direccion_empresa+"\n"
                + "Identificacion del Empleado: "+ empresa.empleado.getIdentificacion()+"\n"+"Nombre Empleado: "+empresa.empleado.getNombre()+"\n"+ "Identificacion Cliente: "+empresa.cliente.getIdentificacion()+"\n" + "Nombre Cliente: "+ empresa.cliente.getNombre()+"\n"+"Apellido Cliente: "+empresa.cliente.getApellidos()+"\n");
    }
    
}
