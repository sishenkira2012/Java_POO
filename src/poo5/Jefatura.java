/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author NEL
 */
public class Jefatura extends Empleado {
    
    private double incentivo;
    
    public void estableceIcentivo(double b){
        incentivo=b;
    }
    
    /*sobre escribe el metodo getsueldo de Empleado para poder sumar y traerlo a esta clase*/
    public double getSueldo(){
        double sueldoJefe=super.getSueldo();
        
        return sueldoJefe + incentivo;
    }
    
    
    

    public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
    }
    
    
    
   
}
