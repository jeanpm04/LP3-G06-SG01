package Ejercicio3;

import java.io.IOException;
import java.util.Scanner;

//import java.io.InputStream;



//public class Main {
//    public static void main(String[] args) {
//        LeerEntrada lector = new LeerEntrada(System.in);
//
//        while (true) {
//            try {
//                System.out.print("Ingrese un carácter: "); // Solicitar entrada al usuario
//                char caracter = lector.getChar();
//
//                if (Character.isWhitespace(caracter)) {
//                    throw new ExcepcionBlanco();
//                } else if (Character.isDigit(caracter)) {
//                    throw new ExcepcionNumero();
//                } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
//                        caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
//                    throw new ExcepcionVocal();
//                } else if (caracter == 'q' || caracter == 'Q') {
//                    throw new ExcepcionSalida();
//                }
//                System.out.println("Carácter válido: " + caracter);
//            } catch (ExcepcionVocal e) {
//                System.out.println(e.getMessage());
//            } catch (ExcepcionNumero e) {
//                System.out.println(e.getMessage());
//            } catch (ExcepcionBlanco e) {
//                System.out.println(e.getMessage());
//            } catch (ExcepcionSalida e) {
//                System.out.println(e.getMessage());
//                break;
//            } catch (IOException e) {
//                System.out.println("Error de lectura: " + e.getMessage());
//            }
//        }
//    }
//}

//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        LeerEntrada lector = new LeerEntrada(System.in);
//
//        while (true) {
//            try {
//                System.out.print("Ingrese un carácter: ");
//                char caracter = (char) System.in.read(); 
//                lector.procesar(caracter);
//                System.out.println("Carácter válido: " + caracter);
//                
//            } catch (ExcepcionVocal e) {
//                System.out.println(e.getMessage());
//                
//            } catch (ExcepcionNumero e) {
//                System.out.println(e.getMessage());
//                
//            } catch (ExcepcionBlanco e) {
//                System.out.println(e.getMessage());
//                
//            } catch (ExcepcionSalida e) {
//                System.out.println(e.getMessage());
//                break;
//                
//            } catch (IOException e) {
//                System.out.println("Error de lectura: " + e.getMessage());
//                break;
//                
//            }
//        }
//    }
//}



public class Main {
    public static void main(String[] args) {
        LeerEntrada lector = new LeerEntrada(System.in);

        while (true) {
            try {
                System.out.print("Ingrese un carácter: ");
                char caracter = (char) System.in.read(); 

                if (Character.isWhitespace(caracter)) {
                    System.out.println("Error: Se ha ingresado un espacio en blanco.");
                    continue; 
                }

                lector.procesar(caracter);
                System.out.println("Carácter válido: " + caracter);
            } 
            catch (ExcepcionVocal e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionNumero e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionBlanco e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionSalida e) {
                System.out.println(e.getMessage());
                break;
            } catch (IOException e) {
                System.out.println("Error de lectura: " + e.getMessage());
                break;
            }
        }
    }
}


