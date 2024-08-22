/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1ej1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author litob
 */
public class TP1EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String letra= "";
        int i;
        String raza;
        ArrayList<String> razas= new ArrayList<>();
        while (!letra.equals("n") && !letra.equals("N")){
            System.out.print("Ingrese una raza de perro: ");
            raza = scanner.nextLine();
            razas.add(raza);
            System.out.println("\nRazas de perros guardadas:"); 
            System.out.print("Desea seguir agregando razas? s/S para continuar n/N para salir): ");
            letra = scanner.nextLine();
            if (letra.equals("n") || letra.equals("N")){
                for (i =0; i < razas.size(); i++) {
                System.out.println(razas.get(i));
                }
            }
        }

    }
    
}
