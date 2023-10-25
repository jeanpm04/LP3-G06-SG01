
public class PruebaInterfazPorPagar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arreglo 6 posiciones
		PorPagar[] objetosPorPagar = new PorPagar[6];
		// objetos
		objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
		objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
		objetosPorPagar[2] = new EmpleadoAsalariado("John","Smith","111-11-1111",800.00);
		objetosPorPagar[3] = new EmpleadoAsalariado("Lisa","Barnes","888-88-8888",1200.00);
		objetosPorPagar[4] = new Prestamo(3,1500.00);
		objetosPorPagar[5] = new Prestamo(4,2000.00);
		
		System.out.println("Facturas y empleados procesados en forma polimorfica\n");
		
		// tipo, pivote, objeto
		for (PorPagar porPagarActual : objetosPorPagar) {
			 //imprime porPagarActual y monto de pago apropiado
			 System.out.printf("%s \n%s: $%,.2f\n\n", 
			porPagarActual.toString(), "pago vencido", 
			porPagarActual.obtenerMontoPagado());
			 }//fin for
	}

}
