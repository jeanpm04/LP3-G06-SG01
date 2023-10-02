
public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	private char tipoCliente;
	private String numeroCuenta;
	private static int CuentaC = 1000;
    private static int CuentaB = 5000;
    private static int CuentaE = 8000;
	
	
	//constructor para asignar tipo C
	 public Persona(int id, String nombre, String apellido) {
	        this(id, nombre, apellido, 'C');
	    }
	//private int numero = 0;
	 public Persona(int id, String nombre, String apellido, char tipoCliente) {
	        this.id = id;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        setTipoCliente(tipoCliente);
	        asignarNumeroCuenta();
	        this.cuenta = new Cuenta(getNumeroCuenta());
	    }
	 
	 
	 private void asignarNumeroCuenta() {
	        switch (tipoCliente) {
	            case 'C':
	                numeroCuenta = "C" + CuentaC;
	                CuentaC++;
	                break;
	            case 'B':
	                numeroCuenta = "B" + CuentaB;
	                CuentaB++;
	                break;
	            case 'E':
	                numeroCuenta = "E" + CuentaE;
	                CuentaE++;
	                break;
	            default:
	                System.out.println("Tipo de cliente no v�lido. Se asignar� el tipo 'C' por defecto.");
	                numeroCuenta = "C" + CuentaC;
	                CuentaC++;
	        }
	 }
	 
	 public int getNumeroCuenta() {
		 int num = 0;
		 num = Integer.valueOf(num);
		 return num;
	 }
	 
	 public char getTipoCliente() {
	        return tipoCliente;
	 }

	 public void setTipoCliente(char tipoCliente) {
	        // Validar que el tipo de cliente sea uno de los valores permitidos (C, B, E)
	        if (tipoCliente == 'C' || tipoCliente == 'B' || tipoCliente == 'E') {
	            this.tipoCliente = tipoCliente;
	        } else {
	            System.out.println("Se asignar� el tipo 'C' por defecto.");
	            this.tipoCliente = 'C'; 
	        }
	 }

	 
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override

	public String toString() {
        return "Cliente: " + id + "\n" +
               "Tipo   : " + tipoCliente + "\n" +
               "Nombres: " + nombre + " " + apellido + "\n" +
               "No.Cuenta: " + numeroCuenta + "\tSaldo:\t" + String.format("%.2f", cuenta.getSaldo());
    }
	
	
	
}


