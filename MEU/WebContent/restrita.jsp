<!DOCTYPE html>
<html>


<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<link rel="stylesheet" type="text/css" href="css/custom.css">


<title>Gerenciador de Espaços UCSAL</title>
</head>

<body>

	<nav class="black"> <a href="index.jsp" class="brand-logo center"><b>Gerenciador
			de Espaços UCSal</b></a> 
			<a href="index.jsp"><i class="material-icons prefix">arrow_back</i></a></nav>

	<div class="loginArea">
		<div class="container">
			<br>
			<img alt="Universidade Católica do Salvador"
				src="images/novaucsalogo.png" height="100" width="200" title="UCSAL">
			
			<form class="" action="homeAdmin.jsp" method="post">
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">person_outline</i> <input
							name="login" id="login" type="text" class="validate inputWhite">
						<label for="login">Login</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">lock_outline</i> <input
							id="senha" type="password" class="validate inputWhite">
						<label for="senha">Senha</label>
					</div>
				</div>
				<input type="submit" name="Entrar" value="Entrar"
					class="waves-effect waves-light btn grey lighten-5">
			</form>

			<br>
			<div class="container">
				<h6>
					<font color="white">Redes Sociais:&nbsp;&nbsp;<a
						class="grey-text text-lighten-3"
						href="https://pt-br.facebook.com/ucsal.oficial/"><input
							type='image' src="images/facebookLogo.png" height="40" width="40">
					</a><a class="grey-text text-lighten-3"
						href="https://www.instagram.com/ucsaloficial/?hl=pt-br"><input
							type='image' src="images/instagramLogo.png" height="38"
							width="38"></a> <a class="grey-text text-lighten-3"
						href="https://twitter.com/ucsaloficial"><input type='image'
							src="images/twitterLogo.png" height="40" width="40"></a></font>
				</h6>
			</div>

		</div>
	</div>


	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>
