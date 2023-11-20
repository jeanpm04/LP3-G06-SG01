package ejercicio3;

public class ejercicio3 {

    public static <T> boolean isEqualTo(T obj1, T obj2) {
        return obj1 != null && obj1.equals(obj2);
    }

    public static void main(String[] args) {
        
    	
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Object isEqualTo: " + isEqualTo(obj1, obj2)); 

        Integer int1 = 10;
        Integer int2 = 10;
        System.out.println("Integer isEqualTo: " + isEqualTo(int1, int2)); 

        Double double1 = 5.5;
        Double double2 = 6.0;
        System.out.println("Double isEqualTo: " + isEqualTo(double1, double2)); 

        String str1 = "Hola";
        String str2 = "Hola";
        System.out.println("String isEqualTo: " + isEqualTo(str1, str2)); 
    }
}
