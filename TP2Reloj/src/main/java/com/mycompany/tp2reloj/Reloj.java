/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2reloj;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author litob
 */
public class Reloj {
    String modelo;
    int numSerie;
    String hora;
    String dia;

    public Reloj() {
        LocalTime horaActual = LocalTime.now();
        hora=horaActual.toString();
        LocalDate fechaActual = LocalDate.now();
        dia=fechaActual.toString();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
   public String incrementarDia(int n){
        LocalDate fecha = LocalDate.parse(dia);
        fecha=fecha.plusDays(n); //devuelve objeto de tipo LocalDate por eso se lo asigno a fecha
        dia=fecha.toString();
        return dia;
    }
   
  /* public void incrementarHora(int n){
        LocalDate sumar =dia.plusDays(n);
        dia=sumar;
        System.out.println("incrementando dia: "+getDia()+"/"+dia.getMonth() ); 
    
    public void limpiarPantalla(int n){
        LocalDate sumar =dia.plusDays(n);
        dia=sumar;
        System.out.println("incrementando dia: "+getDia()+"/"+dia.getMonth() );   
    }
    }*/
}
