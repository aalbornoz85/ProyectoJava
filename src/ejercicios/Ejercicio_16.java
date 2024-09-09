package ejercicios;

public class Ejercicio_16 {
    public static void main(String[] args) {
        // Declarar e inicializar el número
        int a = 5678;

        // Variable para almacenar la suma de los dígitos
        int suma = 0;

        // Variable temporal para manipular el número
        int numero = a;

        // Sumar todos los dígitos
        while (numero > 0) {
            suma += numero % 10;  // Obtener el último dígito
            numero /= 10;         // Eliminar el último dígito
        }

        // Imprimir el resultado
        System.out.println("La suma de los dígitos de " + a + " es: " + suma);
    }
}
