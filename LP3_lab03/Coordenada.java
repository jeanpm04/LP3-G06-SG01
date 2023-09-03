
public class Coordenada {
	private int x;
	private int y;
	
	public Coordenada() {}
	
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Coordenada(Coordenada c) {}
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double distancia(Coordenada c) {
		double x;
		double y;

		x = c.getX();
		y = c.getY();

		x = Math.pow(x, 2);
		y = Math.pow(y, 2);

		double result = 0.0;

		result = Math.sqrt(x + y);
		return result;

	}
	
	public static double distancia(Coordenada c1, Coordenada c2) {
		double x;
		double y;

		double x2;
		double y2;

		double x3;
		double y3;

		x = c1.getX();
		y = c1.getY();

		x2 = c2.getX();
		y2 = c2.getY();

		x3 = Math.pow(x2 - x, 2);
		y3 = Math.pow(y2 - y, 2);

		double result = 0.0;

		result = Math.sqrt(x3 + y3);
		return result;
	}
	
	@Override
	public String toString() {
		return "Coordenadas" + " x = " + x + ", y = " + y + '}';
	}
}
