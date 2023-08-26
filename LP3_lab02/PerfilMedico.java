public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private char sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private int altura; 
    private double peso; 
    
    public PerfilMedico(String primerNombre, String apellido, char sexo, int diaNacimiento, int mesNacimiento, int anoNacimiento, int altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int calcularEdad(int anoActual, int mesActual, int diaActual) {
        int edad = anoActual - anoNacimiento;
        if (mesNacimiento > mesActual ||
            (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
            edad--;
        }
        return edad;
    }
    
    public int calcularFrecuenciaCardiacaMaxima(int edad) {
    	return 208 - (int) (0.7 * edad);
    }
    
    public double calcularIndiceMasaCorporal() {
        double alturacm = altura / 100.0;
        return peso / (alturacm * alturacm);
    }
}