
package data;

/**
 *
 * @author Kevin Martinez y Diego Fernandez
 * Hereda de especimenes proporcionale las caracteristcas y los metodos de la clase superior
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
