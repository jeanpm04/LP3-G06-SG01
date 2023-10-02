
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestComposicion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        int cuentaC = 1000;
        int cuentaB = 5000;
        int cuentaE = 8000;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Mostrar informacion de clientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            int opc = sc.nextInt();
            String nombre;
            String apellido;
            char tipoCliente;

            switch (opc) {
                case 1:
                    System.out.print("Ingrese el nombre de la persona: ");
                    nombre = sc.next();
                    System.out.print("Ingrese el apellido de la persona: ");
                    apellido = sc.next();
                    System.out.print("Ingrese el tipo de cliente (C, B, E): ");
                    tipoCliente = sc.next().charAt(0);

                    // Si el tipo de cliente no es C, se establece como C por defecto
                    if (tipoCliente != 'C' && tipoCliente != 'B' && tipoCliente != 'E') {
                        tipoCliente = 'C';
                    }

                    Persona nuevaPersona = new Persona(personas.size() + 1, nombre, apellido);
                    nuevaPersona.setTipoCliente(tipoCliente);

                    // Asignar numero de cuenta
                    if (tipoCliente == 'C') {
                        nuevaPersona.getCuenta().setNumero(cuentaC++);
                    } else if (tipoCliente == 'B') {
                        nuevaPersona.getCuenta().setNumero(cuentaB++);
                    } else if (tipoCliente == 'E') {
                        nuevaPersona.getCuenta().setNumero(cuentaE++);
                    }

                    personas.add(nuevaPersona);

                    System.out.println("Nuevo cliente creado con exito");
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = sc.nextDouble();
                    System.out.print("Seleccione el cliente (1, 2, ...): ");
                    int clienteRetiro = sc.nextInt();
                    if (clienteRetiro >= 1 && clienteRetiro <= personas.size()) {
                        personas.get(clienteRetiro - 1).getCuenta().retirar(cantidadRetiro);
                    } else {
                        System.out.println("Cliente no valido");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = sc.nextDouble();
                    System.out.print("Seleccione el cliente (1, 2, ...): ");
                    int clienteDeposito = sc.nextInt();
                    if (clienteDeposito >= 1 && clienteDeposito <= personas.size()) {
                        personas.get(clienteDeposito - 1).getCuenta().depositar(cantidadDeposito);
                    } else {
                        System.out.println("Cliente no valido");
                    }
                    break;

                case 4:
                    for (int i = 0; i < personas.size(); i++) {
                        // System.out.println("\nInformacion Cliente " + (i + 1) + ":");
                    	System.out.println();
                        System.out.println(personas.get(i));
                    }
                    break;

                case 5:
                    System.out.println("Fin");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
	}

}
