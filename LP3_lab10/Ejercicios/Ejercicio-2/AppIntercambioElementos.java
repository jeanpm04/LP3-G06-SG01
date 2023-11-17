import java.util.Arrays;
public class AppIntercambioElementos {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original:");
        imprimirArray(intArray);
        // Intercambiar posiciones 1 y 3
        // intercambiarElementos(intArray, 1, 3); // Posiciones válidas
        intercambiarElementos(intArray, 7, 9); // Posiciones fuera de rango
        System.out.println("Arreglo despues del intercambio:");
        imprimirArray(intArray);
        
        String[] stringArray = {"uno", "dos", "tres", "cuatro", "cinco"};
        System.out.println("\nArreglo original:");
        imprimirArray(stringArray);
        // Intercambiar posiciones 0 y 4
        // intercambiarElementos(stringArray, 0, 4); // Posiciones válidas
        intercambiarElementos(stringArray, 0, 9); // Posiciones fuera de rango
        System.out.println("Arreglo despues del intercambio:");
        imprimirArray(stringArray);
    }
    
    public static <T> void intercambiarElementos(T[] arr, int pos1, int pos2) {
        if (pos1 < 0 || pos1 >= arr.length || pos2 < 0 || pos2 >= arr.length) {
            System.out.println("Posiciones fuera del rango del arreglo");
            return;
        }
        T temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }
}
