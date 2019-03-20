<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer formulario con JSP</title>
    </head>
    <!-- Nota: Recuerde que HTML NO! es un Lenguaje de Programación
         Es un lenguaje de Definición de Documentos. Las siguientes líneas 
         son Etiquetas simples de HTML.
    -->
    <body>    
    <h1>Mensaje de Bienvenida</h1>

    <!-- El sigiente código es JAVA incrustado dentro de HTML -->
    <% String nombre = request.getParameter("Nombre_Txt"); %>
    Hola <%= nombre %>
    
    </body>
</html>
