package ejercicios;

public class Ejercicio_24 {
    public static void main(String[] args) {
        int a = 3;
        int Inicio = 1;
        int Fin = 50;
        int suma = 0;

        // Recorrer el rango y sumar los múltiplos de a
        for (int i = Inicio; i <= Fin; i++) {
            if (i % a == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de todos los múltiplos de " + a + " en el rango de " + Inicio + " a " + Fin + " es: " + suma);
    }
}
