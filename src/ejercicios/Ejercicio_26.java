package ejercicios;

public class Ejercicio_26 {
    public static void main(String[] args) {
        int a = -15;
        int absoluteValue;

        // Calcular el valor absoluto
        if (a < 0) {
            absoluteValue = -a; // Si el número es negativo, cambiar su signo
        } else {
            absoluteValue = a; // Si el número es positivo, mantenerlo igual
        }

        // Imprimir el resultado
        System.out.println("El valor absoluto de " + a + " es: " + absoluteValue);
    }

}
