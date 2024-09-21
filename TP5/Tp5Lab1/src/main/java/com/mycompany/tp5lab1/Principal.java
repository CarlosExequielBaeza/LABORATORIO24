/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author litob
 */
public class Principal {
    public static Directorio directorio = new Directorio(); //Declaro afuera para que la variable directorio pertenezca a la clase Tp5Lab1, si la declaro en el main sería local al metodo main
                                                             //Es estática para que se acceda desde otra clase y la uso para las vistas
    public static void main(String[] args) {
        
        Contacto carlos = new Contacto("CARLOS", "BAEZA","BOLIVAR 123", "San Luis", 321);
        directorio.agregarContacto(2666, carlos);
        
        //Buscar Contacto por tel
       /* Contacto x= directorio.buscarContacto(2666);
        System.out.println(x.getNombre()); */
        
         
         //Buscar por apellido
         /* Set<Long> telefonos = new HashSet<>();
         telefonos=directorio.buscarTelefono("BAEZA");
         for (Long telefono : telefonos) {
             System.out.println(telefono);
            }
        */
        
        //Buscar Contacto con ciudad
       /* ArrayList<Contacto> contactos = new ArrayList<>();
        contactos=directorio.buscarContactos("San Luis");
        for (Contacto c : contactos){
            System.out.println(c);
        } */
       
        //Borrar Contacto
        
        //directorio.borrarContacto(2666);
        Contacto y=directorio.buscarContacto(2666);
        if (y==null){
            System.out.println("Contacto borrado  ");
        }
        else{
        System.out.println(y.getNombre());
        
        }
        //System.out.println(carlos.getNombre());
        
         
        
    }
}
