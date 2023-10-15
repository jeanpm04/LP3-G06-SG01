

public class Triangulo extends FiguraBidimensional {
    public double ladoB;
    public double ladoA;
	Triangulo(double b, double h) {ladoA = b; ladoB = h;}
	
	public double obtenerArea() {return ladoA * ladoA / 2;}
    
    //public String  obtenerColor(){return "Rojo";}
}
