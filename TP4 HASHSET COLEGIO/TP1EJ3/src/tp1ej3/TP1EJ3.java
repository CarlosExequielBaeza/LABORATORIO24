package tp1ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TP1EJ3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta = "S";
        String titulo;
        String director;
        Integer duracion;

        List<Pelicula> peliculas;
        peliculas=new ArrayList<>();


        while (!respuesta.equalsIgnoreCase("n")) {
            System.out.println("Introduzca el nombre de la película:");
            titulo = teclado.nextLine();

            System.out.println("Introduzca el nombre del director de la película:");
            director = teclado.nextLine();

            System.out.println("Introduzca la duración de la película:");
            duracion = teclado.nextInt();
            teclado.nextLine(); // Consumir la nueva línea después de nextDouble()

            
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);

           
            System.out.println("¿Desea seguir agregando películas? S/s Sí, n/N No.");
            respuesta = teclado.nextLine();
        }

        // A) Mostrar las películas agregadas
        System.out.println("Películas agregadas:");
        for (Pelicula elemenos : peliculas) {
            System.out.println(elemenos);
        }
        
        // B) Mostrar en pantalla todas las peliculas con duracion mayor a 1 hora
        System.out.println("Peliculas con una duración mayor a 1 hora");
        for (Pelicula elementos : peliculas) {
            if (elementos.getDuracion()>1){
            System.out.println(elementos);
            }
        }
        
        // C) Ordenar las peliculas de acuerdo a su duracion de mayor a menor para luego mostrar en pantalla. Yo uso Comparable
       Collections.sort(peliculas);
       System.out.println("Películas agregadas ordenadas de mayor a menor:");
         for (Pelicula elementos : peliculas) {
            System.out.println(elementos);
        }
        // D) Ordenar peliculas de menor a mayor COMPARATOR
        Collections.sort(peliculas);
       System.out.println("Películas agregadas ordenadas de menor a mayor:");
         for (Pelicula elementos : peliculas) {
            System.out.println(elementos);
        }
        // E) Ordenar peliculas por título COMPARATOR
        Collections.sort(peliculas, new OrdenamientoPorTitulo());
        System.out.println("Películas Ordenadas por titulo:");
         for (Pelicula elementos : peliculas) {
            System.out.println(elementos);
        }
        // F) Ordenar peliculas por nombre del director COMPARATOR
        Collections.sort(peliculas, new OrdenamientoPorDirector());
        System.out.println("Películas ordenadas por nombre del director:");
         for (Pelicula elementos : peliculas) {
            System.out.println(elementos);
        }
       
        

        teclado.close();
    }
}
