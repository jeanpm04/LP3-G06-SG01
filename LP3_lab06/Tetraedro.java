

public class Tetraedro extends FiguraTridimensional {
	public double ladoA;
	public String Aplicacion ="EGYPTO";
	
	Tetraedro(double a) {
		ladoA = a;
	}
	
	public double obtenerArea() {return Math.sqrt(3) * ladoA * ladoA;}
	public double obtenerVolumen() {return (Math.sqrt(2) /12) * ladoA * ladoA * ladoA;}

	public  String obtenerAplicacion(){return Aplicacion;}

	
	
    //public String obtenerAplocacion(){ return Aplicacion;}
}
