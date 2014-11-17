<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>Improve IT :: Login</title></head>
<body>
<h1>Second Step</h1>

<form:form method="post" action="/page2" modelAttribute="page2Stub">
    <c:if test="${page2Stub != null}">
        <table>
            <tr>
                <td>Name</td>
                <td>
                    <form:input path="loginName" readonly="true"/>
                    <c:out value="${page2Stub.loginName}"/>
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <form:input path="email" />
                        <%--
                                                <c:out value="${page2Stub.loginPass}"/>
                        --%>
                </td>
            </tr>

            <form:input type="hidden" path="id"/>

        </table>
    </c:if>
    <c:if test="${page2Stub == null}">
        Could not found info!
    </c:if>

    <br/>
    <input type="submit" value="Next">
</form:form>
</body>
