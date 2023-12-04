package actividades;

import java.sql.*;

public class Transacciones {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Empresa", "root", "root");

            con.setAutoCommit(false); 

            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO empleados (nombre, telefono, sueldo) VALUES ('Ejemplo1', '123', 2000.00)");
            stmt.executeUpdate("INSERT INTO empleados (nombre, telefono, sueldo) VALUES ('Ejemplo2', '456', 2500.00)");

            con.commit(); 

            con.close();
        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback(); // Revertir transaccion
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
