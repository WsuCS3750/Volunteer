<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 7/12/2015
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Prototype Results</title>
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">


</head>
<body>


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






</body>
</html>
