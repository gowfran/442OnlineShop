package controlador;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1. Procesamos los parámetros
        
        //2. Creamos los JavaBeans
        
        //3. Agregamos el Java beans a algun alcance
        request.setAttribute("mensaje", "saludos desde el Servlet");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("mensaje2", "¡Hola Mundo!");
        
        //4. redireccionar a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/ConsultarPedidos.jsp");
        rd.forward(request, response);
    }
    
}
