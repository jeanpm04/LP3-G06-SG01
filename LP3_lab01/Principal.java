import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);

        do {
            vida++;
            System.out.println("Intento:" + vida + "\t¿Cual es el número secreto?");
            rp = sc.nextInt();
            
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);

        if (fl == true) {
            switch (vida) {
                case 1:
                    System.out.println("¡FELICIDADES! ¡Adivinaste a la primera!");
                    break;
                case 2:
                    System.out.println("¡FELICIDADES! ¡Adivinaste en el 2do intento!");
                    break;
                case 3:
                    System.out.println("¡FELICIDADES! ¡Adivinaste en el 3er intento!");
                    break;
            }
            System.out.println("¡Ganaste un viaje a la Luna!");
        } else {
            System.out.println("Ups, perdiste...");
            System.out.println("El número secreto era: 1234");
        }

        System.out.println("¡Gracias por jugar!");
    }
}
