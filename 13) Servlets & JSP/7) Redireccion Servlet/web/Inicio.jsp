<%-- 
    Document   : Inicio
    Created on : 01/11/2008, 01:14:20 PM
    Author     : Ing Santiago Rodr�guez Paniagua.
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
       <head>
    <title>Esta P�gina llama a un Servlet que redirecciona a otra p�gina</title>
  </head>
  <body>
        <!-- ------------------------------------------------------------------ 
            Las siguientes l�neas solo funcionan hasta 
            cuando es llamada esta p�gina desde el servlet.
         ------------------------------------------------------------------- -->
        <% String De_Nuevo = " ";  
            if (request.getParameter("mensaje")== null){
                De_Nuevo = " "; 
           }else{
                De_Nuevo = request.getParameter("mensaje");
           }
        %>                
        <Font color="Red"><H1><%=De_Nuevo %></H1></Font>
        
        
        <H3>Haga clic en un hyperv�nculo para <br> redireccionarlo a la p�gina apropiada</H3>
        <a href="Redirect_Servlet?Saludo=Hola"> Dar bienvenida </a><br><br>
        <a href="Redirect_Servlet?Saludo=Adios"> Despedirse </a> 
        <!-- Saludo es un par�metro que se le pasa al Servlet -->
        
  </body>
</html>
