/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_clases_personas_edificios;

/**
 *
 * @author carol
 */
public class Edificio {
    private char Hospital;
    private String área;
    private boolean energiaEl;
    private String estado;
    private int capacidad;
    
    public Edificio() {
    }

    public Edificio(char campus, String área, boolean energiaEl, 
            String estado, int capacidad) {
        this.Hospital = Hospital;
        this.área = área;
        this.energiaEl = energiaEl;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public char getCampus() {
        return Hospital;
    }

    public void setCampus(char campus) {
        this.Hospital = Hospital;
    }

    public String getÁrea() {
        return área;
    }

    public void setÁrea(String área) {
        this.área = área;
    }

    public boolean isEnergiaEl() {
        return energiaEl;
    }

    public void setEnergiaEl(boolean energiaEl) {
        this.energiaEl = energiaEl;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String toString() {
        return "Edificio{" + "Hospital=" + Hospital + ", \u00e1rea=" + área + 
                ", energiaEl=" + energiaEl 
                + '}'+"\n escoge la accion correspondiente\n 1.-estado "
                + "de uso\n 2.-condiciones\n 3-.capacidad";
    }
    
    public void estadoUso(){
        System.out.println("El edificio del area de "+this.área+
                " y esta "+ this.estado);
    }
    public void condicion(){
        System.out.println("El edificio del area de "+this.área+
                " esta en buenas condiciones");
    }
    public void capacidad(){
        System.out.println("El edificio del area de "+this.área+
                "con una capacidad de "+this.capacidad+"personas");
    }
}
