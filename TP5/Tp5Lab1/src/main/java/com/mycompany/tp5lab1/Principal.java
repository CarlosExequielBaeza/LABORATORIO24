/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5lab1;

/**
 *
 * @author litob
 */
public class Principal {
    public static Directorio directorio = new Directorio(); //Declaro afuera para que la variable directorio pertenezca a la clase Tp5Lab1, si la declaro en el main sería local al metodo main
                                                             //Es estática para que se acceda desde otra clase
    public static void main(String[] args) {
        Contacto carlos = new Contacto("CARLOS", "BAEZA","BOLIVAR 123", "San Luis", 321);
        Directorio directorio1= new Directorio();
        directorio1.agregarContacto(2666, carlos);
        Contacto x= directorio1.buscarContacto(2666);
        System.out.println(x.getNombre());
        
        
    }
}
