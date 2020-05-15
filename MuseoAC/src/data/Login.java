
package data;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Martinez y Diego Fernandez
 * La clase de Login que se encargara de poder iniciar sesion segun el tipo de usuario
 */
public class Login
{
    int opcionLogin;
    String leerUsuarioC, leerContraseñaC;
    public Login() {}
    Menu menu1 = new Menu();
    /**
     * Este método hace que se vea el menú de opcionLogin y podemos iniciar sesión como usuario o administrador
 Depende de como hemos iniciado sesión llamaremos al metodo "MenuUsuario/MenuAdministrador"
 Tambien hemos creado un objeto "Menu" llamado "menu1" para poder llamar a los métodos correspondientes a esa clase.
     */
    public void VisualizarLogin()
    {
        String userpass="usuario1234";
        String adminpass="admin1234";
        
        opcionLogin=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Museo AC");
        
            System.out.println("¿Quieres iniciar sesion como usuario o administrador?\n1. Usuario\n" +
                    "2. Administrador\n3. Salir");
            
            int intentos=0;
            do{
                System.out.print("Introduce un numero de los indicados: ");
                try
                {
                opcionLogin = sc.nextInt();
                    sc.nextLine();
                    intentos++;
                    if (intentos==3) 
                    {
                        System.out.println("Lo siento has superado el numero de intentos");
                        break;
                    }
                }catch(InputMismatchException e)
                {
                    System.out.println("caracter no valido se reiniciara la aplicacion");
                    System.out.println("===================");
                    this.VisualizarLogin();
                    break;
                    
                }
                   
            }while(opcionLogin!=1 && opcionLogin!=2 && opcionLogin!=3);
            
            switch(opcionLogin)
            {
                case 1:
                    
                    int tipo=0;//variable que hara decicidir a los menos si eligen menu de admin o user
                    System.out.println("==========================");
                    System.out.print("Escribe tu nombre de usuario: ");
                    leerUsuarioC = sc.next();
                    System.out.print("Escribe tu contraseña: ");
                    leerContraseñaC = userpass;//sc.next();
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
                    leerContraseñaC = adminpass;//sc.next();
                    if(leerContraseñaC.equalsIgnoreCase("admin1234"))
                    {
                        menu1.menuZona(tipo2);
                    }
                    break;
                        
    }
    
    
    }
}
    
