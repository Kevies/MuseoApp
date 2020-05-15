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
public class Esculturas extends Obras{
    
    String material;

    public Esculturas(String alias, String nombre, String autor, int fecha, boolean donado,String material) {
        super(alias, nombre, autor, fecha, donado);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
