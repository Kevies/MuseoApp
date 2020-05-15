
package data;

/**
 *
 * @author Kevin Martinez y Diego Fernandez
 * Hereda de obras proporcionale las caracteristcas y los metodos de la clase superior
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
