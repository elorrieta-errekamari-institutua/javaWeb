
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<a href="index.jsp">Volver al inicio</a>

<h1>${titulo}</h1>


<ol>
	<c:forEach items="${alumnos}" var="alumno">
		<li>${alumno}</li>
	</c:forEach>	
</ol>