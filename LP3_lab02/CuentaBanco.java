
public class CuentaBanco {
	
	// Atributos
	private String titular;
	private double cantidad;
	
	// Constructores
	// Opción S
	public CuentaBanco(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	// Opción N
	CuentaBanco(String titular) {
		this.titular = titular;
		// this.cantidad = 0.0;
	}
	
	// Métodos 'get' y 'set'
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	// toString
	@Override
    public String toString() {
        return "CuentaBanco{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
	
	// Método 'ingresar'
	public double ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Proceso exitoso.");
        }
        return this.cantidad;
        
    }
	
	// Método 'retirar'
	public double retirar(double cantidad) {
	    if (cantidad > 0) {
	        if (this.cantidad - cantidad < 0) {
	            this.cantidad = 0;
	            System.out.println("Advertencia: La cantidad que ingresó supera su saldo actual.");
	        } else {
	            this.cantidad -= cantidad;
	            System.out.println("Retiro exitoso.");
	        }
	    }
	    return this.cantidad;
	}
	
}
