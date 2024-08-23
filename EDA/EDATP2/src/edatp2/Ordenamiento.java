/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Definir una clase ordenamiento que contenga el atributo datos (un array de
enteros) en el cual se agregarán los métodos:
Carga(): que llena el arreglo con 10000 números aleatorios.
Muestra()
bubbleSort()
insertionSort()
shellSort()
El método main() de la clase principal, tiene que crear un objeto de la clase
ordenamiento e invocar a los métodos y mostrar el arreglo antes y después de
ordenar.
*/
package edatp2;

/**
 *
 * @author litob
 */
public class Ordenamiento {
    int [] datos= new int [1000]; // los arreglos se inicializan si o si antes de usar
   public void carga(){
   for(int i = 0; i < 1000; i++) { 
        datos[i] = (int) (Math.random() * 10000);             
    }
   }
   public void muestra(){
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
   }
  
}
