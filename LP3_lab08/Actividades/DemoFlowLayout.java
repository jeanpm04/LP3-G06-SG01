import javax.swing.JFrame;
//import javax.swing.JOptionPane;

public class DemoFlowLayout {
    public static void main(String[] args) {
    	//String nuevoNombre;
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
        marcoFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFlowLayout.setSize(400, 100);
        //nuevoNombre = JOptionPane.showInputDialog("Introduce un título para la ventana:");
        //marcoFlowLayout.setTitle(nuevoNombre);
        marcoFlowLayout.setVisible(true);
    }
}