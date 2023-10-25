public class Cuenta {
	private int numero;
	private double saldo;
	
	public Cuenta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public Cuenta(int numero) {
		this(numero, 50);
	}
	// setter y getter
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// Metodo para retirar saldo
	public void retirar(double cantidad) {
        double nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("No se puede realizar el retiro. Saldo insuficiente.");
        }
    }
    // Metodo para depositar
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
}
