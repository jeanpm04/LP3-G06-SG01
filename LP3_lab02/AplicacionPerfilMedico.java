import java.util.Scanner;
public class AplicacionPerfilMedico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String primerNombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el día de nacimiento: ");
        int diaNacimiento = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mesNacimiento = scanner.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();

        System.out.print("Ingrese la altura (en centímetros): ");
        int altura = scanner.nextInt();

        System.out.print("Ingrese el peso (en kilogramos): ");
        double peso = scanner.nextDouble();

        int anoActual = 2023;
        int mesActual = 8;
        int diaActual = 26;

        PerfilMedico perfil = new PerfilMedico(primerNombre, apellido, sexo, diaNacimiento, mesNacimiento, anoNacimiento, altura, peso);
        int edad = perfil.calcularEdad(anoActual, mesActual, diaActual);

        System.out.println("\nInformación del perfil médico:");
        System.out.println("Nombre: " + perfil.getPrimerNombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDiaNacimiento() + "/" + perfil.getMesNacimiento() + "/" + perfil.getAnoNacimiento());
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        System.out.println("\nEdad: " + edad + " años");
        System.out.println("Frecuencia Cardiaca Máxima: " + perfil.calcularFrecuenciaCardiacaMaxima(edad));
        System.out.println("Índice de Masa Corporal: " + perfil.calcularIndiceMasaCorporal());

        scanner.close();
    }
}