<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<link rel="stylesheet" type="text/css" href="css/custom.css">

<title>Evento</title>
</head>
<body>

<c:import url="topo.jsp"></c:import>

	
	
<div class="center-align">
<h1 class="white-text"> Evento </h1>
<a href="./evento?q=new"><i class="material-icons prefix">add</i>Adicionar</a>
</div>




<div class="black container white-text">

<table class=" bordered highlight responsive-table" >
<tr>

<th>ID</th>
<th>Nome</th>
<th>Data</th>
<th>Tema</th>  
<th>Opções</th>
</tr>

<c:forEach var="evt" items="${lista}">
<tr>
 <td>${evt.eventoId}</td>
 <td>${evt.nomeEvento}</td>
 <td>${evt.data}</td>
 <td>${evt.tema}</td>

 <td> <a href="local?q=excluir&id=${evt.eventoId}"><i class="material-icons prefix">delete</i>Delete</a>
  	  <a href="local?q=editar&id=${evt.eventoId}"><i class="material-icons prefix">edit</i>Edit</a> 
 </td>
 
<tr>
</c:forEach>
</table>
</div>

		 <script type="text/javascript" src="js/materialize.min.js"></script>

</body>
</html>