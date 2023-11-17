
public class AppSobrecargarImprimirArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Arreglo completo:");
        imprimirArray(arreglo);
        
        try {
            System.out.println("Arreglo con lim.inferior y superior:");
            imprimirArray(arreglo, 2, 8); // Posiciones validas
            // imprimirArray(arreglo, 2, 20); // Posiciones fuera de rango
        } catch (LimiteInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T> void imprimirArray(T[] inputArray, int limInferior, int limSuperior) throws LimiteInvalidoException {
        if (limInferior < 0 || limSuperior >= inputArray.length || limInferior > limSuperior) {
            throw new LimiteInvalidoException("Limites fuera de rango o invalidos");
        }

        for (int i = limInferior; i <= limSuperior; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
        System.out.println();
    }
    
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
	}
}
