package ejercicios;

public class Ejercicio_13 {
    public static void main(String[] args) {
        int a = 1221;
        int original = a;
        int AlReves = 0;

        // Invertir el número
        while (a != 0) {
            int digit = a % 10; // Obtener el último dígito
            AlReves = AlReves * 10 + digit; // Construir el número invertido
            a /= 10; // Eliminar el último dígito del número original
        }

        // Verificar si el número original es igual al número invertido
        if (original == AlReves) {
            System.out.println(original + " es un palíndromo.");
        } else {
            System.out.println(original + " no es un palíndromo.");
        }
    }
}
