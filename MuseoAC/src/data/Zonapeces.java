package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Zonapeces extends Zonas {
    String pececito;
    String separador = "====================";
    private int stock, suma;
    Scanner sc = new Scanner(System.in);
    ArrayList<Peces> listaPeces = new ArrayList<>();

    public Zonapeces(String nombreZona) {
        super(nombreZona);
    }

    public void anadirExistencias() {

        listaPeces.add(new Peces(24, "Atún", "Todo el año", "Muelle", true, "Salada"));
        listaPeces.add(new Peces(24, "Perca", "Todo el año", "Rio", true, "Dulce"));
        listaPeces.add(new Peces(24, "Celacanto", "Todo el año", "Océano", false, "Salada"));

    }

    public String buscarPez() {
        pececito = sc.nextLine();
        for (int i = 0; i < listaPeces.size(); i++) {
            if (listaPeces.get(i).getNombre().equalsIgnoreCase(pececito)) {
                pececito = listaPeces.get(i).getNombre();
                System.out.println("se ha encontrado el pez " + pececito + " en la lista.");
                return pececito;
            }
        }

        System.out.println("no existe el pez que ha escrito.");
        return "";
    }


    public void donarPez() {

        System.out.println("¿Qué pez quieres donar?");
        pececito = this.buscarPez();
        if (pececito.equalsIgnoreCase("")) {
            System.out.println("no puedes donar un pez que no existe");
        } else {

            for (int i = 0; i < listaPeces.size(); i++) {
                if (listaPeces.get(i).getNombre().equalsIgnoreCase(pececito)) {
                    if (listaPeces.get(i).isDonado() == true) {
                        System.out.println("Este pez ya ha sido donado.");
                    } else {
                        listaPeces.get(i).setDonado(true);
                        System.out.println("El pez " + pececito + " se ha donado.");
                    }
                }
            }
        }
    }

    public void mostrarPeces() {
        for (int i = 0; i < listaPeces.size(); i++) {
            System.out.println("Horario " + listaPeces.get(i).getHorario() + " del pez: " + listaPeces.get(i).getNombre());
        }
        System.out.println(separador);
    }

    public void mostrarPecesDonados() {
        for (int i = 0; i < listaPeces.size(); i++) {
            if (listaPeces.get(i).isDonado() == true) {
                System.out.println("El pez " + listaPeces.get(i).getNombre() + " esta donado.");
            }
        }
        System.out.println(separador);
    }

    public void mostrarPecesRestantes() {
        for (int i = 0; i < listaPeces.size(); i++) {
            if (listaPeces.get(i).isDonado() == false) {
                System.out.println("El pez " + listaPeces.get(i).getNombre() + " no esta donado.");
            }
        }
        System.out.println(separador);
    }

    public void añadirPez() {
        String nombrePezNuevo, temporadaPezNuevo, habitatPezNuevo, tipoAguaPezNuevo;
        int horarioPezNuevo;
        boolean donadoPezNuevo;
        System.out.println("Introduce el nombre del pez nuevo: ");
        nombrePezNuevo = sc.nextLine();
        System.out.println("Introduce la temporada del pez nuevo: ");
        temporadaPezNuevo = sc.nextLine();
        System.out.println("Introduce el habitat del pez nuevo: ");
        habitatPezNuevo = sc.nextLine();
        System.out.println("Introduce el tipo de agua del pez nuevo: ");
        tipoAguaPezNuevo = sc.nextLine();
        System.out.println("Introduce el horario del pez nuevo: ");
        horarioPezNuevo = sc.nextInt();
        listaPeces.add(new Peces(horarioPezNuevo, nombrePezNuevo, temporadaPezNuevo, habitatPezNuevo, false, tipoAguaPezNuevo));
    }

    public void modificarPez() {
        int pos = 0;
        int opcionA = 0;
        System.out.println(separador);
        System.out.println("¿Qué pez quieres modificar?");
        pececito=this.buscarPez();
        if (pececito.equalsIgnoreCase("")) {
            System.out.println("no puedes donar un pez que no existe");
        } else {
            for (int i = 0; i < listaPeces.size(); i++) {
                if (listaPeces.get(i).getNombre().equalsIgnoreCase(pececito)) {
                    pos = i;
                }
            }
            while (opcionA!=6) {
                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("1.Nombre\n2.Horario\n3.Habitat\n4.Temporada\n5.Tipo de Agua\n6.Salir");
                opcionA = sc.nextInt();

                switch (opcionA) {
                    case 1:
                        String nuevoNom;
                        System.out.println("¿A qué nombre quieres modificar?");
                        nuevoNom = sc.next();
                        listaPeces.get(pos).setNombre(nuevoNom);
                        System.out.println("Se ha cambiado el nombre de " + pececito + " a " + nuevoNom);
                        break;
                    case 2:
                        int nuevoHorario;
                        System.out.println("Se ha cambiado el horario de " + listaPeces.get(pos).getHorario());
                        nuevoHorario = sc.nextInt();
                        listaPeces.get(pos).setHorario(nuevoHorario);
                        System.out.print(" a " + listaPeces.get(pos).getHorario());
                        break;
                    case 3:
                        String nuevoHabitat;
                        System.out.println("Se ha cambiado el horario de " + listaPeces.get(pos).getHabitat());
                        nuevoHabitat = sc.nextLine();
                        listaPeces.get(pos).setNombre(nuevoHabitat);
                        System.out.print(" a " + listaPeces.get(pos).getHabitat());
                        break;
                    case 4:
                        String nuevaTemporada;
                        System.out.println("Se ha cambiado el horario de " + listaPeces.get(pos).getTemporada());
                        nuevaTemporada = sc.nextLine();
                        listaPeces.get(pos).setNombre(nuevaTemporada);
                        System.out.print(" a " + listaPeces.get(pos).getTemporada());
                        break;
                    case 5:
                        String nuevoTipodeAgua;
                        System.out.println("Se ha cambiado el horario de " + listaPeces.get(pos).getTipoAgua());
                        nuevoTipodeAgua = sc.nextLine();
                        listaPeces.get(pos).setNombre(nuevoTipodeAgua);
                        System.out.print(" a " + listaPeces.get(pos).getTipoAgua());
                        break;
                    case 6:
                        break;
                }
            }
        }
    }
}


