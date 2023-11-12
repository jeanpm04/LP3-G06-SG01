import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		try(PrintWriter salida = new PrintWriter("C:\\Users\\jeang\\OneDrive\\Escritorio\\"
				+ "Semestre IV\\LP3 G06\\Fase 2\\Lab09\\datos.txt")){ //try with resources
			System.out.println("Introduce texto. Para acabar de introducir la cadena FIN:");
			cadena = sc.nextLine();
			while(!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);
				cadena = sc.nextLine();
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
