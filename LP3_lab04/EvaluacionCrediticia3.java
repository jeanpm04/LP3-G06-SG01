import java.util.Random;
import java.util.Scanner;


public class EvaluacionCrediticia3 {
	
	public int totalPersonas = 8;
	public int[] sexo = new int[totalPersonas];
	public int[] trabaja = new int[totalPersonas];
	public int[] sueldo = new int[totalPersonas];
    public double porcentajeHombres;
    public double porcentajeMujeres;
    public double porcentajeHombresTrabajan;
    public double porcentajeMujeresTrabajan;
    public double sueldoPromedioHombresTrabajan;
    public double sueldoPromedioMujeresTrabajan;
    
    public static void evalu() {
        int totalPersonas = 8;
        int[] sexo = new int[totalPersonas];
        int[] trabaja = new int[totalPersonas];
        int[] sueldo = new int[totalPersonas];
        String opcioningreso = "";
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("SELECCIONE UNA OPCION: ");
            System.out.println(" (Y/y) : GENERAR DATOS DE FORMA ALEATORIA: ");
            System.out.println(" (N/n) : INGRESAR DATOS DE FORMA MANUAL: ");
            
            opcioningreso = scanner.next();

            if (!opcioningreso.equalsIgnoreCase("Y") && !opcioningreso.equalsIgnoreCase("N")) {
                System.out.println("Opción no válida. Por favor, ingrese 'Y' o 'N'.");
            }
        } while (!opcioningreso.equalsIgnoreCase("Y") && !opcioningreso.equalsIgnoreCase("N"));
        
        if (opcioningreso.equalsIgnoreCase("y")) {

        	// Generar datos 
        	
            for (int i = 0; i < totalPersonas; i++) {
                sexo[i] = random.nextInt(2) + 1; 
                trabaja[i] = random.nextInt(2) + 1; 
                if (trabaja[i] == 1) {
                    sueldo[i] = random.nextInt(2051) + 950; 
                } else {
                    sueldo[i] = 0;
                }
            }
        	
        }
        else if (opcioningreso.equalsIgnoreCase("N")){
        	
        	// Ingreso de datos
        	
            for (int i = 0; i < totalPersonas; i++) {
                System.out.println("Persona " + (i + 1));
                
                // ingreso - genero
                do {
                    System.out.print("Ingrese el sexo (1 = masculino, 2 = femenino): ");
                    sexo[i] = scanner.nextInt();
                    if (sexo[i] != 1 && sexo[i] != 2) {
                        System.out.println("Valor incorrecto. Ingrese 1 para masculino o 2 para femenino.");
                    }
                } while (sexo[i] != 1 && sexo[i] != 2);

                // Ingresar - trabajo
                do {
                    System.out.print("¿Trabaja? (1 = si, 2 = no): ");
                    trabaja[i] = scanner.nextInt();
                    if (trabaja[i] != 1 && trabaja[i] != 2) {
                        System.out.println("Valor incorrecto. Ingrese 1 para si trabaja o 2 para no trabaja.");
                    }
                } while (trabaja[i] != 1 && trabaja[i] != 2);

                // Ingresar - sueldo
                if (trabaja[i] == 1) {
                    do {
                        System.out.print("Ingrese sueldo (entre 950 y 3000): ");
                        sueldo[i] = scanner.nextInt();
                        if (sueldo[i] < 950 || sueldo[i] > 3000) {
                            System.out.println("Sueldo fuera del rango permitido. Debe estar entre 950 y 3000.");
                        }
                    } while (sueldo[i] < 950 || sueldo[i] > 3000);
                } else {
                    sueldo[i] = 0;
                }
            }
        } else {
            System.out.println("Opción no válida. Por favor, ingrese 'Y' o 'N'.");
            opcioningreso = scanner.next();
        }
        

        // Calculo de porcentajes y sueldos promedio
        
        int totalHombres = 0;
        int totalMujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sueldoHombresTrabajan = 0;
        int sueldoMujeresTrabajan = 0;

        for (int i = 0; i < totalPersonas; i++) {
            if (sexo[i] == 1) {
                totalHombres++;
                if (trabaja[i] == 1) {
                    hombresTrabajan++;
                    sueldoHombresTrabajan += sueldo[i];
                }
            } else {
                totalMujeres++;
                if (trabaja[i] == 1) {
                    mujeresTrabajan++;
                    sueldoMujeresTrabajan += sueldo[i];
                }
            }
        }
        double porcentajeHombres = (double) totalHombres / totalPersonas * 100;
        double porcentajeMujeres = (double) totalMujeres / totalPersonas * 100;
        
        double porcentajeHombresTrabajan = (double) hombresTrabajan / totalHombres * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / totalMujeres * 100;
        
        double sueldoPromedioHombresTrabajan = (double) sueldoHombresTrabajan / hombresTrabajan;
        double sueldoPromedioMujeresTrabajan = (double) sueldoMujeresTrabajan / mujeresTrabajan;
        
        
	    System.out.println("Porcentaje de hombres y mujeres:");
	    System.out.println("Hombres: " + porcentajeHombres + "%");
	    System.out.println("Mujeres: " + porcentajeMujeres + "%");
	    System.out.println();
	            
	        
	    System.out.println("Porcentaje de hombres y mujeres que trabajan:");
	    System.out.println("Hombres que trabajan: " + porcentajeHombresTrabajan + "%");   
	    System.out.println("Mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
	    System.out.println();
	            
	            
	    System.out.println("Sueldo promedio de hombres y mujeres que trabajan:");       
	    System.out.println("Sueldo - Hombres: " + sueldoPromedioHombresTrabajan);
	    System.out.println("Sueldo - Mujeres: " + sueldoPromedioMujeresTrabajan);
        
    }
}