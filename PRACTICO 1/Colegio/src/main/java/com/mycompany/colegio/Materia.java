/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colegio;

import java.util.Objects;

/**
 *
 * @author litob
 */
public class Materia {
    int idMateria;
    int anio;
    String nombre;

    public Materia(int idMateria, int anio, String nombre) {
        this.idMateria = idMateria;
        this.anio = anio;
        this.nombre = nombre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "ID: " + idMateria + " - " + nombre + " (" + anio + "° año)";
    }

   /* @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.idMateria;
        hash = 37 * hash + this.anio;
        hash = 37 * hash + Objects.hashCode(this.nombre);
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    */
}
