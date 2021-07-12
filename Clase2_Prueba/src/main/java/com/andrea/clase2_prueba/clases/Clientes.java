/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.clase2_prueba.clases;

import java.util.ArrayList;

/**
 *
 * @author andreamartinez
 */
public class Clientes {
    
    private ArrayList<Client_S2> clientes = new ArrayList<>();

    /**
     * @return the clientes
     */
    public ArrayList<Client_S2> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Client_S2> clientes) {
        this.clientes = clientes;
    }
    
    public void Create(Client_S2 cliente) {
        getClientes().add(cliente);
        System.out.println("Se ha creado un cliente");
    }

    public void Read() {
        System.out.println("Clientes en el sistema");
        for (int i = 0; i < getClientes().size(); i++) {
            System.out.println("nombre: " + getClientes().get(i).getNombre()
                    + "apellidos: " + getClientes().get(i).getApellidos());
            
        }
    }

    public void Update(int i, Client_S2 cliente) {
        
        getClientes().get(i).setNombre(cliente.getNombre());
        getClientes().get(i).setApellidos(cliente.getApellidos());
        getClientes().get(i).setCorreo(cliente.getCorreo());
        System.out.println("Se Actualiza Cliente en la posición " + i);
    }

    public void Delete(int i) {
        getClientes().remove(i);
        System.out.println("Se ha eliminado un cliente");
    }

}
