package ejercicios;

public class Ejercicio_27 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Intercambio usando operaciones matemáticas
        a = a + b; // Suma de a y b
        b = a - b; // Resta para obtener el valor original de a
        a = a - b; // Resta para obtener el valor original de b

        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
