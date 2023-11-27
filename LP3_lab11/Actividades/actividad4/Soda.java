
package actividad4;

public class Soda extends Biscuits {
    private String sodaType;

    public Soda(int id, String description, float price, String type, String sodaType) {
        super(id, description, price, type);
        this.sodaType = sodaType;
    }


}

