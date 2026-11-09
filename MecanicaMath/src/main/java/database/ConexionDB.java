package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

    private static final String URL = "jdbc:sqlite:mecanicamath.db";

    public static Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            crearTablaSiNoExiste(conn);
        } catch (SQLException e) {
            System.err.println("Error de conexión a SQLite: " + e.getMessage());
        }
        return conn;
    }

    private static void crearTablaSiNoExiste(Connection conn) {
        // Tabla diseñada para almacenar el análisis matemático de Symja
        String sql = "CREATE TABLE IF NOT EXISTS analisis_fórmulas ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " ecuacion_posicion TEXT NOT NULL,"
                + " velocidad_derivada TEXT,"
                + " aceleracion_derivada TEXT,"
                + " fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP"
                + ");";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla: " + e.getMessage());
        }
    }
}
