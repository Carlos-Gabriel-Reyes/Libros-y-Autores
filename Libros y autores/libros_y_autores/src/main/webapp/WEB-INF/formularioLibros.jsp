<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Agregar Libro</title></head>
<body>
    <h2>Formulario para agregar libro</h2>
    <form action="/procesarLibros" method="post">
        <label for="nombre">Nombre del libro:</label><br>
        <input type="text" id="nombre" name="nombre" required><br><br>

        <label for="autor">Autor:</label><br>
        <input type="text" id="autor" name="autor" required><br><br>

        <input type="submit" value="Agregar libro">
    </form>
    <br>
    <a href="/libros">Volver a la lista de libros</a>
</body>
</html>