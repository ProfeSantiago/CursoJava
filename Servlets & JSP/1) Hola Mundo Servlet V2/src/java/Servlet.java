import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
      
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head> <title> 1º Ejemplo Servlets! </title> </head>");
        out.println("<body>");
        out.println("<h1>Hola Mundo Servlet</h1>");
        out.println("</body> </html>");

    }
    
}
