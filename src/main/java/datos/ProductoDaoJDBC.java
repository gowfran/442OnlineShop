package datos;

import domain.ProductoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDaoJDBC implements ProductoDao{
    private static final String SQL_SELECT = "SELECT stockid,Categoria,Familia,SubFamilia,Articulo,units,precio From vw_stockmaster";
    //private static final String SQL_SELECT = "SELECT id_producto, nombre_producto, precio_producto FROM producto";
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
//                int idProducto = rs.getInt("id_producto");
//                String nombreProducto = rs.getString("nombre_producto");
//                String precioProducto = rs.getString("precio_producto");
//                
//                producto = new ProductoDTO();
//                producto.setIdProducto(idProducto);
//                producto.setNombreProducto(nombreProducto);
//                producto.setPrecioProducto(precioProducto);
                  String stockid = rs.getString("stockid");
                  String categoria = rs.getString("categoria");
                  String familia = rs.getString("familia");
                  String subFamilia = rs.getString("subfamilia");
                  String articulo = rs.getString("articulo");
                  String units = rs.getString("units");
                  double precio = rs.getDouble("precio");
                  
                  producto = new ProductoDTO();
                  producto.setStockid(stockid);
                  producto.setCategoria(categoria);
                  producto.setFamilia(familia);
                  producto.setSubFamilia(subFamilia);
                  producto.setArticulo(articulo);
                  producto.setUnits(units);
                  producto.setPrecio(precio);
                
                  productos.add(producto);
                
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
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
            stmt.setString(1, producto.getNombreProducto());
            stmt.setString(2, producto.getPrecioProducto());

            
            System.out.println("ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
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
            stmt.setString(1, producto.getNombreProducto());
            stmt.setString(2, producto.getPrecioProducto());
            stmt.setInt(5, producto.getIdProducto());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
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
            stmt.setInt(1, producto.getIdProducto());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
            
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
        
    }
}
