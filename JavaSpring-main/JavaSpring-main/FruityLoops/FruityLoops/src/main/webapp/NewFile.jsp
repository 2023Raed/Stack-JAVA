

<!DOCTYPE html>
<html>
<head>
	<title>Fruit List</title>
	<style>
		/* Add your own CSS styles here */
	</style>
</head>
<body>
	<h1>Fruit List</h1>
	<ul>
		<c:forEach items="${fruits}" var="fruit">
			<li>${fruit.name} - ${fruit.price}</li>
		</c:forEach>
	</ul>
</body>
</html>
