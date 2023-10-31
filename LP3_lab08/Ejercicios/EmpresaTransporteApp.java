import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpresaTransporteApp extends JFrame implements ActionListener {
    private JTextField nombreTextField, documentoTextField, fechaViajeTextField;
    private JCheckBox audifonosCheckBox, mantaCheckBox, revistasCheckBox;
    private JRadioButton primerPisoRadioButton, segundoPisoRadioButton;
    private JComboBox<String> origenComboBox, destinoComboBox, calidadServicioComboBox;
    private JButton comprarButton, limpiarButton;
    private ButtonGroup pisoButtonGroup;

    public EmpresaTransporteApp() {
        setTitle("Empresa de Transporte - Integrantes: Cruces Joel - Montoya Jean");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel nombreLabel = new JLabel("Nombre Completo:");
        nombreTextField = new JTextField(10);

        JLabel documentoLabel = new JLabel("Documento de Identidad:");
        documentoTextField = new JTextField(10);

        JLabel fechaViajeLabel = new JLabel("Fecha de Viaje:");
        fechaViajeTextField = new JTextField(10);

        JLabel origenLabel = new JLabel("Origen:");
        String[] origenOptions = {"", "Lima", "Arequipa", "Cuzco", "Trujillo", "Piura", "Chiclayo", "Tacna", "Iquitos", "Puno"};
        origenComboBox = new JComboBox<>(origenOptions);

        JLabel destinoLabel = new JLabel("Destino:");
        String[] destinoOptions = {"", "Arequipa", "Lima", "Cuzco", "Trujillo", "Piura", "Chiclayo", "Tacna", "Iquitos", "Puno"};
        destinoComboBox = new JComboBox<>(destinoOptions);

        JLabel pisoLabel = new JLabel("Piso:");
        primerPisoRadioButton = new JRadioButton("1er Piso");
        segundoPisoRadioButton = new JRadioButton("2do Piso");

        pisoButtonGroup = new ButtonGroup();
        pisoButtonGroup.add(primerPisoRadioButton);
        pisoButtonGroup.add(segundoPisoRadioButton);

        JLabel serviciosLabel = new JLabel("Servicios Opcionales:");
        audifonosCheckBox = new JCheckBox("Audífonos");
        mantaCheckBox = new JCheckBox("Manta");
        revistasCheckBox = new JCheckBox("Revistas");

        JLabel calidadServicioLabel = new JLabel("Calidad de Servicio:");
        String[] calidadServicioOptions = {"Económico", "Standard", "VIP"};
        calidadServicioComboBox = new JComboBox<>(calidadServicioOptions);

        comprarButton = new JButton("Comprar Pasaje");
        comprarButton.addActionListener(this);

        limpiarButton = new JButton("Limpiar Datos");
        limpiarButton.addActionListener(this);

        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(documentoLabel);
        panel.add(documentoTextField);
        panel.add(fechaViajeLabel);
        panel.add(fechaViajeTextField);
        panel.add(origenLabel);
        panel.add(origenComboBox);
        panel.add(destinoLabel);
        panel.add(destinoComboBox);
        panel.add(pisoLabel);
        panel.add(primerPisoRadioButton);
        panel.add(segundoPisoRadioButton);
        panel.add(serviciosLabel);
        panel.add(audifonosCheckBox);
        panel.add(mantaCheckBox);
        panel.add(revistasCheckBox);
        panel.add(calidadServicioLabel);
        panel.add(calidadServicioComboBox);
        panel.add(comprarButton);
        panel.add(limpiarButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comprarButton) {
            String nombre = nombreTextField.getText();
            String documento = documentoTextField.getText();
            String fechaViaje = fechaViajeTextField.getText();
            String origen = (String) origenComboBox.getSelectedItem();
            String destino = (String) destinoComboBox.getSelectedItem();
            String piso = primerPisoRadioButton.isSelected() ? "1er Piso" : "2do Piso";
            String serviciosOpcionales = "";
            if (audifonosCheckBox.isSelected()) serviciosOpcionales += "Audífonos ";
            if (mantaCheckBox.isSelected()) serviciosOpcionales += "Manta ";
            if (revistasCheckBox.isSelected()) serviciosOpcionales += "Revistas ";
            String calidadServicio = (String) calidadServicioComboBox.getSelectedItem();

            String resumen = "Resumen de la Compra:\n" +
                    "Nombre: " + nombre + "\n" +
                    "DNI: " + documento + "\n" +
                    "Fecha de Viaje: " + fechaViaje + "\n" +
                    "Origen: " + origen + "\n" +
                    "Destino: " + destino + "\n" +
                    "Piso: " + piso + "\n" +
                    "Servicios Opcionales: " + serviciosOpcionales + "\n" +
                    "Calidad de Servicio: " + calidadServicio;

            JOptionPane.showMessageDialog(this, resumen, "Resumen de Compra", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == limpiarButton) {
            nombreTextField.setText("");
            documentoTextField.setText("");
            fechaViajeTextField.setText("");
            audifonosCheckBox.setSelected(false);
            mantaCheckBox.setSelected(false);
            revistasCheckBox.setSelected(false);
            pisoButtonGroup.clearSelection();
            origenComboBox.setSelectedIndex(0);
            destinoComboBox.setSelectedIndex(0);
            calidadServicioComboBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmpresaTransporteApp());
    }
}
