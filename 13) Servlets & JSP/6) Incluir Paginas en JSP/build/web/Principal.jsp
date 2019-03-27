<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>Ejemplo de la "Acción" Incluir de JSP</h1>
    <table border="1">
        <tbody>
            <tr>
                <td> <jsp:include  page="Primera.html" flush="true" /> </td>
                <td> <jsp:include  page="Segunda.html" flush="true" /> </td>
            </tr>
            <tr>
                <td> <jsp:include  page="Tercera.html" flush="true" />  </td>
                <td> <jsp:include  page="Cuarta.html" flush="true" /> </td>
            </tr>
        </tbody>
    </table>
    </body>
</html>
