package ejercicios;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int a = 5;

        // Variable para almacenar el resultado del factorial
        int factorial = 1;

        // Calcular el factorial usando un bucle for
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        // Imprimir el resultado
        System.out.println("El factorial de " + a + " es: " + factorial);
    }
}
