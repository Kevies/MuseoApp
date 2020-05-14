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
    Zonapeces ejemplo = new Zonapeces();
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
    public void MenuAdmin(){
        
        while (opcionA != 4) {
                        System.out.println(opcionesAdmin);
                        System.out.print(numfinal);
                        opcionA = sc.nextInt();
                        sc.nextLine();
                        
                        switch (opcionA) {
                            case 1:
                                System.out.println(separador);
                                //ac.añadir();
                                System.out.println(separador);
                                break;
                            case 2:
                                System.out.println(separador);
                                //ac.modificar();
                            case 3:
                                System.out.println(separador);
                                //ac.eliminar();
                                break;                           
                        }
                    }
        System.out.println("Gracias por todo");
    }
    /**
     * El menu del usuario, aqui albergara los distintos métodos en futuras actualizaciones.
     * (Puede que esto se borre en actualizaciones)
     */
    public void MenuUsuario(){
       
        while (opcionA != 6) {
                        System.out.println(opcionesUsuario);
                        System.out.print(numfinal);
                        opcionA = sc.nextInt();
                        sc.nextLine(); 
                        switch (opcionA) {
                            case 1:
                                System.out.println(separador);
                                //ac.donar();
                                System.out.println("Has donado");
                                System.out.println(separador);
                                break;
                            case 2:
                                System.out.println(separador);
                                ejemplo.verElementos();
                            case 3:
                                System.out.println(separador);
                                //ac.buscar();
                                System.out.println("Estas buscando un fósil");
                                break;
                            case 4:
                                System.out.println(separador);
                                //ac.verDonados();
                                System.out.println("Estas viendo tus fósiles donados");
                            case 5:
                                System.out.println(separador);
                                //ac.verRestantes();
                                System.out.println("Estas viendo los fósiles que te faltan");
                        }
                    }
        System.out.println("Gracias por todo");
    }
    /**
     * Este metodo muestra un menu con las zonas que tiene el museo
     * 
     * @param tipo segun el usuario que inicie sesion un
     * menu u otro, este parametro hace que el metodo sepa
     * cual mostrar
     */
    public void menuZona(int tipo)
    {
        System.out.println(separador);
        System.out.println("¿A que zona quieres ir?: ");
        System.out.println("1.Fosiles \n2.Peces \n3.Insectos \n4.Obras");
        System.out.print(numfinal);
        opcionA=sc.nextInt();
        
        switch(opcionA)
        {
            case 1:
                
            case 2:
                this.menuPeces(tipo);
                break;
            case 3:
                this.menuInsectos();
                break;
            case 4:
                this.menuObras();
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
    switch(tipo)
        {
        case 0:
            System.out.println(separador);
            System.out.println("!!Bienvenido a la zona de Peces¡¡");
            System.out.println(opcionesUsuario);
            break;
        
        case 1:
            System.out.println(separador);
            System.out.println(tipo);
            System.out.println("!!Bienvenido a la zona de Peces¡¡");
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
     */
    public void menuInsectos()
    {
    System.out.println(separador);
    System.out.println("!!Bienvenido a la zona de Insectos¡¡");
    System.out.println(opcionesUsuario);
    System.out.print(numfinal);
    }
    /**
     * Muestra el menu de la zona de peces, con las opciones para
     * usuario o admin, respectivamente 
     * 
     * (falta añadir el int)
     * (falta un if dentro de los case para que elija a admin o user)
     */
    public void menuObras()
    {
    System.out.println(separador);
    System.out.println("!!Bienvenido a la zona de Artes¡¡");
    System.out.println("1.Ir a pinturas \n2.Ir a esculturas");
    System.out.print(numfinal);
    opcionA=sc.nextInt();
        switch(opcionA)
        {
            case 1:
                System.out.println(separador);
                System.out.println(opcionesUsuario);
                
            case 2:
                System.out.println(separador);
                System.out.println(opcionesUsuario);
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
}
