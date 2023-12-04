package actividades;

import java.sql.*;

public class Operaciones {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Empresa", "root", "root");

            // Insertar
            String insertQuery = "INSERT INTO empleados (nombre, telefono, sueldo) VALUES (?, ?, ?)";
            PreparedStatement insertStatement = con.prepareStatement(insertQuery);
            insertStatement.setString(1, "Ejemplo");
            insertStatement.setString(2, "123456789");
            insertStatement.setDouble(3, 3000.00);
            insertStatement.executeUpdate();

            // Recuperar
            Statement selectStatement = con.createStatement();
            ResultSet resultSet = selectStatement.executeQuery("SELECT * FROM empleados");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("Id") + ", Nombre: " + resultSet.getString("nombre")
                        + ", Teléfono: " + resultSet.getString("telefono") + ", Sueldo: " + resultSet.getDouble("sueldo"));
            }

            // Actualizar
            String updateQuery = "UPDATE empleados SET sueldo = ? WHERE nombre = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);
            updateStatement.setDouble(1, 3500.00);
            updateStatement.setString(2, "Ejemplo");
            updateStatement.executeUpdate();

            // Borrar
            String deleteQuery = "DELETE FROM empleados WHERE nombre = ?";
            PreparedStatement deleteStatement = con.prepareStatement(deleteQuery);
            deleteStatement.setString(1, "Ejemplo");
            deleteStatement.executeUpdate();

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
