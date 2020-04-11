<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section id="productos">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Productos</h4>
                    </div>
                    <table calss="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Categoría</th>
                                <th>Familia</th>
                                <th>Subfamilia</th>
                                <th>Articulo</th>
                                <th>Unidad de medida</th>
                                <th>Precio</th>                      
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de productos-->
                            <c:forEach var="producto" items="${productos}">
                                <tr>
                                    <td>${producto.stockid}</td>
                                    <td>${producto.categoria}</td>
                                    <td>${producto.familia}</td>
                                    <td>${producto.subFamilia}</td>
                                    <td>${producto.articulo}</td>
                                    <td>${producto.units}</td>
                                    <td>${producto.precio}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>