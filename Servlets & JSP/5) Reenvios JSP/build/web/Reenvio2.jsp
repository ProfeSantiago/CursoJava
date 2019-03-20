<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>        
        <%//Inicia el Scriptlet
        int edad= Integer.parseInt(request.getParameter("Edad_Txt"));
        String Nombre = request.getParameter("Nombre_Txt");
        String Hoy = request.getParameter("fecha");
        // Fecha no es un campo de texto de Reenvio1, 
        // es un parámetro que se envio desde el Forward de Reenvio1.
        if (edad >= 18){
        %>
       
       <jsp:forward page = "Reenvio3.jsp">
       <jsp:param name="Name" value="<%=Nombre%>" />
       <jsp:param name="Age" value="<%=edad%>" />
       <jsp:param name="Fechilla" value="<%=Hoy%>" /> 
       </jsp:forward> 

        <% }else{ %>
        
        <jsp:forward page = "Reenvio4.jsp">
       <jsp:param name="Name" value="<%=Nombre%>" />
       <jsp:param name="Age" value="<%=edad%>" />
       <jsp:param name="Fechilla" value="<%=Hoy%>" /> 
       </jsp:forward> 
       
       <% } %>
    </body>
</html>