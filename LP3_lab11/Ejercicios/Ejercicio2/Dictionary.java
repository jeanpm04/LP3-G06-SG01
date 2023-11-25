import java.util.ArrayList;
public class Dictionary<K, V> {
    private ArrayList<OrderedPair<K, V>> pairs;

    public Dictionary() {
        this.pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        OrderedPair<K, V> pair = new OrderedPair<>(key, value);
        pairs.add(pair);
    }

    public boolean delete(K key) {
        for (OrderedPair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) {
        for (OrderedPair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("Objeto con key " + key + " no existe");
    }

	@Override
	public String toString() {
		return "Dictionary [pairs=" + pairs + "]";
	}
}