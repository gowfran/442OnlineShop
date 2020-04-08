<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>#QuedateEnCasa</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Muestra de variables en Vista #1</h1>
        Variable en alcance request: ${mensaje}
        <br/>
        <br/>
        Variable en alcance sesion: ${mensaje2}
        <br/>
        <br/>
        <button>Hola</button>
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Pagina Principal</a>
        
        <script src="js/jquery-3.4.1.min"></script>
        <script src="js/bootstrap.min"></script>
    </body>
</html>
