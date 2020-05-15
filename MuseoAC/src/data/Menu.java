/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 * @author Kevin Martinez y Diego Fernandez
 * El menu contiene todos los menus de los distintos tipos de usuario.
 * y las variables que tienen en comun los menus como las opciones, separadores, mesajes finales...
 */
public class Menu extends Main {
    Zonas salas[] = new Zonas[4];

    Zonapeces zonaPez = new Zonapeces("ZonaPeces");
    ZonaInsectos zonaBichos = new ZonaInsectos("ZonaBichos");
    ZonaObras zonaObras = new ZonaObras("ZonaObras");

    int opcionA;
    Scanner sc = new Scanner(System.in);

    final String OPCIONES_USER = "1. Donar elemento\n2. Ver todos los elementos\n3. Buscar elementos\n4. Ver elementos donados\n5. Ver elementos restantes\n6. Salir";
    final String OPCIONES_ADMIN = "1. Añadir elemento\n2. Modificar elemento\n3. Eliminar elemento \n4. Salir";
    final String SEPARADOR = "==========================";
    final String LINEA_FINAL = "introduce un numero: ";

    /**
     * El constructor del menu.
     */
    public Menu() {
        zonaPez.añadirPecesExistentes();
        zonaBichos.añadirBichoExistentes();
        zonaObras.añadirEsculturasExistentes();
        zonaObras.añadirPinturasExistentes();

    }

    /**
     * Este metodo muestra un menu con las zonas que tiene el museo
     *
     * @param tipo segun el usuario que inicie sesion un
     *             menu u otro, este parametro hace que el metodo sepa
     *             cual mostrar
     */
    public void menuZona(int tipo) {
        salas[0] = new Zonas("Zona Fosiles");
        salas[1] = new Zonas("Zona Peces");
        salas[2] = new Zonas("Zona Insectos");
        salas[3] = new Zonas("Zona obras");
        System.out.println(SEPARADOR);
        System.out.println("¿A que zona quieres ir?: ");
        for (int i = 0; i < salas.length; i++) {
            System.out.println((i + 1) + ". " + salas[i].nombreZona);
        }
        System.out.println("5. Salir");
        System.out.print(LINEA_FINAL);
        opcionA = sc.nextInt();

        switch (opcionA) {
            case 1:
                break;
            case 2:
                this.menuPeces(tipo);
                break;
            case 3:
                this.menuInsectos(tipo);
                break;
            case 4:
                this.menuObras(tipo);
                break;
            case 5:
                break;
        }
    }

    /**
     * Muestra el menu de la zona de peces, con las opciones para
     * usuario o admin, respectivamente
     *
     * @param tipo segun el usuario que inicie sesion un
     *             menu u otro, este parametro hace que el metodo sepa
     *             cual mostrar
     */
    public void menuPeces(int tipo) {
        switch (tipo) {
            case 0:
                System.out.println(SEPARADOR);
                System.out.println("!!Bienvenido a la zona de Peces¡¡");
                System.out.println(OPCIONES_USER);
                System.out.println(LINEA_FINAL);
                opcionA = sc.nextInt();
                switch (opcionA) {
                    case 1:
                        zonaPez.donarPez();
                        break;
                    case 2:
                        zonaPez.mostrarPeces();
                        break;
                    case 3:
                        System.out.println("¿Qué pez quieres buscar?");
                        zonaPez.buscarPez();
                        break;
                    case 4:
                        zonaPez.mostrarPecesDonados();
                        break;
                    case 5:
                        zonaPez.mostrarPecesRestantes();
                        break;
                    case 6:
                        this.menuZona(tipo);
                }
                break;

            case 1:
                System.out.println(SEPARADOR);
                System.out.println(tipo);
                System.out.println("!!Bienvenido a la zona de Peces¡¡");
                System.out.println(OPCIONES_ADMIN);
                System.out.print(LINEA_FINAL);
                opcionA = sc.nextInt();
                switch (opcionA) {
                    case 1:
                        zonaPez.añadirPez();
                        break;
                    case 2:
                        zonaPez.modificarPez();
                        break;
                    case 3:
                        zonaPez.eliminarPez();
                        break;
                    case 4:
                        this.menuZona(tipo);
                }

        }


    }

