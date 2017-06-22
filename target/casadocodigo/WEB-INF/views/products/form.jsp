<%--
  Created by IntelliJ IDEA.
  User: Alan
  Date: 21/06/2017
  Time: 03:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cadastro de Produtos</title>
</head>
<body>

    <form action="/casadocodigo/produtos" method="post">
        <div>
            <label for="title">Título</label>
            <input type="text" name="title" id="title"/>
        </div>
        <div>
            <label for="description">Descrição</label>
            <textarea rows="10" cols="20" name="description" id="description"></textarea>
        </div>
        <div>
            <label for="pages">Número de Páginas</label>
            <input type="text" name="pages" id="pages"/>
        </div>
        <c:forEach items="${types}" var="bookType" varStatus="status">
            <div>
                <label for="price_${bookType}">${bookType}</label>
                <input type="text" name="prices[${status.index}].value" id="price_${bookType}" value="${bookType}"/>
            </div>
        </c:forEach>
        <div>
            <input type="submit" value="Enviar">

        </div>
    </form>
</body>
</html>
