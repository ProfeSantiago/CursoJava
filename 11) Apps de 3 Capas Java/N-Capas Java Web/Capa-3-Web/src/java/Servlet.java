import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet extends HttpServlet {
   
   //-----------------------------------
    //Declaración de Variables Globales
        String Cedula,Nombre,Telefono;
        ResultSet Registro;
        Logica_Negocios Objeto= new Logica_Negocios();
        
    //----------------------------------

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
           //ºººººººººººººººººººººººººººººººººººººººººººº
            Objeto.Conectar("NCapas_ODBC"); //Conectar con la Base de Datos
            //Obtener los Datos desde la página Web anterior y guardarlos en variables
            Cedula = request.getParameter("Cedula_Txt");
            Nombre = request.getParameter("Nombre_Txt");
            Telefono = request.getParameter("Telefono_Txt");
            Objeto.Insertar(Cedula,Nombre,Telefono);
            //ºººººººººººººººººººººººººººººººººººººººººººº
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registro Insertado Correctamente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro Insertado Correctamente</h1>");
            Registro = Objeto.Consultar("Datos");
            try {
                while (Registro.next()) {
                    Cedula = Registro.getString("Cedula");
                    Nombre = Registro.getString("Nombre");
                    Telefono = Registro.getString("Telefono");
                    //ºººººººººººººººººººººººººººººººººººººººººººº
                    //Se muestran los datos en la página Web
                    out.println(Cedula + " " + Nombre + " " + Telefono + " " + "<BR>");
                    //ºººººººººººººººººººººººººººººººººººººººººººº
                }//Fin While
                Registro.close();
            } catch (SQLException ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            out.println("</body>");
            out.println("</html>");
            out.println("<a href=index.jsp>Volver</a>");
           
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
