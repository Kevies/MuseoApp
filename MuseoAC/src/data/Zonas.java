package data;

import java.util.ArrayList;

public class Zonas {

    ArrayList<Zonas> listaZonas = new ArrayList<>();
    String nombreZona;

    public Zonas(String nombreZona) {
        this.nombreZona = nombreZona;
    }


    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public void anadirExistencias() {

        listaZonas.add(new Zonas("Zona de peces"));
        listaZonas.add(new Zonas("Zona de insectos"));
        listaZonas.add(new Zonas("Zona de obras"));
        listaZonas.add(new Zonas("Zona de fósiles"));

    }

    public void visualizarZonas(){
        for (int i = 0; i < listaZonas.size(); i++) {
            System.out.println((i+1)+". "+listaZonas.get(i).getNombreZona());
        }
    }

}
