<%-- 
    Document   : contact
    Created on : 26/11/2013, 23:00:51
    Author     : Rafael
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC com Ajax</title>
        <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
        <script src="${pageContext.request.contextPath}/resources/js/jquery-1.7.1.min.js"></script>
        <script src="<c:url value='/resources/js/contact.js'/>"></script>
    </head>
    <body>
        <div id="container">
            <h2>Find Contact By Name</h2>

            <h2>Submit new Contact</h2>
            <form id="saveContact">
                <div>
                    <label for="firstNameInput">First Name</label>
                    <input type="text" name="firstName" id="firstNameInput"/>
                </div>
                <div>
                    <label for="lastNameInput">Last Name</label>
                    <input type="text" name="lastName" id="lastNameInput"/>
                </div>
                <div>
                    <label for="ageInput">Age</label>
                    <input type="text" name="age" id="ageInput"/>
                </div>
                <div><input id="submit" type="submit" value="Save Contact"></div>
            </form>

            <br><br>
            <h2>Table Contact</h2>
            <table id="contactTableResponse" class="table tr">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>FIRST NAME</th>
                        <th>LAST NAME</th>
                        <th>AGE</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th scope="row">Spring-Ajax</th>
                        <th scope="4">JQuery Ajax</th>
                    </tr>
                </tfoot>
                <tbody>
                    <c:forEach items="${contacts}" var="contact">
                        <tr>
                            <td>${contact.id}</td>
                            <td>${contact.firstName}</td>
                            <td>${contact.lastName}</td>
                            <td>${contact.age}</td>
                        </tr>
                    </c:forEach>        
                </tbody>
            </table>
        </div>
    </body>
</html>
