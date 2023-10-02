
public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private char tipoCliente;
	private Cuenta cuenta;
	private static int numero = 1;
	private static int numeroCuentaC = 1000;
	private static int numeroCuentaB = 5000;
    private static int numeroCuentaE = 8000;
    
	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuenta = new Cuenta(numero++);
		asignarNumeroCuenta();
	}
	// setter y getter
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
	public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
        asignarNumeroCuenta();
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    // Metodo para asignar el numero de cuenta
    private void asignarNumeroCuenta() {
        int numeroCuenta;
        switch (tipoCliente) {
            case 'C':
                numeroCuenta = numeroCuentaC++;
                break;
            case 'B':
                numeroCuenta = numeroCuentaB++;
                break;
            case 'E':
                numeroCuenta = numeroCuentaE++;
                break;
            default:
                numeroCuenta = numeroCuentaC++; // Por defecto, tipo C
        }
        this.cuenta = new Cuenta(numeroCuenta);
    }
    
    @Override
    public String toString() {
        return "Cliente: " + id + "\nTipo: " + tipoCliente + "\nNombres: " + nombre + " " + apellido +
                "\nNo.Cuenta: " + tipoCliente + cuenta.getNumero() + "\tSaldo: " + cuenta.getSaldo();
    }
}
