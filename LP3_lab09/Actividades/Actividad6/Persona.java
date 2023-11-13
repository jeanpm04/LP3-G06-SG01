package Actividad6;

public class Persona {
	
	protected String nif;
	protected String nombre;
	protected int edad;
	public Persona(String nif, String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
	}
	
	public String getNombre() {
		return nombre;
		
	}

	@Override
	public String toString() {
		return "Nif: " + nif + "Nombre: " + nombre + "Edad: " + edad;
	}

}

