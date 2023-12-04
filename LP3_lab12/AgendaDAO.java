import java.sql.*;

public class AgendaDAO {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private AgendaFrame agendaFrame;
    private int posicionActual;
    private int totalRegistros;
    private ResultSet resultSetBusqueda;


    public AgendaDAO(AgendaFrame agendaFrame) {
        this.agendaFrame = agendaFrame;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laboratorio12", "root", "root");
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery("SELECT * FROM Agenda");
            totalRegistros = contarRegistros();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean insertarRegistro(String id, String nombre, String apellido, String email, String telefono) {
        try {
            resultSet.moveToInsertRow();
            resultSet.updateString("id", id);
            resultSet.updateString("nombre", nombre);
            resultSet.updateString("apellido", apellido);
            resultSet.updateString("email", email);
            resultSet.updateString("telefono", telefono);
            resultSet.insertRow();
            resultSet.moveToCurrentRow();
            totalRegistros++;
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void siguienteRegistro() {
        try {
            if (resultSet.next()) {
                agendaFrame.actualizarCampos(resultSet);
                actualizarPosicion();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void anteriorRegistro() {
        try {
            if (resultSet.previous()) {
                agendaFrame.actualizarCampos(resultSet);
                actualizarPosicion();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void actualizarPosicion() {
        try {
            int posicionActual = resultSet.getRow();
            agendaFrame.actualizarPosicion(posicionActual, totalRegistros);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int contarRegistros() {
        try {
            resultSet.last();
            int total = resultSet.getRow();
            resultSet.beforeFirst();
            return total;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public ResultSet buscarPorApellido(String apellido) {
        try {
            String consulta = "SELECT * FROM Agenda WHERE apellido = ?";
            PreparedStatement pst = connection.prepareStatement(consulta);
            pst.setString(1, apellido);

            resultSetBusqueda = pst.executeQuery();

            if (resultSetBusqueda.next()) {
                actualizarPosicion();
                return resultSetBusqueda;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public void mostrarTodosLosRegistros() {
        try {
            // Consulta para obtener todos los registros
            String consulta = "SELECT * FROM Agenda";
            resultSet = statement.executeQuery(consulta);

            // Crear y mostrar la nueva ventana con JTextArea
            new MostrarTodosFrame(resultSet);

            // Cerrar el ResultSet despues de usarlo
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int obtenerTotalRegistros() {
        int total = 0;
        try {
            // Consulta para obtener el numero total de registros
            String consulta = "SELECT COUNT(*) as total FROM Agenda";
            ResultSet countResultSet = statement.executeQuery(consulta);

            // Obtener el resultado de la consulta de conteo
            if (countResultSet.next()) {
                total = countResultSet.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }
}
