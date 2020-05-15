/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Kevin Martinez y Diego Fernandez
 */
public class Main {

    /**
     * @param args El main va a contener la creación un objeto "Museo" llamado "ac"
     * por otro lado va crear un objeto "Login" llamado "iniciarsesion" y despues va a llamar al método "VisualizarLogin" para mostrar poder iniciar sesión.
     * Y luego va a crearse un objeto "Menu" llamado "menu1".
     */
    public static void main(String[] args) {
        Login iniciarsesion = new Login();
        iniciarsesion.VisualizarLogin();
        
    }
    
}
