

public class Circulo extends FiguraBidimensional {
	public double ladoA;
    public String color = "rojo";
	Circulo(double r) {
        ladoA = r;}
	
	public double obtenerArea() {return Math.PI * ladoA * ladoA;}

    public String  obtenerColor(){return color;}

    //public String obtenerColor() { return color; }
}
