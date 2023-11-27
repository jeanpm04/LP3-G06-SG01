
package actividad3;
//
//public class Bag<T> {
//    private T[] list;
//    private int count; // Contador de objetos que hay en la bolsa
//
//    public Bag(int n) {
//        this.list = (T[]) new Object[n];
//        this.count = 0;
//    }
//
//    public void add(T obj) throws IsFull, IsEmpty {
//        if (count < list.length) {
//            list[count++] = obj;
//        } else {
//            throw new IsFull("La bolsa está llena.");
//        }
//    }
//
//    public T[] getObjects() throws IsEmpty {
//        if (count > 0) {
//            return list;
//        } else {
//            throw new IsEmpty("La bolsa está vacía.");
//        }
//    }
//
//    public T remove(T obj) throws ObjectNoExist {
//        int index = getIndex(obj);
//        if (index != -1) {
//            T removedObj = list[index];
//            for (int i = index; i < count - 1; i++) {
//                list[i] = list[i + 1];
//            }
//            count--;
//            return removedObj;
//        } else {
//            throw new ObjectNoExist("El objeto no existe en la bolsa.");
//        }
//    }
//
//    public int getIndex(T obj) {
//        for (int i = 0; i < count; i++) {
//            if (list[i].equals(obj)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Contenido de la bolsa:\n");
//        for (int i = 0; i < count; i++) {
//            sb.append(list[i]).append("\n");
//        }
//        return sb.toString();
//    }
//}




import java.util.Arrays;

//public class Bag<T> {
//    private Object[] objects;
//    private int capacity;
//    private int size;
//
//    public Bag(int capacity) {
//        this.capacity = capacity;
//        objects = new Object[capacity];
//        size = 0;
//    }
//
//    public void add(T obj) throws IsFull, IsEmpty {
//        if (size >= capacity) {
//            throw new IsFull("La bolsa está llena");
//        }
//        objects[size++] = obj;
//    }
//
//    public Object[] getObjects() throws IsEmpty {
//        if (size == 0) {
//            throw new IsEmpty("La bolsa está vacía");
//        }
//        return Arrays.copyOf(objects, size); 
//    }
//
//    public void remove(T obj) throws ObjectNoExist {
//        int index = getIndex(obj);
//        if (index == -1) {
//            throw new ObjectNoExist("El objeto no existe en la bolsa");
//        }
//
//        for (int i = index; i < size - 1; i++) {
//            objects[i] = objects[i + 1];
//        }
//        objects[size - 1] = null;
//        size--;
//    }
//
//    public int getIndex(T obj) {
//        for (int i = 0; i < size; i++) {
//            if (objects[i].equals(obj)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Contenido de la bolsa:\n");
//        for (int i = 0; i < size; i++) {
//            sb.append(objects[i]).append("\n");
//        }
//        return sb.toString();
//    }
//}

import java.util.Arrays;

public class Bag<T> {
    private Object[] objects;
    private int capacity;
    private int size;

    public Bag(int capacity) {
        this.capacity = capacity;
        objects = new Object[capacity];
        size = 0;
    }

    public void add(T obj) throws IsFull, IsEmpty {
        if (size >= capacity) {
            throw new IsFull("La bolsa está llena");
        }
        objects[size++] = obj;
    }

    public Object[] getObjects() throws IsEmpty {
        if (size == 0) {
            throw new IsEmpty("La bolsa está vacía");
        }
        return Arrays.copyOf(objects, size);
    }

    public void remove(T obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index == -1) {
            throw new ObjectNoExist("El objeto no existe en la bolsa");
        }

        for (int i = index; i < size - 1; i++) {
            objects[i] = objects[i + 1];
        }
        objects[size - 1] = null;
        size--;
    }

    public int getIndex(T obj) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contenido de la bolsa:\n");
        for (int i = 0; i < size; i++) {
            sb.append(objects[i]).append("\n");
        }
        return sb.toString();
    }
}