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
	

	<form action="espaco" method="post">
	<div class="cadastroEspaco">
	<div class="container">
				<img alt="Universidade Católica do Salvador"
					src="images/novaucsalogo.png" height="70" width="140" title="UCSAL">
				<h6>Cadastro de Espaço</h6>
						<input name="id" id="id" type="hidden" value="${espaco.espacoId}" > 
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">domain</i> 
						<input class="validate inputWhite" name="nome" id="nome" type="text" value="${espaco.nome}" required> 
							<label for ="nome">Nome do Espaço</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">storage</i> <input name="capMax" 
							id="capMax" type="number" value="${espaco.capacidadeMax}" required class="validate inputWhite"> <label
							for="lotacao">Capacidade Máxima</label>
					</div>
				</div>
				
				<div class="row">
					<div class="input-field col s6">
						<i class="material-icons prefix">storage</i> 
						<label for="lotacao">Status</label> 
						<input name="group1" type="radio" id="true" class="browser-default">

      					<input name="group1" type="radio" id="false" />
					</div>
				</div>
				
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">storage</i> <input name="capMax" 
							id="capMax" type="number" value="${espaco.capacidadeMax}" required class="validate inputWhite"> <label
							for="lotacao">Capacidade Máxima</label>
					</div>
						<input type="submit" name="cadastrar" value="Confirmar"
					class="waves-effect waves-light btn grey lighten-5">
				</div>
					</div>
					</div>		
	</form>		
	
	
		
		
		 <script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>