package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=windows-1252");
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n");
      out.write("       <head>\n");
      out.write("    <title>Esta Página llama a un Servlet que redirecciona a otra página</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("        <!-- ------------------------------------------------------------------ \n");
      out.write("            Las siguientes líneas solo funcionan hasta \n");
      out.write("            cuando es llamada esta página desde el servlet.\n");
      out.write("         ------------------------------------------------------------------- -->\n");
      out.write("        ");
 String De_Nuevo = " ";  
            if (request.getParameter("mensaje")== null){
                De_Nuevo = " "; 
           }else{
                De_Nuevo = request.getParameter("mensaje");
           }
        
      out.write("                \n");
      out.write("        <Font color=\"Red\"><H1>");
      out.print(De_Nuevo );
      out.write("</H1></Font>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <H3>Haga clic en un hypervínculo para <br> redireccionarlo a la página apropiada</H3>\n");
      out.write("        <a href=\"Redirect_Servlet?Saludo=Hola\"> Dar bienvenida </a><br><br>\n");
      out.write("        <a href=\"Redirect_Servlet?Saludo=Adios\"> Despedirse </a> \n");
      out.write("        <!-- Saludo es un parámetro que se le pasa al Servlet -->\n");
      out.write("        \n");
      out.write("  </body>\n");
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
