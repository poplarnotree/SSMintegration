<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2017/8/12
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello world</h1>
<form:form action="test" modelAttribute="user" method="post">
    <table>
        <tr><td><form:input path="loginname"/></td></tr>
        <tr><td><form:password path="password"/></td></tr>
        <tr><td><input type="submit" value="确定"></td></tr>
    </table>
</form:form>
</body>
</html>
