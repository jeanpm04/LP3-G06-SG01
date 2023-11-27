
package actividad4;
import actividad3.*;

//public class App {
//    public static void main(String[] args) throws ObjectNoExist {
//
//        // Bolsa de tipo Goodies
//        Bag<Goodies> goodiesBag = new Bag<>(5);
//        try {
//            Goodies g1 = new Goodies(1, "Generic Goodie", 5.0f);
//            Biscuits biscuit1 = new Biscuits(2, "Cookie", 3.0f, "Crunchy");
//            Chocolates choco1 = new Chocolates(3, "Dark Chocolate", 2.5f, "Dark");
//            Soda soda1 = new Soda(4, "Soda Biscuit", 4.0f, "Soft", "Cola");
//            Sweet sweet1 = new Sweet(5, "Sweet Biscuit", 3.5f, "Soft", "Fruity");
//
//            goodiesBag.add(g1);
//            goodiesBag.add(biscuit1);
//            goodiesBag.add(choco1);
//            goodiesBag.add(soda1);
//            goodiesBag.add(sweet1);
//
//            System.out.println("Contenido de la bolsa de Goodies:");
//            Goodies[] goodiesObjects = (Goodies[]) goodiesBag.getObjects();
//            for (Goodies goodies : goodiesObjects) {
//                System.out.println("ID: " + goodies.getId() + ", Descripción: " + goodies.getDescription() + ", Precio: " + goodies.getPrice());
//            }
//        } catch (IsFull | IsEmpty e) {
//            e.printStackTrace();
//        }
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws ObjectNoExist {
        // Bolsa  tipo Goodies
        Bag<Goodies> goodiesBag = new Bag<>(5);
        try {
            Goodies g1 = new Goodies(1, "Generic Goodie", 5.0f);
            Biscuits biscuit1 = new Biscuits(2, "Cookie", 3.0f, "Crunchy");
            Chocolates choco1 = new Chocolates(3, "Dark Chocolate", 2.5f, "Dark");
            Soda soda1 = new Soda(4, "Soda Biscuit", 4.0f, "Soft", "Cola");
            Sweet sweet1 = new Sweet(5, "Sweet Biscuit", 3.5f, "Soft", "Fruity");

            goodiesBag.add(g1);
            goodiesBag.add(biscuit1);
            goodiesBag.add(choco1);
            goodiesBag.add(soda1);
            goodiesBag.add(sweet1);

            System.out.println("Contenido de la bolsa de Goodies:");
            List<Goodies> goodiesList = new ArrayList<>();
            for (Object obj : goodiesBag.getObjects()) {
                goodiesList.add((Goodies) obj);
            }

            Goodies[] goodiesArray = goodiesList.toArray(new Goodies[0]);

            for (Goodies goodies : goodiesArray) {
                System.out.println("ID: " + goodies.getId() + ", Descripción: " + goodies.getDescription() + ", Precio: " + goodies.getPrice());
            }
        } catch (IsFull | IsEmpty e) {
            e.printStackTrace();
        }
    }
}

