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

<title>Espaço</title>
</head>
<body>

<c:import url="topo.jsp"></c:import>

	
	
<div class="center-align">
<h1 class="white-text"> Espaços </h1>
<a href="cadastroEspaco.jsp"><i class="material-icons prefix">add</i>Adicionar</a>
</div>




<div class="black container white-text">

<table class=" bordered highlight responsive-table" >
<tr>

<th>ID</th>
<th>Nome</th>
<th>Capacidade Maxima</th>
<th>Status</th> 
<th>Opções</th> 
</tr>

<c:forEach var="e" items="${lista}">
<tr>
 <td>${e.espacoId}</td>
 <td>${e.nome}</td>
 <td>${e.capacidadeMax}</td>
 <td>${e.status}</td>
 <td> <a href="espaco?q=excluir&id=${e.espacoId}"><i class="material-icons prefix">delete</i>Delete</a>
  	  <a href="espaco?q=editar&id=${e.espacoId}"><i class="material-icons prefix">edit</i>Edit</a> 
 </td>
 


<tr>
</c:forEach>
</table>
</div>

		 <script type="text/javascript" src="js/materialize.min.js"></script>

</body>
</html>