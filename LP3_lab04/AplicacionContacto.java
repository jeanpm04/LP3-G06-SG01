import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionContacto {

	public static void main(String[] args) {
		ArrayList<Contacto> agenda = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		String telefono;
		String direccion;		
		int opcion;
		do {
			System.out.println("\nMENU DE OPCIONES:");
            System.out.println("1) Añadir contacto");
            System.out.println("2) Buscar contacto");
            System.out.println("3) Modificar contacto");
            System.out.println("4) Borrar contacto");
            System.out.println("5) Eliminar contactos");
            System.out.println("6) Mostrar contactos");
            System.out.println("7) Salir");
            System.out.print("\nSeleccione una opción: ");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
            	case 1:
            		System.out.print("Nombre: ");
            	    nombre = sc.next();
            	    System.out.print("Teléfono: ");
            	    telefono = sc.next();
            	    System.out.print("Dirección: ");
            	    direccion = sc.next();
            	    
            	    Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
            	    agenda.add(nuevoContacto);
            	    System.out.println("Contacto agregado con éxito.");
            		break;
            	case 2:
            	    System.out.print("Ingrese el nombre a buscar: ");
            	    String nombreBuscado = sc.next();
            	    
            	    boolean encontrado = false;
            	    for (Contacto contacto : agenda) {
            	        if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
            	            encontrado = true;
            	            break;
            	        }
            	    }
            	    
            	    if (encontrado) {
            	        System.out.println("Contacto encontrado.");
            	    } else {
            	        System.out.println("Contacto no encontrado.");
            	    }
            	    break;
            	case 3:
            		System.out.print("Ingrese el nombre del contacto a modificar: ");
                    String nombreModificar = sc.next();
                    
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.print("Nuevo nombre: ");
                            contacto.setNombre(sc.next());
                            System.out.print("Nuevo teléfono: ");
                            contacto.setTelefono(sc.next());
                            System.out.print("Nueva dirección: ");
                            contacto.setDireccion(sc.next());
                            System.out.println("Contacto modificado con éxito.");
                            break;
                        }
                    }
            		break;
            	case 4:
            		System.out.print("Ingrese el nombre del contacto a borrar: ");
                    String nombreBorrar = sc.next();
                    
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBorrar)) {
                            agenda.remove(contacto);
                            System.out.println("Contacto eliminado con éxito.");
                            break;
                        }
                    }
            		break;
            	case 5:
            	    agenda.clear();
            	    System.out.println("Todos los contactos han sido eliminados.");
            	    break;
            	case 6:
            		System.out.println("Lista de contactos:");
                    for (Contacto contacto : agenda) {
                        System.out.println(contacto);
                    }
            		break;
            	case 7:
            		System.out.println("Hasta luego!");
            		break;
            }
		} while (opcion != 7);
	}

}
