package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Zonapeces extends Zonas{
    private int stock, suma;
    Scanner sc = new Scanner(System.in);
    ArrayList<Peces> listaPeces = new ArrayList<>();

    public void anadirExistencias() {

        listaPeces.add(new Peces(24,"Atún","Todo el año","Muelle",true,"Salada"));
        listaPeces.add(new Peces(24,"Perca","Todo el año","Rio",true,"Dulce"));
        listaPeces.add(new Peces(24,"Celacanto","Todo el año","Océano",false,"Salada"));

    }

    public void  verElementos(){
            for (int i = 0; i < listaPeces.size() ; i++) {
                System.out.println("Horario "+listaPeces.get(i).getHorario()+" del pez: "+listaPeces.get(i).getNombre());
            }
            System.out.println("==========================");
    }
}

