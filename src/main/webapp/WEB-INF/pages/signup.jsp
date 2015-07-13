<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 7/12/2015
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<form:form method="POST" action="/addVolunteer">


  <table>
    <tr>
      <td><form:label path="firstName">First Name</form:label></td>
      <td><form:input path="firstName" /></td>
    </tr>
    <tr>
      <td><form:label path="lastName">Last Name</form:label></td>
      <td><form:input path="lastName" /></td>
    </tr>
    <tr>
      <td><form:label path="dob">Date of Birth</form:label></td>
      <td><form:input path="dob" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>


</form:form>



</body>
</html>
