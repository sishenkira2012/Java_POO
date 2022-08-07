/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author NEL
 */
public class Uso_Empleado {
    public static void main(String[] args){
        
        
        
        /*array y bucle for*/
        
        /*Empleado[] empleados = new Empleado[3]
        empleados [0] new Empleado("");
        empleados [1] new Empleado("");
        empleados [3] new Empleado("");
        
        for(int i=0; i<empleados.lenth; i++){
            empleados[i].subeSueldo(5);
            
        }
        for(int i=0; i<empleados.lenth; i++){
            System.out.println("nombre"+empleados[i].getNombre().....);
        }
        
        
        
        */
        
        
        /*pasar paramentros al constructor*/
        Empleado empleado1 = new Empleado("nelson",85000,2021,12,17);
        
        
        empleado1.subeSueldo(5);
        System.out.println("nombre "+empleado1.getNombre()+" sueldo: "+empleado1.getSueldo()+
        " fecha de alta: "+empleado1.getAltaContrato());      
    }
    
}
