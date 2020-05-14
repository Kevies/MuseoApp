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
 */
public class Menu extends Main{
    Zonapeces ejemplo = new Zonapeces();
    int opcionA;
    Scanner sc = new Scanner(System.in);
    /**
     * El constructor del menu.
     */
    public Menu() {
        ejemplo.anadirExistencias();
    }
    /**
     * El menu del administrador, aqui albergara los distintos métodos en futuras actualizaciones.
     */
    public void MenuAdmin(){
        
        while (opcionA != 4) {
                        System.out.println("1. Añadir elemento\n2. Modificar elemento\n" +
                                "3. Eliminar elemento \n4. Salir");
                        opcionA = sc.nextInt();
                        sc.nextLine(); 
                        switch (opcionA) {
                            case 1:
                                System.out.println("==========================");
                                //ac.añadir();
                                System.out.println("==========================");
                                break;
                            case 2:
                                System.out.println("==========================");
                                //ac.modificar();
                            case 3:
                                System.out.println("==========================");
                                //ac.eliminar();
                                break;                           
                        }
                    }
        System.out.println("Gracias por todo");
    }
    /**
     * El menu del usuario, aqui albergara los distintos métodos en futuras actualizaciones.
     */
    public void MenuUsuario(){
        while (opcionA != 6) {
                        System.out.println("1. Donar elemento\n2. Ver todos los elementos\n" +
                                "3. Buscar elementos \n4. Ver elementos donados\n5. Ver elementos restantes\n6. Salir");
                        opcionA = sc.nextInt();
                        sc.nextLine(); 
                        switch (opcionA) {
                            case 1:
                                System.out.println("==========================");
                                //ac.donar();
                                System.out.println("Has donado");
                                System.out.println("==========================");
                                break;
                            case 2:
                                System.out.println("==========================");
                                ejemplo.verElementos();
                            case 3:
                                System.out.println("==========================");
                                //ac.buscar();
                                System.out.println("Estas buscando un fósil");
                                break;
                            case 4:
                                System.out.println("==========================");
                                //ac.verDonados();
                                System.out.println("Estas viendo tus fósiles donados");
                            case 5:
                                System.out.println("==========================");
                                //ac.verRestantes();
                                System.out.println("Estas viendo los fósiles que te faltan");
                        }
                    }
        System.out.println("Gracias por todo");
    }
    
}
