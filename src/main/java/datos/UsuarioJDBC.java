
package datos;

import domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioJDBC {
    /*
    En esta clase definiremos las sentencias SQL de consulta, alta, modificación y eliminación (CRUD)
    posterior mente se establecen los métodos que haran uso de las mismas
    */
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password from USUARIO";
    private static final String SQL_INSERT = "INSERT into USUARIO (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE USUARIO SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM USUARIO WHERE id_usuario=?";
    
    //Metodo para consultar registros haceindo uso de un ArrayList
    public List<Usuario> select() throws ClassNotFoundException{
        //Creamos una conexion a la base de datos
        Connection conn = null;
        //Creamos un PreparedStatement para realizar los querys
        PreparedStatement stmt = null;
        //Creamos un ResultSet para guardar el resultado de la consulta
        ResultSet rs = null;
        //Creamos un objeto de Usuario
        Usuario usuario = null;
        //Creamos un ArrayList para guardar los objetos de tipo USUARIO
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            //Obtenemos la conexion y la encerramos en un Try Catch ya que puede arrojarnos una excepción
            conn = Conexion.getConnection();
            //Indicamos al PreparedStatement el query que va a realizar
            stmt = conn.prepareStatement(SQL_SELECT);
            //Guardamos en el resultSet la ejecución del query
            rs = stmt.executeQuery();
            
            //En un ciclo por cada linea ledia guardada en el ressultSet vamos a 
            // guardar cada valor de la columna en una variable
            while(rs.next()){
                //Creamos variables temporales para guardar los datos de la linea leida
                int id_usuario = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                
                //Asignamos los valores al objeto con el uso de los setters
                usuario = new Usuario();
                usuario.setId_uaurio(id_usuario);
                usuario.setUsuario(username);
                usuario.setPassword(password);
                
                //Agregamos el objeto al ArrayList
                usuarios.add(usuario);
                
            }
            
        } catch (SQLException ex) {
            //Imprimimos la excepción en caso de  haber
            ex.printStackTrace(System.out);
        }
        finally{
            //El bloque finally siempre se ejecuta entonces lo utilizamos para
            //cerrar las conexiones
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        
        //Regresamos el ArrayList con todos los objetos agregados
        return usuarios;
        
    }
    //Método para insertar un nuevo registro en la base de datos
    public int insertar(Usuario usuario) throws ClassNotFoundException{
        //Declaramos las variables para conexion y ejecución de querys
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            //Abrimos nuestra conexión y utilizamos try y catch para manejar la exepcion
            conn = Conexion.getConnection();
            //Asigmanos el query a ejecutar en el PreparedStatement
            stmt = conn.prepareStatement(SQL_INSERT);
            //Enviamos los datos que vienen dentro del objeto usuario
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            //Ejecutamos el query y guardamos en la variable rows el resultado 
            //de filas afectadas
            System.out.println("Ejecutando el query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            //Imprimimos en consola el numero de filas afectado
            System.out.println("Registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        //Agregamos el bloque finally para cerrar nuestras conexiones
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        //Retornamos el valor de filas afectadas
        return rows;
    }    
    //Método para actualizar un registro de la tabla usuario
    public int actualizar(Usuario usuario) throws ClassNotFoundException{
        //Declaramos nuestras variables de conexion y ejecución de query
        Connection conn = null;
        PreparedStatement stmt = null;
        //Declaramos variable papra guardar el numero de registros afectados
        int rows = 0;
        try {
            //Abrimos la conexion
            conn = Conexion.getConnection();
            //Asignamos el query al prepadeStatement
            stmt = conn.prepareStatement(SQL_UPDATE);
            //Asignamos los valores del objeto a nuestro query
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_uaurio());
            
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            rows = stmt.executeUpdate();
            System.out.println("Numero de registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        return rows;
    }
    //Método para eliminar un registro de USUSARIO
    public int eliminar(Usuario usuario) throws ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            //Abrimos la conexion
            conn =  Conexion.getConnection();
            //Indicamos al preparedStatement el query a ejecutar
            stmt = conn.prepareStatement(SQL_DELETE);
            //Enviamos el parametro al query
            stmt.setInt(1, usuario.getId_uaurio());
            //Ejecutamos query y lo mostramos en consola
            System.out.println("ejecutando query: " + SQL_DELETE);
            rows = stmt.executeUpdate();
            //Mostramos el numero de registros afectados
            System.out.println("Registros afectados: " + rows);            
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        }
        return rows;
    }
}
