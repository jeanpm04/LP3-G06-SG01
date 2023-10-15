import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // objetos de cada clase
        Edificio edificio = new Edificio(100, 10);
        Auto auto = new Auto("Toyota", "Camry", 25000, 50000, 10);
        Bicicleta bicicleta = new Bicicleta(2, 5, 10);

        // referencias
        ArrayList<ImpactoEcologico> listaImpactoEcologico = new ArrayList<>();
        listaImpactoEcologico.add(edificio);
        listaImpactoEcologico.add(auto);
        listaImpactoEcologico.add(bicicleta);

        // iterar a traves del ArrayList e invocar el metodo polimorfico
        for (ImpactoEcologico elemento : listaImpactoEcologico) {
            System.out.println(elemento);
            System.out.println("Impacto Ecologico: " + elemento.obtenerlmpactoEcologico());
            /*System.out.println("------------------------------");*/
        }
    }
}
