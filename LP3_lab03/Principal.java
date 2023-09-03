
public class Principal {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4, 5);

        System.out.println("El área del rectángulo es: " + Manejador.area(r1));
        System.out.println("El perimetro del rectangulo es: " + Manejador.perimetro(r1));

        Manejador.moverX(r1, 5);
        Manejador.moverY(r1, 2);

        System.out.println("Rectangulo 1: " + r1 + " Color: " + r1.getColor());

        Rectangulo r2 = new Rectangulo(1, 2);
        System.out.println("Rectangulo 2: " + r2 + " Color: " + r2.getColor());

        Rectangulo r3 = new Rectangulo(3, 5);
        System.out.println("Rectangulo 3: " + r3 + " Color: " + r3.getColor());

        Rectangulo r4 = new Rectangulo(2, 4);
        System.out.println("Rectangulo 4: " + r4 + " Color: " + r4.getColor());

        Rectangulo r5 = new Rectangulo(6, 7);
        System.out.println("Rectangulo 5: " + r5 + " Color: " + r5.getColor());

        Rectangulo r6 = new Rectangulo(2, 3);
        System.out.println("Rectangulo 6: " + r6 + " Color: " + r6.getColor());

        Rectangulo r7 = new Rectangulo(5, 8);
        System.out.println("Rectangulo 7: " + r7 + " Color: " + r7.getColor());
    }
}
