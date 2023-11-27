package ejercuno;

//public class App {
//    public static void main(String[] args) throws actividad3.IsEmpty {
//        try {
//            // Crear algunas golosinas
//            Goodies g1 = new Goodies(1, "Chocolate", 2.5f);
//            Goodies g2 = new Goodies(2, "Caramelo", 1.0f);
//            Goodies g3 = new Goodies(3, "Galleta", 1.8f);
//            Goodies g4 = new Goodies(4, "Chicle", 0.5f);
//
//            // Crear una bolsa de golosinas
//            CandyBags candyBag = new CandyBags(5);
//
//            // Agregar golosinas a la bolsa
//            candyBag.add(g1);
//            candyBag.add(g2);
//            candyBag.add(g3);
//            candyBag.add(g4);
//           // candyBag.add(g2); // Intentar agregar una golosina duplicada, no se debería agregar
//
//            // Mostrar contenido de la bolsa
//            System.out.println("Contenido de la bolsa de golosinas:");
//            System.out.println(candyBag.toString());
//
//            // Encontrar la golosina más barata
//            Goodies cheapestGoodie = candyBag.cheapest();
//            System.out.println("\nGolosina más barata:");
//            System.out.println(cheapestGoodie);
//
//            // Encontrar las 2 golosinas más caras
//            CandyBags expensiveGoodies = candyBag.mostExpensive(2);
//            System.out.println("\nLas 2 golosinas más caras:");
//            System.out.println(expensiveGoodies);
//
//        } catch (IsFull | IsEmpty | ObjectAlreadyExists e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}

public class App {
    public static void main(String[] args) throws actividad3.IsEmpty {
        try {
            // Crear algunas golosinas
            Goodies g1 = new Goodies(1, "Chocolate", 2.5f);
            Goodies g2 = new Goodies(2, "Caramelo", 1.0f);
            Goodies g3 = new Goodies(3, "Galleta", 1.8f);
            Goodies g4 = new Goodies(4, "Chicle", 0.5f);

            // Crear una bolsa de golosinas
            CandyBags candyBag = new CandyBags(5);

            // Agregar golosinas a la bolsa
            candyBag.add(g1);
            candyBag.add(g2);
            candyBag.add(g3);
            candyBag.add(g4);
            candyBag.add(g2); // Intentar agregar una golosina duplicada, no se debería agregar

            // Mostrar contenido de la bolsa
            System.out.println("Contenido de la bolsa de golosinas:");
            for (Object g : candyBag.getObjects()) {
                System.out.println(g);
            }

            // Encontrar la golosina más barata
            Goodies cheapestGoodie = candyBag.cheapest();
            System.out.println("\nGolosina más barata:");
            System.out.println(cheapestGoodie);

            // Encontrar las 2 golosinas más caras
            CandyBags expensiveGoodies = candyBag.mostExpensive(2);
            System.out.println("\nLas 2 golosinas más caras:");
            for (Object g : expensiveGoodies.getObjects()) {
                System.out.println(g);
            }

        } catch (IsFull | IsEmpty | ObjectAlreadyExists e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
