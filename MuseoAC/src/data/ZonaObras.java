/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kevie
 */
public class ZonaObras extends Zonas {

    String pinturita;
    String esculturita;
    final String SEPARADOR = "====================";
    Scanner sc = new Scanner(System.in);
    ArrayList<Pinturas> listaPint = new ArrayList<>();
    ArrayList<Esculturas> listaEsc = new ArrayList<>();

    public ZonaObras(String nombreZona) {
        super(nombreZona);
    }

    public void añadirPinturasExistentes() {

        listaPint.add(new Pinturas("Cuadro español", "Las Meninas", "Diego de Velazquez", 1656, true, "Óleo sobre lienzo"));
        listaPint.add(new Pinturas("Retrato Italiano", "La Mona Lisa", "Leonardo Da Vinci", 1503, true, "Óleo sobre lienzo"));
        listaPint.add(new Pinturas("Bodegón", "Manzanas y narajas", "Paul Cezanne", 1899, false, "Óleo sobre lienzo"));

    }

    public void añadirEsculturasExistentes() {

        listaEsc.add(new Esculturas("Busto Antiguo", "Busto de Nefertiti", "Thutmose", -1345, true, "Piedra caliza y yeso"));
        listaEsc.add(new Esculturas("Cabeza colosal", "Cabeza colosal olmeca", "Anónimo", -1500, true, "Basalto"));
        listaEsc.add(new Esculturas("Estatua alada", "Victoria de Samotracia", "Anonimo", -190, false, "Marmol de Paros"));

    }

    public String buscarObra(int tipo) {
        if (tipo == 1) {

            pinturita = sc.nextLine();
            for (int i = 0; i < listaPint.size(); i++) {
                if (listaPint.get(i).getNombre().equalsIgnoreCase(pinturita)) {
                    pinturita = listaPint.get(i).getNombre();
                    System.out.println("se ha encontrado la obra " + pinturita + " en la lista.");
                    return pinturita;
                }
            }
        } else {
            esculturita = sc.nextLine();
            for (int i = 0; i < listaEsc.size(); i++) {
                if (listaEsc.get(i).getNombre().equalsIgnoreCase(esculturita)) {
                    esculturita = listaEsc.get(i).getNombre();
                    System.out.println("se ha encontrado la obra " + esculturita + " en la lista.");
                    return esculturita;
                }
            }
        }

        System.out.println("No se ha encontrado la obra");
        return "";
    }

    public void donarObra(int tipo) 
    {
        System.out.println("¿Qué obra quieres donar?");
        if (tipo == 1) {
            pinturita = this.buscarObra(1);
            if (pinturita.equalsIgnoreCase("")) {
                System.out.println("no puedes donar una obra que no existe");
            } else {
                for (int i = 0; i < listaPint.size(); i++) {
                    if (listaPint.get(i).getNombre().equalsIgnoreCase(pinturita)) {
                        if (listaPint.get(i).isDonado() == true) {
                            System.out.println("Esta obra ya ha sido donado.");
                        } else {
                            listaPint.get(i).setDonado(true);
                            System.out.println("Esta obra " + pinturita + " se ha donado.");
                        }
                    }
                }
            }
        } else {
            esculturita = this.buscarObra(1);
            if (esculturita.equalsIgnoreCase("")) {
                System.out.println("no puedes donar una obra que no existe");
            } else {
                for (int i = 0; i < listaEsc.size(); i++) {
                    if (listaEsc.get(i).getNombre().equalsIgnoreCase(esculturita)) {
                        if (listaEsc.get(i).isDonado() == true) {
                            System.out.println("Esta obra ya ha sido donado.");
                        } else {
                            listaEsc.get(i).setDonado(true);
                            System.out.println("Esta obra " + esculturita + " se ha donado.");
                        }
                    }
                }
            }
        }

    }

    public void mostrarObras(int tipo) {
        if (tipo == 1) {
            for (int i = 0; i < listaPint.size(); i++) {
                System.out.println("- Alias: " + listaPint.get(i).getAlias() + "*** Nombre: " + listaPint.get(i).getNombre());
            }
            System.out.println(SEPARADOR);
        } else {
            for (int i = 0; i < listaEsc.size(); i++) {
                System.out.println("- Alias: " + listaEsc.get(i).getAlias() + "*** Nombre: " + listaEsc.get(i).getNombre());
            }
            System.out.println(SEPARADOR);
        }
    }

    public void mostrarObrasDonados(int tipo) {
        if (tipo == 1) {
            for (int i = 0; i < listaPint.size(); i++) {
                if (listaPint.get(i).isDonado() == true) {
                    System.out.println("La obra " + listaPint.get(i).getNombre() + " esta donado.");
                }
            }
            System.out.println(SEPARADOR);
        } else {

            for (int i = 0; i < listaEsc.size(); i++) {
                if (listaEsc.get(i).isDonado() == true) {
                    System.out.println("La obra " + listaEsc.get(i).getNombre() + " esta donado.");
                }
            }
            System.out.println(SEPARADOR);

        }

    }

