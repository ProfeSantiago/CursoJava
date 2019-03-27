<!-- Nota: Recuerde que HTML NO! es un Lenguaje de Programación
         Es un lenguaje de Definición de Documentos. Las siguientes líneas
         son Etiquetas simples de HTML.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titulo de la Página JSP</title>
    </head>
        <!-- Comentario HTML:
             El Siguiente Bloque contiene la declaración de una
             Variable de Java Pero incrustada dentro del HTML
        -->
        <% String Texto = ""; %>
        <!-- Comentario HTML:
             Ahora leemos el Parametro Que viene por la barra de direcciones
             del Navegador Web (Internet Explorer, FireFox, etc.)
        -->
        <% if (request.getParameter("Parametro")== null){
                //Si no fue enviado el Parametro lo Limpia
                Texto = " ";
           }else{
                //Si fue recibido el Parámetro lo Lee de la Barra de Dirección
               Texto = request.getParameter("Parametro");
           }//Fin Else
        %>
    <body>
        <h1>Titulo Grande</h1>
        <h2>Titulo Mediano</h2>
        <h3>Titulo Pequeño</h3>
        <!-- Comentario HTML: Llamamos a la siguiente pagina -->
        <form action="Pagina2.jsp" method="Get">
            <input type="submit" value="Avanzar >>" name="Avanza_Btn" />
        </form>
        <!-- Mostramos el Parametro recibido -->
        <%=Texto%>
    </body>
</html>
