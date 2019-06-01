<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>


        <%-- include page="menu.jsp" --%>

 <jsp:include page="menu.jsp"/>

<c:forEach var="ob" items="${lst}">
    <h1>${ob.id}</h1>
    <h1>${ob.name}</h1>
    <h1>${ob.age}</h1>
</c:forEach>

    </body>
</html>
