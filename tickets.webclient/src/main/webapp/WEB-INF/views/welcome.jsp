<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="sections/head.jsp" />
</head>
<body>
	<div class="container">
		<jsp:include page="sections/header.jsp" />
		<h1>${welcome}</h1>
		<p>${tagline}</p>
		<spring:url value="/shows" var="showsUrl"></spring:url>
		<a href="${showsUrl}">Shows</a>
	</div>
</body>
</html>
