/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colegio;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author litob
 */
public class Alumno {
    private String apellido;
    private String nombre;
    private int legajo;
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String nombre, String apellido ) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    public void agregarMaterias(Materia m){
        materias.add(m);
        
    }
    public int cantidadMaterias(){
        
    
         return materias.size(); //SIZE PARA SABER EL TAMAÑO
    }
    @Override
    public String toString() {
    return nombre + " " + apellido; // O la información que desees mostrar
    }
    public void mostrar(){
        for (Materia m : materias){
            System.out.println(m);
        }
    
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.legajo;
        hash = 97 * hash + Objects.hashCode(this.materias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.materias, other.materias);
    }
    
}
