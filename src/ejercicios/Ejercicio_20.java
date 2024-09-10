package ejercicios;

public class Ejercicio_20 {
    public static void main(String[] args) {
        int a = 153;
        int NumeroOriginal = a;
        int CantDigitos = String.valueOf(a).length();
        int Sumatoria = 0;

        // Calcular la suma de los dígitos elevados a la potencia del número de dígitos
        while (a > 0) {
            int digit = a % 10; // Obtener el último dígito
            Sumatoria += Math.pow(digit, CantDigitos); // Elevar el dígito a la potencia del número de dígitos y sumar
            a /= 10; // Eliminar el último dígito
        }

        // Verificar si el número es un número Armstrong
        if (Sumatoria == NumeroOriginal) {
            System.out.println(NumeroOriginal + " es un número Armstrong.");
        } else {
            System.out.println(NumeroOriginal + " no es un número Armstrong.");
        }
    }
}
