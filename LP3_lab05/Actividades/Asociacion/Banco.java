import java.util.Arrays;

public class Banco {
	private String nombre;
	private Persona clientes[];
	
	public Banco(String nombre) {
		this(nombre, 20);
	}
	public Banco(String nombre, int numCli) {
		this.nombre = nombre;
		this.clientes = new Persona[numCli];
	}
	
	// setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona[] getClientes() {
		return clientes;
	}
	public void setClientes(Persona[] clientes) {
		this.clientes = clientes;
	}
	
	public void agregarCliente(Persona persona) {
		
	}
	/*
	public Persona darBajaCliente(Persona persona) {
		
	}
	
	public boolean buscarCliente(Persona persona) {
		
	}
	*/
	public void clienteTipo(char tipo) {
		
	}
	
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", clientes=" + Arrays.toString(clientes) + "]";
	}
	
}
