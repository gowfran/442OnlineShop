<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="index.jsp">
        <img src="img/logo.png" width="70" height="70" class="d-inline-block" alt="Logo SUPERMEX"> SuperMex
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-1" 
            aria-controls="#navbar-1" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbar-1">
        <ul class="navbar-nav mr-auto w-100 justify-content-end">
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">Inicio <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/ServletControlador">Productos <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a href="Contactanos.jsp" class="btn btn-primary btn-block">
                    <i class="fas fa-phone-volume"></i> Contáctanos
                </a>
            </li>
        </ul>
    </div>
</nav>