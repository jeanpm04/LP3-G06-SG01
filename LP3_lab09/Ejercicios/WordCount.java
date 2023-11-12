import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class WordCount {
    public static void main(String[] args) throws IOException {
        File archivo = new File("C:\\Users\\jeang\\OneDrive\\Escritorio\\Semestre IV\\"
        		+ "LP3 G06\\Fase 2\\Lab09\\lear.txt");
        mostrarInformacionArchivo(archivo);
    }

    private static void mostrarInformacionArchivo(File archivo) throws IOException {
        FileInputStream fis = new FileInputStream(archivo);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader lector = new BufferedReader(isr);

        String linea;
        int contadorLineas = 0;
        int contadorPalabras = 0;
        int contadorCaracteres = 0;

        while ((linea = lector.readLine()) != null) {
            contadorLineas++;
            String palabras[] = linea.split("\\s+");
            for (String palabra : palabras) {
                contadorPalabras++;
                for (char caracter : palabra.toCharArray()) {
                    if (Character.isLetterOrDigit(caracter)) {
                        contadorCaracteres++;
                    }
                }
            }
        }

        lector.close();

        String mensaje = "Archivo: \"" + archivo.getName() + "\"\n" +
                "Líneas = " + contadorLineas + "\n" +
                "Palabras = " + contadorPalabras + "\n" +
                "Caracteres (letras y dígitos) = " + contadorCaracteres;

        JOptionPane.showMessageDialog(null, mensaje, "WordCount", JOptionPane.INFORMATION_MESSAGE);
    }
}
