//
//
//public class TestAsociacion {
//    public static void main(String[] args) {
//        Banco banco = new Banco("Mi Banco");
//
//        // Agregar clientes a tu banco
//        Persona cliente1 = new Persona(1, "Juan", "Perez", 'C');
//        banco.agregarCliente(cliente1);
//
//        Persona cliente2 = new Persona(2, "Ana", "Gomez", 'B');
//        banco.agregarCliente(cliente2);
//
//        Persona cliente3 = new Persona(3, "Luis", "Rodriguez", 'E');
//        banco.agregarCliente(cliente3);
//
//        Persona cliente4 = new Persona(4, "María", "López", 'C');
//        banco.agregarCliente(cliente4);
//
//        // Listar todos los clientes del banco
//        System.out.println("Clientes del banco:");
//        for (Persona cliente : banco.getClientes()) {
//            if (cliente != null) {
//                System.out.println(cliente);
//            }
//        }
//        
//        System.out.println("\nLISTA SEGUN TIPOS DE CLIENTES");
//        // Dar de baja un cliente (ejemplo: cliente2)
//        banco.darBajaCliente(cliente2);
//
//        // Listar clientes de tipo 'C' en el banco
//        banco.clientesTipo('C');
//
//        // Listar clientes de tipo 'B' en el banco
//        banco.clientesTipo('B');
//
//        // Listar clientes de tipo 'E' en el banco
//        banco.clientesTipo('E');
//    }
//}

//import java.util.Scanner;
//
//public class TestAsociacion {
//    public static void main(String[] args) {
//        Banco banco = new Banco("Mi Banco");
//        Scanner scanner = new Scanner(System.in);
//
//        int opcion;
//
//        do {
//            System.out.println("\nMenú de Opciones:");
//            System.out.println("1. Agregar cliente");
//            System.out.println("2. Eliminar cliente");
//            System.out.println("3. Buscar cliente");
//            System.out.println("4. Mostrar Clientes");
//            System.out.println("5. Salir");
//            System.out.print("Seleccione una opción: ");
//
//            try {
//                opcion = Integer.parseInt(scanner.nextLine());
//
//                switch (opcion) {
//                    case 1:
//                        // Agregar cliente
//                        System.out.print("Ingrese el ID del cliente: ");
//                        int id = Integer.parseInt(scanner.nextLine());
//                        System.out.print("Ingrese el nombre del cliente: ");
//                        String nombre = scanner.nextLine();
//                        System.out.print("Ingrese el apellido del cliente: ");
//                        String apellido = scanner.nextLine();
//                        System.out.print("Ingrese el tipo de cliente (C/B/E): ");
//                        char tipoCliente = scanner.nextLine().charAt(0);
//
//                        Persona nuevoCliente = new Persona(id, nombre, apellido, tipoCliente);
//                        banco.agregarCliente(nuevoCliente);
//                        break;
//                    case 2:
//                        // Eliminar cliente
//                        System.out.print("Ingrese el ID del cliente a eliminar: ");
//                        int idEliminar = Integer.parseInt(scanner.nextLine());
//                        Persona clienteAEliminar = new Persona(idEliminar, "", "", 'C');
//                        banco.darBajaCliente(clienteAEliminar);
//                        break;
//                    case 3:
//                        // Buscar cliente
//                        System.out.print("Ingrese el ID del cliente a buscar: ");
//                        int idBuscar = Integer.parseInt(scanner.nextLine());
//                        Persona clienteBuscado = new Persona(idBuscar, "", "", 'C');
//                        banco.buscarCliente(clienteBuscado);
//                        break;
//                    case 4:
//                        // Mostrar clientes
//                        banco.clientesTipo('C');
//                        banco.clientesTipo('B');
//                        banco.clientesTipo('E');
//                        break;
//                    case 5:
//                        System.out.println("Saliendo del programa.");
//                        break;
//                    default:
//                        System.out.println("Opción no válida. Intente de nuevo.");
//                        break;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Entrada no válida. Intente de nuevo.");
//                opcion = 0;
//            }
//
//        } while (opcion != 5);
//
//        scanner.close();
//    }
//}






