
// 2. Declaración de la clase Factura que implementa PorPagar. 
public class Factura implements PorPagar {
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	public Factura(String pieza, String descripcion, int cuenta, double precio) {
		this.numeroPieza = pieza;
		this.descripcionPieza = descripcion;
		setCantidad(cuenta);
		setPrecioPorArticulo(precio);
	}

	public String getNumeroPieza() {
		return numeroPieza;
	}

	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

	public String getDescripcionPieza() {
		return descripcionPieza;
	}

	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioPorArticulo() {
		return precioPorArticulo;
	}

	public void setPrecioPorArticulo(double precioPorArticulo) {
		this.precioPorArticulo = precioPorArticulo;
	}
	
	@Override
	public double obtenerMontoPagado() {
		return getCantidad()*getPrecioPorArticulo();
	}

	@Override
	public String toString() {
	return "Factura:\n" + "numero de pieza: " + numeroPieza + 
	"("+descripcionPieza + ")\n" + "cantidad: " + cantidad + "\nprecio por  articulo: $" + precioPorArticulo;
	}
	
	
	
}
