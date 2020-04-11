package datos;

import java.sql.*;
public class Conexion {
    /*
    En esta clase llamada Conexion definimos los parametros y métodos que se utilizarán para establecer la conexion
    a la base de datos.
    Se declaran los metodos Close(); para cerrar las conexiones de tipo preparedStatement, Connection y ResultSet
    */
    private static final String JDBC_URL = "jdbc:mysql://localhost/fsegovia_ecommerce?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
        
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
