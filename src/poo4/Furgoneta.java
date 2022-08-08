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
public class Furgoneta extends Coche2 {
    private int capacidad_extra;
    private int plazas_extra;

    public Furgoneta(int capacidad_extra, int plazas_extra) {
        /*llama al constructor de la clase padre*/
        super();
        this.capacidad_extra = capacidad_extra;
        this.plazas_extra = plazas_extra;
    }

    public int getCapacidad_extra() {
        return capacidad_extra;
    }

    public int getPlazas_extra() {
        return plazas_extra;
    }

    @Override
    public String toString() {
        return "Furgoneta{" + "capacidad_extra=" + capacidad_extra + ", plazas_extra=" + plazas_extra + '}';
    }
    
    
    
}
