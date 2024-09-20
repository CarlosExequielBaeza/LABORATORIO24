/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author litob
 */
public class Directorio {
    
    //Primer valor siempre es la clave. Long CLAVE en este caso telefono
    TreeMap<Long, Contacto> directorio = new TreeMap<>();
    
    void agregarContacto(long tel, Contacto contacto){
        directorio.put(tel, contacto);
        
    }
    //Metodo get recorre por si solo el TreeMap
    public Contacto buscarContacto(long tel){ 
        
        return directorio.get(tel);     
    }
    public Set <Long> buscarTelefono(String apellido){
        
         Set<Long> telefonos = new HashSet<>();//Aca voy a guardar los telefonos asociados al apellido
         Set <Long> tel= new HashSet<>();
         tel =   directorio.keySet(); //guardo todas las claves del directorio
         Iterator<Long> it = tel.iterator();
         while(it.hasNext()){
             Long telef=it.next();  
             Contacto c = directorio.get(telef); //En cada vuelta del while Obtengo un Contacto con todos los atributos, del mapa directorio, pasandole la clave telef
             String ape=c.getApellido();
             if(ape.equals(apellido)){
                 telefonos.add(telef);
             }
         }
         
         return telefonos;
        
    }
    public List <Contacto> buscarContactos(String ciudad){
        ArrayList<Contacto> contactos = new ArrayList<>();
        Set<Long> tel = new HashSet<>();//guardo todas las claves(nro tel) del directorio
        Iterator<Long> it = tel.iterator();
        while(it.hasNext()){
            Long telef=it.next();
            Contacto c = directorio.get(telef);
            String ciu=c.getCiudad();
            if(ciu.equals(ciudad)){
                 contactos.add(c);
             }
            
            
        }
        return contactos ;
    }
    public void borrarContacto(long tel){
        directorio.remove(tel);
    }
    
}