<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 8/3/2015
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Basic template for the header -->
<jsp:include page="../blades/head.jsp" />
<jsp:include page="../blades/header.jsp" />

<br>



<!-- Not working properly, basic setup though -->

<a href="<c:url value="/clock/pickuser"/>" class="btn btn-primary">Clock in</a>

<a href="<c:url value="/clock/pickuser"/>" class="btn btn-primary">Clock out</a>

<a href = "<c:url value="/admin/admin"/>">Admin</a>









<!-- Basic template for the footer and end of page -->
<jsp:include page="../blades/footer.jsp" />
<jsp:include page="../blades/foot.jsp" />

