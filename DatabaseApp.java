package lab12;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DatabaseApp extends JFrame implements ActionListener {
    private JTextField sqlField, filterField;
    private JButton executeButton;
    private JTable table;
    private DefaultTableModel tableModel;

    public DatabaseApp() {
        setTitle("Database GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel sqlLabel = new JLabel("INGRESE AQUI:");
        sqlField = new JTextField(30);
        executeButton = new JButton("Submit Query");
        executeButton.addActionListener(this);

        JLabel filterLabel = new JLabel("Apply Filter:");
        filterField = new JTextField(15);
        

        topPanel.add(sqlLabel);
        topPanel.add(sqlField);
        topPanel.add(executeButton);
        topPanel.add(filterLabel);
        topPanel.add(filterField);

        JPanel centerPanel = new JPanel(new BorderLayout());

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        tableModel = new DefaultTableModel();
        table.setModel(tableModel);

        centerPanel.add(scrollPane, BorderLayout.CENTER);

        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(centerPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == executeButton) {
            executeSQLStatement(sqlField.getText(), filterField.getText());
        }
    }

    //
    private void executeSQLStatement(String sql, String filter) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Empresa", "root", "root");
            Statement stmt = con.createStatement();

            if (sql.trim().toLowerCase().startsWith("select")) {
                // Consulta SELECT
                ResultSet rs = stmt.executeQuery(sql + (filter.isEmpty() ? "" : " WHERE " + filter));

                ResultSetMetaData rsMetaData = rs.getMetaData();
                int columnCount = rsMetaData.getColumnCount();
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = rsMetaData.getColumnName(i);
                }
                tableModel.setColumnIdentifiers(columnNames);

                tableModel.setRowCount(0);
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    tableModel.addRow(row);
                }
            } else if (sql.trim().toLowerCase().startsWith("update") || sql.trim().toLowerCase().startsWith("delete")) {
                // Consulta UPDATE o DELETE
                int rowsAffected = stmt.executeUpdate(sql + (filter.isEmpty() ? "" : " WHERE " + filter));
                System.out.println("Filas afectadas: " + rowsAffected);
            }

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	DatabaseApp gui = new DatabaseApp();
            gui.setVisible(true);
        });
    }
}
