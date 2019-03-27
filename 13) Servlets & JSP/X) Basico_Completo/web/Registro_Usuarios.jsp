<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer formulario con JSP</title>
    </head>
    <body background=X-Papel_Natural.jpg>
    <h2>Datos Registrados Correctamente</h2>
    
    <%/* ***********************************************************************
        Leemos de la página Web que llamó a esta Pagina JSP
    *************************************************************************/%>
    <% String Usuario = request.getParameter("Usr_Txt"); %>
    <% String Direccion = request.getParameter("Adr_Txt"); %>
   
    Su Nombre Completo es <%= Usuario %> 
    <BR>
    Su Direccion exacta es <%= Direccion %>
    </body>
</html>
