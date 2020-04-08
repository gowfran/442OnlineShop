package datos;

import domain.ProductoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDaoJDBC implements ProductoDao{
    private static final String SQL_SELECT = "SELECT id_producto, nombre_producto, precio_producto FROM producto";
    private static final String SQL_INSERT = "INSERT INTO producto (nombre_producto, precio_producto) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE producto set nombre_producto=?, precio_producto=? WHERE id_producto =?";
    private static final String SQL_DELETE = "DELETE FROM producto WHERE id_producto=?";
    
    public List<ProductoDTO> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProductoDTO producto = null;
        List<ProductoDTO> productos = new ArrayList<ProductoDTO>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_producto = rs.getInt("id_producto");
                String nombre_producto = rs.getString("nombre_producto");
                String precio_producto = rs.getString("precio_producto");
                
                producto = new ProductoDTO();
                producto.setId_producto(id_producto);
                producto.setNombre_producto(nombre_producto);
                producto.setPrecio_producto(precio_producto);
                
                productos.add(producto);
                
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return productos;
    }
    
    public int insert(ProductoDTO producto){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareCall(SQL_INSERT);
            stmt.setString(1, producto.getNombre_producto());
            stmt.setString(2, producto.getPrecio_producto());

            
            System.out.println("ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
            
        }
        return rows;
    }
    
    public int update(ProductoDTO producto){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, producto.getNombre_producto());
            stmt.setString(2, producto.getPrecio_producto());
            stmt.setInt(5, producto.getId_producto());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
                    Conexion.close(stmt);
                    Conexion.close(conn);
                    }
            return rows;
    }
    
    public int delete(ProductoDTO producto){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, producto.getId_producto());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
            
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
        
    }
}
