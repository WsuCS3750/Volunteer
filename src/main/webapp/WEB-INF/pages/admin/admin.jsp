<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 8/6/2015
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Basic template for the header -->
<jsp:include page="../blades/head.jsp" />
<jsp:include page="../blades/header.jsp" />



  <h1>Admin page</h1>


  <ul>

    <c:forEach var = "users" items = "${allUsers}">
    <li>${users}</li>
  </c:forEach>

  </ul>



<!-- Basic template for the footer and end of page -->
<jsp:include page="../blades/footer.jsp" />
<jsp:include page="../blades/foot.jsp" />

