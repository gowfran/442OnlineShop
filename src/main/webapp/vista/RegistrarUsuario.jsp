<%-- 
    Document   : RegistrarUsuario
    Created on : 31 mar. 2020, 13:19:31
    Author     : Fran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="template/head.jspf" %>

<%@include file="template/nav.jspf" %>
<div class="row" style=" margin-top: 50px;">
    
    <div class="col-lg-7">
        <div class="p-5">
            <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
            </div>
            <form class="user">
                <div class="form-group row">
                    <div class="col-sm-6 mb-3 mb-sm-0">
                        <input type="text" class="form-control form-control-user" id="exampleFirstName" placeholder="First Name">
                    </div>
                    <div class="col-sm-6">
                        <input type="text" class="form-control form-control-user" id="exampleLastName" placeholder="Last Name">
                    </div>
                </div>
                <div class="form-group">
                    <input type="email" class="form-control form-control-user" id="exampleInputEmail" placeholder="Email Address">
                </div>
                <div class="form-group row">
                    <div class="col-sm-6 mb-3 mb-sm-0">
                        <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password">
                    </div>
                    <div class="col-sm-6">
                        <input type="password" class="form-control form-control-user" id="exampleRepeatPassword" placeholder="Repeat Password">
                    </div>
                </div>
                <a href="login.html" class="btn btn-primary btn-user btn-block">
                    Register Account
                </a>
            </form>
            <hr>
            <div class="text-center">
                <a class="small" href="forgot-password.html">Forgot Password?</a>
            </div>
            <div class="text-center">
                <a class="small" href="login.html">Already have an account? Login!</a>
            </div>
        </div>
    </div>
    <div class="col-lg-5 d-none d-lg-block bg-register-image">
        <img class="img-fluid" src="img/WhatsApp Image 2020-04-06 at 12.22.18.jpg">
    </div>
</div>
<br>



<%@include file="template/footer.jspf" %>