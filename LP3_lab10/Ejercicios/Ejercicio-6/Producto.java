import java.util.Objects;

public class Producto {
	int id;
	String nombre;
	
	public Producto(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(getClass() != obj.getClass())
			return false;
		Producto producto = (Producto) obj;
		return id==producto.id && Objects.equals(nombre, producto.nombre);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
