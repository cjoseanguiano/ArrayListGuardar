/*
Escribe un programa que lea números enteros y los guarde en un ArrayList hasta
que se lea un 0 y muestra los números leídos, su suma y su media.
 */
package arraylistguardar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class ArrayListGuardar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numeroLeido;
        do {            
            System.out.println("Introduce numero enteros, ingresa 0 para terminar");
            System.out.println("Numero :");
            numeroLeido= entrada.nextInt();
            
            if (numeroLeido != 0) {
                numeros.add(numeroLeido);
            }
        } while (numeroLeido != 0);
                System.out.println("Guardaste " + numeros.size() + " numeros");
                
                //Mostrar ArrayList Completo
                System.out.println("Valor "+ numeros);
                
                //Recorrido usando un iterador para mostrar un elemento por linea
                
                Iterator iterator = numeros.iterator();
                while (iterator.hasNext()) {
                    Object next = iterator.next();
                    System.out.println(next);
                    
        }
                double suma = 0;
                
                for (Integer i : numeros) {
                    suma = suma + i;
        }
                System.out.println("Suma : " + suma);
                System.out.println("Media : " + suma/numeros.size());
    }
    
}
