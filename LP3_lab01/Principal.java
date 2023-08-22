import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);

        do {
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cual es el número secreto?");
            rp = sc.nextInt();
            
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);
        
        if (fl == true) {
            switch (vida) {
                case 1:
                    System.out.println("¡FELICIDADES! Adivinaste a la primera!");
                    System.out.println("Ganaste: " + Regalo.elegir(vida));
                    break;
                case 2:
                    System.out.println("¡FELICIDADES! Adivinaste al 2do intento!");
                    System.out.println("Ganaste: " + Regalo.elegir(vida));
                    break;
                case 3:
                    System.out.println("¡FELICIDADES! Adivinaste al 3er intento!");
                    System.out.println("Ganaste: " + Regalo.elegir(vida));
                    break;
            } 
        } else {
            System.out.println("Ups, perdiste...");
            System.out.println("El número secreto era: 1234");
        }
        
        System.out.println("¡Gracias por jugar!");    
    }
}

