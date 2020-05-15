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
 * La clase de Login que se encargara de poder iniciar sesion segun el tipo de usuario
 */
public class Login extends Menu
{
    int login;
    String leerUsuarioC, leerContraseñaC;
    public Login() {}
    /**
     * Este método hace que se vea el menú de login y podemos iniciar sesión como usuario o administrador
     * Depende de como hemos iniciado sesión llamaremos al metodo "MenuUsuario/MenuAdministrador"
     * Tambien hemos creado un objeto "Menu" llamado "menu1" para poder llamar a los métodos correspondientes a esa clase.
     */
    public void VisualizarLogin()
    {
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu();
        System.out.println("Bienvenido al Museo AC");
        while (login != 3)
        {
            System.out.println("¿Quieres iniciar sesion como usuario o administrador?\n1. Usuario\n" +
                    "2. Administrador\n3. Salir");
            
            System.out.print("Escribe un numero: ");
            
            login = sc.nextInt();
            sc.nextLine();
            switch(login)
            {
                case 1:
                    
                    int tipo=0;//variable que hara decicidir a los menos si eligen menu de admin o user
                    System.out.println("==========================");
                    System.out.print("Escribe tu nombre de usuario: ");
                    leerUsuarioC = sc.next();
                    System.out.print("Escribe tu contraseña: ");
                    leerContraseñaC = sc.next();
                    if(leerContraseñaC.equalsIgnoreCase("usuario1234"))
                    {
                        menu1.menuZona(tipo);
                    }
                    break;
                case 2:
                    
                    int tipo2=1;
                    System.out.println("==========================");
                    System.out.print("Escribe tu nombre de usuario:");
                    leerUsuarioC = sc.next();
                    System.out.print("Escribe tu contraseña:");
                    leerContraseñaC = sc.next();
                    if(leerContraseñaC.equalsIgnoreCase("admin1234"))
                    {
                        menu1.menuZona(tipo2);
                    }
                    break;
                        
            }
        break;}
    }
}
    
