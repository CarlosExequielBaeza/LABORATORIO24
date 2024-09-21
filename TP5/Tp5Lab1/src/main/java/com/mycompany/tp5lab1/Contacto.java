/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5lab1;

import java.util.TreeMap;

/**
 *
 * @author litob
 */
public class Contacto {
    String nombre;
    String apellido;
    String direccion;
    String ciudad;
    long dni;

    public Contacto(String nombre, String apellido, String direccion, String ciudad, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.dni = dni;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
   

    @Override
public String toString() {
    return "Contacto" +
            "nombre=" + nombre  +
            " apellido=" + apellido  +
            " direccion=" + direccion  +
            " ciudad=" + ciudad  +
            " dni=" + dni;
}
}
