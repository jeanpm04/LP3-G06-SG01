import java.util.Scanner;
public class Ventas {
	public static void main(String[] args) {
		int f = 4;
		int c = 5;
		double ventas[][] = new double[f][c];
		Scanner sc = new Scanner(System.in);
		for(int fila = 0; fila < ventas.length; fila++) {
			for(int columna = 0; columna < ventas[fila].length; columna++) {
				System.out.println("Ingrese la venta del vendedor "+(fila+1)+" del producto "+(columna+1));
				ventas[fila][columna] = sc.nextDouble();
			}
			System.out.println();
		}
		
		// Impresión de la matriz ventas
		double totalFila = 0;
		System.out.printf("%18s%8s%8s%8s%8s%10s\n", "P1", "P2", "P3", "P4", "P5", "Total");
		for(int fila = 0; fila < ventas.length; fila++) {
			System.out.print("Vendedor "+(fila+1)+"\t");
			for(int columna = 0; columna < ventas[fila].length; columna++) {
				System.out.print(ventas[fila][columna] + "\t");
				totalFila = totalFila + ventas[fila][columna];
			}
			System.out.printf("%.2f\t",totalFila);
			System.out.println();
			totalFila=0;
		}
		
		// Impresión de suma de columnas
		double totalColumna = 0;
		System.out.print("Total         "+"\t");
		for(int columna = 0; columna < c; columna++) {
			for(int fila = 0; fila < f; fila++) {
				totalColumna = totalColumna + ventas[fila][columna];
			}
			System.out.printf("%.2f\t",totalColumna);
			totalColumna = 0;
		}
		System.out.println();
	}
}
