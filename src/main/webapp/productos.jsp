<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Booststrap CSS-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!--Iconos de awesome-->
        <script src="https://kit.fontawesome.com/f73e15d56b.js" crossorigin="anonymous"></script>
        <title>SUPERMEX</title>
    </head>
    <body>
        <!--Barra de navegación-->
         <jsp:include page="WEB-INF/paginas/comunes/barraNavegacion.jsp"></jsp:include>  
        <!--Cabecero para productos-->
        <jsp:include page="WEB-INF/paginas/comunes/cabecero.jsp"></jsp:include>
       
        <!--Botones de navegación-->
        <jsp:include page="WEB-INF/paginas/comunes/botonesNavegacion.jsp"></jsp:include>
        
        <!--Listado Productos-->
        <jsp:include page="WEB-INF/paginas/producto/listadoProductos.jsp"></jsp:include>
      
        <!--Pie de página-->
        <jsp:include page="WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>
        
        <script src="js/jquery-3.4.1.min"></script>
        <script src="js/bootstrap.min"></script>
    </body>
</html>
