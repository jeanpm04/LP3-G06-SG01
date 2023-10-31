import javax.swing.JFrame;
//import javax.swing.JOptionPane;

public class DemoBorderLayout {
    public static void main(String[] args) {
    	//String nuevoNombre;
        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
        marcoBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBorderLayout.setSize(400, 300);
        //nuevoNombre = JOptionPane.showInputDialog("Introduce un título para la ventana:");
        //marcoBorderLayout.setTitle(nuevoNombre);
        marcoBorderLayout.setVisible(true);
    }
}