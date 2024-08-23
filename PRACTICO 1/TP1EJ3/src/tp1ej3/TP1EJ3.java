package tp1ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP1EJ3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta = "S";
        String titulo;
        String director;
        double duracion;

        List<Pelicula> peliculas;
        peliculas=new ArrayList<>();


        while (!respuesta.equalsIgnoreCase("n")) {
            System.out.println("Introduzca el nombre de la película:");
            titulo = teclado.nextLine();

            System.out.println("Introduzca el nombre del director de la película:");
            director = teclado.nextLine();

            System.out.println("Introduzca la duración de la película:");
            duracion = teclado.nextDouble();
            teclado.nextLine(); // Consumir la nueva línea después de nextDouble()

            
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);

           
            System.out.println("¿Desea seguir agregando películas? S/s Sí, n/N No.");
            respuesta = teclado.nextLine();
        }

        // Mostrar las películas agregadas
        System.out.println("Películas agregadas:");
        for (Pelicula elementos : peliculas) {
            System.out.println(elementos);
        }

        teclado.close();
    }
}
