package Ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            int indice = 4;
            int resultado = numeros[indice]; 
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            
            System.out.println("Ocurrió una excepción: " + e.getClass().getSimpleName());
        }
        System.out.println("El programa continúa después de la excepción.");
    }
}
