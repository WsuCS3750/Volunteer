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
    <title></title>
</head>
<body>


<h2>Submitted Student Information</h2>
<table>


  <!-- use for each loop here when hooked up to the database -->
  <tr>
    <td>Name</td>
    <td>${firstName}</td>
  </tr>
  <tr>
    <td>Age</td>
    <td>${lastName}</td>
  </tr>
  <tr>
    <td>ID</td>
    <td>${dob}</td>
  </tr>
</table>


</body>
</html>
