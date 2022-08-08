/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author NEL
 */
public class Empleado {
    
    private  final String nombre;
    private String seccion;
    private  int id;
    private static int idSiguiente=1;
    private double sueldo;

    public Date getAltaContrato() {
        return altaContrato;
    }
    private Date altaContrato;

    public String getNombre() {
        return nombre;
    }
    
    
    /*constructor con parametro*/
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        id=idSiguiente;
        idSiguiente++;
        
        GregorianCalendar  calendario=new GregorianCalendar(anio, mes-1,dia);
        altaContrato=calendario.getTime();
    }

    public double getSueldo() {
        return sueldo;
    }
    
    
    

    /*sobrecarga de CONSTRUCTOR*/
   
    /*setter*/
    public void cambiarSeccion(String seccion){
        this.seccion=seccion;
    }
    
    /* no porque podria cambiar de nombre y no se puede no tiene sentido
    public void cambiarNombre(String nombre){
        this.nombre=nombre
    }
    */
    
    
    public void subeSueldo(double porcentaje){
        
        double aumento =sueldo*(porcentaje/100);
        sueldo =sueldo+aumento;
        
    }
    
    
    
    
    /*getter*/
    public String traeDatos(){
        return "el nombre es: "+nombre+" y la seccion es: "+seccion+" id="+id;
    }
    
}
