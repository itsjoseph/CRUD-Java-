package deportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {

    public static Connection connection;
    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mariadb://localhost/admin", "root", "pepe");
            System.out.println("Conexion...");
        } catch (Exception e) {
            System.out.print("Error en la conexion" + e.getMessage());
        }
        return conectar;
    }

    public static Connection connect() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mariadb://localhost/ejemplo";
        String user = "root";
        String pass = "pepe";
        System.out.println("Conectando...");

        try {
            connection = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
