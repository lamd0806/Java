/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.clase2_prueba;

import com.andrea.clase2_prueba.clases.Car_S1;
import com.andrea.clase2_prueba.clases.Client_S2;
import com.andrea.clase2_prueba.clases.Clientes;
import com.andrea.clase2_prueba.clases.Driver_S1;
import com.andrea.clase2_prueba.clases.Service_S1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andreamartinez
 */
public class PruebaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Semana 2:
        
        Car_S1 carro_alquiler=new Car_S1("Negro", "JPO987", "Renault", 2012, 130000);
        Driver_S1 conductor=new Driver_S1(29,"Andrea","Martinez","5632369");
        Client_S2 cliente=new Client_S2("tin@hotmail.com","3136340556","Martin","henao","12345");
        Client_S2 cliente2=new Client_S2("carlos@hotmail.com","3625253","Carlos","franco","52639");
        Service_S1 servicio_nuevo=new Service_S1("27/07/2021",conductor,carro_alquiler,65000,cliente);
        Clientes objClientes = new Clientes();
        
        //set para actualizar
        //servicio_nuevo.getUsuario().setNombre("Brad");
        
        //get para obtener
        System.out.println(servicio_nuevo.getUsuario().getCorreo());
        System.out.println(servicio_nuevo.getVehiculo().getPlaca());
        System.out.println(servicio_nuevo.getConductor().getEdad());
        
        //llamar función de una clase padre (polimorfismo puro)
        cliente.saludar(conductor);
        conductor.saludar(cliente);
        
        //Metodo polimorfismo por sobrecarga , en la clase cliente existen 3 metodos con el mismo nombre perp
        //diferente carga de atributos
        cliente.pagar(63200);
        cliente.pagar(69000, "Efectivo");
        cliente.pagar(48000,"Tarjeta", 5000);
        
        
        ///Invocar Interfaces implementadas
        servicio_nuevo.procesarPago(69000);
        servicio_nuevo.validarMedioPago("tarjeta de credito");
        //Clases Abstractas
        servicio_nuevo.calcularPago();
        servicio_nuevo.recibirEfectivo(85000);
        
        //Invocar metodos crud creados en la clase clientes
        objClientes.Create(cliente);
        objClientes.Read();
        objClientes.Update(0, cliente2);
        objClientes.Read();
        objClientes.Delete(0);
        objClientes.Read();
          
        /*
        //Uso condicionales
        if (getEdad() >= 18 && getEdad() < 60) {
            System.out.println("Mayor de edad");
        } else if (getEdad() >= 60) {
            System.out.println("Tercera edad");
        } else {
            System.out.println("Menor de edad");
        }

        //Uso de while
        int numero = 0;
        System.out.println("___________________________");
        while (numero < 5) {

            System.out.println(numero);
            numero++;
        }

        //uso del For
        System.out.println("___________________________");
        for (int i = 10; i > 0; i--) {

            System.out.println(i);
        }

        //Uso del Switch
        System.out.println("___________________________");
        switch (getEdad()) {
            case 18:
                System.out.println("mayor de edad");
                break;
            case 60:
                System.out.println("Tercera edad");
                break;
            case 15:
                System.out.println("Menor de edad");

        }

        ///Invocando clase Carro
        System.out.println("___________________________");

        ///Este cuando asigne los valores a los atributos
        //Car nuevo_carro= new Car();
        System.out.println(nuevo_carro.color);
        System.out.println(nuevo_carro.cambioEstado());
        //Así cuando tengo un constructor que recibe atributos, lo cree usando . (punto en la clase)
        Car_S1 nuevo_carro = new Car_S1("Azul", "JKL987", "Mazda", 2011, 120000);
        System.out.println(nuevo_carro.getColor());
        Car_S1 carro_2 = new Car_S1("Negro", "JPO987", "Renault", 2012, 130000);
        System.out.println(carro_2.getPlaca());

        System.out.println("___________________________");
        //Clase 3
        Driver_S1 conductor = new Driver_S1("Antonio", "Martinez", 60, "12345", true);
        Driver_S1 conductor2 = new Driver_S1("Luz", "Diaz", 50, "985623", true);
        ArrayList<Driver_S1> conductores = new ArrayList<Driver_S1>();
        conductores.add(conductor);
        conductores.add(conductor2);
        
        for (int i = 0; i < conductores.size(); i++) {
            System.out.println(conductores.get(i).getNombre());
        }
        
        //otro ejemplo
        Car_S1 carro= new Car_S1("Negro", "JPO987", "Renault", 2012, 130000);
        Service_S1 servicio= new Service_S1("09/07/2021",conductor,carro,45000);
        
        //para acceder al valor de un objeto que pertenece a otro objeto primero se accede al objeto y luego al atributo
        
        //para cambiar valor de una variable encapsulada
        conductor.setNombre("Joaquin");
        
        System.out.println(servicio.getConductor().getNombre());
        System.out.println(servicio.getVehiculo().getMarca());
        ArrayList<Service_S1> servicios = new ArrayList<Service_S1>();
        servicios.add(servicio);

        System.out.println("___________________________");
        ArrayList<String> personas = new ArrayList<String>();
        //para agregar 
        personas.add("Andrea Martínez");
        personas.add("Martin Henao");
        personas.add("Pollo");
        personas.add("Topo");

        //mostrar resultado en ventana emergente
        JOptionPane.showMessageDialog(null, personas.get(0));
        //para remover
        personas.remove(0);
        //System.out.println("Actualmente en lista personas " + personas.get(0));
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }

    }

    // simil de  funciones: le debo decir el tipo de dato que va a retornar
    //static , sólo lo voy a usar en mni clase
    public static String getNombre() {
        return "Andrea";
    }

    private static int getEdad() {
        return 60;
    }*/
        
}
    
}
