package ejercicios;

public class Ejercicio_29 {
    public static void main(String[] args) {
        int a = 64;

        // Calcula la raíz cuadrada usando el método de Herón
        double squareRoot = calculateSquareRoot(a);

        // Verifica si el cuadrado de la raíz cuadrada es igual al número original
        if (squareRoot * squareRoot == a) {
            System.out.println(a + " es un cuadrado perfecto.");
        } else {
            System.out.println(a + " no es un cuadrado perfecto.");
        }
    }

    // Metodo para calcular la raíz cuadrada usando el Metodo de Herón
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            return Double.NaN; // La raíz cuadrada de un número negativo no es un número real
        }

        double tolerance = 1e-10; // Tolerancia para la precisión
        double guess = number; // Valor inicial de la suposición

        // Metodo de Herón para encontrar la raíz cuadrada
        while (Math.abs(guess * guess - number) > tolerance) {
            guess = (guess + number / guess) / 2; // Actualiza la suposición
        }

        return guess;
    }
}