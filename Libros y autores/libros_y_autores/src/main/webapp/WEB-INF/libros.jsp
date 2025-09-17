<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Lista de Libros</title></head>
<body>
    <h2>Libros disponibles</h2>
    <ul>
        <c:forEach var="entry" items="${libros}">
            <li>
                <a href="/libros/${entry.key}">${entry.key}</a>
            </li>
        </c:forEach>
    </ul>
    <br>
    <a href="/formularioLibros">Agregar nuevo libro</a>
</body>
</html> 