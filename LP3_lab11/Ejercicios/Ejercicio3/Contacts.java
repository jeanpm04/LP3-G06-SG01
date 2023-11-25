
public class Contacts {
    private Dictionary<String, Persona> contactoDiccionario;
    boolean eliminar;

    public Contacts() {
        this.contactoDiccionario = new Dictionary<>();
    }

    public void add(String dni, Persona persona) {
        contactoDiccionario.add(dni, persona);
        System.out.println("Contacto agregado");
    }

    public void delete(String dni) {
        eliminar = contactoDiccionario.delete(dni);
        if (eliminar) {
            System.out.println("Contacto eliminado");
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    public void view(String dni) {
        try {
            Persona personaContacto = contactoDiccionario.getValue(dni);
            System.out.println("Datos: " + personaContacto);
        } catch (ObjectNoExist e) {
            System.out.println("Error: Contacto no encontrado");
        }
    }

    public void viewAll() {
        System.out.println("Todos los contactos:");
        System.out.println(contactoDiccionario);
    }
}