    public void mostrarObrasRestantes(int tipo) {
        if (tipo == 1) {
            for (int i = 0; i < listaPint.size(); i++) {
                if (listaPint.get(i).isDonado() == false) {
                    System.out.println("El Obra " + listaPint.get(i).getNombre() + " no esta donado.");
                }
            }
            System.out.println(SEPARADOR);
        } else {
            for (int i = 0; i < listaEsc.size(); i++) {
                if (listaEsc.get(i).isDonado() == false) {
                    System.out.println("El Obra " + listaEsc.get(i).getNombre() + " no esta donado.");
                }
            }
            System.out.println(listaEsc);
        }

    }

    /**
     *
     */
    public void añadirObra(int opcion)
    {
        String aliasNuevo, nombreNuevo, autorNuevo, TecnicaNueva, materialNuevo;
        int FechaNueva;
        switch (opcion) {
            case 1:
                
                System.out.print("Introduce el alias nuevo: ");
                aliasNuevo=sc.nextLine();

                System.out.print("Introduce el nombre nuevo: ");
                nombreNuevo=sc.next();

                System.out.print("Introduce el Autor de la nueva obra: ");
                autorNuevo =sc.next();

                System.out.print("Introduce la fecha de la obra: ");
                FechaNueva = sc.nextInt();

                System.out.print("¿Que técnica usa?: ");
                TecnicaNueva = sc.next();
                
                sc.nextLine();

                listaPint.add(new Pinturas(aliasNuevo, nombreNuevo, autorNuevo, FechaNueva, false, TecnicaNueva));
                
                System.out.println("Se ha añadido una la pintura: "+nombreNuevo);
                break;
            case 2:
                System.out.print("Introduce el alias nuevo: ");
                aliasNuevo = sc.next();

                System.out.print("Introduce el nombre nuevo: ");
                nombreNuevo = sc.next();

                System.out.print("Introduce el Autor de la nueva obra: ");
                autorNuevo = sc.next();

                System.out.print("Introduce la fecha de la obra: ");
                FechaNueva = sc.nextInt();

                System.out.print("¿Que material usa?");
                materialNuevo = sc.next();
                
                sc.nextLine();

                listaEsc.add(new Esculturas(aliasNuevo, nombreNuevo, autorNuevo, FechaNueva, false, materialNuevo));
                System.out.println("Se ha añadido la escultura: "+nombreNuevo);
                break;
        }
    }
    
    public void modificarPintura()
    {
        int pos = 0;
        int opcionA = 0;
        System.out.println(SEPARADOR);
        System.out.println("¿Qué pintura quieres modificar?");
        pinturita = this.buscarObra(1);
        if (pinturita.equalsIgnoreCase("")) {
            System.out.println("no puedes donar una pintura que no existe");
        } 
        else 
        {
            for (int i = 0; i < listaPint.size(); i++) 
            {
                if (listaPint.get(i).getNombre().equalsIgnoreCase(pinturita)) 
                {
                    pos = i;
                }
            }
            while (opcionA != 7) {
                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("1.Nombre\n2.Alias\n3.Autort\n4.Fecha\n5.Donado\n6.Tecnica\n7.Salir");
                opcionA = sc.nextInt();
                System.out.println("Pulsa intro para continuar");
                sc.nextLine();
                

                switch (opcionA) 
                {
                    case 1:
                        String nuevoNom;
                        System.out.println("¿A qué nombre quieres modificar?");
                        nuevoNom = sc.next();
                        listaPint.get(pos).setNombre(nuevoNom);
                        System.out.println("Se ha cambiado el nombre de " + pinturita + " a " + nuevoNom);
                        break;
                    case 2:
                        String nuevoAlias;
                        System.out.println("escribe un Alias");
                        nuevoAlias = sc.nextLine();
                        System.out.println("Se ha cambiado el Alias de " + listaPint.get(pos).getAlias());
                        listaPint.get(pos).setAlias(nuevoAlias);
                        System.out.print(" a " + listaPint.get(pos).getAlias());
                        break;
                    case 3:
                        String nuevoAutor;
                        System.out.println("Escribe un autor");
                        nuevoAlias = sc.nextLine();
                        System.out.println("Se ha cambiado el autor de " + listaPint.get(pos).getAutor());
                        nuevoAutor = sc.nextLine();
                        listaPint.get(pos).setAutor(nuevoAutor);
                        System.out.print(" a " + listaPint.get(pos).getAutor());
                        break;
                    case 4:
                        int nuevaFecha;
                        System.out.println("Escribe una fecha");
                        nuevaFecha = sc.nextInt();
                        System.out.println("Se ha cambiado la fecha de " + listaPint.get(pos).getFecha());
                        listaPint.get(pos).setFecha(nuevaFecha);
                        System.out.print(" a " + listaPint.get(pos).getFecha());
                        break;
                    case 5:
                        boolean donado;
                        System.out.println("Cambiar estado de donado:");
                        donado = sc.nextBoolean();
                        System.out.println("Se ha cambiado el estado de " + listaPint.get(pos).isDonado());
                        listaPint.get(pos).setDonado(donado);
                        System.out.print(" a " + listaPint.get(pos).isDonado());
                        break;
                    case 6:
                        String tecnica;
                        System.out.println("Escribe la tecnica: ");
                        tecnica = sc.nextLine();
                        System.out.println("Se ha cambiado la tecnica de " + listaPint.get(pos).getTecnicas());
                        listaPint.get(pos).setTecnicas(tecnica);
                        System.out.print(" a " + listaPint.get(pos).getTecnicas());
                        break;
                    case 7:
                        break;
                }
            }
        }
    
    }
    
