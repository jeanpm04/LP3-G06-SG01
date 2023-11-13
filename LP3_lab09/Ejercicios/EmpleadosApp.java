package Ejercicios;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosApp extends JFrame {
    private static final String NOMBRE_ARCHIVO = "empleados.dat";
    private static final List<Empleado> empleados = new ArrayList<>();

    private JTextField txtNumero, txtNombre, txtSueldo;
    private JTable tablaEmpleados;
    private DefaultTableModel modeloTabla;

    public EmpleadosApp() {
        super("Empleados");
        setLayout(new BorderLayout());

        JPanel panelDatosEmpleado = new JPanel(new GridLayout(4, 2));
        panelDatosEmpleado.add(new JLabel("Datos del Empleado"));
        panelDatosEmpleado.add(new JLabel(""));
        
        panelDatosEmpleado.add(new JLabel("Número:"));
        txtNumero = new JTextField(10);
        panelDatosEmpleado.add(txtNumero);

        panelDatosEmpleado.add(new JLabel("Nombre:"));
        txtNombre = new JTextField(10);
        panelDatosEmpleado.add(txtNombre);

        panelDatosEmpleado.add(new JLabel("Sueldo:"));
        txtSueldo = new JTextField(10);
        panelDatosEmpleado.add(txtSueldo);

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Número");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Sueldo");

        tablaEmpleados = new JTable(modeloTabla);
        add(new JScrollPane(tablaEmpleados), BorderLayout.CENTER);

        add(panelDatosEmpleado, BorderLayout.NORTH);

        JButton btnAgregar = new JButton("Agregar Empleado");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });

        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(btnAgregar);

        add(panelBoton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

        cargarEmpleados();
        reporteEmpleados();
    }

    private void cargarEmpleados() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            empleados.addAll((List<Empleado>) entrada.readObject());
            actualizarTabla();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Se creará uno nuevo al agregar empleados.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void reporteEmpleados() {
        StringBuilder builder = new StringBuilder();
        if (empleados.isEmpty()) {
            builder.append("No hay empleados para mostrar.");
        } else {
            builder.append("Empleados:\n");
            for (Empleado empleado : empleados) {
                builder.append(empleado).append("\n");
            }
        }
        // No se usa JTextArea para el reporte, puedes usarlo como lo necesites.
    }

    private void agregarEmpleado() {
        int numero = Integer.parseInt(txtNumero.getText());
        String nombre = txtNombre.getText();
        double sueldo = Double.parseDouble(txtSueldo.getText());

        Empleado nuevoEmpleado = new Empleado(numero, nombre, sueldo);
        empleados.add(nuevoEmpleado);

        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            salida.writeObject(empleados);
            reporteEmpleados();
            actualizarTabla();
            limpiarCampos();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void limpiarCampos() {
        txtNumero.setText("");
        txtNombre.setText("");
        txtSueldo.setText("");
    }

    private void actualizarTabla() {
        modeloTabla.setRowCount(0); // Limpiar la tabla
        for (Empleado empleado : empleados) {
            Object[] fila = {empleado.getNumero(), empleado.getNombre(), empleado.getSueldo()};
            modeloTabla.addRow(fila);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmpleadosApp();
            }
        });
    }
}