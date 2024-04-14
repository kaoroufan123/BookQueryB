<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 85793
  Date: 2023/6/14
  Time: 上午 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书查询</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/#" method="get">
    <div>
        <table>
            <tr>
                <td>图书名称：</td>
                <td><input type="text" name="bookName"/></td>
                <td>作者：</td>
                <td><input type="text" name="bookAuthor"/></td>
                <td>类别</td>
                <td>
                    <select name="bookTYpe">
                        <option>历史</option>
                        <option>科普</option>
                        <option>武侠</option>
                        <option>曲艺</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="submit" value="搜索"/> </td>
            </tr>
        </table>
    </div>
    </form>

    <br/>
<div>
    <table border="1" class="items list">
        <tr>
            <td>图书名称</td>
            <td>作者</td>
            <td>类别</td>
            <td>查看详情</td>
        </tr>
        <c:forEach var="list" items="${requestScope.list}">
            <tr>
                <td>${list.bookName}</td>
                <td>${list.bookAuthor}</td>
                <td>${list.bookType}</td>
                <td><a href="#">详情</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</div>
</body>
</html>
