package JBoton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple; // boton con texto solamente
    private final JButton botonJButtonElegante; // boton con iconos

    // MarcoBoton agrega objetos JButton a JFrame
	public MarcoBoton()
	 {
		super("Joel Gerardo Cruces de la Cruz - Jean Pierre Montoya Mamani ");
		 setLayout(new FlowLayout());
		
		 botonJButtonSimple = new JButton("Boton simple"); // boton con texto
		 add(botonJButtonSimple); // agrega botonJButtonSimple a JFrame
		
		 Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
		 Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));
		 
		 
		 botonJButtonElegante = new JButton("Boton elegante", insecto1); // establece la imagen
		 botonJButtonElegante.setRolloverIcon(insecto2); // establece la imagen de sustituci�n
		 
		 add(botonJButtonElegante); // agrega botonJButtonElegante a JFrame
		
		 // crea nuevo ManejadorBoton para manejar los eventos de bot�n
		 ManejadorBoton manejador = new ManejadorBoton();
		 botonJButtonElegante.addActionListener(manejador);
		 botonJButtonSimple.addActionListener(manejador);
	 }

    // clase interna para manejar eventos de bot�n
 private class ManejadorBoton implements ActionListener {
        // maneja evento de bot�n
	 @Override
	 public void actionPerformed(ActionEvent evento)
	 {
	 JOptionPane.showMessageDialog(MarcoBoton.this, String.format(
	" Usted oprimio: %s", evento.getActionCommand()));
	 }
    }
} // fin de la clase MarcoBoton
