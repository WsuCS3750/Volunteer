<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 8/11/2015
  Time: 8:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Basic template for the header -->
<jsp:include page="../blades/head.jsp" />
<jsp:include page="../blades/header.jsp" />



<form:form id="SignUp" name="SignUp" method="GET" action="/clock/clock">

    <tr>
      <div class="form-group">
        <td><form:label path="username">Username: </form:label></td>
        <td><form:input id="username" name="username" path="username"/></td>
      </div>
    </tr>


</form:form>








<!-- Basic template for the footer and end of page -->
<jsp:include page="../blades/footer.jsp" />
<jsp:include page="../blades/foot.jsp" />

