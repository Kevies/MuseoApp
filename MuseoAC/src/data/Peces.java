package data;
/**
 * 
 * @author Kevin Martinez y diego fernandez
 * Hereda de especimenes proporcionale las caracteristcas y los metodos de la clase superior
 */
public class Peces extends Especimenes{

    private String tipoAgua;

    public Peces(int horario, String nombre, String temporada, String habitat, boolean donado, String tipoAgua) {
        super(horario, nombre, temporada, habitat, donado);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

}
