/*
USO DE FINAL:se utiliza para que un atirbuto al momento de asignar un valor no sea 
modificado como el nombre PRIVATE FINAL STRING NOMBRE; asi al crear un metodo setter no pueda modifiar


creacion de constantes asignamos seccion="dministracion"
static 

*/
package poo3;

/**
 *
 * @author NEL
 */
public class Empleado {
    
    private  final String nombre;
    private String seccion;
    private  int id;
    private static int idSiguiente=1;
    private String pais;
    
    
    /*constructor con parametro*/
    public Empleado(String nombre){
        this.nombre = nombre;
        id=idSiguiente;
        idSiguiente++;
        seccion ="administracion"; 
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
    
    
    
    
    /*getter*/
    public String traeDatos(){
        return "el nombre es: "+nombre+" y la seccion es: "+seccion+" id="+id;
    }
         
}
