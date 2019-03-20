<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Reenvía la petición hacia otra JSP </title>
    </head>
    <body>       
            
    <%//Inicia el Scriptlet
        String Nombre = request.getParameter("Nombre_Txt");
        int Edad = request.getIntHeader("Edad_Txt");
        if (Nombre != null){
    %><!--Termina e Inicia otro Scriptlet para insertar Bloque HTML/JSP--> 
   
     <jsp:forward page = "Reenvio2.jsp">
         <jsp:param name="fecha" value="<%=new java.util.Date()%>" />
     </jsp:forward> <!-- Fecha no es un campo de texto es 
                         un parámetro de la página: Reenvio2.jsp -->     
     
    <%//Continua el Scriptlet
      }else{
    %><!--Termina Scriptlet para insertar Bloque HTML--> 
    
    <h2>Bienvenido, digite sus datos para continuar</h2>
        <form action="Reenvio1.jsp" method="get">
            Nombre: <BR>
            <input type="text" name="Nombre_Txt" value="" /> <BR>
             Edad: <BR>
             <input type="text" name="Edad_Txt" value="" />
            <input type="submit" value="Continuar" />
        </form>
        
    <%//Continua el Scriptlet
      }//Fin del Else
    %><!--Fin del Scriptlet--> 

    </body>
</html>
