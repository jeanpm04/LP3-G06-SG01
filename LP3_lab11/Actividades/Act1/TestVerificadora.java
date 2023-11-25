
public class TestVerificadora {
    public static void main(String[] args) {
    	Verificadora<Integer> v1 = new Verificadora<Integer>(10);
        v1.add(10);
        v1.add(34);
        v1.add(24);
        v1.add(5);
        v1.add(10);
        System.out.println("24 esta? "+ v1.contiene(24));
        System.out.println("2244 esta? "+ v1.contiene(2344));

        Verificadora<String> v2 = new Verificadora<String>(7);
        v2.add("noviembre");
        v2.add("juguete");
        v2.add("nada");
        System.out.println("juguete esta? "+v2.contiene("juguete"));
        System.out.println("2344 esta? " + v2.contiene("2344"));

        Verificadora<Persona> v3 = new Verificadora<Persona>(10);
        Persona p1 = new Persona("Juan","Av. Venezuela","999999999");
        v3.add(p1);
        Persona p2 = new Persona("Luis", "Av. Ejercito", "999999998");
        v3.add(p2);
        System.out.println("Carlos esta? "+v3.contiene(new Persona("Carlos", "Av. Ejercito", "999999998")));
        System.out.println("Luis esta? "+v3.contiene(new Persona("Luis", "Calle 1", "111222333")));

        Verificadora<Goodies> v4 = new Verificadora<Goodies>(10);
        Goodies g1 = new Goodies(123, "Gomitas", 15.0f);
        Goodies g2 = new Goodies(124, "Helado", 13.0f);
        v4.add(g1);
        v4.add(g2);
        System.out.println("Chocolate esta? "+v4.contiene(new Goodies(123, "Chocolate", 5.0f)));
        System.out.println("Gomitas esta? "+v4.contiene(new Goodies(555, "Gomitas", 15.0f)));

        Verificadora<Estudiante> v5 = new Verificadora<Estudiante>(10);
        Estudiante e1 = new Estudiante("Juan", "Av. Independencia", "111222333", "Inge", 
        		new Procedencia("Arequipa", "Arequipa"));
        Estudiante e2 = new Estudiante("Bryan", "Av. Ejercito", "999999999", "Medi", 
        		new Procedencia("Lima", "Lima"));
        v5.add(e1);
        v5.add(e2);
        System.out.println("Juan esta? "+v5.contiene(new Estudiante("Juan", "Av. Independencia", "111222333", "Inge", 
        		new Procedencia("Arequipa", "Camana"))));
        System.out.println("Juan esta? "+v5.contiene(new Estudiante("Juan", "Calle 2", "555333555", "Abogado", 
        		new Procedencia("Arequipa", "Arequipa"))));
    }
}