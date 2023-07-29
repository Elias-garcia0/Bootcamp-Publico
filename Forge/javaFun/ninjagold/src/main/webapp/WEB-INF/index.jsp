<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

<p>Your gold: <span class="text-success"> <c:out  value=" ${gold} "></c:out> </span></p>


<div class="row">
<div class="card col mx-4 p-1 text-center">
<form action="/gold" method="post">
	<h2>Farm</h2>
	<p>(earns 10-20 gold)</p>
	<input type="hidden" name="lugar" value="farm"/>
	
	<button type="submit" class="btn btn-warning mx-auto abs-center">Find Gold!</button>
</form>
</div>

<div class="card col mx-4 p-1 text-center">
<form action="/gold" method="post">
	<h2>Cave</h2>
	<p>(earns 5-10 gold)</p>
	<input type="hidden" name="lugar" value="cave"/>
	
	<button type="submit" class="btn btn-warning">Find Gold!</button>
</form>
</div>
<div class="card col mx-4 p-1 text-center">
<form action="/gold" method="post">
	<h2>House</h2>
	<p>(earns 2-5 gold)</p>
	<input type="hidden" name="lugar" value="house"/>
	
	<button type="submit" class="btn btn-warning">Find Gold!</button>
</form>
</div>
<div class="card col mx-4 p-1 text-center">
<form action="/gold" method="post">
	<h2>Casino!</h2>
	<p>(earns 0-50 gold)</p>
	<input type="hidden" name="lugar" value="casino"/>
	
	<button type="submit" class="btn btn-warning">Find Gold!</button>
</form>
</div>
</div>
<h2 class="mx-3">Activies:</h2>
<textarea class="text-success" rows="10" cols="150">
<c:forEach items="${resultados  }" var="resultado">
<c:if test="${resultado.contains('aumentas') }">
<c:out value="${resultado }"></c:out>
</c:if>

</c:forEach>
</textarea>

</div>

</body>
</html>