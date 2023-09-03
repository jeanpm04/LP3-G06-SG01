
public class Manejador {

    public Manejador() {
    }

    public static double area(Rectangulo c) {

        double x;
        double y;
        double x2;
        double y2;

        double base;
        double area = 0.0;
        double altura;

        x = c.getEsquina1().getX();
        y = c.getEsquina1().getY();
        x2 = c.getEsquina2().getX();
        y2 = c.getEsquina2().getY();
        base = Math.abs(x - x2);
        altura = Math.abs(y2 - y);

        area = base * altura;
        return area;
    }

    public static double perimetro(Rectangulo c) {
        double x;
        double y;

        double x2;
        double y2;

        double perimetro = 0.0;
        double area = 0.0;
        double base;
        double altura;

        x = c.getEsquina1().getX();
        y = c.getEsquina1().getY();

        x2 = c.getEsquina2().getX();
        y2 = c.getEsquina2().getY();

        base = Math.abs(x - x2);
        altura = Math.abs(y2 - y);
        perimetro = 2 * (base) + 2 * (altura);
        return perimetro;
    }

    public static void moverX(Rectangulo c, int cantidad) {
        int x;
        int x2;

        x = c.getEsquina1().getX();
        x = x + cantidad;
        c.getEsquina1().setX(x);

        x2 = c.getEsquina2().getX();
        x2 = x2 + cantidad;
        c.getEsquina2().setX(x2);
    }

    public static void moverY(Rectangulo c, int cantidad) {
        int y;
        int y2;

        y = c.getEsquina1().getY();
        y2 = c.getEsquina2().getY();

        y = y + cantidad;
        y2 = y2 + cantidad;
        c.getEsquina1().setY(y);
        c.getEsquina2().setY(y2);
    }
}
