
import java.util.Objects;

public class Estudiante extends Persona{
    private String especialidad;
    private Procedencia procedencia;

    public Estudiante(String nombre, String direccion, String telefono, 
    		String especialidad, Procedencia procedencia){
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Estudiante estudiante = (Estudiante) obj;
        return Objects.equals(getNombre(), estudiante.getNombre()) && 
        		Objects.equals(procedencia, estudiante.procedencia);
    }
}