
public class Persona {
    private String dni;
    private String nombre;
    private String direccion;

    public Persona(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombres='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}