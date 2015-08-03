<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 7/12/2015
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Basic template for the first part -->
<jsp:include page="blades/head.jsp" />
<jsp:include page="blades/header.jsp" />


<h2>Please input your information below.</h2>

<form:form id="SignUp" name="SignUp" method="POST" action="/addVolunteer">

  <table>
    <tr>
      <td><form:label path="firstName">First Name:  </form:label></td>
      <td><form:input id="firstName" name="firstName" path="firstName" /></td>
    </tr>
    <tr>
      <td><form:label path="lastName">Last Name:  </form:label></td>
      <td><form:input id="lastName" path="lastName" /></td>
    </tr>
    <tr>
      <td><form:label path="dob">Date of Birth:  </form:label></td>
      <td><form:input id="dob" path="dob" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit" onclick="return validateForm()"/>
      </td>
    </tr>
  </table>


</form:form>

<script type="text/javascript">
  function validateForm()
  {
    if (validateFirstName() == false) {
      return false;
    }

    if (validateLastName() == false) {
      return false;
    }

    if (validateDoB() == false) {
      return false;
    }
  }
  function validateFirstName()
  {
    var letterpattern = /^[a-zA-Z]+$/;
    if (document.SignUp.firstName.value.match(letterpattern)) {
      return true;
    } else {
      alert("First name must be all letters.");
      document.forms["SignUp"]["firstName"].focus();
      return false;
    }

  }
  function validateLastName()
  {
    var letterpattern = /^[a-zA-Z]+$/;
    if (document.SignUp.lastName.value.match(letterpattern)) {
      return true;
    } else {
      alert("Last name must be all letters.");
      document.forms["SignUp"]["lastName"].focus();
      return false;
    }
  }
  function validateDoB()
  {
    //var datepattern = /^\d{1,2}\/\d{1,2}\/\d{4}$/;
    var datepattern = /^\d{2}\/\d{2}\/\d{4}$/; // mm/dd/yyyy only
    if (document.SignUp.dob.value.match(datepattern)) {
      return true;
    } else {
      alert("Date of Birth must be in date format (ex. mm/dd/yyyy).");
      document.forms["SignUp"]["dob"].focus();
      return false;
    }
  }
</script>

<!-- Basic template for the first part -->
<jsp:include page="blades/footer.jsp" />
<jsp:include page="blades/foot.jsp" />

