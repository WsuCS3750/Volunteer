<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 8/1/2015
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>





<%--<nav class="navbar navbar-default">--%>
  <%--<div class="container-fluid">--%>
    <%--<!-- Brand and toggle get grouped for better mobile display -->--%>
    <%--<div class="navbar-header">--%>
      <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">--%>
        <%--<span class="sr-only">Toggle navigation</span>--%>
        <%--<span class="icon-bar"></span>--%>
        <%--<span class="icon-bar"></span>--%>
        <%--<span class="icon-bar"></span>--%>
      <%--</button>--%>
      <%--<a class="navbar-brand" href="<c:url value="/" />">Volunteer CCS</a>--%>
    <%--</div>--%>

    <%--<!-- Collect the nav links, forms, and other content for toggling -->--%>
    <%--<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">--%>
      <%--<ul class="nav navbar-nav">--%>
        <%--<li class="active"><a href="#">About<span class="sr-only">(current)</span></a></li>--%>
        <%--<li><a href="#">Link</a></li>--%>
        <%--<li class="dropdown">--%>
          <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>--%>
          <%--<ul class="dropdown-menu">--%>
            <%--<li><a href="#">Action</a></li>--%>
            <%--<li><a href="#">Another action</a></li>--%>
            <%--<li><a href="#">Something else here</a></li>--%>
            <%--<li role="separator" class="divider"></li>--%>
            <%--<li><a href="#">Separated link</a></li>--%>
            <%--<li role="separator" class="divider"></li>--%>
            <%--<li><a href="#">One more separated link</a></li>--%>
          <%--</ul>--%>
        <%--</li>--%>
      <%--</ul>--%>
      <%--<form class="navbar-form navbar-left" role="search">--%>
        <%--<div class="form-group">--%>
          <%--<input type="text" class="form-control" placeholder="Search">--%>
        <%--</div>--%>
        <%--<button type="submit" class="btn btn-default">Submit</button>--%>
      <%--</form>--%>
      <%--<ul class="nav navbar-nav navbar-right">--%>
        <%--<li><a href="<c:url value="/login"/>">Login</a></li>--%>
        <%--<li class="dropdown">--%>
          <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Username <span class="caret"></span></a>--%>
          <%--<ul class="dropdown-menu">--%>
            <%--<li><a href="#">Profile</a></li>--%>
            <%--<li><a href="#">Manage Hours</a></li>--%>
            <%--<li><a href="#">Something else here</a></li>--%>
            <%--<li role="separator" class="divider"></li>--%>
            <%--<li><a href="#">Separated link</a></li>--%>
          <%--</ul>--%>
        <%--</li>--%>
      <%--</ul>--%>
    <%--</div><!-- /.navbar-collapse -->--%>
  <%--</div><!-- /.container-fluid -->--%>
<%--</nav>--%>

<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a href="/" class="navbar-brand">VolunteerDB</a>
    </div>
    <div class="navbar-collapse collapse">
      <ul class="nav navbar-nav">
        <li><a href="<c:url value="about" />">About</a></li>
        <li><a href="<c:url value="contact" />">Contact</a></li>
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <%--<li><a href="Account/Manage" title="Manage your account">Hello, jake!</a></li>--%>

        <%--Signup--%>
          <li><a href = "<c:url value="signup" />">Signup</a></li>



        <%--Login / Logoff --%>
        <li>
          <a href="<c:url value="login" />">Login</a>
        </li>

        <li>
          <a href = "<c:url value="admin/admin"/>">Admin</a>
        </li>


      </ul>

    </div>
  </div>
</div>
