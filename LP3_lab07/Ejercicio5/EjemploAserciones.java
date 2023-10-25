package Ejercicio5;

public class EjemploAserciones {
    public static void main(String[] args) {
        int edad = 15;
        assert edad >= 18 : "La edad debe ser mayor o igual a 18"; // Aserción
        System.out.println("La persona es mayor de edad.");
    }
}

