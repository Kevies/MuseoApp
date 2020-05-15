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
public class Pinturas extends Obras{
    
    String tecnicas;

    public Pinturas(String alias, String nombre, String autor, int fecha, boolean donado,String tecnicas) {
        super(alias, nombre, autor, fecha, donado);
    }

    public String getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }
    
    
}
