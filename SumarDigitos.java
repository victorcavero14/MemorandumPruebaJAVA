import java.util.Scanner;

public class SumarDigitos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer el valor ingresado por el usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número N
        System.out.print("Por favor, ingrese un número N: ");
        int n = scanner.nextInt();

        // Calcular la suma de los dígitos de todos los números de 1 a N
        int resultado = sumaDigitos(n);
        
        // Imprimir el resultado
        System.out.println("La suma de los dígitos de 1 a N es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    /**
     * Calcula la suma de los dígitos de todos los números de 1 a N.
     *
     * @param n el número límite (inclusive)
     * @return la suma de los dígitos de todos los números de 1 a N
     */
    public static int sumaDigitos(int n) {
        int suma = 0;

        // Iterar a través de todos los números de 1 a N (inclusive)
        for (int i = 1; i <= n; i++) {
            // Tomar una copia del número actual, para no modificar el valor de i
            int numero = i;

            // Mientras el número sea diferente de 0
            while (numero > 0) {
                // Sumar el dígito menos significativo al acumulador 'suma'
                suma += numero % 10;

                // Eliminar el dígito menos significativo del número
                numero /= 10;
            }
        }

        return suma;
    }
}
