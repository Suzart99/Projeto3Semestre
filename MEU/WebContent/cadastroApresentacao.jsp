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

<title>Cadastro Apresentacao</title>
</head>
<body>
<c:import url="topo.jsp"></c:import>   


		
			<div class="cadastroEspaco">
			<div class="container">
			<form action="local" method="post">
				
				<img alt="Universidade Cat�lica do Salvador"
					src="images/novaucsalogo.png" height="70" width="140" title="UCSAL">
				<h6>Cadastro das Apresenta��es</h6>
					<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">domain</i> 
						<input name="id" id="id" type="hidden" value="${orador.oradorId}" >
						<textarea id="sinopse" class="materialize-textarea validate inputWhite" required></textarea>
          				<label for="sinopse">Sinopse</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">keyboard_arrow_up</i>   
						<input type="time" class="timepicker validate inputWhite" name="hora" id="hora" required>
						<label for="hora">Hora</label>
				</div>
					</div>
					<div class="row">
					<div class="input-field col s12">
						<select name="enc" class="browser-default">
							<option value="" selected disabled>Selecione um EVENTO</option>
							<c:forEach var="apresentacao" items="${lista}">
								<option value="${apresentacao.encarregadoId}">${apresentacao.nomeEncarregado}</option>
							</c:forEach>
						</select>
					</div>
					<input type="submit" name="cadastrar" value="Cadastrar"
					class="waves-effect waves-light btn white lighten-5">
				</div>
				</form>		
		</div>
		</div>
		




						
		 <script type="text/javascript" src="js/materialize.min.js"></script>
		  <script type="text/javascript" src="js/custom.js"></script>

</body>
</html>