package ejercicios;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int a = 54321;
        int AlReves = 0;

        while (a != 0) {
            int digit = a % 10; // Obtiene el último dígito
            AlReves = AlReves * 10 + digit; // Añade el dígito al resultado invertido
            a /= 10; // Elimina el último dígito del número original
        }

        System.out.println("Número invertido: " + AlReves);
    }
}
