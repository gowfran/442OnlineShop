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
    <!--Barra de navegación-->
    <jsp:include page="WEB-INF/paginas/comunes/barraNavegacion.jsp"></jsp:include>  
    <body>


        <!--Cabecero-->
        <header id="main-header" class="py-2 bg-info text-white">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <h1>
                            <i class="far fa-envelope-open"></i> Por favor escribenos
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <div class="success row justify-content-center vh-100">  
            <form>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" id="nombre" required>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="apellido">Apellido</label>
                        <input type="text" class="form-control" id="apellido" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="direccion">Dirección</label>
                    <input type="text" class="form-control" id="direccion" placeholder="Avenida Zaragoza..." required>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="ciudad">Ciudad</label>
                        <input type="text" class="form-control" id="ciudad" required>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="codigo">CP</label>
                        <input type="number" class="form-control" id="codigo">
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" required>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="telefono">Teléfono</label>
                        <input type="tel" class="form-control" id="telefono" required>
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-check col-md-7">
                        <input class="form-check-input" type="checkbox" id="gridCheck" required>
                        <a href="#" class="form-check-label">
                            Términos y condiciones
                        </a>
                    </div>
                    <div class="form-check col-md-5">
                        <a href="#"/>Aviso de privacidad
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
        </div>
        <script src="js/jquery-3.4.1.min"></script>
        <script src="js/bootstrap.min"></script>
    </body>
</html>