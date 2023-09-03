
public class AplicacionFecha {

	
 // Método principal 
    
    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        fecha.leer();
        fecha.corta();
        fecha.larga();
        
        if (fecha.bisiesto() == true) {
        	System.out.println("Si es Bisiesto ");
        } else {
        	System.out.println("No es Bisiesto ");
        }
        
        Fecha otraFecha = new Fecha(15, 8, 2022);
        otraFecha.corta();
        otraFecha.larga();

        System.out.println("Días transcurridos: " + fecha.diasTranscurridos());
        System.out.println("Día de la semana: " + fecha.diaSemana());

        System.out.println("Días entre las fechas: " + fecha.diasEntre(otraFecha));

        fecha.siguiente();
        fecha.corta();
        fecha.anterior();
        fecha.corta();

        fecha.fechaFutura(30);
        fecha.corta();
        fecha.fechaFutura(-15);
        fecha.corta();

        Fecha copiaFecha = fecha.copia();
        copiaFecha.corta();

        System.out.println("¿Las fechas son iguales? " + Fecha.igualQue(fecha, copiaFecha));
        System.out.println("¿Fecha es menor que otraFecha? " + Fecha.menorQue(fecha, otraFecha));
        System.out.println("¿Fecha es mayor que otraFecha? " + Fecha.mayorQue(fecha, otraFecha));
    }
}
