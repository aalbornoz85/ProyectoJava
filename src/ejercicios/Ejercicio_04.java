package ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {

        int numero = 5;

        // Verificar si el número es primo
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

    }

    // Metodo verifica si número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        // El número 2 es el único número primo par
        if (numero == 2) {
            return true;
        }
        // Los números pares mayores que 2 no son primos
        if (numero % 2 == 0) {
            return false;
        }
        // Verificar divisibilidad desde 3 hasta la raíz cuadrada del número
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
