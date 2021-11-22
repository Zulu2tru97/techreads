<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <body>
        <h1>Details</h1>

        <a href="/books/edit/<c:out value="${book.id}" />">Edit</a>
        <a href="/books/delete/<c:out value="${book.id}" />">Delete</a>

        <<c:if test="${not empty book}">

            <ul>


                <li><a href=" /books/<c:out value="${book.id}"/>" ><c:out value="${book.title}"/></a></li>
                <c:out value="${book.author}"/>
                <c:out value="${book.rating}"/>
                <img src="<c:out value="${book.img }"/>"/>


            </ul>
        </c:if>
    </body>
</html>