/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author andreamartinez
 */
public class Ejercicio1 {

    ArrayList<Integer> lista_inicial = new ArrayList<Integer>();
    ArrayList<Integer> lista_acumulada = new ArrayList<Integer>();

    public void setLista_inicial(ArrayList<Integer> lista_inicial) {
        this.lista_inicial = lista_inicial;
    }
    
    
    public void suma_acumulativa(ArrayList<Integer> lista_inicial){
    
      lista_inicial.add(4);
      lista_inicial.add(3);
      lista_inicial.add(6);
      lista_inicial.add(10);
      
        System.out.println(lista_inicial);
        
        lista_acumulada.add(0, lista_inicial.get(0));
            
        
        int i=0;
        int j=i+1;
        
        for (int k = 1; k<lista_inicial.size(); k++) {
            
            int valor=lista_inicial.get(j)+lista_acumulada.get(i);
            lista_acumulada.add(valor);
            i=i+1;
            j=j+1;
        }
        
        System.out.println(lista_acumulada);
    
    }
    
    

  
    

    
    
    
    
}
