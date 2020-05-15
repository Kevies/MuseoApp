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
public class Obras {
    
    String alias, nombre, autor;
    int fecha;
    boolean donado;

    public Obras(String alias, String nombre, String autor, int fecha, boolean donado) {
        this.alias = alias;
        this.nombre = nombre;
        this.autor = autor;
        this.fecha = fecha;
        this.donado = donado;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public boolean isDonado() {
        return donado;
    }

    public void setDonado(boolean donado) {
        this.donado = donado;
    }
    
    


    
    
}
