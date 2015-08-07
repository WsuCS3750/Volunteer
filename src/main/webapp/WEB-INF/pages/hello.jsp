<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Basic template for the first part -->
<jsp:include page="blades/head.jsp" />
<jsp:include page="blades/header.jsp" />




<%--<link rel = "stylesheet" type = "text/css" href = "<c:url value="resources/css/main.css" />" />--%>


<%--How to display a message --%>
<%--<h1>${message}</h1>--%>


<div class = "jumbotron">
    <div class = "container">
        <h1>CCS Volunteer Database</h1>
        <a class = "btn btn-primary btn-success" href="<c:url value="signup" />">Signup</a>

        <a class="btn btn-primary btn-success" href="<c:url value="admin/admin" />">Manage</a>


    </div>
</div>











<!-- Weird formatting using bootstrap -->
<%--<form action="/signup">--%>
<%--<input type="submit" value="SignUp!"/>--%>
<%--Signup!--%>
<%--</form>--%>

<%--<button class="btn btn-primary">Signup</button>--%>










<!-- Basic template for the first part -->
<jsp:include page="blades/footer.jsp" />
<jsp:include page="blades/foot.jsp" />

