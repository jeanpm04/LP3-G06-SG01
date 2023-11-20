package ejercicio4;

public class Buscador<T> {

    public int buscarElemento(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i; 
            }
        }
        return -1; 
    }
}
