
public class Verificadora <T> implements Contenedora <T>{
    private T [] datos;
    private int count;
    public Verificadora(int n){
        this.datos = (T[]) new Object[n];
        this.count = 0;
    }
    public void add(T ele){
        if(this.count < this.datos.length){
            this.datos[this.count ++] = ele;
        }
    }
    public boolean contiene(T ele){
        for (int i = 0; i<this.count; i++){
            if(this.datos[i].equals(ele))
                return true;
        }
        return false;
    }
}