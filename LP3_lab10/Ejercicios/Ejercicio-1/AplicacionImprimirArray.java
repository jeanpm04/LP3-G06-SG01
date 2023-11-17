
public class AplicacionImprimirArray {
	public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Arreglo generico:");
        imprimirArray(intArray);

        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro", 
        		"Cinco", "Seis", "Siete", "Ocho"};
        System.out.println("\nArreglo String:");
        imprimirArray(stringArray);
    }
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }

    public static void imprimirArray(String[] inputArray) {
        int count = 0;
        for (String elemento : inputArray) {
            System.out.printf("%-8s", elemento);
            count++;

            if (count % 4 == 0) {
                System.out.println();
            }
        }

        if (count % 4 != 0) {
            System.out.println();
        }
    }

    
}
