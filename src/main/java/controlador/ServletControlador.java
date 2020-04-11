package controlador;
import datos.ProductoDaoJDBC;
import domain.ProductoDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
Para poder reconocer este servlet dedse la página web necesitamos agregar una
anotación y asignar el path, se importa desde javax.servlet.annotation.WebServlet
*/
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    /*
    Hay que indicar cual es el método que va a procesar este servlet
        -Si se hace la llamada desde la un navegador se conoce como una petición doGET
         Ya que lo estamos haciendo directamente por un link del navegador
        -Si utilizamos un formulario lo normal es que se utilice la petición doPOST
    */
    
    //Debido a que el método está definido en la clase padre HttpServlet hay que sobreescribirlo con la notación Override
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //Recuperamos el listado de Productos
        List<ProductoDTO> productos = new ProductoDaoJDBC().select();
        System.out.println("Listado de Productos = " + productos);
        //Compartimos nuestro listado de productos mediante request
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("productos.jsp").forward(request, response);
        
        
        /*
        Aquí se resive la petición y ser responde al navegador
        */
        //1. Procesamos los parámetros
        
        //2. Creamos los JavaBeans
        
        //3. Agregamos el Java beans a algun alcance
        //request.setAttribute("mensaje", "saludos desde el Servlet");
        
        //HttpSession sesion = request.getSession();
        //sesion.setAttribute("mensaje2", "¡Hola Mundo!");
        
        //4. redireccionar a la vista seleccionada
//        RequestDispatcher rd = request.getRequestDispatcher("vista/Contactanos.jsp");
//        rd.forward(request, response);
    }
}
