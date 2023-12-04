import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgendaFrame extends JFrame {
    private JTextField txtID, txtNombre, txtApellido, txtEmail, txtTelefono, txtBuscarApellido;
    private JButton btnSiguiente, btnAnterior, btnInsertar, btnBuscar, btnMostrarTodos;
    private JLabel lblPosicion;

    private AgendaDAO agendaDAO;
    private int totalRegistros;

    public AgendaFrame() {
        super("Agenda App");
        this.agendaDAO = new AgendaDAO(this);

        // Configurar la interfaz de usuario
        txtID = new JTextField(5);
        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtEmail = new JTextField(20);
        txtTelefono = new JTextField(15);
        txtBuscarApellido = new JTextField(20);

        btnSiguiente = new JButton("Siguiente");
        btnAnterior = new JButton("Anterior");
        btnInsertar = new JButton("Insertar");
        btnBuscar = new JButton("Buscar");
        btnMostrarTodos = new JButton("Mostrar Todos");

        lblPosicion = new JLabel("1 de 1");

        // Agregar ActionListener para los botones
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agendaDAO.siguienteRegistro();
            }
        });

        btnAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agendaDAO.anteriorRegistro();
            }
        });

        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarRegistro();
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPorApellido();
            }
        });

        btnMostrarTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTodosLosRegistros();
            }
        });

        // Configurar el diseño de la interfaz
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAnterior);
        panelBotones.add(lblPosicion);
        panelBotones.add(btnSiguiente);

        JPanel panelBuscar = new JPanel();
        panelBuscar.add(new JLabel("Buscar por Apellido:"));
        panelBuscar.add(txtBuscarApellido);
        panelBuscar.add(btnBuscar);

        add(panelBotones);
        add(new JLabel("ID:"));
        add(txtID);
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Apellido:"));
        add(txtApellido);
        add(new JLabel("Email:"));
        add(txtEmail);
        add(new JLabel("Telefono:"));
        add(txtTelefono);

        add(panelBuscar);
        add(btnInsertar);
        add(btnMostrarTodos);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

        // Cargar el primer registro
        agendaDAO.siguienteRegistro();
    }

    private void insertarRegistro() {
        String id = txtID.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();

        boolean exito = agendaDAO.insertarRegistro(id, nombre, apellido, email, telefono);

        if (exito) {
            // Limpiar los campos despues de la insercion
            txtID.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEmail.setText("");
            txtTelefono.setText("");

            // Mover al siguiente registro
            agendaDAO.siguienteRegistro();
        } else {
            JOptionPane.showMessageDialog(this, "Error al insertar el registro.");
        }
    }

    private void buscarPorApellido() {
        String apellidoBuscar = txtBuscarApellido.getText();
        ResultSet resultado = agendaDAO.buscarPorApellido(apellidoBuscar);

        if (resultado != null) {
            actualizarCampos(resultado);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron registros con ese apellido.");
        }
    }

    private void mostrarTodosLosRegistros() {
        // Mostrar todos los registros y regresar al primer registro
        agendaDAO.mostrarTodosLosRegistros();
    }

    public void actualizarPosicion(int posicionActual, int totalRegistros) {
        lblPosicion.setText(posicionActual + " de " + totalRegistros);
    }

    public void actualizarCampos(ResultSet resultSet) {
        try {
            // Actualizar los campos de texto con los datos del registro actual
            txtID.setText(resultSet.getString("id"));
            txtNombre.setText(resultSet.getString("nombre"));
            txtApellido.setText(resultSet.getString("apellido"));
            txtEmail.setText(resultSet.getString("email"));
            txtTelefono.setText(resultSet.getString("telefono"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AgendaFrame();
            }
        });
    }
}
