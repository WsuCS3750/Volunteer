<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<%--<head>--%>
<%--<link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap.min.css") %>'/>--%>
<%--<link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap-theme.min.css") %>'/>--%>
<%--<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("jquery.min.js") %>'></script>--%>
<%--<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("js/bootstrap.min.js") %>'></script>--%>
<%--</head>--%>

<head>


	</head>

<title>Prototype Hello World</title>
<body>
<h1>${message}</h1>
</body>


<!-- Weird formatting -->
<%--<form action="/signup">--%>
	<%--<input type="submit" value="SignUp!"/>--%>
	<%--Signup!--%>
<%--</form>--%>

<%--<button class="btn btn-primary">Signup</button>--%>
<a class = "btn btn-primary btn-success" href="<c:url value="signup" />">Signup</a>









<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
<script src="<c:url value="/resources/core/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/core/jquery.autocomplete.min.js" />"></script>
<%--<script src="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" />"></script>--%>
<script src="<c:url value="/resources/core/bootstrap.min.js" />"></script>


</html>