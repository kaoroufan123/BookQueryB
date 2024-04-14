<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 85793
  Date: 2023/6/14
  Time: 上午 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书详情</title>
</head>
<body>
<div>
<c:forEach var="bookquery" items="${requestScope.bookQuery}">
    <h2 id="h2"></h2>
    <span>作者：</span><label id="bookAuthor">${bookquery.bookName}</label><br/>
    <span>出版社 :</span> <label id="bookConcern">${bookquery.bookConcern}</label><br/>
    <span>出版时间</span> <label id="bookTime">${bookquery.bookTime}</label><br/>
    <span>类别</span> <label id="bookType">${bookquery.bookType}</label><br/>
    <span>内容简介</span> <label id="bookDescription">${bookquery.bookDescription}</label><br/>
</c:forEach>
</div>
</body>
</html>
