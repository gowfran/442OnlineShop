/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.ProductoDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ProductoDao {
    
    public List<ProductoDTO> select();
    
    public int insert(ProductoDTO producto) throws SQLException;
    
    public int update(ProductoDTO producto) throws SQLException;
    
    public int delete(ProductoDTO producto) throws SQLException;
    
    
    
}
