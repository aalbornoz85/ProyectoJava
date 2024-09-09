package ejercicios;

public class Ejercicio_22 {
    public static void main(String[] args) {
        // Declarar e inicializar el número
        int a = 987654;

        // Variable para contar los dígitos
        int cantidadDigitos = 0;

        // Contar los dígitos
        int numero = a;
        while (numero > 0) {
            numero /= 10; // Eliminar el último dígito
            cantidadDigitos++; // Contar el dígito eliminado
        }

        // Imprimir el resultado
        System.out.println("El número " + a + " tiene " + cantidadDigitos + " dígitos.");
    }
}
