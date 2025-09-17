<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Detalle del Libro</title></head>
<body>
    <c:choose>
        <c:when test="${not empty autor}">
            <h2>Detalles del libro</h2>
            <p><strong>Título:</strong> ${nombre}</p>
            <p><strong>Autor:</strong> ${autor}</p>
        </c:when>
        <c:otherwise>
            <h2>Libro no encontrado</h2>
            <p>El libro no se encuentra en nuestra lista.</p>
        </c:otherwise>
    </c:choose>
    <br>
    <a href="/libros">Volver a la lista de libros</a>
</body>
</html>