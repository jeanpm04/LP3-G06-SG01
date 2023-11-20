package ejercicio5;

public class Main {
    public static void main(String[] args) {
        
        Integer[] enteros = {1, 2, 3, 4, 5};
        Double[] doubles = {1.5, 2.5, 3.5, 4.5, 5.5};

       
        BuscadorNumerico<Integer> buscadorEnteros = new BuscadorNumerico<>();
        BuscadorNumerico<Double> buscadorDoubles = new BuscadorNumerico<>();

        
        int posicionEntero = buscadorEnteros.buscarElementoNumerico(enteros, 3);
        System.out.println("Entero encontrado en la posición: " + posicionEntero); 

        int posicionDouble = buscadorDoubles.buscarElementoNumerico(doubles, 4.5);
        System.out.println("Double encontrado en la posición: " + posicionDouble);

        
//        String[] strings = {"uno", "dos", "tres"};
//        
//        BuscadorNumerico<String> buscadorStrings = new BuscadorNumerico<>();
//        
//        int posicionString = buscadorStrings.buscarElementoNumerico(strings, "dos");
    }
}

