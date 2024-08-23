/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asd;

/**
 *
 * @author litob
 */
public class Pelicula {
    String titulo;
    String director;
    double duracion;
    
    public Pelicula (String titulo, String director, double duracion){ //Const
        this.titulo= titulo;
        this.director=director;
        this.duracion=duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }
    
}
