/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author kevie
 */
public class ZonaInsectos extends Zonas {
    
    String bichito;
    String separador = "====================";
    Scanner sc = new Scanner(System.in);
    ArrayList<Insecto> listaBichos = new ArrayList<>();
    
    public ZonaInsectos(String nombreZona) {
        super(nombreZona);
    }
    
     public void añadirBichoExistentes() {
        listaBichos.add(new Insecto(24, "Avispa", "Todo el año", "Copa de los arboles",true,false));
        listaBichos.add(new Insecto(20, "Tarántula","Septiembre-Abril","Suelo",false,true));
        listaBichos.add(new Insecto(24,"Caracol","Todo el año(lluvia)","Rocas",false,true));

    }
     
      public String buscarBicho() 
      {
        bichito = sc.nextLine();
        for (int i = 0; i < listaBichos.size(); i++)
        {
            if (listaBichos.get(i).getNombre().equalsIgnoreCase(bichito))
            {
                bichito = listaBichos.get(i).getNombre();
                System.out.println("se ha encontrado el insecto " + bichito + " en la lista.");
                return bichito;
            }
        }   System.out.println("No existe el insecto que ha escrito.");
        return "";
   
       }
      
      public void donarBicho() 
      {

        System.out.println("¿Qué insecto quieres donar?");
        bichito = this.buscarBicho();
        if (bichito.equalsIgnoreCase("")) 
        {
            System.out.println("no puedes donar un insecto que no existe");
        } else {

            for (int i = 0; i < listaBichos.size(); i++) 
            {
                if (listaBichos.get(i).getNombre().equalsIgnoreCase(bichito)) 
                {
                    if (listaBichos.get(i).isDonado() == true) 
                    {
                        System.out.println("Este insecto ya ha sido donado.");
                    } 
                    else 
                    {
                        listaBichos.get(i).setDonado(true);
                        System.out.println("El insecto " + bichito + " se ha donado.");
                    }
                }
            }
        }
    }
      
      public void mostrarBichos()
      {
        for (int i = 0; i < listaBichos.size(); i++) 
        {
            System.out.println("- Insecto: " +  listaBichos.get(i).getNombre()+" con horario " + listaBichos.get(i).getHorario());
        }
        System.out.println(separador);
      }
      
      public void mostrarBichosDonados()
      {
        for (int i = 0; i < listaBichos.size(); i++) 
        {
            if (listaBichos.get(i).isDonado() == true) 
            {
                System.out.println("El insecto " + listaBichos.get(i).getNombre() + " esta donado.");
            }
        }
        System.out.println(separador);
    }
      
     public void mostrarBichosRestantes() 
     {
        for (int i = 0; i < listaBichos.size(); i++) {
            if (listaBichos.get(i).isDonado() == false) {
                System.out.println("El insecto " + listaBichos.get(i).getNombre() + " no esta donado.");
            }
        }
        System.out.println(separador);
    }
     
     public void añadirBicho() 
    {
        String nombreBichosNuevo, temporadaBichosNuevo, habitatBichosNuevo;
        int horarioBichoNuevo;
        boolean tipoVolador;
        
        System.out.print("Introduce el nombre del insecto nuevo: ");
        nombreBichosNuevo = sc.nextLine();
        
        System.out.print("Introduce la temporada del insecto nuevo: ");
        temporadaBichosNuevo = sc.nextLine();
        
        System.out.print("Introduce el habitat del insecto nuevo: ");
        habitatBichosNuevo = sc.nextLine();
        
        System.out.print("Introduce el horario del insecto nuevo: ");
        horarioBichoNuevo = sc.nextInt();
        
        System.out.print("¿Vuela?: ");
        tipoVolador = sc.hasNextBoolean();
        
        listaBichos.add(new Insecto(horarioBichoNuevo, nombreBichosNuevo, temporadaBichosNuevo, habitatBichosNuevo, tipoVolador, false));
    }
    
    public void modificarBicho() 
    {
        int pos = 0;
        int opcionA = 0;
        System.out.println(separador);
        System.out.println("¿Qué insecto quieres modificar?");
        bichito=this.buscarBicho();
        if (bichito.equalsIgnoreCase("")) {
            System.out.println("no puedes modificar un insecto que no existe");
        } 
        else 
        {
            for (int i = 0; i < listaBichos.size(); i++) {
                if (listaBichos.get(i).getNombre().equalsIgnoreCase(bichito)) {
                    pos = i;
                }
            }
            while (opcionA!=6) {
                System.out.println();
                System.out.println("¿Qué quieres modificar?");
                System.out.println("1.Nombre\n2.Horario\n3.Habitat\n4.Temporada\n5.¿Volador?\n6.Salir");
                opcionA = sc.nextInt();

                switch (opcionA) {
                    case 1:
                        String nuevoNom;
                        System.out.println("¿A qué nombre quieres modificar?");
                        nuevoNom = sc.next();
                        listaBichos.get(pos).setNombre(nuevoNom);
                        System.out.println("Se ha cambiado el nombre de " + bichito + " a " + nuevoNom);
                        break;
                    case 2:
                        int nuevoHorario;
                        System.out.println("Se ha cambiado el horario de " + listaBichos.get(pos).getHorario());
                        nuevoHorario = sc.nextInt();
                        listaBichos.get(pos).setHorario(nuevoHorario);
                        System.out.print(" a " + listaBichos.get(pos).getHorario());
                        break;
                    case 3:
                        String nuevoHabitat;
                        System.out.println("Se ha cambiado el horario de " + listaBichos.get(pos).getHabitat());
                        nuevoHabitat = sc.nextLine();
                        listaBichos.get(pos).setNombre(nuevoHabitat);
                        System.out.print(" a " + listaBichos.get(pos).getHabitat());
                        break;
                    case 4:
                        String nuevaTemporada;
                        System.out.println("Se ha cambiado el horario de " + listaBichos.get(pos).getTemporada());
                        nuevaTemporada = sc.nextLine();
                        listaBichos.get(pos).setNombre(nuevaTemporada);
                        System.out.print(" a " + listaBichos.get(pos).getTemporada());
                        break;
                    case 5:
                        String nuevoTipodeAgua;
                        System.out.println("Se ha cambiado el tipo de volador de " + listaBichos.get(pos).isVolador());
                        nuevoTipodeAgua = sc.nextLine();
                        listaBichos.get(pos).setNombre(nuevoTipodeAgua);
                        System.out.print(" a " + listaBichos.get(pos).isVolador());
                        break;
                    case 6:
                        break;
                }
            }
        }
    }
   
}