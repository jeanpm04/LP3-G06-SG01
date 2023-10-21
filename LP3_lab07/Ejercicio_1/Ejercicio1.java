// commit 3
public class Ejercicio1 {

	
	public static void main(String[] args) {
		double[] v = new double[15];
		try {
			acceso(v,16);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La excepcion se manejo en main: " + e.getMessage());
		}
	}
	
	public static double acceso(double[] v, int j) {
		try {
			if(j>=0 && j <= v.length)
				return v[j];
			else
				throw new ArrayIndexOutOfBoundsException("El indice " + j + 
						" no existe en el vector");
		}
		catch (Exception exc) {
			throw exc;
			
		}
	}
}