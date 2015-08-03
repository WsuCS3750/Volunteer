<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Basic template for the first part -->
<jsp:include page="blades/head.jsp" />
<jsp:include page="blades/header.jsp" />




<h1>${message}</h1>








<!-- Weird formatting using bootstrap -->
<%--<form action="/signup">--%>
<%--<input type="submit" value="SignUp!"/>--%>
<%--Signup!--%>
<%--</form>--%>

<%--<button class="btn btn-primary">Signup</button>--%>
<a class = "btn btn-primary btn-success" href="<c:url value="signup" />">Signup</a>










<!-- Basic template for the first part -->
<jsp:include page="blades/footer.jsp" />
<jsp:include page="blades/foot.jsp" />

