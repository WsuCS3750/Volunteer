<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 7/12/2015
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!-- Basic template for the first part -->
<jsp:include page="blades/head.jsp" />
<jsp:include page="blades/header.jsp" />




<h2>Thank you for submitting your information.</h2>


<table>


  <!-- use for each loop here when hooked up to the database -->
  <tr>
    <td>Name:  </td>
    <td>${firstName}</td>
  </tr>
  <tr>
    <td>Age:  </td>
    <td>${lastName}</td>
  </tr>
  <tr>
    <td>DoB:  </td>
    <td>${dob}</td>
  </tr>
</table>



<%--<h1>Volunteers</h1>--%>

<%--<table id="volunteerTable">--%>
  <%----%>
  <%--<script type = "text/javascript">--%>
    <%--var volunteers = new Array();--%>
  <%--</script>--%>
  <%--<c:forEach items="${volunteers}" var="listVar" varStatus="n">--%>
    <%--<tr>--%>
      <%--<td><c:out value="${listVar}" /></td>--%>
    <%--</tr>--%>
  <%--</c:forEach>--%>

<%--</table>--%>





<!-- Basic template for the first part -->
<jsp:include page="blades/head.jsp" />
<jsp:include page="blades/header.jsp" />

