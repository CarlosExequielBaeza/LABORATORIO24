/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colegio;

/**
 *
 * @author litob
 */
public class Colegio {

    public static void main(String[] args) {
        
            Materia ingles = new Materia(1, 1, "Ingles 1");
            Materia mat = new Materia(2, 1, "Matematica");
            Materia lab = new Materia(3, 1, "Laboratorio 1");
    
            Alumno a1= new Alumno(1001, "Martin", "Lopez");
            Alumno a2= new Alumno(1002,"Brenda", "Martinez");
            a2.agregarMaterias(mat);
            a2.agregarMaterias(ingles);
            a2.agregarMaterias(lab);
            a1.agregarMaterias(mat);
            a1.agregarMaterias(ingles);
            a1.agregarMaterias(lab);
            a2.agregarMaterias(lab);

           
    }

}
