import java.util.Scanner;

public class AppContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacts contactoGestionar = new Contacts();
        Scanner sc = new Scanner(System.in);

        int opc;
        do {
            System.out.println("\nGestión de Contactos");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Eliminar Contacto");
            System.out.println("3. Ver Contacto");
            System.out.println("4. Ver Todos los Contactos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opc: ");

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese DNI: ");
                    String dniAdd = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombreAdd = sc.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edadAdd = sc.nextInt();
                    sc.nextLine();
                    Persona personaAdd = new Persona(nombreAdd, edadAdd);
                    contactoGestionar.add(dniAdd, personaAdd);
                    break;
                case 2:
                    System.out.print("Ingrese DNI a eliminar: ");
                    String dniDelete = sc.nextLine();
                    contactoGestionar.delete(dniDelete);
                    break;
                case 3:
                    System.out.print("Ingrese DNI a ver: ");
                    String dniView = sc.nextLine();
                    contactoGestionar.view(dniView);
                    break;
                case 4:
                	contactoGestionar.viewAll();
                    break;
                case 0:
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 0);

    }

}
