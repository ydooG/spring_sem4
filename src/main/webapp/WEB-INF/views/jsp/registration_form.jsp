<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <form:form method="post" modelAttribute="user">
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
        <form:errors path="name" /> <br>

        <form:label path="password">Password</form:label>
        <form:input path="password"/>
        <form:errors path="password" /> <br>

        <form:label path="email">Email</form:label>
        <form:input path="email"/>
        <form:errors path="email" /> <br>

        <c:if test="${not empty message}">
            <p>${message}</p>
        </c:if>
        <input type="submit" value="Sign Up">
    </form:form>
</body>
</html>