package ejercuno;
import java.util.Arrays;

import actividad3.IsEmpty;


public class Bag<T> {
    private Object[] objects;
    private int capacity;
    private int size;

    public Bag(int capacity) {
        this.capacity = capacity;
        objects = new Object[capacity];
        size = 0;
    }
    public Object[] getObjects() throws IsEmpty {
        if (size == 0) {
            throw new IsEmpty("La bolsa está vacía");
        }
        return Arrays.copyOf(objects, size);
    }
    public void add(T obj) throws IsFull, ObjectAlreadyExists {
        if (size >= capacity) {
            throw new IsFull("La bolsa está llena");
        }

        if (contains(obj)) {
            throw new ObjectAlreadyExists("El objeto ya está en la bolsa");
        }

        objects[size++] = obj;
    }

    public boolean contains(T obj) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    // Otros métodos de la clase Bag como remove, getIndex, getObjects, etc. (omitiendo para brevedad)
}