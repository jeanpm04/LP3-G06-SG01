import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // 1. Constructor predeterminado con el 1-1-1900 como fecha por defecto. 
    
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    // 2. Constructor parametrizado con día, mes y año. 
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    // 3. leer(): pedirá al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a 2050). 
    
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese día (1-31): ");
        this.dia = scanner.nextInt();
        System.out.println("Ingrese mes (1-12): ");
        this.mes = scanner.nextInt();
        System.out.println("Ingrese año (1900-2050): ");
        this.anio = scanner.nextInt();
        valida();
    }

    // 4. bisiesto(): indicará si el año de la fecha es bisiesto o no. 
    
    public boolean bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    
    
    public String bisiesto2() {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return "si";
        } else {
            return "no";
        }
    }

    // 5. diasMes(int): devolverá el número de días del mes que se le indique (para el año de la fecha). 
    
    public int diasMes(int mes) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes];
    }

    // 6. valida(): comprobará si la fecha es correcta (entre el 1-1-1900 y el 31-12-2050)
    
    private void valida() {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
    }

    //7. Accesores y mutadores
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // 8. corta(): mostrará la fecha en formato corto (02-09-2003).
    
    public void corta() {
        System.out.printf("%02d-%02d-%04d\n", dia, mes, anio);
    }

    // 9. diasTranscurridos(): devolverá el pppnúmero de días transcurridos desde el 1-1-1900 hasta la fecha. 
    
    public long diasTranscurridos() {
        long totalDias = 0;
        for (int i = 1900; i < anio; i++) {
            totalDias += bisiesto() ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += diasMes(i);
        }
        totalDias += dia - 1;
        return totalDias;
    }

    // 10. diaSemana(): devolverá el día de la semana de la fecha (0 para domingo, ..., 6 para sábado). El 1-1-1900 fue domingo. 
    
    public int diaSemana() {
        long totalDias = diasTranscurridos();
        return (int) (totalDias % 7);
    }

    // 11. larga(): mostrará la fecha en formato largo, empezando por el día de la semana (martes 2 de septiembre de 2003). 
    
    public void larga() {
        String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        System.out.printf("%s %d de %s de %d\n", diasSemana[diaSemana()], dia, nombreMes(mes), anio);
    }

    // Método para obtener el nombre del mes
    
    private String nombreMes(int mes) {
        String[] nombres = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return nombres[mes];
    }

    // 12. fechaTras(long): hará que la fecha sea la correspondiente a haber transcurrido los días que se indiquen desde el 1-1-1900. 
    
    public void fechaTras(long dias) {
        long totalDias = diasTranscurridos() + dias;
        int nuevoAnio = 1900;
        while (totalDias >= (bisiesto() ? 366 : 365)) {
            totalDias -= bisiesto() ? 366 : 365;
            nuevoAnio++;
        }
        anio = nuevoAnio;
        int nuevoMes = 1;
        while (totalDias >= diasMes(nuevoMes)) {
            totalDias -= diasMes(nuevoMes);
            nuevoMes++;
        }
        mes = nuevoMes;
        dia = (int) (totalDias + 1);
    }

    // 13. diasEntre(Fecha): devolverá el número de días entre la fecha y la proporcionada. 
    
    public long diasEntre(Fecha otraFecha) {
        long dias1 = diasTranscurridos();
        long dias2 = otraFecha.diasTranscurridos();
        return Math.abs(dias1 - dias2);
    }

    // 14. siguiente(): pasará al día siguiente. 
    
    public void siguiente() {
        dia++;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }

    // 15. anterior(): pasará al día anterior. 
    
    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                anio--;
            }
            dia = diasMes(mes);
        }
    }

    // 16. fechaFutura(long): actualiza la fecha, agregandole los días que se le indique. 
    
    public void fechaFutura(long dias) {
        if (dias > 0) {
            for (long i = 0; i < dias; i++) {
                siguiente();
            }
        } else if (dias < 0) {
            for (long i = 0; i < -dias; i++) {
                anterior();
            }
        }
    }

    // 17. copia(): devolverá un clon de la fecha. 
    
    public Fecha copia() {
        return new Fecha(dia, mes, anio);
    }

    // 18. igualQue(Fecha1, Fecha2): método de clase, devuelve True si ambas fechas son iguales, de lo contrario devuelve False. 
    
    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
    }

    // 19. menorQue(Fecha1, Fecha2): método de clase que devuelve True si la Fecha1 es anterior a la Fecha2, de lo contrario devuelve False. 
    
    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio < fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes < fecha2.mes) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes == fecha2.mes && fecha1.dia < fecha2.dia) {
            return true;
        }
        return false;
    }

    //20. mayorQue(Fecha1, Fecha2): método de clase que devuelve True si la Fecha1 es posterior a la Fecha2, de lo contrario retorna False.
    
    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        return !igualQue(fecha1, fecha2) && !menorQue(fecha1, fecha2);
    }

   
}
