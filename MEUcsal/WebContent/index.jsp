<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"

	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/custom.css">

<meta name="google-signin-client_id" content="52811452091-jh8vqs7uou0fg2mbu571g2iieqq0q8q4.apps.googleusercontent.com">

   <script src="https://apis.google.com/js/platform.js" async defer></script>


<title>Gerenciador de Espaços UCSAL</title>
</head>
<body>

	<div class="row">
		<div class="card-panel col s12" id="logindiv">
			<div class="container">
				<h5>
					<img alt="Universidade Católica do Salvador"
						src="https://www.ucsal.br/images/logo-nova-ucsal.png">
				</h5>
			</div>
			<br>
			<form action = "login" method = "post">
				<div class="input-field col s12">
					<i class="material-icons prefix">person_pin_circle</i> <input
						name="matricula" type="text" class="validate " required>
					<label for="matricula" class="active">Matrícula</label>
				</div>
				<div class="input-field col s12">
					<i class="material-icons prefix">lock</i> <input name="senha"
						type="password" class="validate" required> 
						<label
						for="senha" class="active">Senha</label>
				</div>
				<button class="btn waves-effect waves-light btn-large" type="submit"
					name="action">Entrar</button>                       
					
			</form>
			<form action="loginGoogle"><div class="g-signin2" data-onsuccess="onSignIn" id="myP"></div></form>
		</div>
	</div>


</body>
</html>