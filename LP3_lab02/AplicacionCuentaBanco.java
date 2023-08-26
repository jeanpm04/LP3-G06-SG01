
import java.util.Scanner;

public class AplicacionCuentaBanco {
	static CuentaBanco c1 = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String titular;
		double cantidad;
		char opc0;
		int opc1 = 1;
		int opc;
		
		System.out.println(">> BIENVENIDO <<");
		System.out.print("Ingrese su nombre: ");
		titular = sc.nextLine();
		
		
		
		System.out.print("¿Desea ingresar cantidad inicial? S/N: ");
		opc0 = sc.next().charAt(0);
		
		// Opción 'S'
		if(opc0 == 'S') {
			// instancia 1
			System.out.print("Ingrese cantidad inicial: S/.");
			cantidad = sc.nextDouble();
			c1 = new CuentaBanco(titular, cantidad);
			//c1.ingresar(cantidad);
			
		}
		// Opción 'N'
		else {
			// instancia 2
			c1 = new CuentaBanco(titular);
		}
		System.out.println("\n"+ c1.toString());
		do {
			System.out.println("\n>> MENU <<");
			System.out.println("1. Ingresar");
			System.out.println("2. Retirar");
			System.out.println("3. Mostrar saldo");
			System.out.println("4. Salir");

			System.out.print("\nIngrese opción: ");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("Ingrese cantidad: S/.");
				cantidad = sc.nextDouble();
				
				c1.ingresar(cantidad);
				// System.out.println("cantidad: S/."+ cantidad);
				break;
			case 2:
				System.out.print("Ingrese cantidad a retirar: S/.");
				cantidad = sc.nextDouble();
				
				c1.retirar(cantidad);
				break;
			case 3:
				// System.out.println(c1.toString());
				System.out.println("Saldo actual: S/."+c1.getCantidad());
				break;
			case 4:
				opc1 = 0;
				System.out.println("Hasta luego!");
				break;
			default:
				System.out.println("Ingresó una opción inválida. Vuelta a intentarlo.");
			}
		} while (opc1 != 0);
		
		
		
		
	}

}