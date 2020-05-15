/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author kevie
 */
public class Insecto extends Especimenes{
    boolean volador;

    public Insecto(int horario, String nombre, String temporada, String habitat, boolean volador, boolean donado) {
        super(horario, nombre, temporada, habitat, donado);
        this.volador=volador;
    }

    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }
    
}
