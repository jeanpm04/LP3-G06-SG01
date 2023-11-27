
package actividad4;

public class Sweet extends Biscuits {
    private String sweetType;

    public Sweet(int id, String description, float price, String type, String sweetType) {
        super(id, description, price, type);
        this.sweetType = sweetType;
    }

}
