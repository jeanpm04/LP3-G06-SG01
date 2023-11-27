
package actividad3;
import java.util.Arrays;


//public class App {
//    public static void main(String[] args) {
//        // Crear objetos bolsa de diferentes tipos
//
//        // Bolsa de tipo Integer
//        Bag<Integer> integerBag = new Bag<>(5);
//        try {
//            integerBag.add(10);
//            integerBag.add(20);
//            integerBag.add(30);
//
//            System.out.println("Contenido de la bolsa de enteros:");
//            Integer[] intObjects = integerBag.getObjects();
//            for (Integer integer : intObjects) {
//                System.out.println(integer);
//            }
//
//            System.out.println("Índice de 20 en la bolsa de enteros: " + integerBag.getIndex(20));
//
//            integerBag.remove(20);
//            System.out.println("Contenido de la bolsa de enteros después de eliminar 20:");
//            for (Integer integer : integerBag.getObjects()) {
//                System.out.println(integer);
//            }
//        } catch (IsFull | IsEmpty | ObjectNoExist e) {
//            e.printStackTrace();
//        }
//
//        // Bolsa de tipo String
//        Bag<String> stringBag = new Bag<>(5);
//        try {
//            stringBag.add("Apple");
//            stringBag.add("Banana");
//            stringBag.add("Orange");
//
//            System.out.println("\nContenido de la bolsa de cadenas:");
//            String[] strObjects = stringBag.getObjects();
//            for (String str : strObjects) {
//                System.out.println(str);
//            }
//
//            System.out.println("Índice de 'Banana' en la bolsa de cadenas: " + stringBag.getIndex("Banana"));
//
//            stringBag.remove("Banana");
//            System.out.println("Contenido de la bolsa de cadenas después de eliminar 'Banana':");
//            for (String str : stringBag.getObjects()) {
//                System.out.println(str);
//            }
//        } catch (IsFull | IsEmpty | ObjectNoExist e) {
//            e.printStackTrace();
//        }
//
//        // Bolsa de tipo Persona (suponiendo la existencia de una clase Persona)
//        Bag<Persona> personaBag = new Bag<>(3);
//        try {
//            Persona person1 = new Persona("John", 25);
//            Persona person2 = new Persona("Alice", 30);
//            Persona person3 = new Persona("Bob", 28);
//
//            personaBag.add(person1);
//            personaBag.add(person2);
//            personaBag.add(person3);
//
//            System.out.println("\nContenido de la bolsa de personas:");
//            Persona[] personObjects = personaBag.getObjects();
//            for (Persona person : personObjects) {
//                System.out.println("Nombre: " + person.getName() + ", Edad: " + person.getAge());
//            }
//
//            System.out.println("Índice de 'Alice' en la bolsa de personas: " + personaBag.getIndex(person2));
//
//            personaBag.remove(person2);
//            System.out.println("Contenido de la bolsa de personas después de eliminar 'Alice':");
//            for (Persona person : personaBag.getObjects()) {
//                System.out.println("Nombre: " + person.getName() + ", Edad: " + person.getAge());
//            }
//        } catch (IsFull | IsEmpty | ObjectNoExist e) {
//            e.printStackTrace();
//        }
//    }
//}




public class App {
    public static void main(String[] args) {
        
        Bag<Integer> integerBag = new Bag<>(5);
        try {
            integerBag.add(10);
            integerBag.add(20);
            integerBag.add(30);

            System.out.println("Contenido de la bolsa de enteros:");
            Object[] intObjects = integerBag.getObjects();

            
            Integer[] intArray = Arrays.copyOf(intObjects, intObjects.length, Integer[].class);

            for (Integer integer : intArray) {
                System.out.println(integer);
            }

            System.out.println("Índice de 20 en la bolsa de enteros: " + integerBag.getIndex(20));

            integerBag.remove(20);
            System.out.println("Contenido de la bolsa de enteros después de eliminar 20:");
            for (Object integer : integerBag.getObjects()) {
                System.out.println(integer);
            }
        } catch (IsFull | IsEmpty | ObjectNoExist e) {
            e.printStackTrace();
        }

        // Bolsa de  String
        Bag<String> stringBag = new Bag<>(5);
        try {
            stringBag.add("Apple");
            stringBag.add("Banana");
            stringBag.add("Orange");

            System.out.println("\nContenido de la bolsa de cadenas:");
            Object[] strObjects = stringBag.getObjects();

            
            String[] strArray = Arrays.copyOf(strObjects, strObjects.length, String[].class);

            for (String str : strArray) {
                System.out.println(str);
            }

            System.out.println("Índice de 'Banana' en la bolsa de cadenas: " + stringBag.getIndex("Banana"));

            stringBag.remove("Banana");
            System.out.println("Contenido de la bolsa de cadenas después de eliminar 'Banana':");
            for (Object str : stringBag.getObjects()) {
                System.out.println(str);
            }
        } catch (IsFull | IsEmpty | ObjectNoExist e) {
            e.printStackTrace();
        }

        // Bolsa de tipo Persona
        Bag<Persona> personaBag = new Bag<>(3);
        try {
            Persona person1 = new Persona("John", 25);
            Persona person2 = new Persona("Alice", 30);
            Persona person3 = new Persona("Bob", 28);

            personaBag.add(person1);
            personaBag.add(person2);
            personaBag.add(person3);

            System.out.println("\nContenido de la bolsa de personas:");
            Object[] personObjects = personaBag.getObjects();

            
            Persona[] personArray = Arrays.copyOf(personObjects, personObjects.length, Persona[].class);

            for (Persona person : personArray) {
                System.out.println("Nombre: " + person.getName() + ", Edad: " + person.getAge());
            }

            System.out.println("Índice de 'Alice' en la bolsa de personas: " + personaBag.getIndex(person2));

            personaBag.remove(person2);
            System.out.println("Contenido de la bolsa de personas después de eliminar 'Alice':");
            for (Object person : personaBag.getObjects()) {
                System.out.println("Nombre: " + ((Persona) person).getName() + ", Edad: " + ((Persona) person).getAge());
            }
        } catch (IsFull | IsEmpty | ObjectNoExist e) {
            e.printStackTrace();
        }
    }
}
