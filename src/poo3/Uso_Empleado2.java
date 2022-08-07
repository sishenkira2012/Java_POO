/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

/**
 *
 * @author NEL
 */
public class Uso_Empleado2 {
    public static void main(String[] args){
        
        //instanciar para crear constructor 
        Empleado empleado = new Empleado("nelson");
        Empleado empleado2 = new Empleado("jose");
        Empleado empleado3 = new Empleado("miguel");
       
        
        
        empleado.cambiarSeccion("RRHH");
        
        
        System.out.println(empleado.traeDatos());
        
        
        
        
        
        System.out.println(empleado2.traeDatos());
        
    }
    
}
