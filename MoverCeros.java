import java.util.Arrays;

public class MoverCeros {
    public static void main(String[] args) {
        // Crear un array de objetos de tipo Object porque puede contener cualquier tipo de dato
        Object[] array = {false, 1, 0, 1, 2, 0, 1, 3, "a"};

        System.out.println("Array antes: " + Arrays.toString(array));
        
        // Mover los ceros al final del array
        moverCeros(array);

        System.out.println("Array después: " + Arrays.toString(array));
    }

    /**
     * Mueve todos los ceros al final del array, manteniendo el orden del resto de elementos.
     *
     * @param array el array de entrada
     */
    public static void moverCeros(Object[] array) {
        int posicionNoCero = 0;

        // Recorrer el array y mover los ceros al final
        for (int i = 0; i < array.length; i++) {
            // Si el elemento actual no es cero, intercambiarlo con el primer elemento que no es cero
            if (!array[i].equals(0)) {
                // Intercambiar los elementos utilizando una variable temporal
                Object temp = array[i];
                array[i] = array[posicionNoCero];
                array[posicionNoCero++] = temp;
            }
        }
    }
}
