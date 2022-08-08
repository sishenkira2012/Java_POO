/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;

/**
 *
 * @author NEL
 */
public class Uso_Vehiculo {
    public static void main(String[] args){
        
        Coche2 coche2 = new Coche2();
        coche2.setColor("Rojo");
        
        Furgoneta furgoneta = new Furgoneta(7,580);
        
        
        furgoneta.setColor("azul");
        furgoneta.setAsiento_cuero("si");
        furgoneta.setClimatizador("si");
        
        System.out.println(coche2.toString());
        System.out.println(coche2.isAsiento_cuero());
        
        
        System.out.println(furgoneta.isAsiento_cuero());
        System.out.println(furgoneta.toString());
        
        
        
        
        
        
    }
    
}
