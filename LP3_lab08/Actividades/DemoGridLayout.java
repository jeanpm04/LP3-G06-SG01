import javax.swing.JFrame;
//import javax.swing.JOptionPane;

public class DemoGridLayout {
    public static void main(String[] args) {
    	//String nuevoNombre;
        MarcoGridLayout marcoGridLayout = new MarcoGridLayout();
        marcoGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoGridLayout.setSize(400, 300);
        //nuevoNombre = JOptionPane.showInputDialog("Introduce un título para la ventana:");
        //marcoGridLayout.setTitle(nuevoNombre);
        marcoGridLayout.setVisible(true);
    }
}