/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1ej3;

/**
 *
 * @author litob
 */
public class Pelicula implements Comparable <Pelicula> {
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
    @Override
    public String toString() {
        return "Título: " + titulo + ", Director: " + director + ", Duración: " + duracion + " horas";
    }

    @Override
   public int compareTo(Pelicula o) {
    if (this.duracion > o.duracion) return 1;
    else if (this.duracion < o.duracion) return -1;
    else return 0;
}
    
}