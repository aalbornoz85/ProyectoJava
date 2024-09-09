package ejercicios;

public class Ejercicio_17 {
    public static void main(String[] args) {
        // Declarar e inicializar los valores de a y b
        int a = 1, b = 100;

        // Variable para almacenar la suma de los números pares
        int suma = 0;

        // Iterar a través del rango de a a b
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) { // Verificar si el número es par
                suma += i;   // Sumar el número par
            }
        }

        // Imprimir el resultado
        System.out.println("La suma de los números pares entre " + a + " y " + b + " es: " + suma);
    }
}
