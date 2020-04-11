package test;

import datos.ProductoDao;
import datos.ProductoDaoJDBC;
import domain.ProductoDTO;
import java.util.List;

public class ManejoProductos {
    public static void main(String[] args) {
        ProductoDao productoDao = new ProductoDaoJDBC();
        List<ProductoDTO> productos = productoDao.select();
        
        for(ProductoDTO producto : productos){
            System.out.println("productos: " + producto);
        }
        
        //Prueba insert
        /*
        ProductoDTO persona = new ProductoDTO();
        persona.setNombre("María");
        persona.setApellido("Lara");
        persona.setEmail("mlara@mail.com");
        persona.setTelefono("23123232344");
        
        personaJDBC.insert(persona);
        */
        
        //Prueba update
//        ProductoDTO persona = new ProductoDTO();
//        persona.setId_persona(3);
//        persona.setNombre("Mayra");
//        persona.setApellido("Lara");
//        persona.setEmail("mlara@mail.com");
//        persona.setTelefono("55668899");
//        
//        
//        personaJDBC.update(persona);
        

        //Prueba delete
//        ProductoDTO producto = new ProductoDTO();
//        producto.setId_producto(3);
//        
//        personaJDBC.delete(producto);
        
        
    }
    
    
}
