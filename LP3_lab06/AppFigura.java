

public class AppFigura {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[6];

        figuras[0] = new Circulo(5.0);
        figuras[1] = new Cuadrado(4.0);
        figuras[2] = new Triangulo(3.0, 4.0);
        figuras[3] = new Esfera(3.0);
        figuras[4] = new Cubo(2.0);
        figuras[5] = new Tetraedro(4.0);

        for (Figura figura : figuras) {
                System.out.println("Tipo de figura: " + figura.tipo);
                System.out.println("Figura: " + figura.getClass().getSimpleName());
                System.out.println("Area: " + figura.obtenerArea());

            if (figura instanceof Circulo) {
                Circulo figurabidi = (Circulo) figura;
                
                

                if(figurabidi.getClass().getSimpleName() == "Circulo")
                {
                    System.out.println("Color de figura: " + figurabidi.obtenerColor());
                }

            
                
            } else if (figura instanceof Tetraedro) {
                Tetraedro figuratri = (Tetraedro) figura;
                
                System.out.println("Figura: " + figuratri.getClass().getSimpleName());
                //System.out.println("Area superficial: " + figuratri.obtenerArea());
                System.out.println("Volumen: " + figuratri.obtenerVolumen());

                if(figuratri.getClass().getSimpleName() == "Tetraedro")
                {
                    System.out.println("Aplicacion: " + figuratri.obtenerAplicacion());
                }
                
            }
            System.out.println();
        }
    }
}
