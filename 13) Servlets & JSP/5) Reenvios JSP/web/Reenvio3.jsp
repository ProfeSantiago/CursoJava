<%-- 
    Document   : Reenvio3
    Created on : 04/04/2008, 03:21:31 PM
    Author     : Santiago
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <H3>
          Hoy es : <%= request.getParameter("Fechilla")%> <BR>
          Bienvenido  <%= request.getParameter("Name")%>, eres mayor de edad <BR>
          porque tu edad es : <%= request.getParameter("Age")%> 
        </H3>        
    </body>
</html>
