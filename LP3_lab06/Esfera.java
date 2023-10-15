

public class Esfera extends FiguraTridimensional{
    public double ladoA;
	Esfera(double r) {ladoA = r;}
	
	public double obtenerArea() {return 4 * Math.PI * ladoA * ladoA;}
	public double obtenerVolumen() {return ( (4 * Math.PI * ladoA * ladoA * ladoA) / 3);}

    //public  String obtenerAplicacion(){return "EGYPTO";}

}
