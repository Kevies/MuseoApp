package data;

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
