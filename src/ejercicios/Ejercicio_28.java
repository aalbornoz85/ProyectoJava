package ejercicios;

public class Ejercicio_28 {
    public static void main(String[] args) {
        int a = 48, b = 18;

        // Calcula el MCD usando el algoritmo de Euclides
        int gcd = calculateGCD(a, b);

        System.out.println("El MCD de " + a + " y " + b + " es: " + gcd);
    }

    // Metodo para calcular el MCD usando el algoritmo de Euclides
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
