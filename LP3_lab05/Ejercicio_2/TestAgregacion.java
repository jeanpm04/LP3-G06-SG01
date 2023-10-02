
public class TestAgregacion {
    public static void main(String[] args) {
        // Creando un motor
        Motor motor1 = new Motor(3728, 1000);

        //automovil sin motor
        Automovil automovilSinMotor = new Automovil("AU398", 3, "Toyota", "Corolla");
        System.out.println("Informacion del automóvil sin motor:");
        System.out.println(automovilSinMotor);

        //automovil con motor
        Automovil automovilConMotor = new Automovil("AU398", 2, "NIssan", "Versa");
        automovilConMotor.setMotor(motor1);

        System.out.println("\nInformacion del automóvil con motor:");
        System.out.println(automovilConMotor);

        System.out.println("\nInformacion del motor:");
        System.out.println(motor1);
    }
}

