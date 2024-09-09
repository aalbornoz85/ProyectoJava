package ejercicios;

public class Ejercicio_05 {
    public static void main(String[] args) {
        int a = 5, b = 12, c = 9;
        int mayor;

        // Comparar los valores para encontrar el mayor
        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }
        // Mostrar el resultado
        System.out.println("El número mayor de los tres es: " + mayor);
    }
}
