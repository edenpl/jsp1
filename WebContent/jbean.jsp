<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ecodeup</title>
</head>
<body>
	<c:out value = "${ecodeup.welcomeMessage}"> </c:out>
	<br>
	<p>
		<c:out value = "${ecodeup.helloWorld}" ></c:out>
	</p>
	
	
	<p>Fecha actual: 
		<c:out value = "${ecodeup.date}"></c:out>
	</p>
	<p>
		<c:out value="${header['User-Agent']}"></c:out>
	</p>
</body>
</html>