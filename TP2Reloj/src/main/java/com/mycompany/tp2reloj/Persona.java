/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2reloj;

/**
 *
 * @author litob
 */
public class Persona {
    String nombre;
    String apellido;
    int edad;
    double altura;
    Reloj r1;

    public Persona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    /*public void setAltura(double altura) {
        this.altura = altura;
    }*/
    public void hablar() {
        System.out.println("¡Hola!");
    }
    public void comer() {
        System.out.println("Me estoy comiendo unos sanguches");
    }
    public String decirHora(Reloj r1) {
    return "La hora es: " + r1.getHora();
    }

   
}
