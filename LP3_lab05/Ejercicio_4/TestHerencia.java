
public abstract class TestHerencia {

	public static void main(String[] args) {
		Asalariado emplead1 = new Asalariado("Manuel Cortina", 12345678, 28, 2000.0);
		EmpleadoProduccion emplead2 = new EmpleadoProduccion("Juan Mota", 55333222, 30,
		"Noche", 4000.0);
		EmpleadoDistribucion emplead3 = new EmpleadoDistribucion("Antonio Camino",
		55333666, 35, "Granada", 3500.0);
		
        System.out.println(emplead1);
        System.out.println("\n");
        System.out.println(emplead2);
        System.out.println("\n");
        System.out.println(emplead3);
	}
	
}
