/*
* 9. Ingresar un número n y a continuación n números positivos.
* Informar la cantidad de mayores a 5 que se hayan ingresado.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("¿Que cantidad de números desea ingresar?");
        Scanner input = new Scanner(System.in);
        int tamanio = input.nextInt();

        while (tamanio < 0){
            System.out.println("La cantidad de números a ingresar debe ser positiva...");
            tamanio = input.nextInt();
        }

        Integer[] arrayNumeros = new Integer[tamanio];

        System.out.println("CHEQUEO TAMAÑO ARRAY: "+arrayNumeros.length);

        System.out.println("Ingrese los números uno a uno...");

        for (int i = 0; i < arrayNumeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            int numero = teclado.nextInt();

            while(numero < 0){
                System.out.println("Solo aceptamos números positivos");
                numero = teclado.nextInt();
            }
            arrayNumeros[i] = numero;
        }

       System.out.println("-------------------------------------");

        System.out.println("Los números ingresados son: ");
        int contador = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i]+" ");
            if (arrayNumeros[i] > 5){
                contador += 1;
            }
        }
        System.out.println("\nLa cantidad de números mayores a 5 es: "+contador);
    }
}