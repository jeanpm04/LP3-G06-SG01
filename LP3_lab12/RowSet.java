package actividades;

import javax.sql.rowset.*;

public class RowSet {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            RowSetFactory factory = RowSetProvider.newFactory();
            JdbcRowSet rowSet = factory.createJdbcRowSet();

            rowSet.setUrl("jdbc:mysql://localhost:3306/Empresa");
            rowSet.setUsername("root");
            rowSet.setPassword("root");

            rowSet.setCommand("SELECT * FROM empleados where sueldo < 3000 " + " ");
            rowSet.execute();

            while (rowSet.next()) {
                System.out.println("ID: " + rowSet.getInt("Id") + ", Nombre: " + rowSet.getString("nombre")
                        + ", Teléfono: " + rowSet.getString("telefono") + ", Sueldo: " + rowSet.getDouble("sueldo"));
            }

            rowSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
