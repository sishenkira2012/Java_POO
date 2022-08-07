/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author NEL
 */
public class Uso_Coche {
    public static void main(String[] args){
        
        /*instanciar clase*/
        Coche coche1= new Coche();
        /*paso por parametros*/
        coche1.setColor("azul");
        
        
        
        
        System.out.println("datos generales son: "+coche1.toString());
        System.out.println("ruedad es :"+coche1.getAncho());
        System.out.println("color de coche: "+coche1.getColor());
        
        
        coche1.setAsiento_cuero("si");
        System.out.println(""+coche1.isAsiento_cuero());
        
        
        coche1.setClimatizador("si");
        /*podemos obtenerlo apartir del usuario*/
        /*coche1.setClimatizador(JOptionPane.showInputDialog("TIENE ASIENTOS DE CUERO si/no???"))*/
        System.out.println("c :"+coche1.isClimatizador());
        
        System.out.println(coche1.dime_peso());
        
        System.out.println("el precio final del coche es "+coche1.precio_coche());
        
             
    }
}
