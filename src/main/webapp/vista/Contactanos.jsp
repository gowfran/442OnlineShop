<%-- 
    Document   : Contactanos
    Created on : 9 abr 2020, 16:28:27
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="template/head.jspf" %>

<%@include file="template/nav.jspf" %>

<div class="container">  
  <form id="contact" action="" method="post">
    <h3>Contactanos</h3>
    <h4>¡Estamos listos para atenderte!</h4>
    <fieldset>
      <input placeholder="Tu nombre:" type="text" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Tu correo:" type="email" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Tu numero telefonico:" type="tel" tabindex="3" required>
    </fieldset>
    <fieldset>
      <input placeholder="Tu dirección:" type="text" tabindex="4" required>
    </fieldset>
    <fieldset>
      <textarea placeholder="Escribe tu pedido:" tabindex="5" required></textarea>
    </fieldset>
    <fieldset>
      <button name="Enviar" type="submit" id="contact-submit" data-submit="...Sending">Enviar</button>
    </fieldset>
  </form>
</div>
<%@include file="template/footer.jspf" %>