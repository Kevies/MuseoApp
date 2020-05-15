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
    Zonas salas = new Zonas("sala");
    Zonapeces ejemplo = new Zonapeces("salaspez");
    int opcionA;
    Scanner sc = new Scanner(System.in);
    String opcionesUsuario="1. Donar elemento\n2. Ver todos los elementos\n3. Buscar elementos\n4. Ver elementos donados\n5. Ver elementos restantes\n6. Salir";
    String opcionesAdmin="1. Añadir elemento\n2. Modificar elemento\n3. Eliminar elemento \n4. Salir";
    String separador="==========================";
    String numfinal="introduce un numero: ";

    /**
     * El constructor del menu.
     */
    public Menu() {
        ejemplo.anadirExistencias();

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
        salas.anadirExistencias();
        System.out.println(separador);
        System.out.println("¿A que zona quieres ir?: ");
        salas.visualizarZonas();
        System.out.print(numfinal);
        opcionA=sc.nextInt();
        
        switch(opcionA)
        {
            case 1:

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
            System.out.println(separador);
            System.out.println("!!Bienvenido a la zona de Peces¡¡");
            System.out.println(opcionesUsuario);
            System.out.println(numfinal);
            opcionA = sc.nextInt();
            switch (opcionA) {
                case 1:
                    ejemplo.donarPez();
                    break;
                case 2:
                    ejemplo.mostrarPeces();
                    break;
                case 3:
                    System.out.println("¿Qué pez quieres buscar?");
                    ejemplo.buscarPez();
                    break;
                case 4:
                    ejemplo.mostrarPecesDonados();
                    break;
                case 5:
                    ejemplo.mostrarPecesRestantes();
                    break;
                case 6:
                    this.menuZona(tipo);
            }
            break;

        case 1:
                System.out.println(separador);
                System.out.println(tipo);
                System.out.println("!!Bienvenido a la zona de Peces¡¡");
                System.out.println(opcionesAdmin);
                System.out.print(numfinal);
                opcionA = sc.nextInt();
                switch (opcionA) {
                    case 1:
                        ejemplo.añadirPez();
                        break;
                    case 2:
                        ejemplo.modificarPez();
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
        switch(tipo){
            case 0:
                System.out.println(separador);
                System.out.println("!!Bienvenido a la zona de Insectos¡¡");
                System.out.println(opcionesUsuario);
                System.out.print(numfinal);
                break;
            case 1:
                System.out.println(separador);
                System.out.println("!!Bienvenido a la zona de Insectos¡¡");
                System.out.println(opcionesAdmin);
                System.out.print(numfinal);
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
    System.out.println(separador);
    System.out.println("!!Bienvenido a la zona de Artes¡¡");
    System.out.println("1.Ir a pinturas \n2.Ir a esculturas");
    System.out.print(numfinal);
    opcionA=sc.nextInt();
        switch(opcionA)
        {
            case 1:
                if(tipo==0){
                    System.out.println(separador);
                    System.out.println(opcionesUsuario);
                }
                else{
                    System.out.println(separador);
                    System.out.println(opcionesAdmin);
                }
                break;
            case 2:
                if(tipo==0){
                    System.out.println(separador);
                    System.out.println(opcionesUsuario);
                }
                else{
                    System.out.println(separador);
                    System.out.println(opcionesAdmin);
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
        System.out.println(separador);
        System.out.println("opciones");
        System.out.println(numfinal);
        opcionA=sc.nextInt();
        switch(opcionA){}
    }

    public int menuModificarPez(){
        System.out.println(separador);
        System.out.println("¿Qué quieres modificar?");
        System.out.println("1. Nombre\n2.Horario\n3.Habitat\n4.Temporada\n5.Tipo de Agua\n6.Salir");
        opcionA = sc.nextInt();
        return opcionA;
    }
}
