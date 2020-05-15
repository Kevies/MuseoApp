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
public class ZonaObras extends Zonas 
{
    
    String pinturita;
    String esculturita;
    final String SEPARADOR = "====================";
    Scanner sc = new Scanner(System.in);
    ArrayList<Pinturas> listaPint = new ArrayList<>();
    ArrayList<Esculturas> listaEsc = new ArrayList<>();
    
    public ZonaObras(String nombreZona) 
    {
        super(nombreZona);
    }
    public void añadirPinturasExistentes() 
    {

        listaPint.add(new Pinturas("Cuadro español","Las Meninas", "Diego de Velazquez",1656,true,"Óleo sobre lienzo"));
        listaPint.add(new Pinturas("Retrato Italiano","La Mona Lisa","Leonardo Da Vinci",1503,true,"Óleo sobre lienzo"));
        listaPint.add(new Pinturas("Bodegón","Manzanas y narajas","Paul Cezanne",1899,false,"Óleo sobre lienzo"));

    }
    
    public void añadirEsculturasExistentes()
    {

        listaEsc.add(new Esculturas("Busto Antiguo","Busto de Nefertiti", "Thutmose",-1345,true,"Piedra caliza y yeso"));
        listaEsc.add(new Esculturas("Cabeza colosal","Cabeza colosal olmeca","Anónimo",-1500,true,"Basalto"));
        listaEsc.add(new Esculturas("Estaatua alada","Victoria de Samotracia.","Anonimo",-190,false,"Marmol de Paros"));

    }
    
