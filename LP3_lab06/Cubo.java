

public class Cubo extends FiguraTridimensional{
	public double ladoA;
	Cubo(double a) {ladoA = a;}
	
	public double obtenerArea() {return 6 * ladoA * ladoA;}
	public double obtenerVolumen() {return ( ladoA * ladoA * ladoA);}
	//public  String obtenerAplicacion(){return "EGYPTO";}

}
