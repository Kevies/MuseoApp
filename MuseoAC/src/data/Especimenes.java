package data;

public class Especimenes {
    private int horario;
    private String nombre, temporada, habitat;
    private boolean donado;

    public Especimenes(int horario, String nombre, String temporada, String habitat, boolean donado) {
        this.horario = horario;
        this.nombre = nombre;
        this.temporada = temporada;
        this.habitat = habitat;
        this.donado = donado;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isDonado() {
        return donado;
    }

    public void setDonado(boolean donado) {
        this.donado = donado;
    }
}
