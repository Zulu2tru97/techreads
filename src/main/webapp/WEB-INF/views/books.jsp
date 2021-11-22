<!DOCTYPEhtml>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <body>
    <h1>Books</h1>
    <a href="<c:url value="/books/add" />">Add Books</a>


    <c:if test="${not empty books}">

    <ul>
        <c:forEach var="book" items="${books}">

            <li><a href=" /books/details/<c:out value="${book.id}"/>" ><c:out value="${book.title}"/></a></li>
            <c:out value="${book.author}"/>
            <c:out value="${book.rating}"/>
            <img src="<c:out value="${book.img }"/>"/>

        </c:forEach>
    </ul>
    </c:if>
    </body>
</html>