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

<title>Encarregado</title>
</head>
<body>

<c:import url="topo.jsp"></c:import>
	
<div class="center-align">
<h1 class="white-text"> Encarregados </h1>
<a href="cadastroEnc.jsp"><i class="material-icons prefix">add</i>Adicionar</a>
</div>



<div class="black container white-text">

<table class=" bordered highlight responsive-table" >
<tr>

<th>ID</th>
<th>Nome</th>
<th>Cargo</th>
<th>Opções</th>
</tr>

<c:forEach var="e" items="${lista}">
<tr>
 <td>${e.encarregadoId}</td>
 <td>${e.nomeEncarregado}</td>
 <td>${e.cargo}</td>
 <td> <a href="encarregado?q=excluir&id=${e.encarregadoId}"><i class="material-icons prefix">delete</i>Excluir</a>
  	  <a href="encarregado?q=editar&id=${e.encarregadoId}"><i class="material-icons prefix">edit</i>Editar</a> 
 </td>
 


<tr>
</c:forEach>
</table>
</div>

		 <script type="text/javascript" src="js/materialize.min.js"></script>

</body>
</html>