    /**
     * Muestra el menu de la zona de peces, con las opciones para
     * usuario o admin, respectivamente
     *
     * @param tipo es la variable que elgiria el tipo de menu, si es de usuario o admin.
     */
    public void menuInsectos(int tipo) {
        switch (tipo) {
            case 0:
                System.out.println(SEPARADOR);
                System.out.println("!!Bienvenido a la zona de Insectos¡¡");
                System.out.println(OPCIONES_USER);
                System.out.print(LINEA_FINAL);
                opcionA = sc.nextInt();
                switch (opcionA) {
                    case 1:
                        zonaBichos.donarBicho();
                        break;
                    case 2:
                        zonaBichos.mostrarBichos();
                        break;
                    case 3:
                        System.out.println("¿Qué pez quieres buscar?");
                        zonaBichos.buscarBicho();
                        break;
                    case 4:
                        zonaBichos.mostrarBichosDonados();
                        break;
                    case 5:
                        zonaBichos.mostrarBichosRestantes();
                        break;
                    case 6:
                        this.menuZona(tipo);
                }
                break;
            case 1:
                System.out.println(SEPARADOR);
                System.out.println("!!Bienvenido a la zona de Insectos¡¡");
                System.out.println(OPCIONES_ADMIN);
                System.out.print(LINEA_FINAL);
                opcionA = sc.nextInt();
                switch (opcionA) {
                    case 1:
                        zonaBichos.añadirBicho();
                        break;
                    case 2:
                        zonaBichos.modificarBicho();
                        break;
                    case 3:
                        zonaBichos.eliminarBicho();
                        break;
                    case 4:
                        this.menuZona(tipo);
                }
                break;
        }
    }

    /**
     * Muestra el menu de la zona de peces, con las opciones para
     * usuario o admin, respectivamente
     *
     * @param tipo es la variable que elgiria el tipo de menu, si es de usuario o admin.
     */
    public void menuObras(int tipo) 
    {
        System.out.println(SEPARADOR);
        System.out.println("!!Bienvenido a la zona de Artes¡¡");
        System.out.println("1.Ir a pinturas \n2.Ir a esculturas");
        System.out.print(LINEA_FINAL);
        opcionA = sc.nextInt();
        
        if(tipo!=0)
        {
            System.out.println("!!Bienvenido a la zona de Artes¡¡");
            System.out.println(OPCIONES_ADMIN);
        }
        
        
        switch (opcionA) 
        {
            case 1:
                if (tipo == 0) 
                {
                    final int TIPO_ARTE = 1;
                    System.out.println(SEPARADOR);
                    System.out.println(OPCIONES_USER);
                    System.out.print(LINEA_FINAL);
                    opcionA = sc.nextInt();
                    switch (opcionA) {
                        case 1:
                            zonaObras.donarObra(TIPO_ARTE);
                            break;
                        case 2:
                            zonaObras.mostrarObras(TIPO_ARTE);
                            break;
                        case 3:
                            System.out.println("¿Qué obra quieres buscar?");
                            zonaObras.buscarObra(TIPO_ARTE);
                            break;
                        case 4:
                            zonaObras.mostrarObrasDonados(TIPO_ARTE);
                            break;
                        case 5:
                            zonaObras.mostrarObrasRestantes(TIPO_ARTE);
                            break;
                        case 6:
                            this.menuZona(tipo);
                    }


                } 
                else 
                {
                    final int TIPO_ARTE = 1;
                    System.out.print(LINEA_FINAL);
                    opcionA = sc.nextInt();
                    switch (opcionA)
                    {
                        case 1:
                            zonaObras.añadirObra(TIPO_ARTE);
                            break;
                        case 2:
                            zonaObras.modificarPintura();
                            break;
                        case 3:
                            zonaObras.eliminarPinturas();
                            break;
                        case 4:
                            this.menuZona(tipo);
                            break;
                    }

                }
                break;
            case 2:
                if (tipo == 0)
                {
                    final int ARTE = 2;
                    System.out.println(SEPARADOR);
                    System.out.println(OPCIONES_USER);
                    System.out.print(LINEA_FINAL);
                    opcionA = sc.nextInt();
                    switch (opcionA) {
                        case 1:
                            zonaObras.donarObra(ARTE);
                            break;
                        case 2:
                            zonaObras.mostrarObras(ARTE);
                            break;
                        case 3:
                            System.out.println("¿Qué obra quieres buscar?");
                            zonaObras.buscarObra(ARTE);
                            break;
                        case 4:
                            zonaObras.mostrarObrasDonados(ARTE);
                            break;
                        case 5:
                            zonaObras.mostrarObrasRestantes(ARTE);
                            break;
                        case 6:
                            this.menuZona(tipo);
                            break;
                    }
                }
                else 
                {
                    System.out.print(LINEA_FINAL);
                    opcionA = sc.nextInt();
                    final int ARTE_TIPO = 2;
                    switch (opcionA) 
                    {
                        case 1:
                            zonaObras.añadirObra(ARTE_TIPO);
                            break;
                        case 2:
                            zonaObras.modificarEscultura();
                            break;
                        case 3:
                            zonaObras.eliminarEscultura();
                            break;
                        case 4:
                            this.menuZona(tipo);
                            break;
                    }
                    break;

                }
                break;
        }
    }

    /**
     * Muestra el menu de la zona de peces, con las opciones para
     * usuario o admin, respectivamente
     * <p>
     * (falta añadir el int)
     * (falta la estructura de los fosiles y las partes)
     */
    public void menuFosiles() {
        System.out.println(SEPARADOR);
        System.out.println("opciones");
        System.out.println(LINEA_FINAL);
        opcionA = sc.nextInt();
        switch (opcionA) {
        }
    }
}
