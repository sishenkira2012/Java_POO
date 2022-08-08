/*
HERENCIA 
 */
package poo5;

/**
 *
 * @author NEL
 */
public class Uso_Empleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("JUAN", 55000, 2006, 9, 25);

        jefe_RRHH.estableceIcentivo(2570);
        Empleado[] empleado = new Empleado[6];

        empleado[0] = new Empleado("empleado001", 3000, 2006, 07, 07);
        empleado[1] = new Empleado("empleado002", 3000, 2006, 07, 07);
        empleado[2] = new Empleado("empleado003", 3000, 2006, 07, 07);
        empleado[3] = new Empleado("empleado004", 3000, 2006, 07, 07);
        /*polimorfismo*/
        empleado[4] = jefe_RRHH;
        
        empleado[5] = new Jefatura("nestor", 3000, 2006, 07, 07);

        
        
        for (int i = 0; i < empleado.length; i++) {
            empleado[i].subeSueldo(5);

        }
        for (int i = 0; i < empleado.length; i++) {
            
            
            //System.out.println("datos "+empleado[i].traeDatos());
            System.out.println("nombre " + empleado[i].getNombre()+" sueldo :" + empleado[i].getSueldo() + " fecha de contrato :" + empleado[i].getAltaContrato());

        }

    }
}
