import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Redirect_Servlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Redirect_Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>"+request.getParameter("Saludo")+"</h1> <P>");      
        out.println("Para volver:<a href=Inicio.jsp?mensaje=" +"Bienvenido&nbsp;Nuevamente!!" +"> Dar Clic aquí </a><br>");
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
}
