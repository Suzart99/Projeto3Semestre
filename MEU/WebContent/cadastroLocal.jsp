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

<title>Cadastro Local</title>
</head>
<body>
<c:import url="topo.jsp"></c:import>   


		
			<div class="cadastroEspaco">
			<div class="container">
			<form action="local" method="post">
				
				<img alt="Universidade Católica do Salvador"
					src="images/novaucsalogo.png" height="70" width="140" title="UCSAL">
				<h6>Cadastro de Locais</h6>
					<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">domain</i> 
						<input name="id" id="id" type="hidden" value="${local.localId}" >
						<input name="campus" id="campus" type="text" class="validate inputWhite" required > 
							<label for ="campus">Campus</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">keyboard_arrow_up</i> <input name="andar" 
							id="andar" type="text" class="validate inputWhite" required> <label
							for="andar">Andar</label>
				</div>
					</div>
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">domain</i> <input name="bloco" 
							id="bloco" type="text" class="validate inputWhite" required> <label
							for="bloco">Bloco</label>
					</div>
						<input type="submit" name="cadastrar" value="Cadastrar"
					class="waves-effect waves-light btn white lighten-5">
				</div>
				</form>		
		</div>
		</div>
		




		 <script type="text/javascript" src="js/materialize.min.js"></script>

</body>
</html>