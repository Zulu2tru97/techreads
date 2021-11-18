<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <body>
        <h1>Details</h1>

        <a href="/books/edit/<c:out value="${book.id}" />">Edit</a>
        <a href="/books/delete/<c:out value="${book.id}" />">Delete</a>

        <c:out value="${book.rating}"/> <c:out value="${book.title}"/>
        <img src="<c:out value="${book.img}" />" /> <br />
        <c:out value="${book.author}"/>
    </body>
</html>