    public String buscarObra(int tipo)
    {
        if (tipo==1) 
        {
            
                        pinturita = sc.nextLine();
            for (int i = 0; i < listaPint.size(); i++)
            {
                if (listaPint.get(i).getNombre().equalsIgnoreCase(pinturita)) 
                {
                    pinturita = listaPint.get(i).getNombre();
                    System.out.println("se ha encontrado la obra " + pinturita + " en la lista.");
                    return pinturita;
                }
            }   
        }
        else
        {
                        esculturita = sc.nextLine();
            for (int i = 0; i < listaEsc.size(); i++)
            {
                if (listaEsc.get(i).getNombre().equalsIgnoreCase(esculturita)) 
                {
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
         if (tipo==1) 
         {
            pinturita = this.buscarObra(1);
            if (pinturita.equalsIgnoreCase("")) 
            {
            System.out.println("no puedes donar una obra que no existe");
            }
            else 
            {
                for (int i = 0; i < listaPint.size(); i++) 
                {
                    if (listaPint.get(i).getNombre().equalsIgnoreCase(pinturita)) 
                    {
                        if (listaPint.get(i).isDonado() == true) {
                            System.out.println("Esta obra ya ha sido donado.");
                        } else {
                            listaPint.get(i).setDonado(true);
                            System.out.println("Esta obra " + pinturita + " se ha donado.");
                        }
                    }
                }
            }
         }
         else
         {
             esculturita = this.buscarObra(1);
            if (esculturita.equalsIgnoreCase("")) 
            {
            System.out.println("no puedes donar una obra que no existe");
            }
            else 
            {
                for (int i = 0; i < listaEsc.size(); i++) 
                {
                    if (listaEsc.get(i).getNombre().equalsIgnoreCase(esculturita)) 
                    {
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
     
    public void mostrarObras(int tipo) 
     {
         if (tipo==1) 
         {
            for (int i = 0; i < listaPint.size(); i++) 
            {
                System.out.println("- Alias: " +  listaPint.get(i).getAlias()+"*** Nombre: " + listaPint.get(i).getNombre());
            }
        System.out.println(SEPARADOR);
        }
         else
        {
             for (int i = 0; i < listaEsc.size(); i++) 
            {
                System.out.println("- Alias: " +  listaEsc.get(i).getAlias()+"*** Nombre: " + listaEsc.get(i).getNombre());
            }
        System.out.println(SEPARADOR);
        }
    }
    
    public void mostrarObrasDonados(int tipo)
    {
        if (tipo==1) 
        {
            for (int i = 0; i < listaPint.size(); i++) 
            {
                if (listaPint.get(i).isDonado() == true) 
                {
                    System.out.println("La obra " + listaPint.get(i).getNombre() + " esta donado.");
                }
            }
        System.out.println(SEPARADOR);   
        }
        else
        {
        
            for (int i = 0; i < listaEsc.size(); i++) 
            {
                if (listaEsc.get(i).isDonado() == true) 
                {
                    System.out.println("La obra " + listaEsc.get(i).getNombre() + " esta donado.");
                }
            }
        System.out.println(SEPARADOR);
        
        }
     
    }
    
    public void mostrarObrasRestantes(int tipo)
    {
        if (tipo==1) 
        {
            for (int i = 0; i < listaPint.size(); i++) 
        {
            if (listaPint.get(i).isDonado() == false) 
            {
                System.out.println("El Obra " + listaPint.get(i).getNombre() + " no esta donado.");
            }
        }
        System.out.println(SEPARADOR);
        }
        else
        {
            for (int i = 0; i < listaEsc.size(); i++) 
        {
            if (listaEsc.get(i).isDonado() == false) 
            {
                System.out.println("El Obra " + listaEsc.get(i).getNombre() + " no esta donado.");
            }
        }
        System.out.println(listaEsc);
        }
        
    }
    
    /**
     *
     */
    public void añadirObra()
    {
        String AliasNuevo, NombreNuevo, AutorNuevo, TecnicaNueva, materialNuevo;
        int FechaNueva;
        
        System.out.println(SEPARADOR);
        System.out.println("¿Qué quieres donar?");
        System.out.println("1. Pinturas\n2.Esculturas");
        System.out.print("Introduce un numero:");
        int opcion=sc.nextInt();
        
        
        switch(opcion)
        {
            case 1:
                System.out.print("Introduce el alias nuevo: ");
                AliasNuevo = sc.nextLine();

                System.out.print("Introduce el nombre nuevo: ");
                NombreNuevo = sc.nextLine();

                System.out.print("Introduce el Autor de la nueva obra: ");
                AutorNuevo = sc.nextLine();

                System.out.print("Introduce la fecha de la obra: ");
                FechaNueva = sc.nextInt();

                System.out.print("¿Que técnica usa?");
                TecnicaNueva = sc.nextLine();

                listaPint.add(new Pinturas(AliasNuevo, NombreNuevo, AutorNuevo, FechaNueva, false, TecnicaNueva));
                break;
            case 2:
                System.out.print("Introduce el alias nuevo: ");
                AliasNuevo = sc.nextLine();

                System.out.print("Introduce el nombre nuevo: ");
                NombreNuevo = sc.nextLine();

                System.out.print("Introduce el Autor de la nueva obra: ");
                AutorNuevo = sc.nextLine();

                System.out.print("Introduce la fecha de la obra: ");
                FechaNueva = sc.nextInt();

                System.out.print("¿Que material usa?");
                materialNuevo = sc.nextLine();

                listaEsc.add(new Esculturas(AliasNuevo, NombreNuevo, AutorNuevo, FechaNueva, false, materialNuevo));
                break;
        }
    }
    
    public void modificarObra()
    {
        int pos=0;
        System.out.println("Quieres modificar:\n1. Una pintura\n2. Una escultura");
        System.out.print("Introduce un numero:");
        int opcion=sc.nextInt();
        
        if (opcion==1) 
        {
            pinturita=this.buscarObra(opcion);
            if (pinturita.equalsIgnoreCase("")) 
            {
            System.out.println("no puedes modificar una obra que no existe");
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
            }
        }
        else
        {
            esculturita=this.buscarObra(opcion);
            if (esculturita.equalsIgnoreCase("")) 
            {
            System.out.println("no puedes modificar una obra que no existe");
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
            }
        }
        
        if(pinturita=="" || esculturita=="")
        {
            System.out.println("No puedes modificar algo que no existe");
        }
        else
        {
            System.out.println("¿Qué quieres modificar?");
            System.out.println("1.Alias\n2.Nombre\n3.Autor\n4.Fecha\n5.Tecnica/Material\n6.Salir");
            int parte=sc.nextInt();
            switch (parte) 
            {
                case 1:
                    String nuevoAlias;
                    System.out.println("¿A qué Alias quieres modificar?");
                    nuevoAlias = sc.next();
                    if(opcion==1)
                    {
                        System.out.println("Se ha modficado el alias de "+listaPint.get(pos).alias);
                        listaPint.get(pos).setAlias(nuevoAlias);
                        System.out.print( " a " + nuevoAlias);
                    }
                    else
                    {
                        System.out.println("Se ha modficado el alias de "+listaEsc.get(pos).alias);
                        listaEsc.get(pos).setAlias(nuevoAlias);
                        System.out.print(" a " + nuevoAlias);
                    }
                    break;
                case 2:
                    String nuevoNombre;
                    System.out.println("¿A qué Alias quieres modificar?");
                    nuevoNombre = sc.next();
                    if(opcion==1)
                    {
                        listaPint.get(pos).setNombre(nuevoNombre);
                        System.out.println("Se ha modificado el nombre de " + pinturita + " a " + nuevoNombre);
                    }
                    else
                    {
                        listaEsc.get(pos).setNombre(nuevoNombre);
                        System.out.println("Se ha modificado el nombre de " + esculturita + " a " + nuevoNombre);
                    }
                    break;
                case 3:
                    
            }
        
        }
        
        
        
        
            /**
           
            case 3:
                String nuevoHabitat;
                System.out.println("Se ha cambiado el horario de " + listaBichos.get(pos).getHabitat());
                nuevoHabitat = sc.nextLine(); 
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
        */
        }
    
    }


     

