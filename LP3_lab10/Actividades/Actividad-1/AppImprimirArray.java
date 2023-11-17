
public class AppImprimirArray {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float[] floatArray = {1.15f, 2.25f, 3.35f, 4.45f, 5.55f};
        Boolean[] boolArray = {true, false, true, false};
        Persona[] personaArray = {
                new Persona("123456789", "Peter", "Av 123"),
                new Persona("987654321", "Harry", "Av 321")
        };

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray boolArray contiene:%n");
        imprimirArray(boolArray);
        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }
}
