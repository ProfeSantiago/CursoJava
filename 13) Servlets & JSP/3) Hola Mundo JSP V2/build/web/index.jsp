<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo</title>
    </head>
    <!-- Nota: Recuerde que HTML NO! es un Lenguaje de Programación
         Es un lenguaje de Definición de Documentos   -->
    <body>
            <!-- Las siguientes líneas son Etiquetas simples de HTML -->
            <h2>Hola Mundo!!</h2>
            <h3>Este es el Primer Ejemplo de JSP</h3>
            La fecha actual es:
            <!-- El sigiente código es JAVA incrustado dentro de HTML -->
            <%= new java.util.Date() %>
            <% String mensaje = "Hola Mundo"; %>
            <%= mensaje%>
    </body>
</html>
