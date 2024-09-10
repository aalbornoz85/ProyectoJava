package ejercicios;

public class Ejercicio_23 {
    public static void main(String[] args) {
        int N = 10; //
        int[] fibonacci = new int[N];

        // Inicializamos los primeros dos números de la secuencia
        if (N > 0) fibonacci[0] = 0;
        if (N > 1) fibonacci[1] = 1;

        // Calculamos el resto de la secuencia
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimimos la secuencia
        System.out.println("Los primeros " + N + " números de la secuencia de Fibonacci son:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
