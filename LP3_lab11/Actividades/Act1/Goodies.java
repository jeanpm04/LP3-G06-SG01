
import java.util.Objects;

public class Goodies {
    private int id;
    private String descripcion;
    private float precio;

    public Goodies(int id, String descripcion, float precio){
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Goodies goodie = (Goodies) obj;
        return Objects.equals(id, goodie.id);
    }
}