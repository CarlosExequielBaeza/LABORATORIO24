/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1ej3;

import java.util.Comparator;

/**
 *
 * @author litob
 */
public class OrdenamientoPorDirector implements Comparator <Pelicula> {

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p1.getDirector().compareTo(p2.getDirector());
    }
    
}
