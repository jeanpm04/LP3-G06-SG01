package ejercuno;

public class Goodies {
    private int id;
    private String description;
    private float price;

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

 
    @Override
    public String toString() {
        return "ID: " + id + " | Descripción: " + description + " | Precio: " + price;
    }

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
