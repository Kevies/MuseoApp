/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Kevin Martinez y Diego Fernandez
 * El menu contiene todos los menus de los distintos tipos de usuario.
 * y las variables que tienen en comun los menus como las opciones, separadores, mesajes finales...
 */
public class Menu extends Main{
    Zonas salas[] = new Zonas[4];
    
    Zonapeces zonaPez = new Zonapeces("ZonaPeces");
    ZonaInsectos zonaBichos = new ZonaInsectos("ZonaBichos");
    int opcionA;
    Scanner sc = new Scanner(System.in);
    final String OPCIONES_USER="1. Donar elemento\n2. Ver todos los elementos\n3. Buscar elementos\n4. Ver elementos donados\n5. Ver elementos restantes\n6. Salir";
    final String OPCIONES_ADMIN="1. Añadir elemento\n2. Modificar elemento\n3. Eliminar elemento \n4. Salir";
    final String SEPARADOR="==========================";
    final String LINEA_FINAL="introduce un numero: ";

    /**
     * El constructor del menu.
     */
    public Menu() {
        zonaPez.añadirPecesExistentes();
        zonaBichos.añadirBichoExistentes();

    }
    /**
     * El menu del administrador, aqui albergara los distintos métodos en futuras actualizaciones.
     * (Puede que esto se borre en actualizaciones)
     */
    /**
     * El menu del usuario, aqui albergara los distintos métodos en futuras actualizaciones.
     * (Puede que esto se borre en actualizaciones)
     */

    /**
     * Este metodo muestra un menu con las zonas que tiene el museo
     * 
     * @param tipo segun el usuario que inicie sesion un
     * menu u otro, este parametro hace que el metodo sepa
     * cual mostrar
     */
    public void menuZona(int tipo)
    {
        salas [0]= new Zonas("Zona Fosiles");
        salas [1]= new Zonas("Zona Peces");
        salas [2]= new Zonas("Zona Insectos");
        salas [3]= new Zonas("Zona obras");
        System.out.println(SEPARADOR);
        System.out.println("¿A que zona quieres ir?: ");
        for (int i = 0; i < salas.length; i++) {
            System.out.println((i+1)+". "+salas[i].nombreZona);
        }
        System.out.println("5. Salir");
        System.out.print(LINEA_FINAL);
        opcionA=sc.nextInt();
        
        switch(opcionA)
        {
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
     * menu u otro, este parametro hace que el metodo sepa
     * cual mostrar
     */
    public void menuPeces(int tipo)
    {
    switch(tipo) {
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
                switch (opcionA) 
                {
                    case 1:
                        zonaPez.añadirPez();
                        break;
                    case 2:
                        zonaPez.modificarPez();
                        break;
                    case 3:
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
     * (falta añadir el int)
     */
    public void menuInsectos(int tipo)
    {
        switch(tipo)
        {
            case 0:
                System.out.println(SEPARADOR);
                System.out.println("!!Bienvenido a la zona de Insectos¡¡");
                System.out.println(OPCIONES_USER);
                System.out.print(LINEA_FINAL);
                opcionA = sc.nextInt();
                    switch(opcionA)
                    {
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
                switch (opcionA) 
                {
                    case 1:
                        zonaBichos.añadirBicho();
                        break;
                    case 2:
                        zonaBichos.modificarBicho();
                        break;
                    case 3:
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
     * (falta añadir el int)
     * (falta un switch dentro de los case para que elija a admin o user, segun lo que elija colocar los metodos o de pintura o de escultura)
     */
    public void menuObras(int tipo)
    {
    System.out.println(SEPARADOR);
    System.out.println("!!Bienvenido a la zona de Artes¡¡");
    System.out.println("1.Ir a pinturas \n2.Ir a esculturas");
    System.out.print(LINEA_FINAL);
    opcionA=sc.nextInt();
        switch(opcionA)
        {
            case 1:
                if(tipo==0){
                    System.out.println(SEPARADOR);
                    System.out.println(OPCIONES_USER);
                }
                else{
                    System.out.println(SEPARADOR);
                    System.out.println(OPCIONES_ADMIN);
                }
                break;
            case 2:
                if(tipo==0){
                    System.out.println(SEPARADOR);
                    System.out.println(OPCIONES_USER);
                }
                else{
                    System.out.println(SEPARADOR);
                    System.out.println(OPCIONES_ADMIN);
                }
            break;
        }
    }
    /**
     *  Muestra el menu de la zona de peces, con las opciones para
     * usuario o admin, respectivamente 
     * 
     * (falta añadir el int)
     * (falta la estructura de los fosiles y las partes)
     */
    public void menuFosiles()
    {
        System.out.println(SEPARADOR);
        System.out.println("opciones");
        System.out.println(LINEA_FINAL);
        opcionA=sc.nextInt();
        switch(opcionA){}
    }

    public int menuModificarPez(){
        System.out.println(SEPARADOR);
        System.out.println("¿Qué quieres modificar?");
        System.out.println("1. Nombre\n2.Horario\n3.Habitat\n4.Temporada\n5.Tipo de Agua\n6.Salir");
        opcionA = sc.nextInt();
        return opcionA;
    }
}