//import java.util.Scanner;
//
//public class TestAsociacion {
//    public static void main(String[] args) {
//        Banco banco = new Banco("Mi Banco");
//        Scanner scanner = new Scanner(System.in);
//        int opcion;
//
//        while (true) {
//            // Mostrar el menú de opciones
//            System.out.println("\nMenú de Opciones:");
//            System.out.println("1. Agregar cliente");
//            System.out.println("2. Eliminar cliente");
//            System.out.println("3. Buscar cliente");
//            System.out.println("4. Mostrar Clientes");
//            System.out.println("5. Salir");
//
//            // Solicitar al usuario que ingrese una opción
//            System.out.print("Ingrese una opción: ");
//            try {
//                opcion = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Entrada inválida. Por favor, ingrese un número.");
//                continue; // Volver al principio del bucle
//            }
//
//            switch (opcion) {
//                case 1:
//                    // Agregar cliente
//                    System.out.print("Ingrese el ID del cliente: ");
//                    int id = Integer.parseInt(scanner.nextLine());
//                    System.out.print("Ingrese el nombre del cliente: ");
//                    String nombre = scanner.nextLine();
//                    System.out.print("Ingrese el apellido del cliente: ");
//                    String apellido = scanner.nextLine();
//                    System.out.print("Ingrese el tipo de cliente (C/B/E): ");
//                    char tipoCliente = scanner.nextLine().charAt(0);
//                    Persona nuevoCliente = new Persona(id, nombre, apellido, tipoCliente);
//                    banco.agregarCliente(nuevoCliente);
//                    break;
//                case 2:
//                    // Eliminar cliente
//                    System.out.print("Ingrese el ID del cliente a eliminar: ");
//                    int idEliminar = Integer.parseInt(scanner.nextLine());
//                    Persona clienteEliminar = new Persona(idEliminar, "", "");
//                    banco.darBajaCliente(clienteEliminar);
//                    break;
//                case 3:
//                    // Buscar cliente
//                    System.out.print("Ingrese el ID del cliente a buscar: ");
//                    int idBuscar = Integer.parseInt(scanner.nextLine());
//                    Persona clienteBuscar = new Persona(idBuscar, "", "");
//                    if (banco.buscarCliente(clienteBuscar)) {
//                        System.out.println("Información del cliente encontrado:");
//                        System.out.println(clienteBuscar);
//                    }
//                    break;
//                case 4:
//                    // Mostrar Clientes
//                    System.out.println("Lista de Clientes:");
//                    for (Persona cliente : banco.getClientes()) {
//                        if (cliente != null) {
//                            System.out.println(cliente);
//                        }
//                    }
//                    break;
//                case 5:
//                    // Salir
//                    System.out.println("Saliendo del programa.");
//                    scanner.close(); // Cerrar el scanner antes de salir
//                    System.exit(0);
//                default:
//                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
//            }
//        }
//    }
//}




import java.util.InputMismatchException;
import java.util.Scanner;

public class TestAsociacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Mi Banco");

        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Eliminar cliente");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Salir");
            System.out.print("\nIngrese su elección: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del teclado
                
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el ID del cliente: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese el nombre del cliente: ");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese el apellido del cliente: ");
                        String apellido = scanner.nextLine();
                        System.out.println("Ingrese el tipo de cliente (C/B/E): ");
                        char tipoCliente = scanner.nextLine().charAt(0);
                        
                        Persona nuevoCliente = new Persona(id, nombre, apellido, tipoCliente);
                        banco.agregarCliente(nuevoCliente);
                        break;
                    case 2:
                        System.out.println("Ingrese el ID del cliente a eliminar: ");
                        int idEliminar = scanner.nextInt();
                        scanner.nextLine();
                        
                        // Buscar al cliente por su ID
                        Persona clienteAEliminar = null;
                        for (Persona cliente : banco.getClientes()) {
                            if (cliente.getId() == idEliminar) {
                                clienteAEliminar = cliente;
                                break;
                            }
                        }
                        
                        if (clienteAEliminar != null) {
                            Persona clienteEliminado = banco.darBajaCliente(clienteAEliminar);
                            System.out.println("Cliente eliminado: " + clienteEliminado.getNombre());
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el ID del cliente a buscar: ");
                        int idBuscar = scanner.nextInt();
                        scanner.nextLine();
                        Persona clienteEncontrado = null;
                        for (Persona cliente : banco.getClientes()) {
                            if (cliente.getId() == idBuscar) {
                                clienteEncontrado = cliente;
                                break;
                            }
                        }
                        if (clienteEncontrado != null) {
                            System.out.println("Cliente encontrado:");
                            System.out.println(clienteEncontrado);
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                        break;
                    case 4:
                        System.out.println("Clientes en el banco:");
                        for (Persona cliente : banco.getClientes()) {
                            System.out.println(cliente);
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción inválida, seleccione una opcion del menu.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese una opcion correcta.");
                scanner.nextLine();
                opcion = 0; 
            }
        } while (opcion != 5);

        scanner.close();
    }
}

