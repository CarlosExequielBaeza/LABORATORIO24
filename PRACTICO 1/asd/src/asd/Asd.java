/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author litob
 */
public class Asd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        String respuesta="S";
        teclado.nextLine(); // Consumir la nueva línea después de nextInt()
        String titulo;
        String director;
        double duracion;
        int n = teclado.nextInt();
        List<Pelicula> peliculas;
        peliculas=new ArrayList<>();
        //Pelicula p = new Pelicula ("El padrino", "nose", 180);
        while (!respuesta.equalsIgnoreCase("n")){
             System.out.println("Introduzca el nombre de la película: \n");
             titulo= teclado.nextLine();
             System.out.println("Introduzca el nombre del director de la película: \n");
             director= teclado.nextLine();
             System.out.println("Introduzca la duración de la película: \n");
             duracion= teclado.nextDouble();
             Pelicula pelicula = new Pelicula(titulo, director, duracion);
             peliculas.add(pelicula);
             System.out.println("Desea seguir agregando peliculas? S/s Sí, n/N no. \n");
             respuesta=teclado.nextLine();
             
        }
        
    }
    
}
