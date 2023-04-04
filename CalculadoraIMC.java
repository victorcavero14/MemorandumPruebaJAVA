import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los valores ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        try{
            // Solicitar al usuario que ingrese su peso en kg
            System.out.print("Por favor, ingrese su peso en kg: ");
            double peso = scanner.nextDouble();

            // Solicitar al usuario que ingrese su altura en metros
            System.out.print("Por favor, ingrese su altura en metros: ");
            double altura = scanner.nextDouble();

            // Calcular el IMC y obtener la categoría correspondiente
            String resultado = calcularIMC(peso, altura);
            
            // Imprimir el resultado
            System.out.println("Resultado: " + resultado); 
        }
        catch (InputMismatchException e){
            // Imprimir un mensaje de error si el usuario ingresa un valor no esperado
            System.out.println("Utilice solo números para ingresar los datos y separar la parte decimal con un punto.");
        }
       
        // Cerrar el objeto Scanner
        scanner.close();
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC) y devuelve la categoría correspondiente.
     *
     * @param peso el peso en kg
     * @param altura la altura en metros
     * @return la categoría del IMC
     */
    public static String calcularIMC(double peso, double altura) {
        // Calcular el IMC dividiendo el peso por el cuadrado de la altura
        double imc = peso / Math.pow(altura, 2);

        // Comparar el valor del IMC con las condiciones especificadas
        // y retornar la categoría correspondiente
        if (imc <= 18.5) {
            return "Infrapeso";
        } else if (imc <= 25.0) {
            return "Normal";
        } else if (imc <= 30.0) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}
