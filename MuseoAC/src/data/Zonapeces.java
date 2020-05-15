package data;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Kevin Martinez y diego Fernandez
 * Hereda de Zonas y le proporciona el nombre, esta zona tiene una Array list con los peces
 * de la zona que existen en el listado del museo, que este donado o no, es un valor true o false
 * eso indicaria su permanecia en el museo.
 * 
 * Aqui se generan los metodos que llamara el menu, para poder hacer las funcionalidades de la aplicacion.
 */
public class Zonapeces extends Zonas {
    String pececito;
    String separador = "====================";
    Scanner sc = new Scanner(System.in);
    ArrayList<Peces> listaPeces = new ArrayList<>();

    public Zonapeces(String nombreZona) {
        super(nombreZona);
    }
/**
 * Añade el listado de peces del museo
 */
    public void añadirPecesExistentes() {

        listaPeces.add(new Peces(24, "Atún", "Todo el año", "Muelle", true, "Salada"));
        listaPeces.add(new Peces(24, "Perca", "Todo el año", "Rio", true, "Dulce"));
        listaPeces.add(new Peces(24, "Celacanto", "Todo el año", "Océano", false, "Salada"));

    }
/**
 * Busca un pez por su nombre en el listado
 * @return si el pez no existe devuelve una String ("") como valor vacio, sino
 * devuelve su nombre
 */
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

    /**
     * Cambia el estado de donado de false a true, si el pez no ha sido donado antes.
     */
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
    /**
     * Muestra todos los peces del museo donado o no
     */
    public void mostrarPeces() {
        for (int i = 0; i < listaPeces.size(); i++) {
            System.out.println("- Pez: " + listaPeces.get(i).getNombre() + " con horario " + listaPeces.get(i).getHorario());
        }
        System.out.println(separador);
    }
    /**
     * Solo muestra los peces donados
     */
    public void mostrarPecesDonados() {
        for (int i = 0; i < listaPeces.size(); i++) {
            if (listaPeces.get(i).isDonado() == true) {
                System.out.println("El pez " + listaPeces.get(i).getNombre() + " esta donado.");
            }
        }
        System.out.println(separador);
    }
    /**
     * Muestra los peces que no han sido donados
     */
    public void mostrarPecesRestantes() {
        for (int i = 0; i < listaPeces.size(); i++) {
            if (listaPeces.get(i).isDonado() == false) {
                System.out.println("El pez " + listaPeces.get(i).getNombre() + " no esta donado.");
            }
        }
        System.out.println(separador);
    }
    /**
     * Añade un pez al registro del museo
     */
    public void añadirPez() {
        String nombrePezNuevo, temporadaPezNuevo, habitatPezNuevo, tipoAguaPezNuevo;
        int horarioPezNuevo;
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
        int intentos=0;
            while(horarioPezNuevo<0 || horarioPezNuevo>24)
                            {
                                System.out.print("introduce una de las 24h: ");
                                horarioPezNuevo = sc.nextInt();
                                intentos++;
                                if (intentos==3)
                                {
                                    System.out.println("has superado el limite maximo de intentos");
                                    System.out.println("No vas a poder añadir el horario");
                                    horarioPezNuevo=-1;
                                    break;
                                }
                            }
        
        listaPeces.add(new Peces(horarioPezNuevo, nombrePezNuevo, temporadaPezNuevo, habitatPezNuevo, false, tipoAguaPezNuevo));
    }
    /**
     * Modifica un pez del registro del museo
     */
    public void modificarPez() {
        int pos = 0;
        int opcionA = 0;
        System.out.println(separador);
        System.out.println("¿Qué pez quieres modificar?");
        pececito = this.buscarPez();
        if (pececito.equalsIgnoreCase("")) {
            System.out.println("no puedes donar un pez que no existe");
        } else {
            for (int i = 0; i < listaPeces.size(); i++) {
                if (listaPeces.get(i).getNombre().equalsIgnoreCase(pececito)) {
                    pos = i;
                }
            }
            while (opcionA != 6) {
                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("1.Nombre\n2.Horario\n3.Habitat\n4.Temporada\n5.Tipo de Agua\n6.¿Donado?\n7.Salir");
                opcionA = sc.nextInt();
                
                while(opcionA<0 || opcionA>6)
                    {
                        System.out.print("introduce un numeor de los indicados: ");
                        opcionA = sc.nextInt();
                        int intentos=0;
                        if (intentos==3)
                        {
                            System.out.println("has superado el limite maximo de intentos");
                            break;
                        }
                    }

                switch (opcionA)
                {
                    case 1:
                        String nuevoNom;
                        System.out.println("¿A qué nombre quieres modificar?");
                        nuevoNom = sc.next();
                        listaPeces.get(pos).setNombre(nuevoNom);
                        System.out.println("Se ha cambiado el nombre de " + pececito + " a " + nuevoNom);
                        break;
                    case 2:
                        int nuevoHorario;
                        System.out.println("¿A qué horario quieres modificar?");
                        System.out.println("Se ha cambiado el horario de " + listaPeces.get(pos).getHorario());
                        nuevoHorario = sc.nextInt();
                        int intentos=0;
                            while(opcionA<0 || opcionA>24)
                            {
                                System.out.print("introduce una de las 24h: ");
                                opcionA = sc.nextInt();
                                intentos++;
                                if (intentos==3)
                                {
                                    System.out.println("has superado el limite maximo de intentos");
                                    System.out.println("No vas a poder cambiarlo");
                                    nuevoHorario=listaPeces.get(pos).getHorario();
                                    break;
                                }
                            }
                        
                        listaPeces.get(pos).setHorario(nuevoHorario);
                        System.out.print(" a " + listaPeces.get(pos).getHorario());
                        break;
                    case 3:
                        String nuevoHabitat;
                        System.out.println("¿A qué habitat quieres modificar?");
                        System.out.println("Se ha cambiado el habitat de " + listaPeces.get(pos).getHabitat());
                        nuevoHabitat = sc.nextLine();
                        listaPeces.get(pos).setNombre(nuevoHabitat);
                        System.out.print(" a " + listaPeces.get(pos).getHabitat());
                        break;
                    case 4:
                        String nuevaTemporada;
                        System.out.println("¿A qué temporada quieres modificar?");
                        System.out.println("Se ha cambiado la temporada de " + listaPeces.get(pos).getTemporada());
                        nuevaTemporada = sc.nextLine();
                        listaPeces.get(pos).setNombre(nuevaTemporada);
                        System.out.print(" a " + listaPeces.get(pos).getTemporada());
                        break;
                    case 5:
                        String nuevoTipodeAgua;
                        System.out.println("¿Que tipo de agua es?");
                        System.out.println("Se ha cambiado el agua de " + listaPeces.get(pos).getTipoAgua());
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
    /**
     * Elmina un pez del registro del museo
     */
    public void eliminarPez() {
        int pos = 0;
        System.out.println("¿Qué pez quieres eliminar?");
        pececito = this.buscarPez();
        if (pececito.equalsIgnoreCase("")) {
            System.out.println("no puedes eliminar un pez que no existe");
        } else {
            for (int i = 0; i < listaPeces.size(); i++) {
                if (listaPeces.get(i).getNombre().equalsIgnoreCase(pececito)) {
                    pos = i;
                }
            }
        listaPeces.remove(pos);
            System.out.println("Se ha eliminado "+pececito);
        }
    }
}





