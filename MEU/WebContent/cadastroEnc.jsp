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
	

	<form action="encarregado" method="post">
	<div class="cadastroEspaco">
	<div class="container">
				<img alt="Universidade Católica do Salvador"
					src="images/novaucsalogo.png" height="70" width="140" title="UCSAL">
				<h6>Cadastro de Encarregado</h6>
				<div class="row">
					<div class="input-field col s12">
						<input name="id" id="id" type="hidden" value="${encarregado.encarregadoId}" required > 
							<label for ="id"></label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s6">
						<i class="material-icons prefix">person</i> 
						<input class="validate inputWhite" name="nome" id="nome" type="text" value="${encarregado.nomeEncarregado}" required> 
							<label for ="nome">Nome do Encarregado</label>
					</div>
					<div class="input-field col s6">
						<i class="material-icons prefix">assignment_ind</i> <input name="cargo" 
							id="cargo" type="text" value="${encarregado.cargo}" required class="validate inputWhite"> <label
							for="lotacao">Cargo</label>
					</div>
				</div>
					<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">assignment_ind</i> <input name="login" 
							id="login" type="text" value="${encarregado.login}" required class="validate inputWhite"> <label
							for="login">Login</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">assignment_ind</i> <input name="senha" 
							id="senha" type="text" value="${encarregado.senha}" required class="validate inputWhite"> <label
							for="senha">Senha</label>
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