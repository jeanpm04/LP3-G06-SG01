import java.util.Arrays;

public class Banco {
    private String nombre;
    private Persona clientes[];
    private int numClientes;

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return Arrays.copyOf(clientes, numClientes);
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    
    //Metodos para implementar
    
    public void agregarCliente(Persona persona) {
    	
        // Verificacion de clientes
        if (!buscarCliente(persona)) {
        	
            // Comprobando el espacio en el arreglo
            if (numClientes < clientes.length) {
                clientes[numClientes] = persona;
                numClientes++;
            } else {
                System.out.println("No se puede agregar más clientes.");
            }
            
        } else {
            System.out.println("El cliente ya existe.");
        }
    }

    public Persona darBajaCliente(Persona persona) {
        int indice = -1;
        
        // Buscando al cliente en el arreglo
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {		//Implementacion de .equals() 
                indice = i;
                break;
            }
        }
        
        // Si se encuentra al cliente, se da de baja y se devuelve
        if (indice != -1) {
            Persona clienteEliminado = clientes[indice];
            
            // Moviendo cliente de la ultima posición
            for (int i = indice; i < numClientes - 1; i++) {
                clientes[i] = clientes[i + 1];
            }
            clientes[numClientes - 1] = null; // Eliminar la referencia al cliente eliminado
            numClientes--;
            return clienteEliminado;
            
        } else {
            System.out.println("El cliente no se encuentra en el banco.");
            return null;
        }
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {	//Implementacion de .equals() 
                return true;
            }
        }
        return false;
    }

    
//    public void clientesTipo(char tipo) {
//        System.out.println("Clientes de tipo '" + tipo + "':");
//        for (int i = 0; i < numClientes; i++) {
//            if (clientes[i].getTipoCliente() == tipo) {
//                System.out.println(clientes[i]);
//            }
//        }
//    }
    
 // metodo para mostrar los clientes de un tipo especifico
    public void clientesTipo(char tipo) {
    	
        System.out.println("\nClientes de tipo '" + tipo + "':");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getTipoCliente() == tipo) {
                System.out.println(clientes[i]);
                // mostrar informacion
                if (clientes[i].getCuenta() != null) {
                    System.out.println("Cuenta del cliente:");
                    System.out.println(clientes[i].getCuenta());
                    System.out.println("\n");
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(nombre).append("\n");
        sb.append("Clientes:\n");
        for (int i = 0; i < numClientes; i++) {
            sb.append(clientes[i]).append("\n");
        }
        return sb.toString();
    }
}

