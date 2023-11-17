
public class AppMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Minimo de %d, %d, %d y %d es %d%n%n",
                3, 4, 5, 2, minimo(3, 4, 5, 2));
        System.out.printf("Minimo de %.1f, %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, 5.5, minimo(6.6, 7.7, 8.8, 5.5));
        System.out.printf("Minimo de %s, %s, %s y %s es %s%n%n",
                "pera", "zanahoria", "uva", "manzana", minimo("pera", "zanahoria", "uva", "manzana"));

        Persona persona1 = new Persona(123456789, "Josue", "Calle 1");
        Persona persona2 = new Persona(987654321, "Karina", "Calle 2");
        Persona persona3 = new Persona(111111111, "Bill", "Calle 3");
        Persona persona4 = new Persona(222222222, "Luis", "Calle 4");

        System.out.printf("Minimo de \n %s \n %s \n %s \n y %s\n es -> %s%n%n",
        		persona1, persona2,persona3,persona4, minimo(persona1, persona2, persona3, persona4));
	}
	public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T min = a;

        if (b.compareTo(min) < 0)
            min = b;
        if (c.compareTo(min) < 0)
            min = c;
        if (d.compareTo(min) < 0)
            min = d;

        return min;
    }
}
