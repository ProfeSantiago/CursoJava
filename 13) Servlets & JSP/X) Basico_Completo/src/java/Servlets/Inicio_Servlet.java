/*******************************************************************************
 * ing. Santiago Rodríguez Paniagua 21/10/2008
 ******************************************************************************/
package Servlets;
import Clases.Seguridad_Class; //Importamos la Clase
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Inicio_Servlet extends HttpServlet {
    
    //------------------------------------
    //Declaración de Variables
        String Nombre="";
        String Clave="";
        Seguridad_Class Acceso = new Seguridad_Class("Estudiante","123");
    //------------------------------------
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
/*******************************************************************************
    Leemos de la página Web que llamó a este Servlet
*******************************************************************************/        
        Nombre = request.getParameter("Usr_Txt"); 
        Clave = request.getParameter("Pass_Txt");
        
/*******************************************************************************
    Comprobamos el usuario utilizando la función Validad
    que es una propiedad de Acceso, el cual es una instancia de Seguridad_Class
******************************************************************************/
        if (Acceso.validar(Nombre, Clave) == true){ 
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Acceso Autorizado</title>");
            out.println("</head>");
            out.println("<body background=X-Hielo.jpg>");
            out.println("<h2>Bienvenido Usuario: </h2>");
            out.println("<Font color=Green><B>"+Nombre +"</B> </Font><P>");
            out.println("Usted a ingresado a: <Font color=Blue> www." + request.getContextPath ()+ ".com</Font>");
            out.println("<P>Para continuar debe actualizar sus datos <P>");
            out.println("<a href=Registrar_Usuario.html> Continuar >> </a>");
            out.println("</body>");
            out.println("</html>");
        }else{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error: Acceso No Autorizado</title>");
            out.println("</head>");
            out.println("<body background=X-snowbg.gif>");
            out.println("<Font color=Red><h2> Error de inicio de Sesion</h2></Font>");
            out.println("El Usuario: <Font color=Blue><B> " + Nombre+" </B></Font><P>");
            out.println("No esta registrado en: <Font color=Green> www." + request.getContextPath ()+ ".com</Font><P>");
            out.println("<P>Para continuar debe registrar sus datos <P>");
            out.println("<a href=Registrar_Usuario.html> Continuar >> </a>");
            out.println("</body>");
            out.println("</html>");
        }//Fin Else
        } finally { 
            out.close();
        }
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
    }// </editor-fold>

}
