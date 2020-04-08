<%-- 
    Document   : Pedidos
    Created on : 31 mar. 2020, 13:20:36
    Author     : Fran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="template/head.jsp" />
<jsp:include page="template/nav.jsp" />

<%--
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
--%>
<form>
    <div class="form-group">
    <label for="email">Nombre del Cliente:</label>
    <input type="" class="form-control" placeholder="cliente" id="email">
  </div>
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" placeholder="Enter email" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Dirección:</label>
    <input type="" class="form-control" placeholder="Direccion" id="pwd">
  </div>
  <div class="form-group">
    <label for="pwd">telefono</label>
    <input type="" class="form-control" placeholder="Telefono" id="pwd">
  </div>
    <div class="form-group">
    <label for="pwd">Num pedido</label>
    <input type="" class="form-control" placeholder="Pedido" id="pwd">
  </div>
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>
<jsp:include page="template/footer.jsp" />