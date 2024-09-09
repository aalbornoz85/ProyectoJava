package ejercicios;

public class Ejercicio_25 {
    public static void main(String[] args) {
        int a = 7;

        // Imprimir la tabla de multiplicar para el número a
        System.out.println("Tabla de multiplicar del " + a + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = a * i;
            System.out.println(a + " x " + i + " = " + resultado);
        }
    }
}
