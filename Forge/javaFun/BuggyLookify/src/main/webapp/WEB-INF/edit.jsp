<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formateo fechas (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- Formulario form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- para errores de renderizado en rutas PUT -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar canciones</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body >
<div class="container mt-5">
        <h1 class="text-center bg-warning text-white py-3">Editar canción</h1>
        <div class="row justify-content-center bg-light p-4 rounded">
            <form class="col-md-6" action="/songs/${songs.id}/edit" method="post" modelAttribute="songs">
                <div class="form-group">
                    <label for="title">Title</label>
                    <form:errors path="title" cssClass="text-danger" />
                    <input type="text" class="form-control" id="title" name="title" />
                </div>
                <div class="form-group">
                    <label for="artist">Artist</label>
                    <form:errors path="artist" cssClass="text-danger" />
                    <input type="text" class="form-control" id="artist" name="artist" />
                </div>
                <div class="form-group">
                    <label for="rating">Rating</label>
                    <form:errors path="rating" cssClass="text-danger" />
                    <input type="text" class="form-control" id="rating" name="rating" />
                </div>

                <button type="submit" class="btn btn-success btn-block">Submit</button>
            </form>
        </div>
    </div>
</body>
</html>