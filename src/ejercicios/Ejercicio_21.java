package ejercicios;

public class Ejercicio_21 {
    public static void main(String[] args) {
        int a = 49;
        double tolerance = 1e-10; // Tolerancia para la precisión
        double guess = a; // Valor inicial de la suposición

        // Metodo de Herón para encontrar la raíz cuadrada
        while (Math.abs(guess * guess - a) > tolerance) {
            guess = (guess + a / guess) / 2; // Actualiza la suposición
        }

        System.out.printf("La raíz cuadrada de %d es aproximadamente %.5f%n", a, guess);
    }
}
