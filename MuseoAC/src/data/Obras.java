
package data;

/**
 *
 * @author Kevin Martinez y Diego Fernadez
 * Esta clase es la superior a obras y esculturas y les proporciona las caracteristicas comunes
 * y tambien lo metodos para obtener y poner sus valores.
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
