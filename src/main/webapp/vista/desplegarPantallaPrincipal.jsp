<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>#QuedateEnCasa</title>
    </head>
    <body>
        <h1>Muestra de variables en Vista #1</h1>
        Variable en alcance request: ${mensaje}
        <br/>
        <br/>
        Variable en alcance sesion: ${mensaje2}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Pagina Principal</a>
    </body>
</html>
