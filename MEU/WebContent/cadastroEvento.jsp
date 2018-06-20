<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html">
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<link rel="stylesheet" type="text/css" href="css/custom.css">

<title>Cadastro Evento</title>
</head>
<body>
	<c:import url="topo.jsp"></c:import>

	<form action="evento" method="post">
		<div class="cadastroEspaco">
			<div class="container">
				<img alt="Universidade Católica do Salvador"
					src="images/novaucsalogo.png" height="100" width="200"
					title="UCSAL">
				<h6>Cadastro de Evento</h6>

				<div class="row">
					<div class="input-field col s12">
									<input name="id" id="id" type="hidden" value="${evento.eventoId}" >
						<i class="material-icons prefix">event</i> <input id="nome" name="nome"
							type="text" class="validate inputwhite"> <label
							for="nome">Nome do Evento</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s5">
						<i class="material-icons prefix">event</i> <input id="tema"
							name ="tema" type="text" class="validate inputwhite"> <label
							for="tema">Tema</label>
					</div>
					<div class="input-field col s7">
						<i class="material-icons prefix">assignment</i><input name="data"
							id="data" type="date" class="datepicker inputwhite"> <label
							for="data">Data</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<select name="enc" class="browser-default">
							<option value="" selected disabled>Selecione o ENCARREGADO </option>
							<c:forEach var="encarregado" items="${lista}">
								<option value="${encarregado.encarregadoId}">${encarregado.nomeEncarregado}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<input type="submit" name="cadastrar" value="Confirmar"
						class="waves-effect waves-light btn grey lighten-5">
			</div>
		</div>
	</form>






	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
	<script type="text/javascript" src="js/custom.js"></script>

</body>
</html>
