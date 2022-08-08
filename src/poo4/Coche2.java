/*
HERENCIA
*/

package poo4;

/**
 *
 * @author NEL
 */
public class Coche2 {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    
    private String color;
    private int peso_total;
    private boolean asiento_cuero, climatizador;
    
    /*metodo constructor inicializando atributos*/
    
    public Coche2(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        pesoPlataforma=1000;
    }
    
    /* getters: captadores, captar o proporcionar el valor de una propiedad, obtener*/
    public int getRuedas() {
        return ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso() {
        return pesoPlataforma;
    }

    public String getColor() {
        return color;
    }

    public int getPesoPlataforma() {
        return pesoPlataforma;
    }

    public int getPeso_total() {
        return peso_total;
    }
    
    /**/
    public String isAsiento_cuero() {

        if (asiento_cuero == true) {
            return "el coche tiene asientos de cuero";
        } else {
            return "el coche tiene asientos de serie";
        }
    }

    /**/
    public String isClimatizador() {

        if (climatizador == true) {
            return "incorpora climatizador";
        } else {
            return "incorpora airea condicionado";

        }

    }
    
    
    public int precio_coche(){
        
        int precio_final=10000;
        
        if(asiento_cuero==true){
            precio_final=precio_final+2000;
        }
        if(climatizador==true){
            precio_final=precio_final+1500;
            
        }
        return precio_final;
    }
    /**********************************************/
    
    
    /*metodo setter and getter*/
    public String dime_peso(){
        int peso_carroceria=500;
        
        peso_total=pesoPlataforma+peso_carroceria;
        
        if(asiento_cuero==true){
            peso_total=peso_total+50;
            
        }if(climatizador==true){
            peso_total=peso_total+20;
           
        }
        return "el peso del coche es"+peso_total;         
    }
    /**********************************************/

    
    
    
    
    /*seters: definidores definir o establecer el valor de una propiedad, modificar
    */

    public void setColor(String color) {
        this.color = color;
        
    }
    
    /*es un setter y getter */
    public void setPesoPlataforma(int pesoPlataforma) {
        this.pesoPlataforma = pesoPlataforma;
    }

    public void setAsiento_cuero(String asiento_cuero) {
        if(asiento_cuero =="si"){
            this.asiento_cuero = true;
            
        }else{
            this.asiento_cuero = false;
            
        }
       
    }

    public void setClimatizador(String climatizador) {
        
        if(climatizador=="si"){
            this.climatizador = true;
            
        }else{
            this.climatizador=false;
        }
        
        
        
    }
    
    /*
    METODO SETTER
    public void configurar_asientos(String asientos_cuero){
    if(asientos_cuero=="si"){
        this.asientos_cuerto=true;
    }elser{
        this.asientos_cuero=false;
    }
    }
    */
    /**********************************************/
    /*getter*/
    
    
    @Override
    public String toString() {
        return "Coche{" + "ruedas=" + ruedas + ", largo=" + largo + ", ancho=" + ancho + ", motor=" + motor + ", pesoPlataforma=" + pesoPlataforma + ", color=" + color + ", peso_total=" + peso_total + ", asiento_cuero=" + asiento_cuero + ", climatizador=" + climatizador + '}';
    }
    /*dameDatosGeneralesCoche
    public String datos_Generales(){
    return "la plataforma tiene "+ruedas+"ruedad"+
    }
   
    
    */
    
    
    
}
