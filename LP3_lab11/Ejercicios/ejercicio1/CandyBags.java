package ejercuno;

import java.util.Arrays;

public class CandyBags extends Bag<Goodies> {
    public CandyBags(int capacity) {
        super(capacity);
    }

    @Override
    public void add(Goodies obj) throws IsFull, ObjectAlreadyExists {
        super.add(obj);
    }

    public Goodies cheapest() throws IsEmpty, actividad3.IsEmpty {
        if (size() == 0) {
            throw new IsEmpty("La bolsa está vacía");
        }

        Goodies cheapestGoodie = (Goodies) getObjects()[0];
        for (Object g : getObjects()) {
            if (((Goodies) g).getPrice() < cheapestGoodie.getPrice()) {
                cheapestGoodie = (Goodies) g;
            }
        }
        return cheapestGoodie;
    }

    private int size() {
		// TODO Auto-generated method stub
		return 0;
	}	

	public CandyBags mostExpensive(int n) throws IsEmpty, actividad3.IsEmpty, IsFull, ObjectAlreadyExists {
        if (size() == 0) {
            throw new IsEmpty("La bolsa está vacía");
        }

        Goodies[] allGoodies = (Goodies[]) getObjects();
        Arrays.sort(allGoodies, (g1, g2) -> Float.compare(g2.getPrice(), g1.getPrice()));

        n = Math.min(n, size()); // Asegurarse de no exceder el tamaño de la bolsa
        CandyBags expensiveGoodiesBag = new CandyBags(n);

        for (int i = 0; i < n; i++) {
            expensiveGoodiesBag.add(allGoodies[i]);
        }

        return expensiveGoodiesBag;
    }
}