
public class TestAgregacion {

	public static void main(String[] args) {
		Motor motor1 = new Motor(123, 7000);
		Motor motor2 = new Motor(321, 6800);
		
		Automovil automovil1 = new Automovil("AEF-717", 2, "Toyota", "Supra");
		automovil1.setMotor(motor1);
		Automovil automovil2 = new Automovil("F5U-597", 2, "Nissan", "Skyline");
		automovil2.setMotor(motor2);
		
		System.out.println("Informacion Automovil 1");
		System.out.println(automovil1);
		System.out.println("\nInformacion Automovil 2");
		System.out.println(automovil2);
	}

}
