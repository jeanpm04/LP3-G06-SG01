package actividades;

import java.sql.*;

public class PreparedStatementEjemplo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Empresa", "root", "root");

            String query = "SELECT * FROM empleados WHERE sueldo > ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, 3000.00);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("Id") + ", Nombre: " + rs.getString("nombre")
                        + ", Teléfono: " + rs.getString("telefono") + ", Sueldo: " + rs.getDouble("sueldo"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