    public void modificarEscultura()
    {
    int pos = 0;
        int opcionA = 0;
        System.out.println(SEPARADOR);
        System.out.println("¿Qué escultura quieres modificar?");
        esculturita = this.buscarObra(2);
        if (esculturita.equalsIgnoreCase("")) {
            System.out.println("no puedes donar una escultura que no existe");
        } 
        else 
        {
            for (int i = 0; i < listaEsc.size(); i++) 
            {
                if (listaEsc.get(i).getNombre().equalsIgnoreCase(esculturita)) 
                {
                    pos = i;
                }
            }
            while (opcionA != 7) {
                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("1.Nombre\n2.Alias\n3.Autort\n4.Fecha\n5.Donado\n6.Material\n7.Salir");
                opcionA = sc.nextInt();
                
                sc.nextLine();

                switch (opcionA) 
                {
                    case 1:
                        String nuevoNom;
                        System.out.println("¿A qué nombre quieres modificar?");
                        nuevoNom = sc.next();
                        listaEsc.get(pos).setNombre(nuevoNom);
                        System.out.println("Se ha cambiado el nombre de " + esculturita + " a " + nuevoNom);
                        break;
                    case 2:
                        String nuevoAlias;
                        System.out.println("escribe un Alias");
                        nuevoAlias = sc.nextLine();
                        System.out.println("Se ha cambiado el Alias de " + listaEsc.get(pos).getAlias());
                        listaEsc.get(pos).setAlias(nuevoAlias);
                        System.out.print(" a " + listaEsc.get(pos).getAlias());
                        break;
                    case 3:
                        String nuevoAutor;
                        System.out.println("Escribe un autor");
                        nuevoAlias = sc.nextLine();
                        System.out.println("Se ha cambiado el autor de " + listaEsc.get(pos).getAutor());
                        nuevoAutor = sc.nextLine();
                        listaEsc.get(pos).setAutor(nuevoAutor);
                        System.out.print(" a " + listaEsc.get(pos).getAutor());
                        break;
                    case 4:
                        int nuevaFecha;
                        System.out.println("Escribe una fecha");
                        nuevaFecha = sc.nextInt();
                        System.out.println("Se ha cambiado la fecha de " + listaEsc.get(pos).getFecha());
                        listaEsc.get(pos).setFecha(nuevaFecha);
                        System.out.print(" a " + listaEsc.get(pos).getFecha());
                        break;
                    case 5:
                        boolean donado;
                        System.out.println("Cambiar estado de donado:");
                        donado = sc.nextBoolean();
                        System.out.println("Se ha cambiado el estado de " + listaEsc.get(pos).isDonado());
                        listaEsc.get(pos).setDonado(donado);
                        System.out.print(" a " + listaEsc.get(pos).isDonado());
                        break;
                    case 6:
                        String material;
                        System.out.println("Escribe el material: ");
                        material = sc.nextLine();
                        System.out.println("Se ha cambiado la tecnica de " + listaEsc.get(pos).getMaterial());
                        listaEsc.get(pos).setMaterial(material);
                        System.out.print(" a " + listaEsc.get(pos).getMaterial());
                        break;
                    case 7:
                        break;
                }
            }
        }
    
    }
    
    public void eliminarPinturas()
    {
        int pos = 0;
        System.out.println("¿Que pintura quieres eliminar?");
        pinturita = this.buscarObra(1);
        if (pinturita.equalsIgnoreCase("")) 
        {
            System.out.println("no puedes eliminar un pintura que no existe");
        } 
        else 
        {
            for (int i = 0; i < listaPint.size(); i++) 
            {
                if (listaPint.get(i).getNombre().equalsIgnoreCase(pinturita)) 
                {
                    pos = i;
                }
            }
            listaPint.remove(pos);
            System.out.println("Se ha eliminado " + pinturita);
        }
    }
    
    public void eliminarEscultura()
    {
        int pos = 0;
        System.out.println("¿Que escultura quieres eliminar?");
        esculturita = this.buscarObra(2);
        if (esculturita.equalsIgnoreCase("")) 
        {
            System.out.println("no puedes eliminar un escultura que no existe");
        } 
        else 
        {
            for (int i = 0; i < listaEsc.size(); i++) 
            {
                if (listaEsc.get(i).getNombre().equalsIgnoreCase(esculturita)) 
                {
                    pos = i;
                }
            }
            listaEsc.remove(pos);
            System.out.println("Se ha eliminado " + esculturita);
        }
    }
}




     

