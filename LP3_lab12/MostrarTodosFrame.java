import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostrarTodosFrame extends JFrame {

    private JTextArea textArea;

    public MostrarTodosFrame(ResultSet resultSet) {
        super("Mostrar Todos los Registros");
        textArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        mostrarRegistros(resultSet);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void mostrarRegistros(ResultSet resultSet) {
        try {
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");

                String registro = String.format("ID: %s, Nombre: %s, Apellido: %s, Email: %s, Telefono: %s%n",
                        id, nombre, apellido, email, telefono);

                textArea.append(registro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
