<%@ page import="java.io.File" %>
<%@ page import="org.apache.logging.log4j.LogManager" %>
<%@ page import="org.apache.logging.log4j.Logger" %>
<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 8/3/2015
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Basic template for the header -->
<jsp:include page="blades/head.jsp" />
<jsp:include page="blades/header.jsp" />


<h1>Login to CCS Volunteer Database</h1>

  <h1>
  <%
    // java here
    //Print the error string here
    String errorString = (String)request.getAuthType();
    out.println(errorString);
  %>
  </h1>


<form name = "loginForm" action = "<c:url value = "security_check" />" method="post">

  <table>
    <tr>
      <td>User:</td>
      <td><input type="text" name = "userName" value = ""></td>
    </tr>

    <tr>
      <td>Password:</td>
      <td><input type="password" name = "userPass" value = ""></td>
    </tr>

    <tr>
      <td>
        <input class = "btn btn-success" name="submit" type = "submit" value = "submit">
      </td>
    </tr>
  </table>

</form>









<!-- Basic template for the footer and end of page -->
<jsp:include page="blades/footer.jsp" />
<jsp:include page="blades/foot.jsp" />

