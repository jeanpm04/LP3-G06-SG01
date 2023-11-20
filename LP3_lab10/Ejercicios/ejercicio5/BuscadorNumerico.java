package ejercicio5;

public class BuscadorNumerico<T extends Number> {

    public int buscarElementoNumerico(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i; 
            }
        }
        return -1; 
    }
}
