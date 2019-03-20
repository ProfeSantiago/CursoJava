<%-- 
    Document   : index
    Created on : 01/03/2010, 11:00:11 AM
    Author     : Santiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action = "Servlet" method = "get">
         <H2>Ingresar Datos</H2>
         Cedula <BR>
         <input type="text" name="Cedula_Txt" value="" /> <BR>
         Nombre <BR>
         <input type="text" name="Nombre_Txt" value="" /> <BR>
         Telefono <BR>
         <input type="text" name="Telefono_Txt" value="" /> <P>
         <input type = "submit" value = "Insertar" />
       </form>
    </body>
</html>
