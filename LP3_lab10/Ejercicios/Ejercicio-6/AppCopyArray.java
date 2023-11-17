import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class AppCopyArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String
		String[] arrString1 = {"enero","febrero","abril"};
		String[] arrString2 = {"enero","marzo","mayo"};
		String[] arrNuevo1 = copyArray(arrString1, arrString2);
		System.out.println("El nuevo array de String es: " + Arrays.toString(arrNuevo1));
		
		//Producto
		Producto[] arrProducto1 = {new Producto(1,"Producto 1"), new Producto(2, "Producto 2")};
		Producto[] arrProducto2 = {new Producto(1,"Producto 1"), new Producto(3, "Producto 3")};
				
		Producto[] arrNuevo2 = copyArray(arrProducto1, arrProducto2);
		System.out.println("El nuevo array de Producto es: \n" + Arrays.toString(arrNuevo2));
		
		//Persona
		Persona[] arrPersona1 = {new Persona("Juan",22), new Persona("Luis",19), new Persona("Juan",22), 
				new Persona("Luis",19), new Persona("Mateo", 30)};
		Persona[] arrPersona2 = {new Persona("Mateo", 30), new Persona("Luis",19),new Persona("Juan",22), 
				new Persona("Luis",19)};
		//Persona[] arrPersona3= {new Persona("Karina", 30)};	
		Persona[] arrNuevo3 = copyArray(arrPersona1, arrPersona2);
		System.out.println("El nuevo array de Persona es: \n" + Arrays.toString(arrNuevo3));
	}
	
	public static <T> T[] copyArray(T[] arr1, T[] arr2) {
		Set<T> set = new HashSet<>(Arrays.asList(arr1));
		set.addAll(Arrays.asList(arr2));
		//T[] temp = null;
		return set.toArray(Arrays.copyOf(arr2, 0));
	}
}
