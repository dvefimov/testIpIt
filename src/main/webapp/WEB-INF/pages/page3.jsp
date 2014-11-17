<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>Improve IT :: Login</title></head>
<body>
<h1>Third Step</h1>

<form:form method="post" action="/page3" modelAttribute="infoPage3">
    <c:if test="${infoPage3 != null}">
        <table>
            <tr>
                <td>Name</td>
                <td>
                    <form:input path="loginName" readonly="true"/>
                    <c:out value="${infoPage3.loginName}"/>
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <form:input path="email" readonly="true"/>
                    <c:out value="${infoPage3.email}"/>
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    <form:input path="region" />
                        <%--
                                                <c:out value="${infoPage3.loginPass}"/>
                        --%>
                </td>
            </tr>

        </table>
    </c:if>
    <c:if test="${infoPage3 == null}">
        Could not found info!
    </c:if>

    <br/>
    <input type="submit" value="Next">
</form:form>
</body>
