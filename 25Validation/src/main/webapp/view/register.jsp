<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "f"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="https://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>


        <f:form  modelAttribute="register">
            <f:input path="id" />
            <f:input path="name" />
            <f:errors path="name" />
            <f:input path="age" />
            <f:errors path="age" />
            <f:button>Submit</f:button>
        </f:form>



</body>
</html>