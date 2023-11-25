
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OrderedPair<Integer, Integer> par1 = new OrderedPair<>(1, 2);
        OrderedPair<Integer, String> par2 = new OrderedPair<>(3, "Hola");
        OrderedPair<String, Persona> par3 = new OrderedPair<>("Mundo", new Persona("Juan", 22));

        System.out.println("Par 1: " + par1);
        System.out.println("Par 2: " + par2);
        System.out.println("Par 3: " + par3);
	}

}
