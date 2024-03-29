/*
* 9. Ingresar un número n y a continuación n números positivos.
* Informar la cantidad de mayores a 5 que se hayan ingresado.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // INPUT: CANTIDAD DE NUMEROS.
        System.out.println("¿Que cantidad de números desea ingresar?");
        Scanner input = new Scanner(System.in);
        int tamanio = input.nextInt();

        // CHEQUEO QUE LA CANTIDA DE NUMEROS A INGRESAR SEA POSITIVA.
        while (tamanio < 0){
            System.out.println("La cantidad de números a ingresar debe ser positiva...");
            tamanio = input.nextInt();
        }
        Integer[] arrayNumeros = new Integer[tamanio];

        // INPUT DE NUMEROS.
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

        // RECORRO EL ARRAY Y CON UN CONTADOR REGISTRO LA CANTIDAD DE POSICIONES [I] MAYORES A CINCO.
        int contador = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] > 5){
                contador += 1;
            }
        }
        // OUTPUT:
        System.out.println("\nLa cantidad de números MAYORES a 5 es: "+contador);
    }
}