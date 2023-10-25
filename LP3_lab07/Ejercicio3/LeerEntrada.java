package Ejercicio3;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;

//public class LeerEntrada {
//    private Reader stream;
//    private char caracter;
//
//    public LeerEntrada(InputStream fuente) {
//        stream = new InputStreamReader(fuente);
//    }
//
//    public char getChar() throws IOException {
//        return caracter;
//    }
//
//    public void procesar() throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida, IOException {
//        caracter = (char) this.stream.read();
//
//        if (Character.isDigit(caracter)) {
//            throw new ExcepcionNumero();
//        } else if (Character.isWhitespace(caracter)) {
//            throw new ExcepcionBlanco();
//        } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
//                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
//            throw new ExcepcionVocal();
//        } else if (caracter == 'q' || caracter == 'Q') {
//            throw new ExcepcionSalida();
//        }
//    }
//}

public class LeerEntrada {
    private Reader stream;
    private char caracter;

    public LeerEntrada(InputStream fuente) {
        stream = new InputStreamReader(fuente);
    }

    public char getChar() throws IOException {
        return caracter;
    }

    public void procesar(char caracter) throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
        if (Character.isDigit(caracter)) {
            throw new ExcepcionNumero();
        } else if (Character.isWhitespace(caracter)) {
            throw new ExcepcionBlanco();
        } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            throw new ExcepcionVocal();
        } else if (caracter == 'q' || caracter == 'Q') {
            throw new ExcepcionSalida();
        }
    }
}