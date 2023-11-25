public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<String, Integer> diccionario = new Dictionary<>();
		diccionario.add("Uno", 1);
		diccionario.add("Dos", 2);
		diccionario.add("Tres", 3);
        System.out.println(diccionario);

        System.out.println(diccionario.delete("Cinco"));
        System.out.println(diccionario.delete("Tres"));
        System.out.println(diccionario);

        try {
            int valor = diccionario.getValue("Uno");
            System.out.println("Valor: " + valor);
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
	}
}