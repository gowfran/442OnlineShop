package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {
        //Creamos un objeto de la clase UsuarioJDBC para poder haccer uso de
        //sus métodos
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        //Creamos un ArrayList para guardar el resultado de metodo Select que
        //nos devuelve un tipo ArrayList
        List<Usuario> usuarios = usuarioJDBC.select();
        
        //Utilizamos un for, por cada objeto persona obtenido del ArrayList
        //imprimimos su metodo toStrign que muestra el contenido
        for(Usuario usuario : usuarios){
            System.out.println("Usuario: " + usuario);
        }
        
        //realizamos una pruba para insertar un nuevo usuario en la base de datos
        //Creamos un objeto de tipo uduario
//        Usuario usuario = new Usuario();
//        //Le pasamos los parametros de entrada para el nuevo usuario
//        usuario.setUsuario("Hector233");
//        usuario.setPassword("12345");
//        //Ejecutamos el método con ayuda del objeto usaurioJDBC y le proporcionamos
//        //El objeto usaurio
//        usuarioJDBC.insertar(usuario);

//        //Realizamos prueba del método update
//        Usuario usuario = new Usuario();
//        usuario.setUsuario("José");
//        usuario.setPassword("coca cola");
//        usuario.setId_uaurio(2);
//        
//        usuarioJDBC.actualizar(usuario);
        
        
        //Realizamos prueva para eliminar un registro
        Usuario usuario = new Usuario();
        //Este metodo solo requiere del Id que se requiere eliminar
        usuario.setId_uaurio(3);
        usuarioJDBC.eliminar(usuario);
    }
    
}
