<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>Improve IT :: Login</title></head>
<body>
<h1>First Step</h1>

<form:form method="post" action="/page1" modelAttribute="infoPage1">
<c:if test="${infoPage1 != null}">
<table>
    <tr>
    <tr>
        <td>Login Id</td>
        <td>
            <form:input path="id" readonly="true"/>
                <%--<c:out value="${infoPage1.id}"/>--%>
        </td>
    </tr>
    <tr>
        <td>Name</td>
        <td>
            <form:input path="loginName" />
            <c:out value="${infoPage1.loginName}"/>
        </td>
    </tr>
    <tr>
        <td>Password</td>
        <td>
            <form:input path="loginPass" />
                <%--
                                        <c:out value="${infoPage1.loginPass}"/>
                --%>
        </td>
    </tr>

</table>
</c:if>
    <c:if test="${infoPage1 == null}">
        Could not found info!
    </c:if>

    <br/>
    <input type="submit" value="Next">
</form:form>
</body>
