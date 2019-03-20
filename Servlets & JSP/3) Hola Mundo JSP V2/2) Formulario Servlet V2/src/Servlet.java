import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet de Ejemplo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Servlet del Sitio: " + request.getContextPath () + "</h3>");
        out.println("Bienvenido: " + request.getParameter("Nombre_Txt"));
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
