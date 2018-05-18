<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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


<title>Gerenciador de Espaços UCSAL</title>
</head>
<body>

<c:import url="navbar.jsp"></c:import>
	
		
		<div class="logindiv">
				<form action="espaco" method="post">
				
				Nome: <input type="text" name="nome" /><br> 
				Capacidade: <input type="number" name="capMax" /><br> 
				Local: <input type="text" name="local" /><br> 
						<input type="submit" value="criar" />
				</form>
		</div>
		

<c:import url="footer.jsp"></c:import>
</body>
</html>