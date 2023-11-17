import java.util.Objects;

public class Persona {
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(getClass() != obj.getClass())
			return false;
		Persona persona = (Persona) obj;
		return edad==persona.edad && Objects.equals(nombre, persona.nombre);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, edad);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
