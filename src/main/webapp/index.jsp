<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Bootstrap CSS-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!--Iconos de awesome-->
        <script src="https://kit.fontawesome.com/f73e15d56b.js" crossorigin="anonymous"></script>
        <title>SUPERMEX</title>
    </head>
    <body>
        <!--Barra de navegación-->
        <jsp:include page="WEB-INF/paginas/comunes/barraNavegacion.jsp"></jsp:include>  
        
        
        
        <!--<a href="http://www.gcars.website/ECommerce/vista/enviarCorreo.php?nombre=fran&mail=thefran0803@gmail.com&telefono=419&cp=37960&direccion=queretaro&pedido=maruchan">
            Enviar correo
        </a>-->
        
            <!--Carrusel-->
            <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="img/ENCABEZADO PROVEEDORES.png" class="d-block w-100" alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Fresco</h5>
                            <p>Precios de locura.</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="img/img3.jpeg" class="d-block w-100" alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Querétaro</h5>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="img/proveedores.jpg" class="d-block w-100" alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Proveedores</h5>
                            <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                        </div>
                    </div>
                </div>
            </div>

            <!--Pie de página-->
        <jsp:include page="WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>    
            <script src="js/jquery-3.4.1.min"></script>
            <script src="js/bootstrap.min"></script>
        </body>
    </html>
    <!--Modal contáctanos-->
