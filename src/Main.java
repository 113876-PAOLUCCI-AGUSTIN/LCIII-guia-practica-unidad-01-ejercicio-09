/*
* 9. Ingresar un número n y a continuación n números positivos.
* Informar la cantidad de mayores a 5 que se hayan ingresado.
*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¿Que cantidad de números desea ingresar?");
        Scanner input = new Scanner(System.in);

        int tamanio = input.nextInt();
        Integer[] ArrayNumeros = new Integer[tamanio];

        System.out.println("Ingrese los números uno a uno...");

        for (int i = 0; i < ArrayNumeros.length; i++) {
            ArrayNumeros[i] = input.nextInt();
        }
        System.out.println("-------------------------------------");
        System.out.println("Los números ingresados son: ");
        int contador = 0;
        for (int i = 0; i < ArrayNumeros.length; i++) {
            System.out.print(ArrayNumeros[i]+" ");
            if (ArrayNumeros[i] > 5){
                contador += 1;
            }
        }
        System.out.println("\nLa cantidad de números mayores a 5 es: "+contador);
    }
}