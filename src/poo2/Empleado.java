/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;



import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author NEL
 */
public class Empleado {
    
    private String nombre;
    private double sueldo;
    private int anio;
    private int dia;
    private Date altaContrato;
    private int mes;
    
    /*constructor que reciva parametros*/

    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        
        GregorianCalendar  calendario=new GregorianCalendar(anio, mes-1,dia);
        altaContrato=calendario.getTime();
    }
    /*sobrecarga de constructor*/
    public Empleado(String nombre){
        this(nombre,3000,2000,01,01);
        
    }
    
    
    
    /***************GETTER*******************************/
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }
    
    
    
    /***************SETTER*******************************/
    public void subeSueldo(double porcentaje){
        
        double aumento =sueldo*(porcentaje/100);
        sueldo =sueldo+aumento;
        
    }
    
    


    

    
    
}
