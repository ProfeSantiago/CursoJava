package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reenvio1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Reenvía la petición hacia otra JSP </title>\n");
      out.write("    </head>\n");
      out.write("    <body>       \n");
      out.write("            \n");
      out.write("    ");
//Inicia el Scriptlet
        String Nombre = request.getParameter("Nombre_Txt");
        int Edad = request.getIntHeader("Edad_Txt");
        if (Nombre != null){
    
      out.write("<!--Termina e Inicia otro Scriptlet para insertar Bloque HTML/JSP--> \n");
      out.write("   \n");
      out.write("     ");
      if (true) {
        _jspx_page_context.forward("Reenvio2.jsp" + (("Reenvio2.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("fecha", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(new java.util.Date()), request.getCharacterEncoding()));
        return;
      }
      out.write(" <!-- Fecha no es un campo de texto es \n");
      out.write("                         un parámetro de la página: Reenvio2.jsp -->     \n");
      out.write("     \n");
      out.write("    ");
//Continua el Scriptlet
      }else{
    
      out.write("<!--Termina Scriptlet para insertar Bloque HTML--> \n");
      out.write("    \n");
      out.write("    <h2>Bienvenido, digite sus datos para continuar</h2>\n");
      out.write("        <form action=\"Reenvio1.jsp\" method=\"get\">\n");
      out.write("            Nombre: <BR>\n");
      out.write("            <input type=\"text\" name=\"Nombre_Txt\" value=\"\" /> <BR>\n");
      out.write("             Edad: <BR>\n");
      out.write("             <input type=\"text\" name=\"Edad_Txt\" value=\"\" />\n");
      out.write("            <input type=\"submit\" value=\"Continuar\" />\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    ");
//Continua el Scriptlet
      }//Fin del Else
    
      out.write("<!--Fin del Scriptlet--> \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
