package ejercicios;

public class Ejercicio_19 {
    public static void main(String[] args) {
        int a = 28;
        int SumaDivisores = 0;

        // Calcular la suma de los divisores propios
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                SumaDivisores += i;
            }
        }

        // Verificar si el número es perfecto
        if (SumaDivisores == a) {
            System.out.println(a + " es un número perfecto.");
        } else {
            System.out.println(a + " no es un número perfecto.");
        }
    }
}
