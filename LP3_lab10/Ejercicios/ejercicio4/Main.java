package ejercicio4;

public class Main {
    public static void main(String[] args) {
       
        Producto[] productos = {
            new Producto(1, "Producto 1", 10.5),
            new Producto(2, "Producto 2", 20.0),
            new Producto(3, "Producto 3", 15.75)
        };

        Persona[] personas = {
            new Persona("111", "Juan Pérez", "Calle A"),
            new Persona("222", "María Gómez", "Calle B"),
            new Persona("333", "Luis Rodríguez", "Calle C")
        };

        Estudiante[] estudiantes = {
            new Estudiante("444", "Ana Martínez", "Calle D", "Ingeniería"),
            new Estudiante("555", "Carlos Sánchez", "Calle E", "Medicina"),
            new Estudiante("666", "Ana Martínez", "Calle F", "Arquitectura")
        };
 
        Buscador<Producto> buscadorProductos = new Buscador<>();
        Buscador<Persona> buscadorPersonas = new Buscador<>();
        Buscador<Estudiante> buscadorEstudiantes = new Buscador<>();

        
        int posicionProducto = buscadorProductos.buscarElemento(productos, new Producto(2, "", 0.0));
        System.out.println("Producto encontrado en la posición: " + posicionProducto);

        
        int posicionPersona = buscadorPersonas.buscarElemento(personas, new Persona("", "María Gómez", ""));
        System.out.println("Persona encontrada en la posición: " + posicionPersona);

        
        int posicionEstudiante = buscadorEstudiantes.buscarElemento(estudiantes, new Estudiante("", "Ana Martínez", "", "Arquitectura"));
        System.out.println("Estudiante encontrado en la posición: " + posicionEstudiante);
    }
}