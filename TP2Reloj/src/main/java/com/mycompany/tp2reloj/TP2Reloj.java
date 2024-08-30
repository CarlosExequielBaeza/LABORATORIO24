/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2reloj;

/**
 *
 * @author litob
 */
public class TP2Reloj {

    public static void main(String[] args) {
        Reloj r1 = new Reloj();
        Persona carlos = new Persona("Carlos","Baeza", 30, 1.80 );
        System.out.println("La hora es " + carlos.decirHora(r1) + ", la altura es " + carlos.getAltura());
        System.out.println("La fecha actual es " + carlos.decirFecha(r1));
        carlos.usarReloj(r1, 1);
    }
}
