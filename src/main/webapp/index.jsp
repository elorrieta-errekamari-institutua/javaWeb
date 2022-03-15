<h1>Hola soy la pagina principal</h1>

<a href="listado-alumnos">Listado Alumnos</a>

<form action="saludar-controller" method="post" >
	
	<input type="text" name="nombre" placeholder="Dime tu nombre" required>
	<br>
	<input type="submit" value="Enviar">
	
</form>

<p style="color:red">${saludo}<p>